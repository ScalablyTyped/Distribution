package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataSyncSource extends StObject {
  
  /**
    * Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can synchronize data from AWS Organizations.
    */
  var AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource] = js.undefined
  
  /**
    * Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come online.
    */
  var IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions] = js.undefined
  
  /**
    * The SyncSource AWS Regions included in the resource data sync.
    */
  var SourceRegions: ResourceDataSyncSourceRegionList
  
  /**
    * The type of data source for the resource data sync. SourceType is either AwsOrganizations (if an organization is present in AWS Organizations) or singleAccountMultiRegions.
    */
  var SourceType: ResourceDataSyncSourceType
}
object ResourceDataSyncSource {
  
  inline def apply(SourceRegions: ResourceDataSyncSourceRegionList, SourceType: ResourceDataSyncSourceType): ResourceDataSyncSource = {
    val __obj = js.Dynamic.literal(SourceRegions = SourceRegions.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncSource]
  }
  
  extension [Self <: ResourceDataSyncSource](x: Self) {
    
    inline def setAwsOrganizationsSource(value: ResourceDataSyncAwsOrganizationsSource): Self = StObject.set(x, "AwsOrganizationsSource", value.asInstanceOf[js.Any])
    
    inline def setAwsOrganizationsSourceUndefined: Self = StObject.set(x, "AwsOrganizationsSource", js.undefined)
    
    inline def setIncludeFutureRegions(value: ResourceDataSyncIncludeFutureRegions): Self = StObject.set(x, "IncludeFutureRegions", value.asInstanceOf[js.Any])
    
    inline def setIncludeFutureRegionsUndefined: Self = StObject.set(x, "IncludeFutureRegions", js.undefined)
    
    inline def setSourceRegions(value: ResourceDataSyncSourceRegionList): Self = StObject.set(x, "SourceRegions", value.asInstanceOf[js.Any])
    
    inline def setSourceRegionsVarargs(value: ResourceDataSyncSourceRegion*): Self = StObject.set(x, "SourceRegions", js.Array(value :_*))
    
    inline def setSourceType(value: ResourceDataSyncSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
  }
}
