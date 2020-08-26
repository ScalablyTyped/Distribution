package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourcePermissionsResponse extends js.Object {
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
  /**
    * The principals.
    */
  var Principals: js.UndefOr[PrincipalList] = js.native
}

object DescribeResourcePermissionsResponse {
  @scala.inline
  def apply(): DescribeResourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourcePermissionsResponse]
  }
  @scala.inline
  implicit class DescribeResourcePermissionsResponseOps[Self <: DescribeResourcePermissionsResponse] (val x: Self) extends AnyVal {
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
    def setMarker(value: PageMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setPrincipalsVarargs(value: Principal*): Self = this.set("Principals", js.Array(value :_*))
    @scala.inline
    def setPrincipals(value: PrincipalList): Self = this.set("Principals", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipals: Self = this.set("Principals", js.undefined)
  }
  
}

