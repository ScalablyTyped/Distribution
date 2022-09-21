package typings.canvg

import typings.canvg.documentDocumentMod.Document
import typings.canvg.pathElementMod.PathElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glyphElementMod {
  
  @JSImport("canvg/dist/Document/GlyphElement", "GlyphElement")
  @js.native
  open class GlyphElement protected () extends PathElement {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    val arabicForm: js.UndefOr[ArabicForm] = js.native
    
    val horizAdvX: Double = js.native
    
    val unicode: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.canvg.canvgStrings.isolated
    - typings.canvg.canvgStrings.terminal
    - typings.canvg.canvgStrings.medial
    - typings.canvg.canvgStrings.initial
  */
  trait ArabicForm extends StObject
  object ArabicForm {
    
    inline def initial: typings.canvg.canvgStrings.initial = "initial".asInstanceOf[typings.canvg.canvgStrings.initial]
    
    inline def isolated: typings.canvg.canvgStrings.isolated = "isolated".asInstanceOf[typings.canvg.canvgStrings.isolated]
    
    inline def medial: typings.canvg.canvgStrings.medial = "medial".asInstanceOf[typings.canvg.canvgStrings.medial]
    
    inline def terminal: typings.canvg.canvgStrings.terminal = "terminal".asInstanceOf[typings.canvg.canvgStrings.terminal]
  }
}
