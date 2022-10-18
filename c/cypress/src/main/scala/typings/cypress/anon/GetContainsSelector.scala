package typings.cypress.anon

import typings.cypress.Cypress.ElementCoordinates
import typings.cypress.Cypress.ElementPositioning
import typings.cypress.JQuery
import typings.cypress.JQuery.Selector
import typings.cypress.JQuery.htmlString
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainsSelector extends StObject {
  
  def getContainsSelector(text: String): Selector = js.native
  def getContainsSelector(text: String, filter: String): Selector = js.native
  
  def getCoordsByPosition(left: Double, top: Double): Double = js.native
  def getCoordsByPosition(left: Double, top: Double, xPosition: String): Double = js.native
  def getCoordsByPosition(left: Double, top: Double, xPosition: String, yPosition: String): Double = js.native
  def getCoordsByPosition(left: Double, top: Double, xPosition: Unit, yPosition: String): Double = js.native
  
  def getElementAtPointFromViewport(doc: Document, x: Double, y: Double): Element | Null = js.native
  
  def getElementCoordinatesByPosition(element: JQuery[HTMLElement], position: String): ElementCoordinates = js.native
  def getElementCoordinatesByPosition(element: HTMLElement, position: String): ElementCoordinates = js.native
  
  def getElementCoordinatesByPositionRelativeToXY(element: JQuery[HTMLElement], x: Double, y: Double): ElementPositioning = js.native
  def getElementCoordinatesByPositionRelativeToXY(element: HTMLElement, x: Double, y: Double): ElementPositioning = js.native
  
  def getElementPositioning(element: JQuery[HTMLElement]): ElementPositioning = js.native
  def getElementPositioning(element: HTMLElement): ElementPositioning = js.native
  
  def getElements(element: JQuery[HTMLElement]): JQuery[HTMLElement] | js.Array[HTMLElement] = js.native
  
  def getFirstDeepestElement(elements: js.Array[HTMLElement]): HTMLElement = js.native
  def getFirstDeepestElement(elements: js.Array[HTMLElement], index: Double): HTMLElement = js.native
  
  def getFirstFixedOrStickyPositionParent(element: JQuery[HTMLElement]): JQuery[HTMLElement] | HTMLElement = js.native
  def getFirstFixedOrStickyPositionParent(element: HTMLElement): JQuery[HTMLElement] | HTMLElement = js.native
  
  def getFirstScrollableParent(element: JQuery[HTMLElement]): JQuery[HTMLElement] | HTMLElement = js.native
  def getFirstScrollableParent(element: HTMLElement): JQuery[HTMLElement] | HTMLElement = js.native
  
  def getFirstStickyPositionParent(element: JQuery[HTMLElement]): JQuery[HTMLElement] | HTMLElement = js.native
  def getFirstStickyPositionParent(element: HTMLElement): JQuery[HTMLElement] | HTMLElement = js.native
  
  def getReasonIsHidden(element: JQuery[HTMLElement]): String = js.native
  def getReasonIsHidden(element: JQuery[HTMLElement], options: js.Object): String = js.native
  def getReasonIsHidden(element: HTMLElement): String = js.native
  def getReasonIsHidden(element: HTMLElement, options: js.Object): String = js.native
  
  def getWindowByElement(element: JQuery[HTMLElement]): JQuery[HTMLElement] | HTMLElement = js.native
  def getWindowByElement(element: HTMLElement): JQuery[HTMLElement] | HTMLElement = js.native
  
  /**
    * Returns a boolean indicating whether an element is attached to the DOM.
    */
  def isAttached(element: JQuery[HTMLElement]): Boolean = js.native
  def isAttached(element: Document): Boolean = js.native
  def isAttached(element: HTMLElement): Boolean = js.native
  def isAttached(element: Window): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether an element is a descendent of another element.
    */
  def isDescendent(element1: JQuery[HTMLElement], element2: JQuery[HTMLElement]): Boolean = js.native
  def isDescendent(element1: JQuery[HTMLElement], element2: HTMLElement): Boolean = js.native
  def isDescendent(element1: HTMLElement, element2: JQuery[HTMLElement]): Boolean = js.native
  def isDescendent(element1: HTMLElement, element2: HTMLElement): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether an element is detached from the DOM.
    */
  def isDetached(element: JQuery[HTMLElement]): Boolean = js.native
  def isDetached(element: HTMLElement): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether a node is of document type.
    */
  def isDocument(obj: Any): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether an object is a DOM object.
    */
  def isDom(obj: Any): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether an object is a DOM element.
    */
  def isElement(obj: Any): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether an element can receive focus.
    */
  def isFocusable(element: JQuery[HTMLElement]): Boolean = js.native
  def isFocusable(element: HTMLElement): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether an element currently has focus.
    */
  def isFocused(element: JQuery[HTMLElement]): Boolean = js.native
  def isFocused(element: HTMLElement): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether an element is hidden.
    */
  def isHidden(element: JQuery[HTMLElement]): Boolean = js.native
  def isHidden(element: JQuery[HTMLElement], methodName: String): Boolean = js.native
  def isHidden(element: JQuery[HTMLElement], methodName: String, options: js.Object): Boolean = js.native
  def isHidden(element: JQuery[HTMLElement], methodName: Unit, options: js.Object): Boolean = js.native
  def isHidden(element: HTMLElement): Boolean = js.native
  def isHidden(element: HTMLElement, methodName: String): Boolean = js.native
  def isHidden(element: HTMLElement, methodName: String, options: js.Object): Boolean = js.native
  def isHidden(element: HTMLElement, methodName: Unit, options: js.Object): Boolean = js.native
  
  def isInputType(element: JQuery[HTMLElement], `type`: String): Boolean = js.native
  def isInputType(element: JQuery[HTMLElement], `type`: js.Array[String]): Boolean = js.native
  def isInputType(element: HTMLElement, `type`: String): Boolean = js.native
  def isInputType(element: HTMLElement, `type`: js.Array[String]): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether an object is a jQuery object.
    */
  def isJquery(obj: Any): /* is cypress.JQuery<std.HTMLElement> */ Boolean = js.native
  
  def isScrollable(element: JQuery[HTMLElement]): Boolean = js.native
  def isScrollable(element: HTMLElement): Boolean = js.native
  /**
    * Returns a boolean indicating whether an element is scrollable.
    */
  def isScrollable(element: Window): Boolean = js.native
  
  def isSelector(element: JQuery[HTMLElement], selector: Selector): Boolean = js.native
  def isSelector(element: HTMLElement, selector: Selector): Boolean = js.native
  
  def isTextLike(element: JQuery[HTMLElement]): Boolean = js.native
  def isTextLike(element: HTMLElement): Boolean = js.native
  
  def isType(element: JQuery[HTMLElement], `type`: String): Boolean = js.native
  def isType(element: HTMLElement, `type`: String): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether object is undefined or html, body, or document.
    */
  def isUndefinedOrHTMLBodyDoc(obj: Any): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether an element is visible.
    */
  def isVisible(element: JQuery[HTMLElement]): Boolean = js.native
  def isVisible(element: HTMLElement): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether an object is a window object.
    */
  def isWindow(obj: Any): /* is std.Window */ Boolean = js.native
  
  def query(selector: Selector): JQuery[HTMLElement] = js.native
  def query(selector: Selector, context: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  def query(selector: Selector, context: Element): JQuery[HTMLElement] = js.native
  
  def stringify(element: JQuery[HTMLElement], form: String): String = js.native
  def stringify(element: HTMLElement, form: String): String = js.native
  
  /**
    * Returns an array of raw elements pulled out from a jQuery object.
    */
  def unwrap(obj: Any): Any = js.native
  
  /**
    * Returns a jQuery object obtained by wrapping an object in jQuery.
    */
  def wrap(wrappingElement_function: Selector | htmlString): JQuery[HTMLElement] = js.native
  def wrap(wrappingElement_function: js.Function1[/* index */ Double, String | JQuery[HTMLElement]]): JQuery[HTMLElement] = js.native
  def wrap(wrappingElement_function: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  def wrap(wrappingElement_function: Element): JQuery[HTMLElement] = js.native
}
