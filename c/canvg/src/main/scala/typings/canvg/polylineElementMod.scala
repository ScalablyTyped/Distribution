package typings.canvg

import typings.canvg.documentDocumentMod.Document
import typings.canvg.pathElementMod.PathElement
import typings.canvg.pointMod.Point
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineElementMod {
  
  @JSImport("canvg/dist/Document/PolylineElement", "PolylineElement")
  @js.native
  open class PolylineElement protected () extends PathElement {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /* protected */ val points: js.Array[Point] = js.native
  }
}
