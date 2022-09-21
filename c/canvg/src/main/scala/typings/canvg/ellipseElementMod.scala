package typings.canvg

import typings.canvg.documentDocumentMod.Document
import typings.canvg.pathElementMod.PathElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipseElementMod {
  
  @JSImport("canvg/dist/Document/EllipseElement", "EllipseElement")
  @js.native
  open class EllipseElement protected () extends PathElement {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
  }
}
