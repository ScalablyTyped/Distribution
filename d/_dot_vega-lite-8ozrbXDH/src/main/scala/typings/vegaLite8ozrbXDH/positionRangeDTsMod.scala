package typings.vegaLite8ozrbXDH

import org.scalablytyped.runtime.StringDictionary
import typings.vegaLite8ozrbXDH.anon.DefaultPos2
import typings.vegaLite8ozrbXDH.anon.DefaultPosDefaultPos2
import typings.vegaLite8ozrbXDH.anon.MidPointParamschannelx2y2
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

object positionRangeDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/encode/position-range.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pointOrRangePosition(channel: x | y, model: UnitModel, hasDefaultPosDefaultPos2Range: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOrRangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2Range.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  inline def position2Ref(
    hasChannelChannelDefChannel2DefMarkDefConfigScaleNameScaleStackOffsetDefaultRef: MidPointParamschannelx2y2
  ): VgValueRef | js.Array[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("position2Ref")(hasChannelChannelDefChannel2DefMarkDefConfigScaleNameScaleStackOffsetDefaultRef.asInstanceOf[js.Any]).asInstanceOf[VgValueRef | js.Array[VgValueRef]]
  
  inline def rangePosition(channel: x | y | theta | radius, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
