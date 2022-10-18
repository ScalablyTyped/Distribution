package typings.canvg.distDocumentElementsMod.elements

import org.scalablytyped.runtime.Instantiable3
import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentElementsMod.elements.^
import typings.canvg.distDocumentFeDropShadowElementMod.FeDropShadowElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg/dist/Document/elements", "elements.feDropShadow")
@js.native
open class feDropShadow protected () extends FeDropShadowElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object feDropShadow {
  
  inline def apply: Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    FeDropShadowElement
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("feDropShadow").asInstanceOf[Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    FeDropShadowElement
  ]]
}
