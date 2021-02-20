package typings.cliTable2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Border extends StObject {
    
    var border: js.Array[String] = js.native
    
    var compact: Boolean = js.native
    
    var head: js.Array[String] = js.native
    
    var `padding-left`: Double = js.native
    
    var `padding-right`: Double = js.native
  }
  object Border {
    
    @scala.inline
    def apply(
      border: js.Array[String],
      compact: Boolean,
      head: js.Array[String],
      `padding-left`: Double,
      `padding-right`: Double
    ): Border = {
      val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
      __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
      __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Border]
    }
    
    @scala.inline
    implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: js.Array[String]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderVarargs(value: String*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value :_*))
      
      @scala.inline
      def `setPadding-left`(value: Double): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-right`(value: Double): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Head extends StObject {
    
    var border: js.UndefOr[js.Array[String]] = js.native
    
    var head: js.UndefOr[js.Array[String]] = js.native
    
    var `padding-left`: js.UndefOr[Double] = js.native
    
    var `padding-right`: js.UndefOr[Double] = js.native
  }
  object Head {
    
    @scala.inline
    def apply(): Head = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Head]
    }
    
    @scala.inline
    implicit class HeadMutableBuilder[Self <: Head] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: js.Array[String]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBorderVarargs(value: String*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      @scala.inline
      def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value :_*))
      
      @scala.inline
      def `setPadding-left`(value: Double): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
      
      @scala.inline
      def `setPadding-right`(value: Double): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<cli-table2.cli-table2.CharName, string>> */
  @js.native
  trait PartialRecordCharNamestri extends StObject {
    
    var bottom: js.UndefOr[String] = js.native
    
    var `bottom-left`: js.UndefOr[String] = js.native
    
    var `bottom-mid`: js.UndefOr[String] = js.native
    
    var `bottom-right`: js.UndefOr[String] = js.native
    
    var left: js.UndefOr[String] = js.native
    
    var `left-mid`: js.UndefOr[String] = js.native
    
    var mid: js.UndefOr[String] = js.native
    
    var `mid-mid`: js.UndefOr[String] = js.native
    
    var middle: js.UndefOr[String] = js.native
    
    var right: js.UndefOr[String] = js.native
    
    var `right-mid`: js.UndefOr[String] = js.native
    
    var top: js.UndefOr[String] = js.native
    
    var `top-left`: js.UndefOr[String] = js.native
    
    var `top-mid`: js.UndefOr[String] = js.native
    
    var `top-right`: js.UndefOr[String] = js.native
  }
  object PartialRecordCharNamestri {
    
    @scala.inline
    def apply(): PartialRecordCharNamestri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordCharNamestri]
    }
    
    @scala.inline
    implicit class PartialRecordCharNamestriMutableBuilder[Self <: PartialRecordCharNamestri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBottom-left`(value: String): Self = StObject.set(x, "bottom-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBottom-leftUndefined`: Self = StObject.set(x, "bottom-left", js.undefined)
      
      @scala.inline
      def `setBottom-mid`(value: String): Self = StObject.set(x, "bottom-mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBottom-midUndefined`: Self = StObject.set(x, "bottom-mid", js.undefined)
      
      @scala.inline
      def `setBottom-right`(value: String): Self = StObject.set(x, "bottom-right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBottom-rightUndefined`: Self = StObject.set(x, "bottom-right", js.undefined)
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLeft-mid`(value: String): Self = StObject.set(x, "left-mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLeft-midUndefined`: Self = StObject.set(x, "left-mid", js.undefined)
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMid-mid`(value: String): Self = StObject.set(x, "mid-mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMid-midUndefined`: Self = StObject.set(x, "mid-mid", js.undefined)
      
      @scala.inline
      def setMidUndefined: Self = StObject.set(x, "mid", js.undefined)
      
      @scala.inline
      def setMiddle(value: String): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRight-mid`(value: String): Self = StObject.set(x, "right-mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRight-midUndefined`: Self = StObject.set(x, "right-mid", js.undefined)
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTop-left`(value: String): Self = StObject.set(x, "top-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTop-leftUndefined`: Self = StObject.set(x, "top-left", js.undefined)
      
      @scala.inline
      def `setTop-mid`(value: String): Self = StObject.set(x, "top-mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTop-midUndefined`: Self = StObject.set(x, "top-mid", js.undefined)
      
      @scala.inline
      def `setTop-right`(value: String): Self = StObject.set(x, "top-right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTop-rightUndefined`: Self = StObject.set(x, "top-right", js.undefined)
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Inlined std.Record<cli-table2.cli-table2.CharName, string> */
  @js.native
  trait RecordCharNamestring extends StObject {
    
    var bottom: String = js.native
    
    var `bottom-left`: String = js.native
    
    var `bottom-mid`: String = js.native
    
    var `bottom-right`: String = js.native
    
    var left: String = js.native
    
    var `left-mid`: String = js.native
    
    var mid: String = js.native
    
    var `mid-mid`: String = js.native
    
    var middle: String = js.native
    
    var right: String = js.native
    
    var `right-mid`: String = js.native
    
    var top: String = js.native
    
    var `top-left`: String = js.native
    
    var `top-mid`: String = js.native
    
    var `top-right`: String = js.native
  }
  object RecordCharNamestring {
    
    @scala.inline
    def apply(
      bottom: String,
      `bottom-left`: String,
      `bottom-mid`: String,
      `bottom-right`: String,
      left: String,
      `left-mid`: String,
      mid: String,
      `mid-mid`: String,
      middle: String,
      right: String,
      `right-mid`: String,
      top: String,
      `top-left`: String,
      `top-mid`: String,
      `top-right`: String
    ): RecordCharNamestring = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], mid = mid.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.updateDynamic("bottom-left")(`bottom-left`.asInstanceOf[js.Any])
      __obj.updateDynamic("bottom-mid")(`bottom-mid`.asInstanceOf[js.Any])
      __obj.updateDynamic("bottom-right")(`bottom-right`.asInstanceOf[js.Any])
      __obj.updateDynamic("left-mid")(`left-mid`.asInstanceOf[js.Any])
      __obj.updateDynamic("mid-mid")(`mid-mid`.asInstanceOf[js.Any])
      __obj.updateDynamic("right-mid")(`right-mid`.asInstanceOf[js.Any])
      __obj.updateDynamic("top-left")(`top-left`.asInstanceOf[js.Any])
      __obj.updateDynamic("top-mid")(`top-mid`.asInstanceOf[js.Any])
      __obj.updateDynamic("top-right")(`top-right`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordCharNamestring]
    }
    
    @scala.inline
    implicit class RecordCharNamestringMutableBuilder[Self <: RecordCharNamestring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBottom-left`(value: String): Self = StObject.set(x, "bottom-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBottom-mid`(value: String): Self = StObject.set(x, "bottom-mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBottom-right`(value: String): Self = StObject.set(x, "bottom-right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLeft-mid`(value: String): Self = StObject.set(x, "left-mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMid-mid`(value: String): Self = StObject.set(x, "mid-mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddle(value: String): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRight-mid`(value: String): Self = StObject.set(x, "right-mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTop-left`(value: String): Self = StObject.set(x, "top-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTop-mid`(value: String): Self = StObject.set(x, "top-mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTop-right`(value: String): Self = StObject.set(x, "top-right", value.asInstanceOf[js.Any])
    }
  }
}
