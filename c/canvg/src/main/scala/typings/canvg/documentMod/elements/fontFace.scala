package typings.canvg.documentMod.elements

import org.scalablytyped.runtime.Instantiable3
import typings.canvg.documentDocumentMod.Document
import typings.canvg.documentMod.elements.^
import typings.canvg.fontFaceElementMod.FontFaceElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg/dist/Document", "elements.font-face")
@js.native
open class fontFace protected () extends FontFaceElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object fontFace {
  
  inline def apply: Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    FontFaceElement
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("font-face").asInstanceOf[Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    FontFaceElement
  ]]
}
