package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channeldefDTsMod.ChannelDef
import typings.vegaLite8ozrbXDH.guideDotDTsMod.GuideEncodingConditionalValueDef
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgEncodeEntry
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/encode/conditional.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapCondition[CD /* <: ChannelDef[String] | GuideEncodingConditionalValueDef */](
    model: UnitModel,
    channelDef: CD,
    vgChannel: String,
    refFn: js.Function1[/* cDef */ CD, VgValueRef]
  ): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapCondition")(model.asInstanceOf[js.Any], channelDef.asInstanceOf[js.Any], vgChannel.asInstanceOf[js.Any], refFn.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
