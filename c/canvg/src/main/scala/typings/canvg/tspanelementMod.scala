package typings.canvg

import typings.canvg.documentDocumentMod.Document
import typings.canvg.textElementMod.TextElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tspanelementMod {
  
  @JSImport("canvg/dist/Document/TSpanElement", "TSpanElement")
  @js.native
  open class TSpanElement protected () extends TextElement {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /* protected */ val text: String = js.native
  }
}
