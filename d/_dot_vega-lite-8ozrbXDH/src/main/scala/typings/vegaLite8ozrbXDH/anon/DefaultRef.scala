package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgEncodeChannel
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgValueRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultRef extends StObject {
  
  var defaultRef: js.UndefOr[VgValueRef] = js.undefined
  
  var defaultValue: js.UndefOr[
    (typings.vegaLite8ozrbXDH.channeldefDTsMod.Value[ExprRef | SignalRef]) | SignalRef
  ] = js.undefined
  
  var vgChannel: js.UndefOr[VgEncodeChannel] = js.undefined
}
object DefaultRef {
  
  inline def apply(): DefaultRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRef]
  }
  
  extension [Self <: DefaultRef](x: Self) {
    
    inline def setDefaultRef(value: VgValueRef): Self = StObject.set(x, "defaultRef", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefUndefined: Self = StObject.set(x, "defaultRef", js.undefined)
    
    inline def setDefaultValue(value: (typings.vegaLite8ozrbXDH.channeldefDTsMod.Value[ExprRef | SignalRef]) | SignalRef): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: (Double | String)*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setVgChannel(value: VgEncodeChannel): Self = StObject.set(x, "vgChannel", value.asInstanceOf[js.Any])
    
    inline def setVgChannelUndefined: Self = StObject.set(x, "vgChannel", js.undefined)
  }
}
