package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEntityRecognizerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: typings.awsSdk.comprehendMod.EntityRecognizerArn = js.native
}
object DeleteEntityRecognizerRequest {
  
  @scala.inline
  def apply(EntityRecognizerArn: EntityRecognizerArn): DeleteEntityRecognizerRequest = {
    val __obj = js.Dynamic.literal(EntityRecognizerArn = EntityRecognizerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEntityRecognizerRequest]
  }
  
  @scala.inline
  implicit class DeleteEntityRecognizerRequestMutableBuilder[Self <: DeleteEntityRecognizerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityRecognizerArn(value: EntityRecognizerArn): Self = StObject.set(x, "EntityRecognizerArn", value.asInstanceOf[js.Any])
  }
}
