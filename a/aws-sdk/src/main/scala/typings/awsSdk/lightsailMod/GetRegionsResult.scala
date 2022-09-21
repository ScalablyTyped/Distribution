package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegionsResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about your get regions request.
    */
  var regions: js.UndefOr[RegionList] = js.undefined
}
object GetRegionsResult {
  
  inline def apply(): GetRegionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegionsResult]
  }
  
  extension [Self <: GetRegionsResult](x: Self) {
    
    inline def setRegions(value: RegionList): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: Region*): Self = StObject.set(x, "regions", js.Array(value*))
  }
}
