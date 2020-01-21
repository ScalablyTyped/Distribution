package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntentRequest extends js.Object {
  /**
    * The name of the intent. The name is case sensitive. 
    */
  var name: IntentName = js.native
  /**
    * The version of the intent.
    */
  var version: Version = js.native
}

object GetIntentRequest {
  @scala.inline
  def apply(name: IntentName, version: Version): GetIntentRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetIntentRequest]
  }
}

