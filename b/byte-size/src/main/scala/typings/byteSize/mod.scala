package typings.byteSize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(bytes: Double): ByteSizeResult = ^.asInstanceOf[js.Dynamic].apply(bytes.asInstanceOf[js.Any]).asInstanceOf[ByteSizeResult]
    inline def apply(bytes: Double, options: ByteSizeOptions): ByteSizeResult = (^.asInstanceOf[js.Dynamic].apply(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ByteSizeResult]
    
    @JSImport("byte-size", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultOptions(options: ByteSizeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait ByteSizeOptions extends StObject {
    
    var customUnits: js.UndefOr[js.Object] = js.undefined
    
    var locale: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var toStringFn: js.UndefOr[js.Function0[String]] = js.undefined
    
    var units: js.UndefOr[String] = js.undefined
  }
  object ByteSizeOptions {
    
    inline def apply(): ByteSizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByteSizeOptions]
    }
    
    extension [Self <: ByteSizeOptions](x: Self) {
      
      inline def setCustomUnits(value: js.Object): Self = StObject.set(x, "customUnits", value.asInstanceOf[js.Any])
      
      inline def setCustomUnitsUndefined: Self = StObject.set(x, "customUnits", js.undefined)
      
      inline def setLocale(value: String | js.Array[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocaleVarargs(value: String*): Self = StObject.set(x, "locale", js.Array(value*))
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setToStringFn(value: () => String): Self = StObject.set(x, "toStringFn", js.Any.fromFunction0(value))
      
      inline def setToStringFnUndefined: Self = StObject.set(x, "toStringFn", js.undefined)
      
      inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  trait ByteSizeResult extends StObject {
    
    var long: String
    
    var unit: String
    
    var value: String
  }
  object ByteSizeResult {
    
    inline def apply(long: String, unit: String, value: String): ByteSizeResult = {
      val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteSizeResult]
    }
    
    extension [Self <: ByteSizeResult](x: Self) {
      
      inline def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
