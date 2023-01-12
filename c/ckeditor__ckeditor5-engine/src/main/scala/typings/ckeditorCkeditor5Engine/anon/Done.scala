package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineBooleans.`false`
import typings.ckeditorCkeditor5Engine.srcModelTreewalkerMod.TreeWalkerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Done extends StObject {
  
  var done: `false`
  
  var value: TreeWalkerValue
}
object Done {
  
  inline def apply(value: TreeWalkerValue): Done = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Done] (val x: Self) extends AnyVal {
    
    inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TreeWalkerValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
