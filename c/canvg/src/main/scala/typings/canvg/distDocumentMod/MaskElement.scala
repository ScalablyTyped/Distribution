package typings.canvg.distDocumentMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg/dist/Document", "MaskElement")
@js.native
open class MaskElement protected ()
  extends typings.canvg.distDocumentElementsMod.MaskElement {
  def this(document: typings.canvg.distDocumentDocumentMod.Document) = this()
  def this(document: typings.canvg.distDocumentDocumentMod.Document, node: HTMLElement) = this()
  def this(document: typings.canvg.distDocumentDocumentMod.Document, node: Unit, captureTextNodes: Boolean) = this()
  def this(
    document: typings.canvg.distDocumentDocumentMod.Document,
    node: HTMLElement,
    captureTextNodes: Boolean
  ) = this()
}
/* static members */
object MaskElement {
  
  @JSImport("canvg/dist/Document", "MaskElement")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("canvg/dist/Document", "MaskElement.ignoreStyles")
  @js.native
  def ignoreStyles: js.Array[String] = js.native
  inline def ignoreStyles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreStyles")(x.asInstanceOf[js.Any])
}
