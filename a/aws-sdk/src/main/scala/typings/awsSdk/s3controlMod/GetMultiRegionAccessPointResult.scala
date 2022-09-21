package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMultiRegionAccessPointResult extends StObject {
  
  /**
    * A container element containing the details of the requested Multi-Region Access Point.
    */
  var AccessPoint: js.UndefOr[MultiRegionAccessPointReport] = js.undefined
}
object GetMultiRegionAccessPointResult {
  
  inline def apply(): GetMultiRegionAccessPointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMultiRegionAccessPointResult]
  }
  
  extension [Self <: GetMultiRegionAccessPointResult](x: Self) {
    
    inline def setAccessPoint(value: MultiRegionAccessPointReport): Self = StObject.set(x, "AccessPoint", value.asInstanceOf[js.Any])
    
    inline def setAccessPointUndefined: Self = StObject.set(x, "AccessPoint", js.undefined)
  }
}
