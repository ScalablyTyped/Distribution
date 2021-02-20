package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopTrainingEntityRecognizerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer currently being trained.
    */
  var EntityRecognizerArn: typings.awsSdk.comprehendMod.EntityRecognizerArn = js.native
}
object StopTrainingEntityRecognizerRequest {
  
  @scala.inline
  def apply(EntityRecognizerArn: EntityRecognizerArn): StopTrainingEntityRecognizerRequest = {
    val __obj = js.Dynamic.literal(EntityRecognizerArn = EntityRecognizerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTrainingEntityRecognizerRequest]
  }
  
  @scala.inline
  implicit class StopTrainingEntityRecognizerRequestMutableBuilder[Self <: StopTrainingEntityRecognizerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityRecognizerArn(value: EntityRecognizerArn): Self = StObject.set(x, "EntityRecognizerArn", value.asInstanceOf[js.Any])
  }
}
