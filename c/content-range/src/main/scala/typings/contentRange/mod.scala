package typings.contentRange

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("content-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(options: ContentRangeFormatOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(str: String): ContentRangeParts | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[ContentRangeParts | Null]
  
  trait ContentRangeFormatOptions extends StObject {
    
    var first: js.UndefOr[Double] = js.undefined
    
    var last: js.UndefOr[Double] = js.undefined
    
    var length: Double | Null
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var unit: String
  }
  object ContentRangeFormatOptions {
    
    inline def apply(unit: String): ContentRangeFormatOptions = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], length = null)
      __obj.asInstanceOf[ContentRangeFormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentRangeFormatOptions] (val x: Self) extends AnyVal {
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthNull: Self = StObject.set(x, "length", null)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentRangeParts extends StObject {
    
    var first: Double | Null
    
    var last: Double | Null
    
    var length: Double | Null
    
    var unit: String
  }
  object ContentRangeParts {
    
    inline def apply(unit: String): ContentRangeParts = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], first = null, last = null, length = null)
      __obj.asInstanceOf[ContentRangeParts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentRangeParts] (val x: Self) extends AnyVal {
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstNull: Self = StObject.set(x, "first", null)
      
      inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastNull: Self = StObject.set(x, "last", null)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthNull: Self = StObject.set(x, "length", null)
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
}
