package typings.canvg

import typings.canvg.documentDocumentMod.Document
import typings.canvg.elementMod.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontFaceElementMod {
  
  @JSImport("canvg/dist/Document/FontFaceElement", "FontFaceElement")
  @js.native
  open class FontFaceElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    val ascent: Double = js.native
    
    val descent: Double = js.native
    
    val unitsPerEm: Double = js.native
  }
}
