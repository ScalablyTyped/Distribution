package typings.canvg.elementsMod.elements

import org.scalablytyped.runtime.Instantiable3
import typings.canvg.animateElementMod.AnimateElement
import typings.canvg.documentDocumentMod.Document
import typings.canvg.elementsMod.elements.^
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg/dist/Document/elements", "elements.animate")
@js.native
open class animate protected () extends AnimateElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object animate {
  
  inline def apply: Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    AnimateElement
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("animate").asInstanceOf[Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    AnimateElement
  ]]
}
