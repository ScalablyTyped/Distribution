package typings.canvg.distDocumentMod.elements

import org.scalablytyped.runtime.Instantiable3
import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentMod.elements.^
import typings.canvg.distDocumentTextPathElementMod.TextPathElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg/dist/Document", "elements.textPath")
@js.native
open class textPath protected () extends TextPathElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object textPath {
  
  inline def apply: Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    TextPathElement
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("textPath").asInstanceOf[Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    TextPathElement
  ]]
}
