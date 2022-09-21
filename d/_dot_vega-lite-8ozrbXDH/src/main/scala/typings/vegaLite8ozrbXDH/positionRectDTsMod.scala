package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.FieldDef
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.radius
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.theta
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.y
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgEncodeEntry
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionRectDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/encode/position-rect.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rectBinRef(hasFieldDefScaleNameBandPositionOffset: FieldDef): VgValueRef = ^.asInstanceOf[js.Dynamic].applyDynamic("rectBinRef")(hasFieldDefScaleNameBandPositionOffset.asInstanceOf[js.Any]).asInstanceOf[VgValueRef]
  
  inline def rectPosition(model: UnitModel, channel: x | y | theta | radius): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
