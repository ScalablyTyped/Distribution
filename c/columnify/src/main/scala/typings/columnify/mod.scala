package typings.columnify

import org.scalablytyped.runtime.StringDictionary
import typings.columnify.anon.PickOptionsminWidthmaxWid
import typings.columnify.columnifyStrings.center
import typings.columnify.columnifyStrings.centre
import typings.columnify.columnifyStrings.left
import typings.columnify.columnifyStrings.right
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(data: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(data: js.Array[js.Any], options: GlobalOptions): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(data: Record[String, js.Any]): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(data: Record[String, js.Any], options: GlobalOptions): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("columnify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GlobalOptions
    extends StObject
       with Options {
    
    var columnSplitter: js.UndefOr[String] = js.undefined
    
    var columns: js.UndefOr[js.Array[String]] = js.undefined
    
    var config: js.UndefOr[StringDictionary[Options]] = js.undefined
    
    var maxLineWidth: js.UndefOr[Double] = js.undefined
    
    var truncate: js.UndefOr[Boolean] = js.undefined
    
    var widths: js.UndefOr[StringDictionary[PickOptionsminWidthmaxWid]] = js.undefined
  }
  object GlobalOptions {
    
    @scala.inline
    def apply(): GlobalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalOptions]
    }
    
    @scala.inline
    implicit class GlobalOptionsMutableBuilder[Self <: GlobalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnSplitter(value: String): Self = StObject.set(x, "columnSplitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSplitterUndefined: Self = StObject.set(x, "columnSplitter", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setConfig(value: StringDictionary[Options]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setMaxLineWidth(value: Double): Self = StObject.set(x, "maxLineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLineWidthUndefined: Self = StObject.set(x, "maxLineWidth", js.undefined)
      
      @scala.inline
      def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      @scala.inline
      def setWidths(value: StringDictionary[PickOptionsminWidthmaxWid]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var align: js.UndefOr[left | center | centre | right] = js.undefined
    
    var dataTransform: js.UndefOr[js.Function1[/* data */ String, String]] = js.undefined
    
    var headingTransform: js.UndefOr[js.Function1[/* data */ String, String]] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var paddingChr: js.UndefOr[String] = js.undefined
    
    var preserveNewLines: js.UndefOr[Boolean] = js.undefined
    
    var showHeaders: js.UndefOr[Boolean] = js.undefined
    
    var truncateMarker: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: left | center | centre | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setDataTransform(value: /* data */ String => String): Self = StObject.set(x, "dataTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataTransformUndefined: Self = StObject.set(x, "dataTransform", js.undefined)
      
      @scala.inline
      def setHeadingTransform(value: /* data */ String => String): Self = StObject.set(x, "headingTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeadingTransformUndefined: Self = StObject.set(x, "headingTransform", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setPaddingChr(value: String): Self = StObject.set(x, "paddingChr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingChrUndefined: Self = StObject.set(x, "paddingChr", js.undefined)
      
      @scala.inline
      def setPreserveNewLines(value: Boolean): Self = StObject.set(x, "preserveNewLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveNewLinesUndefined: Self = StObject.set(x, "preserveNewLines", js.undefined)
      
      @scala.inline
      def setShowHeaders(value: Boolean): Self = StObject.set(x, "showHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeadersUndefined: Self = StObject.set(x, "showHeaders", js.undefined)
      
      @scala.inline
      def setTruncateMarker(value: String): Self = StObject.set(x, "truncateMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateMarkerUndefined: Self = StObject.set(x, "truncateMarker", js.undefined)
    }
  }
}
