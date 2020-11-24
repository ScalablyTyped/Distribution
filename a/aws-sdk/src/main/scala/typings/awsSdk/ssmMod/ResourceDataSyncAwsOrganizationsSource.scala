package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDataSyncAwsOrganizationsSource extends js.Object {
  
  /**
    * If an AWS Organization is present, this is either OrganizationalUnits or EntireOrganization. For OrganizationalUnits, the data is aggregated from a set of organization units. For EntireOrganization, the data is aggregated from the entire AWS Organization. 
    */
  var OrganizationSourceType: ResourceDataSyncOrganizationSourceType = js.native
  
  /**
    * The AWS Organizations organization units included in the sync.
    */
  var OrganizationalUnits: js.UndefOr[ResourceDataSyncOrganizationalUnitList] = js.native
}
object ResourceDataSyncAwsOrganizationsSource {
  
  @scala.inline
  def apply(OrganizationSourceType: ResourceDataSyncOrganizationSourceType): ResourceDataSyncAwsOrganizationsSource = {
    val __obj = js.Dynamic.literal(OrganizationSourceType = OrganizationSourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncAwsOrganizationsSource]
  }
  
  @scala.inline
  implicit class ResourceDataSyncAwsOrganizationsSourceOps[Self <: ResourceDataSyncAwsOrganizationsSource] (val x: Self) extends AnyVal {
    
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
    def setOrganizationSourceType(value: ResourceDataSyncOrganizationSourceType): Self = this.set("OrganizationSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationalUnitsVarargs(value: ResourceDataSyncOrganizationalUnit*): Self = this.set("OrganizationalUnits", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationalUnits(value: ResourceDataSyncOrganizationalUnitList): Self = this.set("OrganizationalUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationalUnits: Self = this.set("OrganizationalUnits", js.undefined)
  }
}
