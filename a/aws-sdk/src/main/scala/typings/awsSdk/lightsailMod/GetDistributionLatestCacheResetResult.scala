package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDistributionLatestCacheResetResult extends StObject {
  
  /**
    * The timestamp of the last cache reset (e.g., 1479734909.17) in Unix time format.
    */
  var createTime: js.UndefOr[IsoDate] = js.undefined
  
  /**
    * The status of the last cache reset.
    */
  var status: js.UndefOr[String] = js.undefined
}
object GetDistributionLatestCacheResetResult {
  
  inline def apply(): GetDistributionLatestCacheResetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionLatestCacheResetResult]
  }
  
  extension [Self <: GetDistributionLatestCacheResetResult](x: Self) {
    
    inline def setCreateTime(value: IsoDate): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
