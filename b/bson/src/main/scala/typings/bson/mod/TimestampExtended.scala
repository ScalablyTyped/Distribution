package typings.bson.mod

import typings.bson.anon.I
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampExtended extends StObject {
  
  @JSName("$timestamp")
  var $timestamp: I
}
object TimestampExtended {
  
  inline def apply($timestamp: I): TimestampExtended = {
    val __obj = js.Dynamic.literal($timestamp = $timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampExtended]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimestampExtended] (val x: Self) extends AnyVal {
    
    inline def set$timestamp(value: I): Self = StObject.set(x, "$timestamp", value.asInstanceOf[js.Any])
  }
}
