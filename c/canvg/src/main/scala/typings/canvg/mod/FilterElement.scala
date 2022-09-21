package typings.canvg.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "FilterElement")
@js.native
open class FilterElement protected ()
  extends typings.canvg.documentMod.FilterElement {
  def this(document: typings.canvg.documentDocumentMod.Document) = this()
  def this(document: typings.canvg.documentDocumentMod.Document, node: HTMLElement) = this()
  def this(document: typings.canvg.documentDocumentMod.Document, node: Unit, captureTextNodes: Boolean) = this()
  def this(document: typings.canvg.documentDocumentMod.Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
/* static members */
object FilterElement {
  
  @JSImport("canvg", "FilterElement")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("canvg", "FilterElement.ignoreStyles")
  @js.native
  def ignoreStyles: js.Array[String] = js.native
  inline def ignoreStyles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreStyles")(x.asInstanceOf[js.Any])
}
