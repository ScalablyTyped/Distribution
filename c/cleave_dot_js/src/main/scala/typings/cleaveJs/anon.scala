package typings.cleaveJs

import typings.cleaveJs.mod.Properties
import typings.cleaveJs.optionsMod.CleaveOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<cleave.js.cleave.js.^, 'destroy'> */
  trait Omitdestroy extends StObject {
    
    var constructor: js.Function2[/* selector */ String | HTMLElement, /* options */ CleaveOptions, Any]
    
    var getFormattedValue: js.Function0[String]
    
    var getISOFormatDate: js.Function0[String]
    
    var getRawValue: js.Function0[String]
    
    var properties: Properties
    
    var setPhoneRegionCode: js.Function1[/* regionCode */ String, Unit]
    
    var setRawValue: js.Function1[/* value */ String, Unit]
  }
  object Omitdestroy {
    
    inline def apply(
      constructor: (/* selector */ String | HTMLElement, /* options */ CleaveOptions) => Any,
      getFormattedValue: () => String,
      getISOFormatDate: () => String,
      getRawValue: () => String,
      properties: Properties,
      setPhoneRegionCode: /* regionCode */ String => Unit,
      setRawValue: /* value */ String => Unit
    ): Omitdestroy = {
      val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction2(constructor), getFormattedValue = js.Any.fromFunction0(getFormattedValue), getISOFormatDate = js.Any.fromFunction0(getISOFormatDate), getRawValue = js.Any.fromFunction0(getRawValue), properties = properties.asInstanceOf[js.Any], setPhoneRegionCode = js.Any.fromFunction1(setPhoneRegionCode), setRawValue = js.Any.fromFunction1(setRawValue))
      __obj.asInstanceOf[Omitdestroy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Omitdestroy] (val x: Self) extends AnyVal {
      
      inline def setConstructor(value: (/* selector */ String | HTMLElement, /* options */ CleaveOptions) => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction2(value))
      
      inline def setGetFormattedValue(value: () => String): Self = StObject.set(x, "getFormattedValue", js.Any.fromFunction0(value))
      
      inline def setGetISOFormatDate(value: () => String): Self = StObject.set(x, "getISOFormatDate", js.Any.fromFunction0(value))
      
      inline def setGetRawValue(value: () => String): Self = StObject.set(x, "getRawValue", js.Any.fromFunction0(value))
      
      inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSetPhoneRegionCode(value: /* regionCode */ String => Unit): Self = StObject.set(x, "setPhoneRegionCode", js.Any.fromFunction1(value))
      
      inline def setSetRawValue(value: /* value */ String => Unit): Self = StObject.set(x, "setRawValue", js.Any.fromFunction1(value))
    }
  }
  
  trait RawValue extends StObject {
    
    var rawValue: String
  }
  object RawValue {
    
    inline def apply(rawValue: String): RawValue = {
      val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawValue] (val x: Self) extends AnyVal {
      
      inline def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    }
  }
}
