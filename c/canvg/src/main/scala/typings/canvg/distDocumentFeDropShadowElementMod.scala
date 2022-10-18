package typings.canvg

import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentElementMod.Element
import typings.canvg.distTypesMod.RenderingContext2D
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentFeDropShadowElementMod {
  
  @JSImport("canvg/dist/Document/FeDropShadowElement", "FeDropShadowElement")
  @js.native
  open class FeDropShadowElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    @JSName("apply")
    def apply(_underscore: RenderingContext2D, _x: Double, _y: Double, _width: Double, _height: Double): Unit = js.native
  }
}
