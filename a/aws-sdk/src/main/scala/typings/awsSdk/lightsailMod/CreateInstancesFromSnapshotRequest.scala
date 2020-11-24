package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstancesFromSnapshotRequest extends js.Object {
  
  /**
    * An array of objects representing the add-ons to enable for the new instance.
    */
  var addOns: js.UndefOr[AddOnRequestList] = js.native
  
  /**
    * An object containing information about one or more disk mappings.
    */
  var attachedDiskMapping: js.UndefOr[AttachedDiskMap] = js.native
  
  /**
    * The Availability Zone where you want to create your instances. Use the following formatting: us-east-2a (case sensitive). You can get a list of Availability Zones by using the get regions operation. Be sure to add the include Availability Zones parameter to your request.
    */
  var availabilityZone: String = js.native
  
  /**
    * The bundle of specification information for your virtual private server (or instance), including the pricing plan (e.g., micro_1_0).
    */
  var bundleId: NonEmptyString = js.native
  
  /**
    * The names for your new instances.
    */
  var instanceNames: StringList = js.native
  
  /**
    * The name of the instance snapshot on which you are basing your new instances. Use the get instance snapshots operation to return information about your existing snapshots. Constraint:   This parameter cannot be defined together with the source instance name parameter. The instance snapshot name and source instance name parameters are mutually exclusive.  
    */
  var instanceSnapshotName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The name for your key pair.
    */
  var keyPairName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The date of the automatic snapshot to use for the new instance. Use the get auto snapshots operation to identify the dates of the available automatic snapshots. Constraints:   Must be specified in YYYY-MM-DD format.   This parameter cannot be defined together with the use latest restorable auto snapshot parameter. The restore date and use latest restorable auto snapshot parameters are mutually exclusive.   Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var restoreDate: js.UndefOr[String] = js.native
  
  /**
    * The name of the source instance from which the source automatic snapshot was created. Constraints:   This parameter cannot be defined together with the instance snapshot name parameter. The source instance name and instance snapshot name parameters are mutually exclusive.   Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var sourceInstanceName: js.UndefOr[String] = js.native
  
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * A Boolean value to indicate whether to use the latest available automatic snapshot. Constraints:   This parameter cannot be defined together with the restore date parameter. The use latest restorable auto snapshot and restore date parameters are mutually exclusive.   Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.native
  
  /**
    * You can create a launch script that configures a server with additional user data. For example, apt-get -y update.  Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and CentOS use yum, Debian and Ubuntu use apt-get, and FreeBSD uses pkg. For a complete list, see the Dev Guide. 
    */
  var userData: js.UndefOr[String] = js.native
}
object CreateInstancesFromSnapshotRequest {
  
  @scala.inline
  def apply(availabilityZone: String, bundleId: NonEmptyString, instanceNames: StringList): CreateInstancesFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any], instanceNames = instanceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstancesFromSnapshotRequest]
  }
  
  @scala.inline
  implicit class CreateInstancesFromSnapshotRequestOps[Self <: CreateInstancesFromSnapshotRequest] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleId(value: NonEmptyString): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNamesVarargs(value: String*): Self = this.set("instanceNames", js.Array(value :_*))
    
    @scala.inline
    def setInstanceNames(value: StringList): Self = this.set("instanceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnsVarargs(value: AddOnRequest*): Self = this.set("addOns", js.Array(value :_*))
    
    @scala.inline
    def setAddOns(value: AddOnRequestList): Self = this.set("addOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOns: Self = this.set("addOns", js.undefined)
    
    @scala.inline
    def setAttachedDiskMapping(value: AttachedDiskMap): Self = this.set("attachedDiskMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedDiskMapping: Self = this.set("attachedDiskMapping", js.undefined)
    
    @scala.inline
    def setInstanceSnapshotName(value: ResourceName): Self = this.set("instanceSnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceSnapshotName: Self = this.set("instanceSnapshotName", js.undefined)
    
    @scala.inline
    def setKeyPairName(value: ResourceName): Self = this.set("keyPairName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPairName: Self = this.set("keyPairName", js.undefined)
    
    @scala.inline
    def setRestoreDate(value: String): Self = this.set("restoreDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreDate: Self = this.set("restoreDate", js.undefined)
    
    @scala.inline
    def setSourceInstanceName(value: String): Self = this.set("sourceInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceInstanceName: Self = this.set("sourceInstanceName", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUseLatestRestorableAutoSnapshot(value: Boolean): Self = this.set("useLatestRestorableAutoSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLatestRestorableAutoSnapshot: Self = this.set("useLatestRestorableAutoSnapshot", js.undefined)
    
    @scala.inline
    def setUserData(value: String): Self = this.set("userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
  }
}
