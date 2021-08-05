package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstancesFromSnapshotRequest extends StObject {
  
  /**
    * An array of objects representing the add-ons to enable for the new instance.
    */
  var addOns: js.UndefOr[AddOnRequestList] = js.undefined
  
  /**
    * An object containing information about one or more disk mappings.
    */
  var attachedDiskMapping: js.UndefOr[AttachedDiskMap] = js.undefined
  
  /**
    * The Availability Zone where you want to create your instances. Use the following formatting: us-east-2a (case sensitive). You can get a list of Availability Zones by using the get regions operation. Be sure to add the include Availability Zones parameter to your request.
    */
  var availabilityZone: String
  
  /**
    * The bundle of specification information for your virtual private server (or instance), including the pricing plan (e.g., micro_1_0).
    */
  var bundleId: NonEmptyString
  
  /**
    * The names for your new instances.
    */
  var instanceNames: StringList
  
  /**
    * The name of the instance snapshot on which you are basing your new instances. Use the get instance snapshots operation to return information about your existing snapshots. Constraint:   This parameter cannot be defined together with the source instance name parameter. The instance snapshot name and source instance name parameters are mutually exclusive.  
    */
  var instanceSnapshotName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name for your key pair.
    */
  var keyPairName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The date of the automatic snapshot to use for the new instance. Use the get auto snapshots operation to identify the dates of the available automatic snapshots. Constraints:   Must be specified in YYYY-MM-DD format.   This parameter cannot be defined together with the use latest restorable auto snapshot parameter. The restore date and use latest restorable auto snapshot parameters are mutually exclusive.   Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var restoreDate: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the source instance from which the source automatic snapshot was created. Constraints:   This parameter cannot be defined together with the instance snapshot name parameter. The source instance name and instance snapshot name parameters are mutually exclusive.   Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var sourceInstanceName: js.UndefOr[String] = js.undefined
  
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A Boolean value to indicate whether to use the latest available automatic snapshot. Constraints:   This parameter cannot be defined together with the restore date parameter. The use latest restorable auto snapshot and restore date parameters are mutually exclusive.   Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * You can create a launch script that configures a server with additional user data. For example, apt-get -y update.  Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and CentOS use yum, Debian and Ubuntu use apt-get, and FreeBSD uses pkg. For a complete list, see the Dev Guide. 
    */
  var userData: js.UndefOr[String] = js.undefined
}
object CreateInstancesFromSnapshotRequest {
  
  inline def apply(availabilityZone: String, bundleId: NonEmptyString, instanceNames: StringList): CreateInstancesFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any], instanceNames = instanceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstancesFromSnapshotRequest]
  }
  
  extension [Self <: CreateInstancesFromSnapshotRequest](x: Self) {
    
    inline def setAddOns(value: AddOnRequestList): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    inline def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    inline def setAddOnsVarargs(value: AddOnRequest*): Self = StObject.set(x, "addOns", js.Array(value :_*))
    
    inline def setAttachedDiskMapping(value: AttachedDiskMap): Self = StObject.set(x, "attachedDiskMapping", value.asInstanceOf[js.Any])
    
    inline def setAttachedDiskMappingUndefined: Self = StObject.set(x, "attachedDiskMapping", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setBundleId(value: NonEmptyString): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setInstanceNames(value: StringList): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    inline def setInstanceNamesVarargs(value: String*): Self = StObject.set(x, "instanceNames", js.Array(value :_*))
    
    inline def setInstanceSnapshotName(value: ResourceName): Self = StObject.set(x, "instanceSnapshotName", value.asInstanceOf[js.Any])
    
    inline def setInstanceSnapshotNameUndefined: Self = StObject.set(x, "instanceSnapshotName", js.undefined)
    
    inline def setKeyPairName(value: ResourceName): Self = StObject.set(x, "keyPairName", value.asInstanceOf[js.Any])
    
    inline def setKeyPairNameUndefined: Self = StObject.set(x, "keyPairName", js.undefined)
    
    inline def setRestoreDate(value: String): Self = StObject.set(x, "restoreDate", value.asInstanceOf[js.Any])
    
    inline def setRestoreDateUndefined: Self = StObject.set(x, "restoreDate", js.undefined)
    
    inline def setSourceInstanceName(value: String): Self = StObject.set(x, "sourceInstanceName", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceNameUndefined: Self = StObject.set(x, "sourceInstanceName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setUseLatestRestorableAutoSnapshot(value: Boolean): Self = StObject.set(x, "useLatestRestorableAutoSnapshot", value.asInstanceOf[js.Any])
    
    inline def setUseLatestRestorableAutoSnapshotUndefined: Self = StObject.set(x, "useLatestRestorableAutoSnapshot", js.undefined)
    
    inline def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
