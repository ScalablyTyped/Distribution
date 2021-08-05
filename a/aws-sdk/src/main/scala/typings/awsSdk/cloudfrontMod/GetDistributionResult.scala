package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDistributionResult extends StObject {
  
  /**
    * The distribution's information.
    */
  var Distribution: js.UndefOr[typings.awsSdk.cloudfrontMod.Distribution] = js.undefined
  
  /**
    * The current version of the distribution's information. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
}
object GetDistributionResult {
  
  inline def apply(): GetDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionResult]
  }
  
  extension [Self <: GetDistributionResult](x: Self) {
    
    inline def setDistribution(value: Distribution): Self = StObject.set(x, "Distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "Distribution", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
