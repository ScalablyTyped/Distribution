package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTypedLinkFacetInformationResponse extends js.Object {
  /**
    * The order of identity attributes for the facet, from most significant to least significant. The ability to filter typed links considers the order that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls. For more information about identity attributes, see Typed Links.
    */
  var IdentityAttributeOrder: js.UndefOr[AttributeNameList] = js.native
}

object GetTypedLinkFacetInformationResponse {
  @scala.inline
  def apply(): GetTypedLinkFacetInformationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTypedLinkFacetInformationResponse]
  }
  @scala.inline
  implicit class GetTypedLinkFacetInformationResponseOps[Self <: GetTypedLinkFacetInformationResponse] (val x: Self) extends AnyVal {
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
    def setIdentityAttributeOrderVarargs(value: AttributeName*): Self = this.set("IdentityAttributeOrder", js.Array(value :_*))
    @scala.inline
    def setIdentityAttributeOrder(value: AttributeNameList): Self = this.set("IdentityAttributeOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityAttributeOrder: Self = this.set("IdentityAttributeOrder", js.undefined)
  }
  
}

