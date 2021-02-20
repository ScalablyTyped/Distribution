package typings.cliTable

import typings.cliTable.anon.PartialRecordtoptopmidtop
import typings.cliTable.anon.PartialTableOptions
import typings.cliTable.anon.Partialpaddingleftnumberp
import typings.cliTable.cliTableStrings.left
import typings.cliTable.cliTableStrings.middle
import typings.cliTable.cliTableStrings.right
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cli-table", JSImport.Namespace)
  @js.native
  class ^ () extends Table {
    def this(options: PartialTableOptions) = this()
  }
  @JSImport("cli-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cli-table", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Table
    extends Array[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ js.Any
        ]
  
  @js.native
  trait TableOptions extends StObject {
    
    var chars: PartialRecordtoptopmidtop = js.native
    
    var colAligns: js.Array[left | middle | right] = js.native
    
    var colWidths: js.Array[Double] = js.native
    
    var colors: Boolean = js.native
    
    var head: js.Array[String] = js.native
    
    var style: Partialpaddingleftnumberp = js.native
    
    var truncate: String = js.native
  }
  object TableOptions {
    
    @scala.inline
    def apply(
      chars: PartialRecordtoptopmidtop,
      colAligns: js.Array[left | middle | right],
      colWidths: js.Array[Double],
      colors: Boolean,
      head: js.Array[String],
      style: Partialpaddingleftnumberp,
      truncate: String
    ): TableOptions = {
      val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableOptions]
    }
    
    @scala.inline
    implicit class TableOptionsMutableBuilder[Self <: TableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChars(value: PartialRecordtoptopmidtop): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColAligns(value: js.Array[left | middle | right]): Self = StObject.set(x, "colAligns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColAlignsVarargs(value: (left | middle | right)*): Self = StObject.set(x, "colAligns", js.Array(value :_*))
      
      @scala.inline
      def setColWidths(value: js.Array[Double]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColWidthsVarargs(value: Double*): Self = StObject.set(x, "colWidths", js.Array(value :_*))
      
      @scala.inline
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: Partialpaddingleftnumberp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncate(value: String): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
    }
  }
}
