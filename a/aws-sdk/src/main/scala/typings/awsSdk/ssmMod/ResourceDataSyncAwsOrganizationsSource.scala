package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataSyncAwsOrganizationsSource extends StObject {
  
  /**
    * If an AWS Organization is present, this is either OrganizationalUnits or EntireOrganization. For OrganizationalUnits, the data is aggregated from a set of organization units. For EntireOrganization, the data is aggregated from the entire AWS Organization. 
    */
  var OrganizationSourceType: ResourceDataSyncOrganizationSourceType
  
  /**
    * The AWS Organizations organization units included in the sync.
    */
  var OrganizationalUnits: js.UndefOr[ResourceDataSyncOrganizationalUnitList] = js.undefined
}
object ResourceDataSyncAwsOrganizationsSource {
  
  inline def apply(OrganizationSourceType: ResourceDataSyncOrganizationSourceType): ResourceDataSyncAwsOrganizationsSource = {
    val __obj = js.Dynamic.literal(OrganizationSourceType = OrganizationSourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncAwsOrganizationsSource]
  }
  
  extension [Self <: ResourceDataSyncAwsOrganizationsSource](x: Self) {
    
    inline def setOrganizationSourceType(value: ResourceDataSyncOrganizationSourceType): Self = StObject.set(x, "OrganizationSourceType", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnits(value: ResourceDataSyncOrganizationalUnitList): Self = StObject.set(x, "OrganizationalUnits", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitsUndefined: Self = StObject.set(x, "OrganizationalUnits", js.undefined)
    
    inline def setOrganizationalUnitsVarargs(value: ResourceDataSyncOrganizationalUnit*): Self = StObject.set(x, "OrganizationalUnits", js.Array(value :_*))
  }
}
