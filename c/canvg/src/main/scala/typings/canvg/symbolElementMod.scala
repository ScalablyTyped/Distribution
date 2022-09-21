package typings.canvg

import typings.canvg.documentDocumentMod.Document
import typings.canvg.renderedElementMod.RenderedElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolElementMod {
  
  @JSImport("canvg/dist/Document/SymbolElement", "SymbolElement")
  @js.native
  open class SymbolElement protected () extends RenderedElement {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
  }
}
