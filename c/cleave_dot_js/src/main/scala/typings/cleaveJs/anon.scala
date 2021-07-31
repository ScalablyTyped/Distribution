package typings.cleaveJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RawValue extends StObject {
    
    var rawValue: String
  }
  object RawValue {
    
    @scala.inline
    def apply(rawValue: String): RawValue = {
      val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawValue]
    }
    
    @scala.inline
    implicit class RawValueMutableBuilder[Self <: RawValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    }
  }
}
