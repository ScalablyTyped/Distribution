package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateOrganizationConfigurationRequest extends StObject {
  
  /**
    * Indicates whether to automatically enable member accounts in the organization.
    */
  var AutoEnable: Boolean = js.native
  
  /**
    * An object describes which data sources will be updated.
    */
  var DataSources: js.UndefOr[OrganizationDataSourceConfigurations] = js.native
  
  /**
    * The ID of the detector to update the delegated administrator for.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}
object UpdateOrganizationConfigurationRequest {
  
  @scala.inline
  def apply(AutoEnable: Boolean, DetectorId: DetectorId): UpdateOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateOrganizationConfigurationRequestMutableBuilder[Self <: UpdateOrganizationConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSources(value: OrganizationDataSourceConfigurations): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
