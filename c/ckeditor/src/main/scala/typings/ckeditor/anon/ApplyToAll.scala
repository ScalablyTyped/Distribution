package typings.ckeditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyToAll extends StObject {
  
  var applyToAll: js.UndefOr[Boolean] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
}
object ApplyToAll {
  
  @scala.inline
  def apply(): ApplyToAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyToAll]
  }
  
  @scala.inline
  implicit class ApplyToAllMutableBuilder[Self <: ApplyToAll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyToAll(value: Boolean): Self = StObject.set(x, "applyToAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyToAllUndefined: Self = StObject.set(x, "applyToAll", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
