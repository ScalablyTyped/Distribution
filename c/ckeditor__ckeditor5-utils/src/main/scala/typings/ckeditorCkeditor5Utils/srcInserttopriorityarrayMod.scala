package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.srcPrioritiesMod.PriorityString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInserttopriorityarrayMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/inserttopriorityarray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: ObjectWithPriority */](objects: js.Array[T], objectToInsert: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(objects.asInstanceOf[js.Any], objectToInsert.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ObjectWithPriority extends StObject {
    
    /**
      * Priority of the object.
      */
    var priority: PriorityString
  }
  object ObjectWithPriority {
    
    inline def apply(priority: PriorityString): ObjectWithPriority = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectWithPriority]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectWithPriority] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: PriorityString): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
}
