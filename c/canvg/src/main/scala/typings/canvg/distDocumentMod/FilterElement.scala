package typings.canvg.distDocumentMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg/dist/Document", "FilterElement")
@js.native
open class FilterElement protected ()
  extends typings.canvg.distDocumentElementsMod.FilterElement {
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
object FilterElement {
  
  @JSImport("canvg/dist/Document", "FilterElement")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("canvg/dist/Document", "FilterElement.ignoreStyles")
  @js.native
  def ignoreStyles: js.Array[String] = js.native
  inline def ignoreStyles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreStyles")(x.asInstanceOf[js.Any])
}
