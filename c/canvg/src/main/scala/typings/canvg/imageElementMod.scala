package typings.canvg

import typings.canvg.boundingBoxMod.BoundingBox
import typings.canvg.documentDocumentMod.Document
import typings.canvg.renderedElementMod.RenderedElement
import typings.std.CanvasImageSource
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageElementMod {
  
  @JSImport("canvg/dist/Document/ImageElement", "ImageElement")
  @js.native
  open class ImageElement protected () extends RenderedElement {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    def getBoundingBox(): BoundingBox = js.native
    
    /* protected */ var image: js.UndefOr[CanvasImageSource | String] = js.native
    
    /* protected */ def loadImage(href: String): js.Promise[Unit] = js.native
    
    /* protected */ def loadSvg(href: String): js.Promise[Unit] = js.native
    
    var loaded: Boolean = js.native
  }
}
