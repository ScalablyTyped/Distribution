package typings.canvg

import typings.canvg.documentDocumentMod.Document
import typings.canvg.gradientElementMod.GradientElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearGradientElementMod {
  
  @JSImport("canvg/dist/Document/LinearGradientElement", "LinearGradientElement")
  @js.native
  open class LinearGradientElement protected () extends GradientElement {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
  }
}
