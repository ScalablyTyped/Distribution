package typings.cordovaPluginGlobalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dst extends StObject {
    
    var dst: Boolean
  }
  object Dst {
    
    @scala.inline
    def apply(dst: Boolean): Dst = {
      val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dst]
    }
    
    @scala.inline
    implicit class DstMutableBuilder[Self <: Dst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDst(value: Boolean): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatLength extends StObject {
    
    var formatLength: js.UndefOr[String] = js.undefined
    
    // "short" | "medium" | "long" | "full"
    var selector: js.UndefOr[String] = js.undefined
  }
  object FormatLength {
    
    @scala.inline
    def apply(): FormatLength = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatLength]
    }
    
    @scala.inline
    implicit class FormatLengthMutableBuilder[Self <: FormatLength] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatLength(value: String): Self = StObject.set(x, "formatLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatLengthUndefined: Self = StObject.set(x, "formatLength", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
  
  trait Item extends StObject {
    
    var item: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Item {
    
    @scala.inline
    def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Type {
    
    @scala.inline
    def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    @scala.inline
    def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueArray extends StObject {
    
    var value: js.Array[String]
  }
  object ValueArray {
    
    @scala.inline
    def apply(value: js.Array[String]): ValueArray = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueArray]
    }
    
    @scala.inline
    implicit class ValueArrayMutableBuilder[Self <: ValueArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait ValueNumber extends StObject {
    
    var value: Double
  }
  object ValueNumber {
    
    @scala.inline
    def apply(value: Double): ValueNumber = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueNumber]
    }
    
    @scala.inline
    implicit class ValueNumberMutableBuilder[Self <: ValueNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
