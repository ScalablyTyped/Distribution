package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationEbsVolumesResult extends StObject {
  
  /**
    * An object that contains the status of whether scanning EBS volumes should be auto-enabled for new members joining the organization.
    */
  var AutoEnable: js.UndefOr[Boolean] = js.undefined
}
object OrganizationEbsVolumesResult {
  
  inline def apply(): OrganizationEbsVolumesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEbsVolumesResult]
  }
  
  extension [Self <: OrganizationEbsVolumesResult](x: Self) {
    
    inline def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableUndefined: Self = StObject.set(x, "AutoEnable", js.undefined)
  }
}
