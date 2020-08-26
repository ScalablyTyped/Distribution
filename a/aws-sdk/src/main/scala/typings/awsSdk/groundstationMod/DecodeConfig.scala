package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodeConfig extends js.Object {
  /**
    * Unvalidated JSON of a decode Config.
    */
  var unvalidatedJSON: JsonString = js.native
}

object DecodeConfig {
  @scala.inline
  def apply(unvalidatedJSON: JsonString): DecodeConfig = {
    val __obj = js.Dynamic.literal(unvalidatedJSON = unvalidatedJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeConfig]
  }
  @scala.inline
  implicit class DecodeConfigOps[Self <: DecodeConfig] (val x: Self) extends AnyVal {
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
    def setUnvalidatedJSON(value: JsonString): Self = this.set("unvalidatedJSON", value.asInstanceOf[js.Any])
  }
  
}

