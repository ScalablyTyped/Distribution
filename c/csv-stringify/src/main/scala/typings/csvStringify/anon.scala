package typings.csvStringify

import typings.csvStringify.es5Mod.Cast
import typings.csvStringify.es5Mod.CastingContext
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Boolean extends StObject {
    
    var boolean: js.UndefOr[Cast[scala.Boolean]] = js.native
    
    var date: js.UndefOr[Cast[typings.std.Date]] = js.native
    
    var number: js.UndefOr[Cast[Double]] = js.native
    
    /**
      * Custom formatter for generic object values
      */
    var `object`: js.UndefOr[Cast[Record[String, _]]] = js.native
    
    var string: js.UndefOr[Cast[String]] = js.native
  }
  object Boolean {
    
    @scala.inline
    def apply(): Boolean = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Boolean]
    }
    
    @scala.inline
    implicit class BooleanMutableBuilder[Self <: Boolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolean(value: (scala.Boolean, /* context */ CastingContext) => String): Self = StObject.set(x, "boolean", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setDate(value: (typings.std.Date, /* context */ CastingContext) => String): Self = StObject.set(x, "date", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setNumber(value: (Double, /* context */ CastingContext) => String): Self = StObject.set(x, "number", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setObject(value: (Record[String, _], /* context */ CastingContext) => String): Self = StObject.set(x, "object", js.Any.fromFunction2(value))
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setString(value: (String, /* context */ CastingContext) => String): Self = StObject.set(x, "string", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
  
  @js.native
  trait Date extends StObject {
    
    var boolean: js.UndefOr[typings.csvStringify.mod.Cast[scala.Boolean]] = js.native
    
    var date: js.UndefOr[typings.csvStringify.mod.Cast[typings.std.Date]] = js.native
    
    var number: js.UndefOr[typings.csvStringify.mod.Cast[Double]] = js.native
    
    /**
      * Custom formatter for generic object values
      */
    var `object`: js.UndefOr[typings.csvStringify.mod.Cast[Record[String, _]]] = js.native
    
    var string: js.UndefOr[typings.csvStringify.mod.Cast[String]] = js.native
  }
  object Date {
    
    @scala.inline
    def apply(): Date = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolean(value: (scala.Boolean, /* context */ typings.csvStringify.mod.CastingContext) => String): Self = StObject.set(x, "boolean", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setDate(value: (typings.std.Date, /* context */ typings.csvStringify.mod.CastingContext) => String): Self = StObject.set(x, "date", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setNumber(value: (Double, /* context */ typings.csvStringify.mod.CastingContext) => String): Self = StObject.set(x, "number", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setObject(value: (Record[String, _], /* context */ typings.csvStringify.mod.CastingContext) => String): Self = StObject.set(x, "object", js.Any.fromFunction2(value))
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setString(value: (String, /* context */ typings.csvStringify.mod.CastingContext) => String): Self = StObject.set(x, "string", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
}
