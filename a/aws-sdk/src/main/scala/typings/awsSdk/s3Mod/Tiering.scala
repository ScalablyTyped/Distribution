package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tiering extends StObject {
  
  /**
    * S3 Intelligent-Tiering access tier. See Storage class for automatically optimizing frequently and infrequently accessed objects for a list of access tiers in the S3 Intelligent-Tiering storage class.
    */
  var AccessTier: IntelligentTieringAccessTier
  
  /**
    * The number of consecutive days of no access after which an object will be eligible to be transitioned to the corresponding tier. The minimum number of days specified for Archive Access tier must be at least 90 days and Deep Archive Access tier must be at least 180 days. The maximum can be up to 2 years (730 days).
    */
  var Days: IntelligentTieringDays
}
object Tiering {
  
  inline def apply(AccessTier: IntelligentTieringAccessTier, Days: IntelligentTieringDays): Tiering = {
    val __obj = js.Dynamic.literal(AccessTier = AccessTier.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tiering]
  }
  
  extension [Self <: Tiering](x: Self) {
    
    inline def setAccessTier(value: IntelligentTieringAccessTier): Self = StObject.set(x, "AccessTier", value.asInstanceOf[js.Any])
    
    inline def setDays(value: IntelligentTieringDays): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
  }
}
