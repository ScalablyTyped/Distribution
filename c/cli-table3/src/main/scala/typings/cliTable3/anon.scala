package typings.cliTable3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Border extends StObject {
    
    var border: js.Array[String]
    
    var compact: Boolean
    
    var head: js.Array[String]
    
    var `padding-left`: Double
    
    var `padding-right`: Double
  }
  object Border {
    
    inline def apply(
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
    
    extension [Self <: Border](x: Self) {
      
      inline def setBorder(value: js.Array[String]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderVarargs(value: String*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value :_*))
      
      inline def `setPadding-left`(value: Double): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
      
      inline def `setPadding-right`(value: Double): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
    }
  }
  
  trait Head extends StObject {
    
    var border: js.UndefOr[js.Array[String]] = js.undefined
    
    var head: js.UndefOr[js.Array[String]] = js.undefined
    
    var `padding-left`: js.UndefOr[Double] = js.undefined
    
    var `padding-right`: js.UndefOr[Double] = js.undefined
  }
  object Head {
    
    inline def apply(): Head = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Head]
    }
    
    extension [Self <: Head](x: Self) {
      
      inline def setBorder(value: js.Array[String]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderVarargs(value: String*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      inline def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value :_*))
      
      inline def `setPadding-left`(value: Double): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
      
      inline def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
      
      inline def `setPadding-right`(value: Double): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
      
      inline def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<cli-table3.cli-table3.CharName, string>> */
  trait PartialRecordCharNamestri extends StObject {
    
    var bottom: js.UndefOr[String] = js.undefined
    
    var `bottom-left`: js.UndefOr[String] = js.undefined
    
    var `bottom-mid`: js.UndefOr[String] = js.undefined
    
    var `bottom-right`: js.UndefOr[String] = js.undefined
    
    var left: js.UndefOr[String] = js.undefined
    
    var `left-mid`: js.UndefOr[String] = js.undefined
    
    var mid: js.UndefOr[String] = js.undefined
    
    var `mid-mid`: js.UndefOr[String] = js.undefined
    
    var middle: js.UndefOr[String] = js.undefined
    
    var right: js.UndefOr[String] = js.undefined
    
    var `right-mid`: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[String] = js.undefined
    
    var `top-left`: js.UndefOr[String] = js.undefined
    
    var `top-mid`: js.UndefOr[String] = js.undefined
    
    var `top-right`: js.UndefOr[String] = js.undefined
  }
  object PartialRecordCharNamestri {
    
    inline def apply(): PartialRecordCharNamestri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordCharNamestri]
    }
    
    extension [Self <: PartialRecordCharNamestri](x: Self) {
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def `setBottom-left`(value: String): Self = StObject.set(x, "bottom-left", value.asInstanceOf[js.Any])
      
      inline def `setBottom-leftUndefined`: Self = StObject.set(x, "bottom-left", js.undefined)
      
      inline def `setBottom-mid`(value: String): Self = StObject.set(x, "bottom-mid", value.asInstanceOf[js.Any])
      
      inline def `setBottom-midUndefined`: Self = StObject.set(x, "bottom-mid", js.undefined)
      
      inline def `setBottom-right`(value: String): Self = StObject.set(x, "bottom-right", value.asInstanceOf[js.Any])
      
      inline def `setBottom-rightUndefined`: Self = StObject.set(x, "bottom-right", js.undefined)
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def `setLeft-mid`(value: String): Self = StObject.set(x, "left-mid", value.asInstanceOf[js.Any])
      
      inline def `setLeft-midUndefined`: Self = StObject.set(x, "left-mid", js.undefined)
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
      
      inline def `setMid-mid`(value: String): Self = StObject.set(x, "mid-mid", value.asInstanceOf[js.Any])
      
      inline def `setMid-midUndefined`: Self = StObject.set(x, "mid-mid", js.undefined)
      
      inline def setMidUndefined: Self = StObject.set(x, "mid", js.undefined)
      
      inline def setMiddle(value: String): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
      
      inline def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def `setRight-mid`(value: String): Self = StObject.set(x, "right-mid", value.asInstanceOf[js.Any])
      
      inline def `setRight-midUndefined`: Self = StObject.set(x, "right-mid", js.undefined)
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def `setTop-left`(value: String): Self = StObject.set(x, "top-left", value.asInstanceOf[js.Any])
      
      inline def `setTop-leftUndefined`: Self = StObject.set(x, "top-left", js.undefined)
      
      inline def `setTop-mid`(value: String): Self = StObject.set(x, "top-mid", value.asInstanceOf[js.Any])
      
      inline def `setTop-midUndefined`: Self = StObject.set(x, "top-mid", js.undefined)
      
      inline def `setTop-right`(value: String): Self = StObject.set(x, "top-right", value.asInstanceOf[js.Any])
      
      inline def `setTop-rightUndefined`: Self = StObject.set(x, "top-right", js.undefined)
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Inlined std.Record<cli-table3.cli-table3.CharName, string> */
  trait RecordCharNamestring extends StObject {
    
    var bottom: String
    
    var `bottom-left`: String
    
    var `bottom-mid`: String
    
    var `bottom-right`: String
    
    var left: String
    
    var `left-mid`: String
    
    var mid: String
    
    var `mid-mid`: String
    
    var middle: String
    
    var right: String
    
    var `right-mid`: String
    
    var top: String
    
    var `top-left`: String
    
    var `top-mid`: String
    
    var `top-right`: String
  }
  object RecordCharNamestring {
    
    inline def apply(
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
    
    extension [Self <: RecordCharNamestring](x: Self) {
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def `setBottom-left`(value: String): Self = StObject.set(x, "bottom-left", value.asInstanceOf[js.Any])
      
      inline def `setBottom-mid`(value: String): Self = StObject.set(x, "bottom-mid", value.asInstanceOf[js.Any])
      
      inline def `setBottom-right`(value: String): Self = StObject.set(x, "bottom-right", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def `setLeft-mid`(value: String): Self = StObject.set(x, "left-mid", value.asInstanceOf[js.Any])
      
      inline def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
      
      inline def `setMid-mid`(value: String): Self = StObject.set(x, "mid-mid", value.asInstanceOf[js.Any])
      
      inline def setMiddle(value: String): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def `setRight-mid`(value: String): Self = StObject.set(x, "right-mid", value.asInstanceOf[js.Any])
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def `setTop-left`(value: String): Self = StObject.set(x, "top-left", value.asInstanceOf[js.Any])
      
      inline def `setTop-mid`(value: String): Self = StObject.set(x, "top-mid", value.asInstanceOf[js.Any])
      
      inline def `setTop-right`(value: String): Self = StObject.set(x, "top-right", value.asInstanceOf[js.Any])
    }
  }
}
