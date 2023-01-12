package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypefaceFactory extends StObject {
  
  /**
    * Create a typeface using Freetype from the specified bytes and return it. CanvasKit supports
    * .ttf, .woff and .woff2 fonts. It returns null if the bytes cannot be decoded.
    * @param fontData
    */
  def MakeFreeTypeFaceFromData(fontData: js.typedarray.ArrayBuffer): Typeface | Null
}
object TypefaceFactory {
  
  inline def apply(MakeFreeTypeFaceFromData: js.typedarray.ArrayBuffer => Typeface | Null): TypefaceFactory = {
    val __obj = js.Dynamic.literal(MakeFreeTypeFaceFromData = js.Any.fromFunction1(MakeFreeTypeFaceFromData))
    __obj.asInstanceOf[TypefaceFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypefaceFactory] (val x: Self) extends AnyVal {
    
    inline def setMakeFreeTypeFaceFromData(value: js.typedarray.ArrayBuffer => Typeface | Null): Self = StObject.set(x, "MakeFreeTypeFaceFromData", js.Any.fromFunction1(value))
  }
}
