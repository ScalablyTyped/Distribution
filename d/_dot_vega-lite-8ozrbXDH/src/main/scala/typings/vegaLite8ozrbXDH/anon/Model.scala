package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.channelDTsMod.PolarPositionChannel
import typings.vegaLite8ozrbXDH.channelDTsMod.PositionChannel
import typings.vegaLite8ozrbXDH.scaleComponentDTsMod.ScaleComponent
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.mid
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.zeroOrMax
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.zeroOrMin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  var channel: PositionChannel | PolarPositionChannel
  
  var defaultPos: mid | zeroOrMin | zeroOrMax | Null
  
  var model: UnitModel
  
  var scale: ScaleComponent
  
  var scaleName: String
}
object Model {
  
  inline def apply(
    channel: PositionChannel | PolarPositionChannel,
    model: UnitModel,
    scale: ScaleComponent,
    scaleName: String
  ): Model = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any], defaultPos = null)
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setChannel(value: PositionChannel | PolarPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setDefaultPos(value: mid | zeroOrMin | zeroOrMax): Self = StObject.set(x, "defaultPos", value.asInstanceOf[js.Any])
    
    inline def setDefaultPosNull: Self = StObject.set(x, "defaultPos", null)
    
    inline def setModel(value: UnitModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setScale(value: ScaleComponent): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
  }
}
