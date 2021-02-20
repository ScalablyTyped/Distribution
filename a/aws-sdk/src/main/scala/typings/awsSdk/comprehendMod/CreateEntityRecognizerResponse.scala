package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEntityRecognizerResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: js.UndefOr[typings.awsSdk.comprehendMod.EntityRecognizerArn] = js.native
}
object CreateEntityRecognizerResponse {
  
  @scala.inline
  def apply(): CreateEntityRecognizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEntityRecognizerResponse]
  }
  
  @scala.inline
  implicit class CreateEntityRecognizerResponseMutableBuilder[Self <: CreateEntityRecognizerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityRecognizerArn(value: EntityRecognizerArn): Self = StObject.set(x, "EntityRecognizerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityRecognizerArnUndefined: Self = StObject.set(x, "EntityRecognizerArn", js.undefined)
  }
}
