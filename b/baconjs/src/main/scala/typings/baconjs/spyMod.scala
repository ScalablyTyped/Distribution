package typings.baconjs

import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spyMod {
  
  @JSImport("baconjs/types/spy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(spy: Spy_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(spy.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def registerObs(obs: default[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerObs")(obs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def spy(spy: Spy_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(spy.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type Spy_ = js.Function1[/* obs */ default[Any], Any]
}
