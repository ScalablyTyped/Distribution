package typings.colorsOption

import typings.chalk.mod.ChalkInstance
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("colors-option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ChalkInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ChalkInstance]
  inline def default(options: Options): ChalkInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[ChalkInstance]
  
  /* Inlined std.Partial<std.Readonly<{  colors :boolean | undefined,   stream :node.stream.Stream}>> */
  trait Options extends StObject {
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    var stream: js.UndefOr[Stream] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
}
