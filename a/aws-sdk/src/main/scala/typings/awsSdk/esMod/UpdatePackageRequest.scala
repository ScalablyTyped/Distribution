package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePackageRequest extends js.Object {
  
  /**
    * An info message for the new version which will be shown as part of GetPackageVersionHistoryResponse.
    */
  var CommitMessage: js.UndefOr[typings.awsSdk.esMod.CommitMessage] = js.native
  
  /**
    * New description of the package.
    */
  var PackageDescription: js.UndefOr[typings.awsSdk.esMod.PackageDescription] = js.native
  
  /**
    * Unique identifier for the package.
    */
  var PackageID: typings.awsSdk.esMod.PackageID = js.native
  
  var PackageSource: typings.awsSdk.esMod.PackageSource = js.native
}
object UpdatePackageRequest {
  
  @scala.inline
  def apply(PackageID: PackageID, PackageSource: PackageSource): UpdatePackageRequest = {
    val __obj = js.Dynamic.literal(PackageID = PackageID.asInstanceOf[js.Any], PackageSource = PackageSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePackageRequest]
  }
  
  @scala.inline
  implicit class UpdatePackageRequestOps[Self <: UpdatePackageRequest] (val x: Self) extends AnyVal {
    
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
    def setPackageID(value: PackageID): Self = this.set("PackageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageSource(value: PackageSource): Self = this.set("PackageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitMessage(value: CommitMessage): Self = this.set("CommitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitMessage: Self = this.set("CommitMessage", js.undefined)
    
    @scala.inline
    def setPackageDescription(value: PackageDescription): Self = this.set("PackageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageDescription: Self = this.set("PackageDescription", js.undefined)
  }
}
