package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Seeded extends StObject {
  
  var seed: Seed = js.native
}
object Seeded {
  
  @scala.inline
  def apply(seed: Seed): Seeded = {
    val __obj = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seeded]
  }
  
  @scala.inline
  implicit class SeededMutableBuilder[Self <: Seeded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeed(value: Seed): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
  }
}
