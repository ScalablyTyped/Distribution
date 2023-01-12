package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings.fortune
import typings.cookieclicker.cookieclickerStrings.fortuneCPS
import typings.cookieclicker.cookieclickerStrings.fortuneGC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FortuneTickerEffect
  extends StObject
     with TickerEffectClass {
  
  /**
    * The fortune subtype itself
    */
  var sub: GenericTieredUpgrade[fortune] | fortuneGC | fortuneCPS
  
  @JSName("type")
  var type_FortuneTickerEffect: fortune
}
object FortuneTickerEffect {
  
  inline def apply(sub: GenericTieredUpgrade[fortune] | fortuneGC | fortuneCPS): FortuneTickerEffect = {
    val __obj = js.Dynamic.literal(sub = sub.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fortune")
    __obj.asInstanceOf[FortuneTickerEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FortuneTickerEffect] (val x: Self) extends AnyVal {
    
    inline def setSub(value: GenericTieredUpgrade[fortune] | fortuneGC | fortuneCPS): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setType(value: fortune): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
