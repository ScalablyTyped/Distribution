package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeSelfParentFirst extends StObject {
  
  var includeSelf: Boolean
  
  var parentFirst: js.UndefOr[Boolean] = js.undefined
}
object IncludeSelfParentFirst {
  
  @scala.inline
  def apply(includeSelf: Boolean): IncludeSelfParentFirst = {
    val __obj = js.Dynamic.literal(includeSelf = includeSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeSelfParentFirst]
  }
  
  @scala.inline
  implicit class IncludeSelfParentFirstMutableBuilder[Self <: IncludeSelfParentFirst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeSelf(value: Boolean): Self = StObject.set(x, "includeSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFirst(value: Boolean): Self = StObject.set(x, "parentFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFirstUndefined: Self = StObject.set(x, "parentFirst", js.undefined)
  }
}
