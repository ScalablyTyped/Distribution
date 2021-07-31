package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentFirst extends StObject {
  
  var includeSelf: js.UndefOr[Boolean] = js.undefined
  
  var parentFirst: js.UndefOr[Boolean] = js.undefined
}
object ParentFirst {
  
  @scala.inline
  def apply(): ParentFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentFirst]
  }
  
  @scala.inline
  implicit class ParentFirstMutableBuilder[Self <: ParentFirst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeSelf(value: Boolean): Self = StObject.set(x, "includeSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSelfUndefined: Self = StObject.set(x, "includeSelf", js.undefined)
    
    @scala.inline
    def setParentFirst(value: Boolean): Self = StObject.set(x, "parentFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFirstUndefined: Self = StObject.set(x, "parentFirst", js.undefined)
  }
}
