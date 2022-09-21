package typings.canvg.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "Element")
@js.native
abstract class Element protected ()
  extends typings.canvg.documentMod.Element {
  def this(document: typings.canvg.documentDocumentMod.Document) = this()
  def this(document: typings.canvg.documentDocumentMod.Document, node: HTMLElement) = this()
  def this(document: typings.canvg.documentDocumentMod.Document, node: Unit, captureTextNodes: Boolean) = this()
  def this(document: typings.canvg.documentDocumentMod.Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
/* static members */
object Element {
  
  @JSImport("canvg", "Element.ignoreChildTypes")
  @js.native
  val ignoreChildTypes: js.Array[String] = js.native
}
