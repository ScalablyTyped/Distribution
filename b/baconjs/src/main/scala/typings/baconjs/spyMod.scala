package typings.baconjs

import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spyMod {
  
  @JSImport("baconjs/types/spy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(spy: Spy_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(spy.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def registerObs(obs: default[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerObs")(obs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def spy(spy: Spy_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(spy.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type Spy_ = js.Function1[/* obs */ default[js.Any], js.Any]
}
