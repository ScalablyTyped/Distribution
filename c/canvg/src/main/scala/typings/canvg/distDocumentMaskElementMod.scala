package typings.canvg

import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentElementMod.Element
import typings.canvg.distTypesMod.RenderingContext2D
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentMaskElementMod {
  
  @JSImport("canvg/dist/Document/MaskElement", "MaskElement")
  @js.native
  open class MaskElement protected () extends Element {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D, element: Element): Unit = js.native
  }
  /* static members */
  object MaskElement {
    
    @JSImport("canvg/dist/Document/MaskElement", "MaskElement")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("canvg/dist/Document/MaskElement", "MaskElement.ignoreStyles")
    @js.native
    def ignoreStyles: js.Array[String] = js.native
    inline def ignoreStyles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreStyles")(x.asInstanceOf[js.Any])
  }
}
