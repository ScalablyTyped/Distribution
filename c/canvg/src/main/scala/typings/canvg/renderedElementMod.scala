package typings.canvg

import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.documentDocumentMod.Document
import typings.canvg.elementMod.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderedElementMod {
  
  @JSImport("canvg/dist/Document/RenderedElement", "RenderedElement")
  @js.native
  abstract class RenderedElement protected () extends Element {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /* protected */ def calculateOpacity(): Double = js.native
    
    /* private */ var modifiedEmSizeStack: Any = js.native
    
    def setContext(ctx: RenderingContext2D, fromMeasure: Boolean): Unit = js.native
  }
}
