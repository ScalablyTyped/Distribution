package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasGradient extends StObject {
  
  def addColorStop(index: Double, color: String): Unit = js.native
}
object CanvasGradient {
  
  @scala.inline
  def apply(addColorStop: (Double, String) => Unit): CanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.asInstanceOf[CanvasGradient]
  }
  
  @scala.inline
  implicit class CanvasGradientMutableBuilder[Self <: CanvasGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddColorStop(value: (Double, String) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
  }
}
