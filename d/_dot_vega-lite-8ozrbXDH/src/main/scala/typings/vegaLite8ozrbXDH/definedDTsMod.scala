package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channeldefDTsMod.Value
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgEncodeEntry
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object definedDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/encode/defined.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defined(model: UnitModel): VgEncodeEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("defined")(model.asInstanceOf[js.Any]).asInstanceOf[VgEncodeEntry]
  
  inline def valueIfDefined(prop: String, value: Value[ExprRef | SignalRef]): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("valueIfDefined")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
