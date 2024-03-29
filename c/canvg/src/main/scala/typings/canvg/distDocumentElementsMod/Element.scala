package typings.canvg.distDocumentElementsMod

import typings.canvg.distDocumentDocumentMod.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("canvg/dist/Document/elements", "Element")
@js.native
open class Element protected ()
  extends typings.canvg.distDocumentElementMod.Element {
  def this(document: Document) = this()
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
/* static members */
object Element {
  
  @JSImport("canvg/dist/Document/elements", "Element.ignoreChildTypes")
  @js.native
  val ignoreChildTypes: js.Array[String] = js.native
}
