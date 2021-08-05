package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wrinkler extends StObject {
  
  var close: Double
  
  var hp: Double
  
  var hurt: Double
  
  var id: Double
  
  var phase: Double
  
  var r: Double
  
  var selected: PseudoBoolean
  
  var sucked: Double
  
  var `type`: Double
  
  var x: Double
  
  var y: Double
}
object Wrinkler {
  
  inline def apply(
    close: Double,
    hp: Double,
    hurt: Double,
    id: Double,
    phase: Double,
    r: Double,
    selected: PseudoBoolean,
    sucked: Double,
    `type`: Double,
    x: Double,
    y: Double
  ): Wrinkler = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], hp = hp.asInstanceOf[js.Any], hurt = hurt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], sucked = sucked.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrinkler]
  }
  
  extension [Self <: Wrinkler](x: Self) {
    
    inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setHp(value: Double): Self = StObject.set(x, "hp", value.asInstanceOf[js.Any])
    
    inline def setHurt(value: Double): Self = StObject.set(x, "hurt", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: Double): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: PseudoBoolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSucked(value: Double): Self = StObject.set(x, "sucked", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
