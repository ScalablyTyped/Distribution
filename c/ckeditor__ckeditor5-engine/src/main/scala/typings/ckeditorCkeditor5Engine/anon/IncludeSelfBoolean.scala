package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeSelfBoolean extends StObject {
  
  var includeSelf: Boolean = js.native
}
object IncludeSelfBoolean {
  
  @scala.inline
  def apply(includeSelf: Boolean): IncludeSelfBoolean = {
    val __obj = js.Dynamic.literal(includeSelf = includeSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeSelfBoolean]
  }
  
  @scala.inline
  implicit class IncludeSelfBooleanMutableBuilder[Self <: IncludeSelfBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeSelf(value: Boolean): Self = StObject.set(x, "includeSelf", value.asInstanceOf[js.Any])
  }
}
