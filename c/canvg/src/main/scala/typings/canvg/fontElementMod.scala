package typings.canvg

import typings.canvg.anon.PartialRecordArabicFormGl
import typings.canvg.documentDocumentMod.Document
import typings.canvg.elementMod.Element
import typings.canvg.fontFaceElementMod.FontFaceElement
import typings.canvg.glyphElementMod.GlyphElement
import typings.canvg.missingGlyphElementMod.MissingGlyphElement
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontElementMod {
  
  @JSImport("canvg/dist/Document/FontElement", "FontElement")
  @js.native
  open class FontElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    val arabicGlyphs: Record[String, PartialRecordArabicFormGl] = js.native
    
    val fontFace: js.UndefOr[FontFaceElement] = js.native
    
    val glyphs: Record[String, GlyphElement] = js.native
    
    val horizAdvX: Double = js.native
    
    val isArabic: Boolean = js.native
    
    val isRTL: Boolean = js.native
    
    val missingGlyph: js.UndefOr[MissingGlyphElement] = js.native
    
    def render(): Unit = js.native
  }
}
