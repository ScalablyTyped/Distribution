package typings.canvg

import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentElementMod.Element
import typings.canvg.distDocumentPathElementMod.PathElement
import typings.canvg.distTypesMod.RenderingContext2D
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentFilterElementMod {
  
  @JSImport("canvg/dist/Document/FilterElement", "FilterElement")
  @js.native
  open class FilterElement protected () extends Element {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D, element: Element): Unit = js.native
    @JSName("apply")
    def apply(ctx: RenderingContext2D, element: PathElement): Unit = js.native
  }
  /* static members */
  object FilterElement {
    
    @JSImport("canvg/dist/Document/FilterElement", "FilterElement")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("canvg/dist/Document/FilterElement", "FilterElement.ignoreStyles")
    @js.native
    def ignoreStyles: js.Array[String] = js.native
    inline def ignoreStyles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreStyles")(x.asInstanceOf[js.Any])
  }
}
