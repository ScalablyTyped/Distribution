package typings.cliTable

import typings.cliTable.cliTableStrings.left
import typings.cliTable.cliTableStrings.middle
import typings.cliTable.cliTableStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<std.Record<'top' | 'top-mid' | 'top-left' | 'top-right' | 'bottom' | 'bottom-mid' | 'bottom-left' | 'bottom-right' | 'left' | 'left-mid' | 'mid' | 'mid-mid' | 'right' | 'right-mid' | 'middle', string>> */
  trait PartialRecordtoptopmidtop extends StObject {
    
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
  object PartialRecordtoptopmidtop {
    
    @scala.inline
    def apply(): PartialRecordtoptopmidtop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordtoptopmidtop]
    }
    
    @scala.inline
    implicit class PartialRecordtoptopmidtopMutableBuilder[Self <: PartialRecordtoptopmidtop] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined std.Partial<cli-table.cli-table.TableOptions> */
  trait PartialTableOptions extends StObject {
    
    var chars: js.UndefOr[PartialRecordtoptopmidtop] = js.undefined
    
    var colAligns: js.UndefOr[js.Array[left | middle | right]] = js.undefined
    
    var colWidths: js.UndefOr[js.Array[Double]] = js.undefined
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    var head: js.UndefOr[js.Array[String]] = js.undefined
    
    var style: js.UndefOr[Partialpaddingleftnumberp] = js.undefined
    
    var truncate: js.UndefOr[String] = js.undefined
  }
  object PartialTableOptions {
    
    @scala.inline
    def apply(): PartialTableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTableOptions]
    }
    
    @scala.inline
    implicit class PartialTableOptionsMutableBuilder[Self <: PartialTableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChars(value: PartialRecordtoptopmidtop): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      @scala.inline
      def setColAligns(value: js.Array[left | middle | right]): Self = StObject.set(x, "colAligns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColAlignsUndefined: Self = StObject.set(x, "colAligns", js.undefined)
      
      @scala.inline
      def setColAlignsVarargs(value: (left | middle | right)*): Self = StObject.set(x, "colAligns", js.Array(value :_*))
      
      @scala.inline
      def setColWidths(value: js.Array[Double]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColWidthsUndefined: Self = StObject.set(x, "colWidths", js.undefined)
      
      @scala.inline
      def setColWidthsVarargs(value: Double*): Self = StObject.set(x, "colWidths", js.Array(value :_*))
      
      @scala.inline
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: Partialpaddingleftnumberp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTruncate(value: String): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  padding-left :number,   padding-right :number,   head :std.Array<string>,   border :std.Array<string>,   compact :boolean}> */
  trait Partialpaddingleftnumberp extends StObject {
    
    var border: js.UndefOr[js.Array[String]] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var head: js.UndefOr[js.Array[String]] = js.undefined
    
    var `padding-left`: js.UndefOr[Double] = js.undefined
    
    var `padding-right`: js.UndefOr[Double] = js.undefined
  }
  object Partialpaddingleftnumberp {
    
    @scala.inline
    def apply(): Partialpaddingleftnumberp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialpaddingleftnumberp]
    }
    
    @scala.inline
    implicit class PartialpaddingleftnumberpMutableBuilder[Self <: Partialpaddingleftnumberp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: js.Array[String]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBorderVarargs(value: String*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
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
}
