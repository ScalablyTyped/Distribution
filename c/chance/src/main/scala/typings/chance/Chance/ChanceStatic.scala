package typings.chance.Chance

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChanceStatic
  extends StObject
     with Instantiable0[typings.chance.Chance.Chance]
     with Instantiable1[
      (/* generator */ js.Function0[Any]) | (/* seed (repeated) */ Seed), 
      typings.chance.Chance.Chance
    ] {
  
  def apply(): typings.chance.Chance.Chance = js.native
  def apply(generator: js.Function0[Any]): typings.chance.Chance.Chance = js.native
  def apply(seed: Seed*): typings.chance.Chance.Chance = js.native
}
