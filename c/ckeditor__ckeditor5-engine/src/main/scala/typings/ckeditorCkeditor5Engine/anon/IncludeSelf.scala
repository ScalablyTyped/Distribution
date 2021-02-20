package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeSelf extends StObject {
  
  var includeSelf: Boolean = js.native
  
  var parentFirst: Boolean = js.native
}
object IncludeSelf {
  
  @scala.inline
  def apply(includeSelf: Boolean, parentFirst: Boolean): IncludeSelf = {
    val __obj = js.Dynamic.literal(includeSelf = includeSelf.asInstanceOf[js.Any], parentFirst = parentFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeSelf]
  }
  
  @scala.inline
  implicit class IncludeSelfMutableBuilder[Self <: IncludeSelf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeSelf(value: Boolean): Self = StObject.set(x, "includeSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFirst(value: Boolean): Self = StObject.set(x, "parentFirst", value.asInstanceOf[js.Any])
  }
}
