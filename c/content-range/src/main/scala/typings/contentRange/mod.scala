package typings.contentRange

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("content-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def format(options: ContentRangeFormatOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parse(str: String): ContentRangeParts | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[ContentRangeParts | Null]
  
  trait ContentRangeFormatOptions extends StObject {
    
    var first: js.UndefOr[Double] = js.undefined
    
    var last: js.UndefOr[Double] = js.undefined
    
    var length: Double | Null
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var unit: String
  }
  object ContentRangeFormatOptions {
    
    @scala.inline
    def apply(unit: String): ContentRangeFormatOptions = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], length = null)
      __obj.asInstanceOf[ContentRangeFormatOptions]
    }
    
    @scala.inline
    implicit class ContentRangeFormatOptionsMutableBuilder[Self <: ContentRangeFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      @scala.inline
      def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthNull: Self = StObject.set(x, "length", null)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentRangeParts extends StObject {
    
    var first: Double | Null
    
    var last: Double | Null
    
    var length: Double | Null
    
    var unit: String
  }
  object ContentRangeParts {
    
    @scala.inline
    def apply(unit: String): ContentRangeParts = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], first = null, last = null, length = null)
      __obj.asInstanceOf[ContentRangeParts]
    }
    
    @scala.inline
    implicit class ContentRangePartsMutableBuilder[Self <: ContentRangeParts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstNull: Self = StObject.set(x, "first", null)
      
      @scala.inline
      def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastNull: Self = StObject.set(x, "last", null)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthNull: Self = StObject.set(x, "length", null)
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
}
