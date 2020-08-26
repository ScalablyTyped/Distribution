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
  @scala.inline
  implicit class GetIntentRequestOps[Self <: GetIntentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: IntentName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

