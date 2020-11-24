package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDataSyncSourceWithState extends js.Object {
  
  /**
    * The field name in SyncSource for the ResourceDataSyncAwsOrganizationsSource type.
    */
  var AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource] = js.native
  
  /**
    * Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come online.
    */
  var IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions] = js.native
  
  /**
    * The SyncSource AWS Regions included in the resource data sync.
    */
  var SourceRegions: js.UndefOr[ResourceDataSyncSourceRegionList] = js.native
  
  /**
    * The type of data source for the resource data sync. SourceType is either AwsOrganizations (if an organization is present in AWS Organizations) or singleAccountMultiRegions.
    */
  var SourceType: js.UndefOr[ResourceDataSyncSourceType] = js.native
  
  /**
    * The data type name for including resource data sync state. There are four sync states:  OrganizationNotExists: Your organization doesn't exist.  NoPermissions: The system can't locate the service-linked role. This role is automatically created when a user creates a resource data sync in Explorer.  InvalidOrganizationalUnit: You specified or selected an invalid unit in the resource data sync configuration.  TrustedAccessDisabled: You disabled Systems Manager access in the organization in AWS Organizations.
    */
  var State: js.UndefOr[ResourceDataSyncState] = js.native
}
object ResourceDataSyncSourceWithState {
  
  @scala.inline
  def apply(): ResourceDataSyncSourceWithState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataSyncSourceWithState]
  }
  
  @scala.inline
  implicit class ResourceDataSyncSourceWithStateOps[Self <: ResourceDataSyncSourceWithState] (val x: Self) extends AnyVal {
    
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
    def setAwsOrganizationsSource(value: ResourceDataSyncAwsOrganizationsSource): Self = this.set("AwsOrganizationsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsOrganizationsSource: Self = this.set("AwsOrganizationsSource", js.undefined)
    
    @scala.inline
    def setIncludeFutureRegions(value: ResourceDataSyncIncludeFutureRegions): Self = this.set("IncludeFutureRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeFutureRegions: Self = this.set("IncludeFutureRegions", js.undefined)
    
    @scala.inline
    def setSourceRegionsVarargs(value: ResourceDataSyncSourceRegion*): Self = this.set("SourceRegions", js.Array(value :_*))
    
    @scala.inline
    def setSourceRegions(value: ResourceDataSyncSourceRegionList): Self = this.set("SourceRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRegions: Self = this.set("SourceRegions", js.undefined)
    
    @scala.inline
    def setSourceType(value: ResourceDataSyncSourceType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
    
    @scala.inline
    def setState(value: ResourceDataSyncState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
