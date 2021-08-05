package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Seeded extends StObject {
  
  var seed: Seed
}
object Seeded {
  
  inline def apply(seed: Seed): Seeded = {
    val __obj = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seeded]
  }
  
  extension [Self <: Seeded](x: Self) {
    
    inline def setSeed(value: Seed): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
  }
}
