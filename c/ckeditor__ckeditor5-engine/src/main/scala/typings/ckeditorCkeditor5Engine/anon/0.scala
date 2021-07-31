package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Utils.mod.PriorityString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var priority: PriorityString | Double
}
object `0` {
  
  @scala.inline
  def apply(priority: PriorityString | Double): `0` = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: PriorityString | Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
