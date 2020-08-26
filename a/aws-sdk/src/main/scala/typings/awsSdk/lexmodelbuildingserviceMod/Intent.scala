package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Intent extends js.Object {
  /**
    * The name of the intent.
    */
  var intentName: IntentName = js.native
  /**
    * The version of the intent.
    */
  var intentVersion: Version = js.native
}

object Intent {
  @scala.inline
  def apply(intentName: IntentName, intentVersion: Version): Intent = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], intentVersion = intentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intent]
  }
  @scala.inline
  implicit class IntentOps[Self <: Intent] (val x: Self) extends AnyVal {
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
    def setIntentName(value: IntentName): Self = this.set("intentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntentVersion(value: Version): Self = this.set("intentVersion", value.asInstanceOf[js.Any])
  }
  
}

