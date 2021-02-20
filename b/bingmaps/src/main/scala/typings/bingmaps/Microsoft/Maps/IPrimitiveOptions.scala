package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrimitiveOptions extends StObject {
  
  /** The css cursor to show when the IPrimitive has mouse events on it. Default value is pointer (hand). */
  var cursor: js.UndefOr[String] = js.native
  
  /** Boolean indicating whether the IPrimitive is visible. */
  var visible: js.UndefOr[Boolean] = js.native
}
object IPrimitiveOptions {
  
  @scala.inline
  def apply(): IPrimitiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPrimitiveOptions]
  }
  
  @scala.inline
  implicit class IPrimitiveOptionsMutableBuilder[Self <: IPrimitiveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
