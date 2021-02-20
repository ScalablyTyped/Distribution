package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expanded extends StObject {
  
  var expanded: js.Array[typings.react.mod.Key] = js.native
}
object Expanded {
  
  @scala.inline
  def apply(expanded: js.Array[typings.react.mod.Key]): Expanded = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expanded]
  }
  
  @scala.inline
  implicit class ExpandedMutableBuilder[Self <: Expanded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: js.Array[typings.react.mod.Key]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedVarargs(value: typings.react.mod.Key*): Self = StObject.set(x, "expanded", js.Array(value :_*))
  }
}
