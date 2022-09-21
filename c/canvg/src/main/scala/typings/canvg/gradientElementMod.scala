package typings.canvg

import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.documentDocumentMod.Document
import typings.canvg.elementMod.Element
import typings.canvg.pathElementMod.PathElement
import typings.canvg.propertyMod.Property
import typings.canvg.stopElementMod.StopElement
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gradientElementMod {
  
  @JSImport("canvg/dist/Document/GradientElement", "GradientElement")
  @js.native
  abstract class GradientElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /* protected */ def addParentOpacity(parentOpacityProp: Property[Any], color: String): String = js.native
    
    val attributesToInherit: js.Array[String] = js.native
    
    def createGradient(ctx: RenderingContext2D, element: PathElement, parentOpacityProp: Property[Any]): String | CanvasGradient | CanvasPattern = js.native
    
    def getGradient(ctx: RenderingContext2D, element: PathElement): CanvasGradient | Null = js.native
    
    def getGradientUnits(): String = js.native
    
    /* protected */ def inheritStopContainer(stopsContainer: Element): Unit = js.native
    
    /* protected */ val stops: js.Array[StopElement] = js.native
  }
}
