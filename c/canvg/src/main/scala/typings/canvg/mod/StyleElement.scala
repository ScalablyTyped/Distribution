package typings.canvg.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "StyleElement")
@js.native
open class StyleElement protected ()
  extends typings.canvg.distDocumentMod.StyleElement {
  def this(document: typings.canvg.distDocumentDocumentMod.Document, node: HTMLElement) = this()
  def this(
    document: typings.canvg.distDocumentDocumentMod.Document,
    node: HTMLElement,
    captureTextNodes: Boolean
  ) = this()
}
/* static members */
object StyleElement {
  
  @JSImport("canvg", "StyleElement")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseExternalUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExternalUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
