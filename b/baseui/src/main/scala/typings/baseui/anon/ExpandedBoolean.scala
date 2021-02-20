package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandedBoolean extends StObject {
  
  var expanded: Boolean = js.native
}
object ExpandedBoolean {
  
  @scala.inline
  def apply(expanded: Boolean): ExpandedBoolean = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedBoolean]
  }
  
  @scala.inline
  implicit class ExpandedBooleanMutableBuilder[Self <: ExpandedBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
  }
}
