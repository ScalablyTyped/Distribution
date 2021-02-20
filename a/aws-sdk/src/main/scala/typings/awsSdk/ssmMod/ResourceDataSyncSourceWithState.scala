package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDataSyncSourceWithState extends StObject {
  
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
  implicit class ResourceDataSyncSourceWithStateMutableBuilder[Self <: ResourceDataSyncSourceWithState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsOrganizationsSource(value: ResourceDataSyncAwsOrganizationsSource): Self = StObject.set(x, "AwsOrganizationsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsOrganizationsSourceUndefined: Self = StObject.set(x, "AwsOrganizationsSource", js.undefined)
    
    @scala.inline
    def setIncludeFutureRegions(value: ResourceDataSyncIncludeFutureRegions): Self = StObject.set(x, "IncludeFutureRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFutureRegionsUndefined: Self = StObject.set(x, "IncludeFutureRegions", js.undefined)
    
    @scala.inline
    def setSourceRegions(value: ResourceDataSyncSourceRegionList): Self = StObject.set(x, "SourceRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRegionsUndefined: Self = StObject.set(x, "SourceRegions", js.undefined)
    
    @scala.inline
    def setSourceRegionsVarargs(value: ResourceDataSyncSourceRegion*): Self = StObject.set(x, "SourceRegions", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: ResourceDataSyncSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    @scala.inline
    def setState(value: ResourceDataSyncState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
