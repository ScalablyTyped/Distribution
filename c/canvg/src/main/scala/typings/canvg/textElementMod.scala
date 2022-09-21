package typings.canvg

import typings.canvg.boundingBoxMod.BoundingBox
import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.documentDocumentMod.Document
import typings.canvg.elementMod.Element
import typings.canvg.fontElementMod.FontElement
import typings.canvg.glyphElementMod.GlyphElement
import typings.canvg.renderedElementMod.RenderedElement
import typings.std.ChildNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textElementMod {
  
  @JSImport("canvg/dist/Document/TextElement", "TextElement")
  @js.native
  open class TextElement protected () extends RenderedElement {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /* protected */ def adjustChildCoordinates(ctx: RenderingContext2D, textParent: TextElement, parent: Element, i: Double): TextElement = js.native
    
    /* protected */ def adjustChildCoordinatesRecursive(ctx: RenderingContext2D): Unit = js.native
    
    /* protected */ def adjustChildCoordinatesRecursiveCore(ctx: RenderingContext2D, textParent: TextElement, parent: Element, i: Double): Unit = js.native
    
    /* protected */ def applyAnchoring(): Unit = js.native
    
    def getBoundingBox(ctx: RenderingContext2D): BoundingBox = js.native
    
    /* protected */ def getChildBoundingBox(ctx: RenderingContext2D, textParent: TextElement, parent: Element, i: Double): BoundingBox = js.native
    
    /* protected */ def getFontSize(): Double = js.native
    
    def getGlyph(font: FontElement, text: String, i: Double): GlyphElement = js.native
    
    /**
      * Inherits positional attributes from {@link TextElement} parent(s). Attributes
      * are only inherited from a parent to its first child.
      * @param name - The attribute name.
      * @returns The attribute value or null.
      */
    /* protected */ def getInheritedAttribute(name: String): String | Null = js.native
    
    /* protected */ def getTElementBoundingBox(ctx: RenderingContext2D): BoundingBox = js.native
    
    def getText(): String = js.native
    
    /* protected */ def getTextFromNode(): String = js.native
    /* protected */ def getTextFromNode(node: ChildNode): String = js.native
    
    /* protected */ def initializeCoordinates(): Unit = js.native
    
    /* private */ var leafTexts: Any = js.native
    
    /* private */ var maxX: Any = js.native
    
    /* private */ var measureCache: Any = js.native
    
    /* protected */ def measureTargetText(ctx: RenderingContext2D, targetText: String): Double = js.native
    
    /* protected */ def measureText(ctx: RenderingContext2D): Double = js.native
    
    /* private */ var minX: Any = js.native
    
    /* protected */ def renderChild(ctx: RenderingContext2D, textParent: TextElement, parent: Element, i: Double): Unit = js.native
    
    /* protected */ def renderTElementChildren(ctx: RenderingContext2D): Unit = js.native
    
    /* private */ var textChunkStart: Any = js.native
    
    /* protected */ var x: Double = js.native
    
    /* protected */ var y: Double = js.native
  }
}
