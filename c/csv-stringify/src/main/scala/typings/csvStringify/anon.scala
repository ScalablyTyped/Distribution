package typings.csvStringify

import typings.csvStringify.mod.Cast
import typings.csvStringify.mod.CastReturnObject
import typings.csvStringify.mod.CastingContext
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bigint extends StObject {
    
    var bigint: js.UndefOr[Cast[js.BigInt]] = js.undefined
    
    var boolean: js.UndefOr[Cast[Boolean]] = js.undefined
    
    var date: js.UndefOr[Cast[js.Date]] = js.undefined
    
    var number: js.UndefOr[Cast[Double]] = js.undefined
    
    /**
      * Custom formatter for generic object values
      */
    var `object`: js.UndefOr[Cast[Record[String, Any]]] = js.undefined
    
    var string: js.UndefOr[Cast[String]] = js.undefined
  }
  object Bigint {
    
    inline def apply(): Bigint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bigint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bigint] (val x: Self) extends AnyVal {
      
      inline def setBigint(value: (js.BigInt, /* context */ CastingContext) => String | CastReturnObject): Self = StObject.set(x, "bigint", js.Any.fromFunction2(value))
      
      inline def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
      
      inline def setBoolean(value: (Boolean, /* context */ CastingContext) => String | CastReturnObject): Self = StObject.set(x, "boolean", js.Any.fromFunction2(value))
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setDate(value: (js.Date, /* context */ CastingContext) => String | CastReturnObject): Self = StObject.set(x, "date", js.Any.fromFunction2(value))
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setNumber(value: (Double, /* context */ CastingContext) => String | CastReturnObject): Self = StObject.set(x, "number", js.Any.fromFunction2(value))
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setObject(value: (Record[String, Any], /* context */ CastingContext) => String | CastReturnObject): Self = StObject.set(x, "object", js.Any.fromFunction2(value))
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setString(value: (String, /* context */ CastingContext) => String | CastReturnObject): Self = StObject.set(x, "string", js.Any.fromFunction2(value))
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
}
