package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTerminologyResponse extends js.Object {
  /**
    * The data location of the custom terminology being retrieved. The custom terminology file is returned in a presigned url that has a 30 minute expiration.
    */
  var TerminologyDataLocation: js.UndefOr[typings.awsSdk.translateMod.TerminologyDataLocation] = js.native
  /**
    * The properties of the custom terminology being retrieved.
    */
  var TerminologyProperties: js.UndefOr[typings.awsSdk.translateMod.TerminologyProperties] = js.native
}

object GetTerminologyResponse {
  @scala.inline
  def apply(): GetTerminologyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTerminologyResponse]
  }
  @scala.inline
  implicit class GetTerminologyResponseOps[Self <: GetTerminologyResponse] (val x: Self) extends AnyVal {
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
    def setTerminologyDataLocation(value: TerminologyDataLocation): Self = this.set("TerminologyDataLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminologyDataLocation: Self = this.set("TerminologyDataLocation", js.undefined)
    @scala.inline
    def setTerminologyProperties(value: TerminologyProperties): Self = this.set("TerminologyProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminologyProperties: Self = this.set("TerminologyProperties", js.undefined)
  }
  
}

