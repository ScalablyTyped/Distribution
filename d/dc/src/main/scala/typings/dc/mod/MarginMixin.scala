package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginMixin[T] extends StObject {
  
  def margins(): Margins
  def margins(t: Margins): T
  @JSName("margins")
  var margins_Original: IGetSet[Margins, T]
}
object MarginMixin {
  
  inline def apply[T](margins: IGetSet[Margins, T]): MarginMixin[T] = {
    val __obj = js.Dynamic.literal(margins = margins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginMixin[T]]
  }
  
  extension [Self <: MarginMixin[?], T](x: Self & MarginMixin[T]) {
    
    inline def setMargins(value: IGetSet[Margins, T]): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
  }
}
