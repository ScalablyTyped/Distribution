package typings.bunyanFormat

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.bunyanFormat.bunyanFormatStrings.bunyan
import typings.bunyanFormat.bunyanFormatStrings.inspect
import typings.bunyanFormat.bunyanFormatStrings.json
import typings.bunyanFormat.bunyanFormatStrings.long
import typings.bunyanFormat.bunyanFormatStrings.short
import typings.bunyanFormat.bunyanFormatStrings.simple
import typings.bunyanFormat.mod.BunyanFormatWritable.Options
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bunyan-format", JSImport.Namespace)
  @js.native
  open class ^ protected () extends BunyanFormatWritable {
    // tslint:disable-next-line no-misused-new
    def this(options: Options) = this()
    def this(options: Options, output: Writable) = this()
  }
  @JSImport("bunyan-format", JSImport.Namespace)
  @js.native
  val ^ : BunyanFormatWritable = js.native
  
  /** Creates a writable stream that formats bunyan records written to it. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable2 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined  */ @js.native
  trait BunyanFormatWritable extends Writable {
    
    def apply(options: Options): BunyanFormatWritable = js.native
    def apply(options: Options, output: Writable): BunyanFormatWritable = js.native
  }
  object BunyanFormatWritable {
    
    type ColorFromLevel = NumberDictionary[String]
    
    trait Options extends StObject {
      
      var color: js.UndefOr[Boolean] = js.undefined
      
      var colorFromLevel: js.UndefOr[ColorFromLevel] = js.undefined
      
      var jsonIndent: js.UndefOr[String | Double] = js.undefined
      
      var levelInString: js.UndefOr[Boolean] = js.undefined
      
      var outputMode: js.UndefOr[short | long | simple | json | bunyan | inspect] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorFromLevel(value: ColorFromLevel): Self = StObject.set(x, "colorFromLevel", value.asInstanceOf[js.Any])
        
        inline def setColorFromLevelUndefined: Self = StObject.set(x, "colorFromLevel", js.undefined)
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setJsonIndent(value: String | Double): Self = StObject.set(x, "jsonIndent", value.asInstanceOf[js.Any])
        
        inline def setJsonIndentUndefined: Self = StObject.set(x, "jsonIndent", js.undefined)
        
        inline def setLevelInString(value: Boolean): Self = StObject.set(x, "levelInString", value.asInstanceOf[js.Any])
        
        inline def setLevelInStringUndefined: Self = StObject.set(x, "levelInString", js.undefined)
        
        inline def setOutputMode(value: short | long | simple | json | bunyan | inspect): Self = StObject.set(x, "outputMode", value.asInstanceOf[js.Any])
        
        inline def setOutputModeUndefined: Self = StObject.set(x, "outputMode", js.undefined)
      }
    }
  }
  
  type _To = BunyanFormatWritable
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BunyanFormatWritable = ^
}
