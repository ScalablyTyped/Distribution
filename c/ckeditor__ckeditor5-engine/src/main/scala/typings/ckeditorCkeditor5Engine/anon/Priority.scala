package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Utils.mod.PriorityString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Priority extends StObject {
  
  var priority: js.UndefOr[PriorityString | Double] = js.undefined
}
object Priority {
  
  @scala.inline
  def apply(): Priority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Priority]
  }
  
  @scala.inline
  implicit class PriorityMutableBuilder[Self <: Priority] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: PriorityString | Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
