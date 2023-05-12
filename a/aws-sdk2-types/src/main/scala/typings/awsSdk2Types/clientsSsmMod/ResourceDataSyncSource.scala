package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataSyncSource extends StObject {
  
  /**
    * Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can synchronize data from Organizations.
    */
  var AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource] = js.undefined
  
  /**
    * When you create a resource data sync, if you choose one of the Organizations options, then Systems Manager automatically enables all OpsData sources in the selected Amazon Web Services Regions for all Amazon Web Services accounts in your organization (or in the selected organization units). For more information, see About multiple account and Region resource data syncs in the Amazon Web Services Systems Manager User Guide.
    */
  var EnableAllOpsDataSources: js.UndefOr[ResourceDataSyncEnableAllOpsDataSources] = js.undefined
  
  /**
    * Whether to automatically synchronize and aggregate data from new Amazon Web Services Regions when those Regions come online.
    */
  var IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions] = js.undefined
  
  /**
    * The SyncSource Amazon Web Services Regions included in the resource data sync.
    */
  var SourceRegions: ResourceDataSyncSourceRegionList
  
  /**
    * The type of data source for the resource data sync. SourceType is either AwsOrganizations (if an organization is present in Organizations) or SingleAccountMultiRegions.
    */
  var SourceType: ResourceDataSyncSourceType
}
object ResourceDataSyncSource {
  
  inline def apply(SourceRegions: ResourceDataSyncSourceRegionList, SourceType: ResourceDataSyncSourceType): ResourceDataSyncSource = {
    val __obj = js.Dynamic.literal(SourceRegions = SourceRegions.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceDataSyncSource] (val x: Self) extends AnyVal {
    
    inline def setAwsOrganizationsSource(value: ResourceDataSyncAwsOrganizationsSource): Self = StObject.set(x, "AwsOrganizationsSource", value.asInstanceOf[js.Any])
    
    inline def setAwsOrganizationsSourceUndefined: Self = StObject.set(x, "AwsOrganizationsSource", js.undefined)
    
    inline def setEnableAllOpsDataSources(value: ResourceDataSyncEnableAllOpsDataSources): Self = StObject.set(x, "EnableAllOpsDataSources", value.asInstanceOf[js.Any])
    
    inline def setEnableAllOpsDataSourcesUndefined: Self = StObject.set(x, "EnableAllOpsDataSources", js.undefined)
    
    inline def setIncludeFutureRegions(value: ResourceDataSyncIncludeFutureRegions): Self = StObject.set(x, "IncludeFutureRegions", value.asInstanceOf[js.Any])
    
    inline def setIncludeFutureRegionsUndefined: Self = StObject.set(x, "IncludeFutureRegions", js.undefined)
    
    inline def setSourceRegions(value: ResourceDataSyncSourceRegionList): Self = StObject.set(x, "SourceRegions", value.asInstanceOf[js.Any])
    
    inline def setSourceRegionsVarargs(value: ResourceDataSyncSourceRegion*): Self = StObject.set(x, "SourceRegions", js.Array(value*))
    
    inline def setSourceType(value: ResourceDataSyncSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
  }
}
