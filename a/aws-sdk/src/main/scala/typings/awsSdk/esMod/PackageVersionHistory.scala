package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageVersionHistory extends js.Object {
  
  /**
    * A message associated with the version.
    */
  var CommitMessage: js.UndefOr[typings.awsSdk.esMod.CommitMessage] = js.native
  
  /**
    * Timestamp which tells creation time of the package version.
    */
  var CreatedAt: js.UndefOr[typings.awsSdk.esMod.CreatedAt] = js.native
  
  /**
    * Version of the package.
    */
  var PackageVersion: js.UndefOr[typings.awsSdk.esMod.PackageVersion] = js.native
}
object PackageVersionHistory {
  
  @scala.inline
  def apply(): PackageVersionHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageVersionHistory]
  }
  
  @scala.inline
  implicit class PackageVersionHistoryOps[Self <: PackageVersionHistory] (val x: Self) extends AnyVal {
    
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
    def setCommitMessage(value: CommitMessage): Self = this.set("CommitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitMessage: Self = this.set("CommitMessage", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setPackageVersion(value: PackageVersion): Self = this.set("PackageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageVersion: Self = this.set("PackageVersion", js.undefined)
  }
}
