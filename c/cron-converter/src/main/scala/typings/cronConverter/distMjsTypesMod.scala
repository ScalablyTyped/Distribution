package typings.cronConverter

import typings.cronConverter.cronConverterStrings.day
import typings.cronConverter.cronConverterStrings.hour
import typings.cronConverter.cronConverterStrings.minute
import typings.cronConverter.cronConverterStrings.month
import typings.cronConverter.cronConverterStrings.weekday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsTypesMod {
  
  trait Options extends StObject {
    
    var outputHashes: Boolean
    
    var outputMonthNames: Boolean
    
    var outputWeekdayNames: Boolean
  }
  object Options {
    
    inline def apply(outputHashes: Boolean, outputMonthNames: Boolean, outputWeekdayNames: Boolean): Options = {
      val __obj = js.Dynamic.literal(outputHashes = outputHashes.asInstanceOf[js.Any], outputMonthNames = outputMonthNames.asInstanceOf[js.Any], outputWeekdayNames = outputWeekdayNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOutputHashes(value: Boolean): Self = StObject.set(x, "outputHashes", value.asInstanceOf[js.Any])
      
      inline def setOutputMonthNames(value: Boolean): Self = StObject.set(x, "outputMonthNames", value.asInstanceOf[js.Any])
      
      inline def setOutputWeekdayNames(value: Boolean): Self = StObject.set(x, "outputWeekdayNames", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unit extends StObject {
    
    var alt: js.UndefOr[js.Array[String]] = js.undefined
    
    var max: Double
    
    var min: Double
    
    var name: minute | hour | day | month | weekday
  }
  object Unit {
    
    inline def apply(max: Double, min: Double, name: minute | hour | day | month | weekday): Unit = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: js.Array[String]): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setAltVarargs(value: String*): Self = StObject.set(x, "alt", js.Array(value*))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setName(value: minute | hour | day | month | weekday): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
