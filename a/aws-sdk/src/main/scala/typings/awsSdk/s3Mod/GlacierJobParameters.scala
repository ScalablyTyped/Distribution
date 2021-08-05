package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlacierJobParameters extends StObject {
  
  /**
    * Retrieval tier at which the restore will be processed.
    */
  var Tier: typings.awsSdk.s3Mod.Tier
}
object GlacierJobParameters {
  
  inline def apply(Tier: Tier): GlacierJobParameters = {
    val __obj = js.Dynamic.literal(Tier = Tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlacierJobParameters]
  }
  
  extension [Self <: GlacierJobParameters](x: Self) {
    
    inline def setTier(value: Tier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
  }
}
