package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddIpamOperatingRegion extends StObject {
  
  /**
    * The name of the operating Region.
    */
  var RegionName: js.UndefOr[String] = js.undefined
}
object AddIpamOperatingRegion {
  
  inline def apply(): AddIpamOperatingRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddIpamOperatingRegion]
  }
  
  extension [Self <: AddIpamOperatingRegion](x: Self) {
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
  }
}
