package typings.canvg.mod.elements

import typings.canvg.anon.TypeofStyleElement
import typings.canvg.documentDocumentMod.Document
import typings.canvg.mod.elements.^
import typings.canvg.styleElementMod.StyleElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg", "elements.style")
@js.native
open class style protected () extends StyleElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object style {
  
  inline def apply: TypeofStyleElement = ^.asInstanceOf[js.Dynamic].selectDynamic("style").asInstanceOf[TypeofStyleElement]
}
