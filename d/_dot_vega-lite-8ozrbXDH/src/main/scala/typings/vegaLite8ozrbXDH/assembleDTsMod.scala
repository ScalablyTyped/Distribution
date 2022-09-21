package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.HeaderBoolean
import typings.vegaLite8ozrbXDH.componentDTsMod.AxisComponent
import typings.vegaLite8ozrbXDH.componentDTsMod.AxisComponentIndex
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.grid
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.main
import typings.vegaTypings.axisMod.Axis
import typings.vegaTypings.signalMod.NewSignal
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assembleDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/axis/assemble.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleAxes(axisComponents: AxisComponentIndex, config: Config[SignalRef]): js.Array[Axis] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxes")(axisComponents.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[Axis]]
  
  inline def assembleAxis(axisCmpt: AxisComponent, kind: main | grid, config: Config[SignalRef]): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxis")(axisCmpt.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Axis]
  inline def assembleAxis(axisCmpt: AxisComponent, kind: main | grid, config: Config[SignalRef], opt: HeaderBoolean): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxis")(axisCmpt.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Axis]
  
  inline def assembleAxisSignals(model: Model): js.Array[NewSignal] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxisSignals")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[NewSignal]]
}
