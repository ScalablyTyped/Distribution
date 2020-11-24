package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphBuilderFactory extends js.Object {
  
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
  implicit class ParagraphBuilderFactoryOps[Self <: ParagraphBuilderFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMake(value: (ParagraphStyle, SkFontMgr) => ParagraphBuilder): Self = this.set("Make", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMakeFromFontProvider(value: (ParagraphStyle, TypefaceFontProvider) => ParagraphBuilder): Self = this.set("MakeFromFontProvider", js.Any.fromFunction2(value))
  }
}
