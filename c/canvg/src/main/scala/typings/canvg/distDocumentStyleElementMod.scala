package typings.canvg

import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentElementMod.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentStyleElementMod {
  
  @JSImport("canvg/dist/Document/StyleElement", "StyleElement")
  @js.native
  open class StyleElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
  }
  /* static members */
  object StyleElement {
    
    @JSImport("canvg/dist/Document/StyleElement", "StyleElement")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseExternalUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExternalUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
