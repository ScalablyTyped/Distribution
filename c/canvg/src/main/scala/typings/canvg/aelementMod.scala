package typings.canvg

import typings.canvg.documentDocumentMod.Document
import typings.canvg.textElementMod.TextElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aelementMod {
  
  @JSImport("canvg/dist/Document/AElement", "AElement")
  @js.native
  open class AElement protected () extends TextElement {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /* protected */ val hasText: Boolean = js.native
    
    def onClick(): Unit = js.native
    
    def onMouseMove(): Unit = js.native
    
    /* protected */ val text: String = js.native
  }
}
