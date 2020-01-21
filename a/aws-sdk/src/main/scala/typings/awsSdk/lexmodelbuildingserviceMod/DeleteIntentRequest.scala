package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIntentRequest extends js.Object {
  /**
    * The name of the intent. The name is case sensitive. 
    */
  var name: IntentName = js.native
}

object DeleteIntentRequest {
  @scala.inline
  def apply(name: IntentName): DeleteIntentRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIntentRequest]
  }
}

