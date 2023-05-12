package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngleLines extends StObject {
  
  var angleLines: Fallback
}
object AngleLines {
  
  inline def apply(angleLines: Fallback): AngleLines = {
    val __obj = js.Dynamic.literal(angleLines = angleLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngleLines]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AngleLines] (val x: Self) extends AnyVal {
    
    inline def setAngleLines(value: Fallback): Self = StObject.set(x, "angleLines", value.asInstanceOf[js.Any])
  }
}
