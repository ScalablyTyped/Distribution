package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdefaultsDrawTime extends StObject {
  
  val drawTime: String
  
  val propagate: Boolean
}
object TypeofdefaultsDrawTime {
  
  inline def apply(drawTime: String, propagate: Boolean): TypeofdefaultsDrawTime = {
    val __obj = js.Dynamic.literal(drawTime = drawTime.asInstanceOf[js.Any], propagate = propagate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdefaultsDrawTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofdefaultsDrawTime] (val x: Self) extends AnyVal {
    
    inline def setDrawTime(value: String): Self = StObject.set(x, "drawTime", value.asInstanceOf[js.Any])
    
    inline def setPropagate(value: Boolean): Self = StObject.set(x, "propagate", value.asInstanceOf[js.Any])
  }
}
