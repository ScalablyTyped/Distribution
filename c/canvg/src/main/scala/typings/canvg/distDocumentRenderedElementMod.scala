package typings.canvg

import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentElementMod.Element
import typings.canvg.distTypesMod.RenderingContext2D
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentRenderedElementMod {
  
  /* note: abstract class */ @JSImport("canvg/dist/Document/RenderedElement", "RenderedElement")
  @js.native
  open class RenderedElement protected () extends Element {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /* protected */ def calculateOpacity(): Double = js.native
    
    /* private */ var modifiedEmSizeStack: Any = js.native
    
    def setContext(ctx: RenderingContext2D, fromMeasure: Boolean): Unit = js.native
  }
}
