package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphBuilderFactory extends StObject {
  
  /**
    * Creates a ParagraphBuilder using the fonts available from the given font manager.
    * @param style
    * @param fontManager
    */
  def Make(style: ParagraphStyle, fontManager: SkFontMgr): ParagraphBuilder = js.native
  
  /**
    * Creates a ParagraphBuilder using the fonts available from the given font provider.
    * @param style
    * @param fontSrc
    */
  def MakeFromFontProvider(style: ParagraphStyle, fontSrc: TypefaceFontProvider): ParagraphBuilder = js.native
}
object ParagraphBuilderFactory {
  
  @scala.inline
  def apply(
    Make: (ParagraphStyle, SkFontMgr) => ParagraphBuilder,
    MakeFromFontProvider: (ParagraphStyle, TypefaceFontProvider) => ParagraphBuilder
  ): ParagraphBuilderFactory = {
    val __obj = js.Dynamic.literal(Make = js.Any.fromFunction2(Make), MakeFromFontProvider = js.Any.fromFunction2(MakeFromFontProvider))
    __obj.asInstanceOf[ParagraphBuilderFactory]
  }
  
  @scala.inline
  implicit class ParagraphBuilderFactoryMutableBuilder[Self <: ParagraphBuilderFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMake(value: (ParagraphStyle, SkFontMgr) => ParagraphBuilder): Self = StObject.set(x, "Make", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMakeFromFontProvider(value: (ParagraphStyle, TypefaceFontProvider) => ParagraphBuilder): Self = StObject.set(x, "MakeFromFontProvider", js.Any.fromFunction2(value))
  }
}
