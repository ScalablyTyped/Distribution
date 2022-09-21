package typings.canvg.mod.elements

import typings.canvg.anon.TypeofPathElement
import typings.canvg.documentDocumentMod.Document
import typings.canvg.mod.elements.^
import typings.canvg.pathElementMod.PathElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg", "elements.path")
@js.native
open class path protected () extends PathElement {
  def this(document: Document) = this()
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object path {
  
  inline def apply: TypeofPathElement = ^.asInstanceOf[js.Dynamic].selectDynamic("path").asInstanceOf[TypeofPathElement]
}
