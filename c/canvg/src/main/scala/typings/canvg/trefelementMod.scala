package typings.canvg

import typings.canvg.documentDocumentMod.Document
import typings.canvg.textElementMod.TextElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trefelementMod {
  
  @JSImport("canvg/dist/Document/TRefElement", "TRefElement")
  @js.native
  open class TRefElement protected () extends TextElement {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
  }
}
