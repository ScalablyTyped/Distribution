package typings.baconjs

import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spyMod {
  
  @JSImport("baconjs/types/spy", JSImport.Default)
  @js.native
  def default(spy: Spy_): Double = js.native
  
  @JSImport("baconjs/types/spy", "registerObs")
  @js.native
  def registerObs(obs: default[_]): Unit = js.native
  
  @JSImport("baconjs/types/spy", "spy")
  @js.native
  def spy(spy: Spy_): Double = js.native
  
  type Spy_ = js.Function1[/* obs */ default[js.Any], js.Any]
}
