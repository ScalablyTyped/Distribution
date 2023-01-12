package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentFirst extends StObject {
  
  var includeSelf: js.UndefOr[Boolean] = js.undefined
  
  var parentFirst: js.UndefOr[Boolean] = js.undefined
}
object ParentFirst {
  
  inline def apply(): ParentFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentFirst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentFirst] (val x: Self) extends AnyVal {
    
    inline def setIncludeSelf(value: Boolean): Self = StObject.set(x, "includeSelf", value.asInstanceOf[js.Any])
    
    inline def setIncludeSelfUndefined: Self = StObject.set(x, "includeSelf", js.undefined)
    
    inline def setParentFirst(value: Boolean): Self = StObject.set(x, "parentFirst", value.asInstanceOf[js.Any])
    
    inline def setParentFirstUndefined: Self = StObject.set(x, "parentFirst", js.undefined)
  }
}
