package typings.canvg

import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentElementMod.Element
import typings.canvg.distTypesMod.RenderingContext2D
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentFeColorMatrixElementMod {
  
  @JSImport("canvg/dist/Document/FeColorMatrixElement", "FeColorMatrixElement")
  @js.native
  open class FeColorMatrixElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D, _x: Double, _y: Double, width: Double, height: Double): Unit = js.native
    
    /* protected */ val includeOpacity: Boolean = js.native
    
    /* protected */ val matrix: js.Array[Double] = js.native
  }
}
