package typings.canvg

import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distPropertyMod.Property
import typings.canvg.distTypesMod.RenderingContext2D
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentElementMod {
  
  /* note: abstract class */ @JSImport("canvg/dist/Document/Element", "Element")
  @js.native
  open class Element protected () extends StObject {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /* protected */ def addChild(childNode: Element): Unit = js.native
    /* protected */ def addChild(childNode: HTMLElement): Unit = js.native
    
    def addStylesFromStyleDefinition(): Unit = js.native
    
    var animationFrozen: Boolean = js.native
    
    var animationFrozenValue: String = js.native
    
    /* protected */ def applyEffects(ctx: RenderingContext2D): Unit = js.native
    
    val attributes: Record[String, Property[Any]] = js.native
    
    /* protected */ val captureTextNodes: Boolean = js.native
    
    var children: js.Array[Element] = js.native
    
    def clearContext(_underscore: RenderingContext2D): Unit = js.native
    
    /* protected */ val document: Document = js.native
    
    def getAttribute(name: String): Property[Any] = js.native
    def getAttribute(name: String, createIfNotExists: Boolean): Property[Any] = js.native
    
    def getHrefAttribute(): Property[Any] = js.native
    
    def getStyle(name: String): Property[Any] = js.native
    def getStyle(name: String, createIfNotExists: Boolean): Property[Any] = js.native
    def getStyle(name: String, createIfNotExists: Boolean, skipAncestors: Boolean): Property[Any] = js.native
    def getStyle(name: String, createIfNotExists: Unit, skipAncestors: Boolean): Property[Any] = js.native
    
    def isFirstChild(): Boolean = js.native
    
    /* protected */ def matchesSelector(selector: String): Boolean = js.native
    
    /* protected */ val node: js.UndefOr[HTMLElement] = js.native
    
    var parent: Element | Null = js.native
    
    /* protected */ def removeStyles(element: Element, ignoreStyles: js.Array[String]): js.Array[js.Tuple2[String, String]] = js.native
    
    def render(ctx: RenderingContext2D): Unit = js.native
    
    def renderChildren(ctx: RenderingContext2D): Unit = js.native
    
    /* protected */ def restoreStyles(element: Element, styles: js.Array[js.Tuple2[String, String]]): Unit = js.native
    
    def setContext(_underscore: RenderingContext2D): Unit = js.native
    
    val styles: Record[String, Property[Any]] = js.native
    
    val stylesSpecificity: Record[String, String] = js.native
    
    val `type`: String = js.native
  }
  /* static members */
  object Element {
    
    @JSImport("canvg/dist/Document/Element", "Element.ignoreChildTypes")
    @js.native
    val ignoreChildTypes: js.Array[String] = js.native
  }
}
