package typings.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterMod {
  
  @JSImport("cloudevents-sdk/lib/formats/json/formatter", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with JSONFormatter {
    
    /* CompleteClass */
    override def format(payload: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def toString(payload: js.Any): String = js.native
  }
  
  trait JSONFormatter extends StObject {
    
    def format(payload: js.Any): js.Any
    
    def toString(payload: js.Any): String
  }
  object JSONFormatter {
    
    @scala.inline
    def apply(format: js.Any => js.Any, toString_ : js.Any => String): JSONFormatter = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[JSONFormatter]
    }
    
    @scala.inline
    implicit class JSONFormatterMutableBuilder[Self <: JSONFormatter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: js.Any => js.Any): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToString_(value: js.Any => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    }
  }
}
