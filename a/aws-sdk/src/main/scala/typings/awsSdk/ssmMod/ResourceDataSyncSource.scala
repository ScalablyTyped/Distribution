package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDataSyncSource extends StObject {
  
  /**
    * Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can synchronize data from AWS Organizations.
    */
  var AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource] = js.native
  
  /**
    * Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come online.
    */
  var IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions] = js.native
  
  /**
    * The SyncSource AWS Regions included in the resource data sync.
    */
  var SourceRegions: ResourceDataSyncSourceRegionList = js.native
  
  /**
    * The type of data source for the resource data sync. SourceType is either AwsOrganizations (if an organization is present in AWS Organizations) or singleAccountMultiRegions.
    */
  var SourceType: ResourceDataSyncSourceType = js.native
}
object ResourceDataSyncSource {
  
  @scala.inline
  def apply(SourceRegions: ResourceDataSyncSourceRegionList, SourceType: ResourceDataSyncSourceType): ResourceDataSyncSource = {
    val __obj = js.Dynamic.literal(SourceRegions = SourceRegions.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncSource]
  }
  
  @scala.inline
  implicit class ResourceDataSyncSourceMutableBuilder[Self <: ResourceDataSyncSource] (val x: Self) extends AnyVal {
    
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
    def setSourceRegionsVarargs(value: ResourceDataSyncSourceRegion*): Self = StObject.set(x, "SourceRegions", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: ResourceDataSyncSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
  }
}
