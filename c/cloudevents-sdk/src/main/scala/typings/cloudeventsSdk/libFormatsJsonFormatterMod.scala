package typings.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatsJsonFormatterMod {
  
  @JSImport("cloudevents-sdk/lib/formats/json/formatter", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with JSONFormatter {
    
    /* CompleteClass */
    override def format(payload: Any): Any = js.native
    
    /* CompleteClass */
    override def toString(payload: Any): String = js.native
  }
  
  trait JSONFormatter extends StObject {
    
    def format(payload: Any): Any
    
    def toString(payload: Any): String
  }
  object JSONFormatter {
    
    inline def apply(format: Any => Any, toString_ : Any => String): JSONFormatter = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[JSONFormatter]
    }
    
    extension [Self <: JSONFormatter](x: Self) {
      
      inline def setFormat(value: Any => Any): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setToString_(value: Any => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    }
  }
}
