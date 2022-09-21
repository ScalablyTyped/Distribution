package typings.canvg

import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.documentDocumentMod.Document
import typings.canvg.elementMod.Element
import typings.canvg.propertyMod.Property
import typings.std.CanvasPattern
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternElementMod {
  
  @JSImport("canvg/dist/Document/PatternElement", "PatternElement")
  @js.native
  open class PatternElement protected () extends Element {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    def createPattern(ctx: RenderingContext2D, _underscore: Element, parentOpacityProp: Property[Any]): CanvasPattern = js.native
  }
}
