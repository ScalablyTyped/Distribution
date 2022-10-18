package typings.canvg

import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentPathElementMod.PathElement
import typings.canvg.distPointMod.Point
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentLineElementMod {
  
  @JSImport("canvg/dist/Document/LineElement", "LineElement")
  @js.native
  open class LineElement protected () extends PathElement {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    def getPoints(): js.Array[Point] = js.native
  }
}
