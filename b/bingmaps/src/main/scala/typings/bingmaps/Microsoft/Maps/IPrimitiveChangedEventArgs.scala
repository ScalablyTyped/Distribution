package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrimitiveChangedEventArgs extends StObject {
  
  /** The name of the change that occured; 'locations' or 'options'. */
  var name: String
  
  /** The IPrimitive shape the event occured on. */
  var sender: IPrimitive
}
object IPrimitiveChangedEventArgs {
  
  inline def apply(name: String, sender: IPrimitive): IPrimitiveChangedEventArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrimitiveChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPrimitiveChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSender(value: IPrimitive): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
