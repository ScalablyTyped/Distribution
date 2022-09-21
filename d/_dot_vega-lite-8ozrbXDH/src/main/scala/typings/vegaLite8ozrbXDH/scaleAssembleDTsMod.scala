package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channelDTsMod.ScaleChannel
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgRange
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleAssembleDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/assemble.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleScaleRange(scaleRange: VgRange, scaleName: String, channel: ScaleChannel): VgRange = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleScaleRange")(scaleRange.asInstanceOf[js.Any], scaleName.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[VgRange]
  inline def assembleScaleRange(scaleRange: VgRange, scaleName: String, channel: ScaleChannel, model: Model): VgRange = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleScaleRange")(scaleRange.asInstanceOf[js.Any], scaleName.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[VgRange]
  
  inline def assembleScales(model: Model): js.Array[VgScale] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleScales")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[VgScale]]
  
  inline def assembleScalesForModel(model: Model): js.Array[VgScale] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleScalesForModel")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[VgScale]]
}
