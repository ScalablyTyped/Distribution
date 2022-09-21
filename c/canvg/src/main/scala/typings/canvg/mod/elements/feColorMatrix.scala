package typings.canvg.mod.elements

import org.scalablytyped.runtime.Instantiable3
import typings.canvg.documentDocumentMod.Document
import typings.canvg.feColorMatrixElementMod.FeColorMatrixElement
import typings.canvg.mod.elements.^
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg", "elements.feColorMatrix")
@js.native
open class feColorMatrix protected () extends FeColorMatrixElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object feColorMatrix {
  
  inline def apply: Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    FeColorMatrixElement
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("feColorMatrix").asInstanceOf[Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    FeColorMatrixElement
  ]]
}
