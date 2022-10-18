package typings.canvg.distDocumentMod.elements

import org.scalablytyped.runtime.Instantiable3
import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentImageElementMod.ImageElement
import typings.canvg.distDocumentMod.elements.^
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg/dist/Document", "elements.image")
@js.native
open class image protected () extends ImageElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object image {
  
  inline def apply: Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    ImageElement
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("image").asInstanceOf[Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    ImageElement
  ]]
}
