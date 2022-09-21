package typings.canvg.mod.elements

import org.scalablytyped.runtime.Instantiable3
import typings.canvg.documentDocumentMod.Document
import typings.canvg.mod.elements.^
import typings.canvg.stopElementMod.StopElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg", "elements.stop")
@js.native
open class stop protected () extends StopElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object stop {
  
  inline def apply: Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    StopElement
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("stop").asInstanceOf[Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    StopElement
  ]]
}
