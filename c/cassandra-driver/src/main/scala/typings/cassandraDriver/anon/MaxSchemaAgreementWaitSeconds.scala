package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxSchemaAgreementWaitSeconds extends js.Object {
  var maxSchemaAgreementWaitSeconds: js.UndefOr[Double] = js.native
  var maxVersion: js.UndefOr[Double] = js.native
  var noCompact: js.UndefOr[Boolean] = js.native
  var port: js.UndefOr[Double] = js.native
}

object MaxSchemaAgreementWaitSeconds {
  @scala.inline
  def apply(): MaxSchemaAgreementWaitSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxSchemaAgreementWaitSeconds]
  }
  @scala.inline
  implicit class MaxSchemaAgreementWaitSecondsOps[Self <: MaxSchemaAgreementWaitSeconds] (val x: Self) extends AnyVal {
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
    def setMaxSchemaAgreementWaitSeconds(value: Double): Self = this.set("maxSchemaAgreementWaitSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSchemaAgreementWaitSeconds: Self = this.set("maxSchemaAgreementWaitSeconds", js.undefined)
    @scala.inline
    def setMaxVersion(value: Double): Self = this.set("maxVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxVersion: Self = this.set("maxVersion", js.undefined)
    @scala.inline
    def setNoCompact(value: Boolean): Self = this.set("noCompact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCompact: Self = this.set("noCompact", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

