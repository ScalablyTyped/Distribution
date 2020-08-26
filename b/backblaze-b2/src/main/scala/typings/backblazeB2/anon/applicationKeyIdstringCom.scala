package typings.backblazeB2.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  applicationKeyId :string} & backblaze-b2.backblaze-b2.CommonArgs */
@js.native
trait applicationKeyIdstringCom extends js.Object {
  var applicationKeyId: String = js.native
  var axios: js.UndefOr[Record[String, _]] = js.native
  var axiosOverride: js.UndefOr[Record[String, _]] = js.native
}

object applicationKeyIdstringCom {
  @scala.inline
  def apply(applicationKeyId: String): applicationKeyIdstringCom = {
    val __obj = js.Dynamic.literal(applicationKeyId = applicationKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[applicationKeyIdstringCom]
  }
  @scala.inline
  implicit class applicationKeyIdstringComOps[Self <: applicationKeyIdstringCom] (val x: Self) extends AnyVal {
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
    def setApplicationKeyId(value: String): Self = this.set("applicationKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxios(value: Record[String, _]): Self = this.set("axios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxios: Self = this.set("axios", js.undefined)
    @scala.inline
    def setAxiosOverride(value: Record[String, _]): Self = this.set("axiosOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxiosOverride: Self = this.set("axiosOverride", js.undefined)
  }
  
}

