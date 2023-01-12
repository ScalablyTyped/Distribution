package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.detach
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HowMany extends StObject {
  
  var howMany: Double
  
  var sourcePosition: ReturnType[js.Function0[Root]]
  
  var `type`: detach
}
object HowMany {
  
  inline def apply(howMany: Double, sourcePosition: ReturnType[js.Function0[Root]]): HowMany = {
    val __obj = js.Dynamic.literal(howMany = howMany.asInstanceOf[js.Any], sourcePosition = sourcePosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("detach")
    __obj.asInstanceOf[HowMany]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HowMany] (val x: Self) extends AnyVal {
    
    inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
    
    inline def setSourcePosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    inline def setType(value: detach): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
