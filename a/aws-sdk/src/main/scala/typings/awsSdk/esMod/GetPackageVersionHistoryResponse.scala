package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPackageVersionHistoryResponse extends js.Object {
  
  var NextToken: js.UndefOr[String] = js.native
  
  var PackageID: js.UndefOr[typings.awsSdk.esMod.PackageID] = js.native
  
  /**
    * List of PackageVersionHistory objects.
    */
  var PackageVersionHistoryList: js.UndefOr[typings.awsSdk.esMod.PackageVersionHistoryList] = js.native
}
object GetPackageVersionHistoryResponse {
  
  @scala.inline
  def apply(): GetPackageVersionHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackageVersionHistoryResponse]
  }
  
  @scala.inline
  implicit class GetPackageVersionHistoryResponseOps[Self <: GetPackageVersionHistoryResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPackageID(value: PackageID): Self = this.set("PackageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageID: Self = this.set("PackageID", js.undefined)
    
    @scala.inline
    def setPackageVersionHistoryListVarargs(value: PackageVersionHistory*): Self = this.set("PackageVersionHistoryList", js.Array(value :_*))
    
    @scala.inline
    def setPackageVersionHistoryList(value: PackageVersionHistoryList): Self = this.set("PackageVersionHistoryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageVersionHistoryList: Self = this.set("PackageVersionHistoryList", js.undefined)
  }
}
