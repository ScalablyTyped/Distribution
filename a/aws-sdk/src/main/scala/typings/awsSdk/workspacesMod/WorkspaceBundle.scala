package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceBundle extends js.Object {
  
  /**
    * The bundle identifier.
    */
  var BundleId: js.UndefOr[typings.awsSdk.workspacesMod.BundleId] = js.native
  
  /**
    * The compute type. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeType: js.UndefOr[typings.awsSdk.workspacesMod.ComputeType] = js.native
  
  /**
    * A description.
    */
  var Description: js.UndefOr[typings.awsSdk.workspacesMod.Description] = js.native
  
  /**
    * The image identifier of the bundle.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.native
  
  /**
    * The last time that the bundle was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the bundle.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The owner of the bundle. This is the account identifier of the owner, or AMAZON if the bundle is provided by AWS.
    */
  var Owner: js.UndefOr[BundleOwner] = js.native
  
  /**
    * The size of the root volume.
    */
  var RootStorage: js.UndefOr[typings.awsSdk.workspacesMod.RootStorage] = js.native
  
  /**
    * The size of the user storage.
    */
  var UserStorage: js.UndefOr[typings.awsSdk.workspacesMod.UserStorage] = js.native
}
object WorkspaceBundle {
  
  @scala.inline
  def apply(): WorkspaceBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceBundle]
  }
  
  @scala.inline
  implicit class WorkspaceBundleOps[Self <: WorkspaceBundle] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: BundleId): Self = this.set("BundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("BundleId", js.undefined)
    
    @scala.inline
    def setComputeType(value: ComputeType): Self = this.set("ComputeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeType: Self = this.set("ComputeType", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setImageId(value: WorkspaceImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Timestamp): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOwner(value: BundleOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    
    @scala.inline
    def setRootStorage(value: RootStorage): Self = this.set("RootStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootStorage: Self = this.set("RootStorage", js.undefined)
    
    @scala.inline
    def setUserStorage(value: UserStorage): Self = this.set("UserStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStorage: Self = this.set("UserStorage", js.undefined)
  }
}
