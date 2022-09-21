package typings.canvg

import typings.canvg.documentDocumentMod.Document
import typings.canvg.elementMod.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defsElementMod {
  
  @JSImport("canvg/dist/Document/DefsElement", "DefsElement")
  @js.native
  open class DefsElement protected () extends Element {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    def render(): Unit = js.native
  }
}
