package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePlatformVersionResult extends StObject {
  
  /**
    * Detailed information about the version of the custom platform.
    */
  var PlatformSummary: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformSummary] = js.undefined
}
object DeletePlatformVersionResult {
  
  inline def apply(): DeletePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePlatformVersionResult]
  }
  
  extension [Self <: DeletePlatformVersionResult](x: Self) {
    
    inline def setPlatformSummary(value: PlatformSummary): Self = StObject.set(x, "PlatformSummary", value.asInstanceOf[js.Any])
    
    inline def setPlatformSummaryUndefined: Self = StObject.set(x, "PlatformSummary", js.undefined)
  }
}
