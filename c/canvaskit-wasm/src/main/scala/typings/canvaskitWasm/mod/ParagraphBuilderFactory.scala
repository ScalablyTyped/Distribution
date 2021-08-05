package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParagraphBuilderFactory extends StObject {
  
  /**
    * Creates a ParagraphBuilder using the fonts available from the given font manager.
    * @param style
    * @param fontManager
    */
  def Make(style: ParagraphStyle, fontManager: SkFontMgr): ParagraphBuilder
  
  /**
    * Creates a ParagraphBuilder using the fonts available from the given font provider.
    * @param style
    * @param fontSrc
    */
  def MakeFromFontProvider(style: ParagraphStyle, fontSrc: TypefaceFontProvider): ParagraphBuilder
}
object ParagraphBuilderFactory {
  
  inline def apply(
    Make: (ParagraphStyle, SkFontMgr) => ParagraphBuilder,
    MakeFromFontProvider: (ParagraphStyle, TypefaceFontProvider) => ParagraphBuilder
  ): ParagraphBuilderFactory = {
    val __obj = js.Dynamic.literal(Make = js.Any.fromFunction2(Make), MakeFromFontProvider = js.Any.fromFunction2(MakeFromFontProvider))
    __obj.asInstanceOf[ParagraphBuilderFactory]
  }
  
  extension [Self <: ParagraphBuilderFactory](x: Self) {
    
    inline def setMake(value: (ParagraphStyle, SkFontMgr) => ParagraphBuilder): Self = StObject.set(x, "Make", js.Any.fromFunction2(value))
    
    inline def setMakeFromFontProvider(value: (ParagraphStyle, TypefaceFontProvider) => ParagraphBuilder): Self = StObject.set(x, "MakeFromFontProvider", js.Any.fromFunction2(value))
  }
}
