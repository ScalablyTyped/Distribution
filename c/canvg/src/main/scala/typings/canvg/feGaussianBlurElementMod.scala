package typings.canvg

import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.documentDocumentMod.Document
import typings.canvg.elementMod.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feGaussianBlurElementMod {
  
  @JSImport("canvg/dist/Document/FeGaussianBlurElement", "FeGaussianBlurElement")
  @js.native
  open class FeGaussianBlurElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D, x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /* protected */ val blurRadius: Double = js.native
    
    val extraFilterDistance: Double = js.native
  }
}
