package typings.convertLayout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait layout extends StObject {
  
  def fromEn(s: String): String = js.native
  
  def toEn(s: String): String = js.native
}
object layout {
  
  @scala.inline
  def apply(fromEn: String => String, toEn: String => String): layout = {
    val __obj = js.Dynamic.literal(fromEn = js.Any.fromFunction1(fromEn), toEn = js.Any.fromFunction1(toEn))
    __obj.asInstanceOf[layout]
  }
  
  @scala.inline
  implicit class layoutMutableBuilder[Self <: layout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromEn(value: String => String): Self = StObject.set(x, "fromEn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToEn(value: String => String): Self = StObject.set(x, "toEn", js.Any.fromFunction1(value))
  }
}
