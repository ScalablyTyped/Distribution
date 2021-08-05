package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDistributionBundlesResult extends StObject {
  
  /**
    * An object that describes a distribution bundle.
    */
  var bundles: js.UndefOr[DistributionBundleList] = js.undefined
}
object GetDistributionBundlesResult {
  
  inline def apply(): GetDistributionBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionBundlesResult]
  }
  
  extension [Self <: GetDistributionBundlesResult](x: Self) {
    
    inline def setBundles(value: DistributionBundleList): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: DistributionBundle*): Self = StObject.set(x, "bundles", js.Array(value :_*))
  }
}
