package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShuffleConfig extends StObject {
  
  /**
    * Determines the shuffling order in ShuffleConfig value.
    */
  var Seed: typings.awsSdk.sagemakerMod.Seed
}
object ShuffleConfig {
  
  inline def apply(Seed: Seed): ShuffleConfig = {
    val __obj = js.Dynamic.literal(Seed = Seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShuffleConfig]
  }
  
  extension [Self <: ShuffleConfig](x: Self) {
    
    inline def setSeed(value: Seed): Self = StObject.set(x, "Seed", value.asInstanceOf[js.Any])
  }
}
