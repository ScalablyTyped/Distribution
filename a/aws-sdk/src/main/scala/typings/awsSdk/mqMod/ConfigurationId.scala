package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationId extends js.Object {
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The revision number of the configuration.
    */
  var Revision: js.UndefOr[integer] = js.native
}

object ConfigurationId {
  @scala.inline
  def apply(): ConfigurationId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationId]
  }
  @scala.inline
  implicit class ConfigurationIdOps[Self <: ConfigurationId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setRevision(value: integer): Self = this.set("Revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("Revision", js.undefined)
  }
  
}

