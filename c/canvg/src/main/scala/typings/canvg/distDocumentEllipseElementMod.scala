package typings.canvg

import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentPathElementMod.PathElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentEllipseElementMod {
  
  @JSImport("canvg/dist/Document/EllipseElement", "EllipseElement")
  @js.native
  open class EllipseElement protected () extends PathElement {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
  }
}
