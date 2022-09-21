package typings.vegaLite8ozrbXDH

import org.scalablytyped.runtime.StringDictionary
import typings.vegaLite8ozrbXDH.anon.DefaultPos
import typings.vegaLite8ozrbXDH.anon.MidPointParamschannelxyra
import typings.vegaLite8ozrbXDH.anon.Model
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.radius
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.theta
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.y
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionPointDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/encode/position-point.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pointPosition(channel: x | y | theta | radius, model: UnitModel, hasDefaultPosVgChannel: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosVgChannel.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  inline def pointPositionDefaultRef(hasModelDefaultPosChannelScaleNameScale: Model): js.Function0[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointPositionDefaultRef")(hasModelDefaultPosChannelScaleNameScale.asInstanceOf[js.Any]).asInstanceOf[js.Function0[VgValueRef]]
  
  inline def positionRef(params: MidPointParamschannelxyra): VgValueRef | js.Array[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("positionRef")(params.asInstanceOf[js.Any]).asInstanceOf[VgValueRef | js.Array[VgValueRef]]
}
