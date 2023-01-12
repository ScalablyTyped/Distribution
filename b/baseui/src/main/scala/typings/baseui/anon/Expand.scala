package typings.baseui.anon

import typings.baseui.baseuiStrings.expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expand extends StObject {
  
  val expand: typings.baseui.baseuiStrings.expand
}
object Expand {
  
  inline def apply(): Expand = {
    val __obj = js.Dynamic.literal(expand = "expand")
    __obj.asInstanceOf[Expand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expand] (val x: Self) extends AnyVal {
    
    inline def setExpand(value: expand): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
  }
}
