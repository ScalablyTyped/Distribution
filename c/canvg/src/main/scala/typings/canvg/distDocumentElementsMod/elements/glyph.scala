package typings.canvg.distDocumentElementsMod.elements

import org.scalablytyped.runtime.Instantiable3
import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentElementsMod.elements.^
import typings.canvg.distDocumentGlyphElementMod.GlyphElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg/dist/Document/elements", "elements.glyph")
@js.native
open class glyph protected () extends GlyphElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object glyph {
  
  inline def apply: Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    GlyphElement
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("glyph").asInstanceOf[Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    GlyphElement
  ]]
}
