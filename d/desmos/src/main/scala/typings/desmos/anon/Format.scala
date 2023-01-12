package typings.desmos.anon

import typings.desmos.desmosStrings.contain
import typings.desmos.desmosStrings.png
import typings.desmos.desmosStrings.preserveX
import typings.desmos.desmosStrings.preserveY
import typings.desmos.desmosStrings.stretch
import typings.desmos.desmosStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  /**
    * Determines the format of the generated image.
    * @default "png"
    */
  var format: js.UndefOr[png | svg] = js.undefined
  
  /**
    * An object representing desired viewport bounds. The current viewport value will be used for any omitted property,
    * but note that you cannot specify top without bottom or left without right. Passing invalid bounds will log a warning
    * to the console and use the current viewport bounds in their entirety.
    */
  var mathBounds: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(bounds : desmos.anon.Bottom): void>[0] */ js.Any
  ] = js.undefined
  
  /**
    * Determines the strategy for computing the viewport visible in the screenshot.
    * @default "contain"
    */
  var mode: js.UndefOr[contain | stretch | preserveX | preserveY] = js.undefined
  
  /**
    * Determines whether to include point labels in the captured image.
    * @default false
    */
  var showLabels: js.UndefOr[Boolean] = js.undefined
}
object Format {
  
  inline def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: png | svg): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMathBounds(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(bounds : desmos.anon.Bottom): void>[0] */ js.Any
    ): Self = StObject.set(x, "mathBounds", value.asInstanceOf[js.Any])
    
    inline def setMathBoundsUndefined: Self = StObject.set(x, "mathBounds", js.undefined)
    
    inline def setMode(value: contain | stretch | preserveX | preserveY): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
    
    inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
  }
}
