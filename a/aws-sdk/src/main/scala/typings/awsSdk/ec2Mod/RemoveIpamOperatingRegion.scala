package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveIpamOperatingRegion extends StObject {
  
  /**
    * The name of the operating Region you want to remove.
    */
  var RegionName: js.UndefOr[String] = js.undefined
}
object RemoveIpamOperatingRegion {
  
  inline def apply(): RemoveIpamOperatingRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveIpamOperatingRegion]
  }
  
  extension [Self <: RemoveIpamOperatingRegion](x: Self) {
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
  }
}
