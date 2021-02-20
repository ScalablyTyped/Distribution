package typings.bunyanFormat

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.bunyanFormat.bunyanFormatStrings.bunyan
import typings.bunyanFormat.bunyanFormatStrings.json
import typings.bunyanFormat.bunyanFormatStrings.long
import typings.bunyanFormat.bunyanFormatStrings.short
import typings.bunyanFormat.bunyanFormatStrings.simple
import typings.bunyanFormat.mod.BunyanFormatWritable.Options
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bunyan-format", JSImport.Namespace)
  @js.native
  class ^ protected () extends BunyanFormatWritable {
    // tslint:disable-next-line no-misused-new
    def this(options: Options) = this()
    def this(options: Options, output: Writable) = this()
  }
  @JSImport("bunyan-format", JSImport.Namespace)
  @js.native
  val ^ : BunyanFormatWritable = js.native
  
  /** Creates a writable stream that formats bunyan records written to it. */
  @js.native
  trait BunyanFormatWritable
    extends Writable
       with // tslint:disable-next-line no-misused-new
  Instantiable1[/* options */ Options, BunyanFormatWritable]
       with Instantiable2[/* options */ Options, /* output */ Writable, BunyanFormatWritable] {
    
    def apply(options: Options): BunyanFormatWritable = js.native
    def apply(options: Options, output: Writable): BunyanFormatWritable = js.native
  }
  object BunyanFormatWritable {
    
    type ColorFromLevel = NumberDictionary[String]
    
    @js.native
    trait Options extends StObject {
      
      var color: js.UndefOr[Boolean] = js.native
      
      var colorFromLevel: js.UndefOr[ColorFromLevel] = js.native
      
      var jsonIndent: js.UndefOr[String | Double] = js.native
      
      var levelInString: js.UndefOr[Boolean] = js.native
      
      var outputMode: js.UndefOr[short | long | simple | json | bunyan] = js.native
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
        def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorFromLevel(value: ColorFromLevel): Self = StObject.set(x, "colorFromLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorFromLevelUndefined: Self = StObject.set(x, "colorFromLevel", js.undefined)
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setJsonIndent(value: String | Double): Self = StObject.set(x, "jsonIndent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJsonIndentUndefined: Self = StObject.set(x, "jsonIndent", js.undefined)
        
        @scala.inline
        def setLevelInString(value: Boolean): Self = StObject.set(x, "levelInString", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLevelInStringUndefined: Self = StObject.set(x, "levelInString", js.undefined)
        
        @scala.inline
        def setOutputMode(value: short | long | simple | json | bunyan): Self = StObject.set(x, "outputMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutputModeUndefined: Self = StObject.set(x, "outputMode", js.undefined)
      }
    }
  }
  
  type _To = BunyanFormatWritable
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BunyanFormatWritable = ^
}
