package typings.bytebuffer

import typings.long.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Length extends StObject {
    
    var length: Double
    
    var string: String
  }
  object Length {
    
    @scala.inline
    def apply(length: Double, string: String): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  trait LengthValue extends StObject {
    
    var length: Double
    
    var value: Long
  }
  object LengthValue {
    
    @scala.inline
    def apply(length: Double, value: Long): LengthValue = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LengthValue]
    }
    
    @scala.inline
    implicit class LengthValueMutableBuilder[Self <: LengthValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var length: Double
    
    var value: Double
  }
  object Value {
    
    @scala.inline
    def apply(length: Double, value: Double): Value = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
