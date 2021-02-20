package typings.contentRange

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("content-range", "format")
  @js.native
  def format(options: ContentRangeFormatOptions): String = js.native
  
  @JSImport("content-range", "parse")
  @js.native
  def parse(str: String): ContentRangeParts | Null = js.native
  
  @js.native
  trait ContentRangeFormatOptions extends StObject {
    
    var first: js.UndefOr[Double] = js.native
    
    var last: js.UndefOr[Double] = js.native
    
    var length: Double | Null = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var unit: String = js.native
  }
  object ContentRangeFormatOptions {
    
    @scala.inline
    def apply(unit: String): ContentRangeFormatOptions = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
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
  
  @js.native
  trait ContentRangeParts extends StObject {
    
    var first: Double | Null = js.native
    
    var last: Double | Null = js.native
    
    var length: Double | Null = js.native
    
    var unit: String = js.native
  }
  object ContentRangeParts {
    
    @scala.inline
    def apply(unit: String): ContentRangeParts = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
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
