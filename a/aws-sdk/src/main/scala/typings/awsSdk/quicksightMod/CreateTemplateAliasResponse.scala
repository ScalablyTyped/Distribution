package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplateAliasResponse extends js.Object {
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * Information about the template alias.
    */
  var TemplateAlias: js.UndefOr[typings.awsSdk.quicksightMod.TemplateAlias] = js.native
}

object CreateTemplateAliasResponse {
  @scala.inline
  def apply(): CreateTemplateAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTemplateAliasResponse]
  }
  @scala.inline
  implicit class CreateTemplateAliasResponseOps[Self <: CreateTemplateAliasResponse] (val x: Self) extends AnyVal {
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
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTemplateAlias(value: TemplateAlias): Self = this.set("TemplateAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateAlias: Self = this.set("TemplateAlias", js.undefined)
  }
  
}

