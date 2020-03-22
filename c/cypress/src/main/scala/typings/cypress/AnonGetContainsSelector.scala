package typings.cypress

import typings.cypress.JQuery_.Selector
import typings.cypress.JQuery_.htmlString
import typings.cypress.cypressMod.Cypress.ElementCoordinates
import typings.cypress.cypressMod.Cypress.ElementPositioning
import typings.std.Document_
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetContainsSelector extends js.Object {
  def getContainsSelector(text: String): Selector = js.native
  def getContainsSelector(text: String, filter: String): Selector = js.native
  def getCoordsByPosition(left: Double, top: Double): Double = js.native
  def getCoordsByPosition(left: Double, top: Double, xPosition: String): Double = js.native
  def getCoordsByPosition(left: Double, top: Double, xPosition: String, yPosition: String): Double = js.native
  def getElementAtPointFromViewport(doc: Document_, x: Double, y: Double): Element | Null = js.native
  def getElementCoordinatesByPosition(element: JQuery_[HTMLElement], position: String): ElementCoordinates = js.native
  def getElementCoordinatesByPosition(element: HTMLElement, position: String): ElementCoordinates = js.native
  def getElementCoordinatesByPositionRelativeToXY(element: JQuery_[HTMLElement], x: Double, y: Double): ElementPositioning = js.native
  def getElementCoordinatesByPositionRelativeToXY(element: HTMLElement, x: Double, y: Double): ElementPositioning = js.native
  def getElementPositioning(element: JQuery_[HTMLElement]): ElementPositioning = js.native
  def getElementPositioning(element: HTMLElement): ElementPositioning = js.native
  def getElements(element: JQuery_[HTMLElement]): JQuery_[HTMLElement] | js.Array[HTMLElement] = js.native
  def getFirstDeepestElement(elements: js.Array[HTMLElement]): HTMLElement = js.native
  def getFirstDeepestElement(elements: js.Array[HTMLElement], index: Double): HTMLElement = js.native
  def getFirstFixedOrStickyPositionParent(element: JQuery_[HTMLElement]): JQuery_[HTMLElement] | HTMLElement = js.native
  def getFirstFixedOrStickyPositionParent(element: HTMLElement): JQuery_[HTMLElement] | HTMLElement = js.native
  def getFirstScrollableParent(element: JQuery_[HTMLElement]): JQuery_[HTMLElement] | HTMLElement = js.native
  def getFirstScrollableParent(element: HTMLElement): JQuery_[HTMLElement] | HTMLElement = js.native
  def getFirstStickyPositionParent(element: JQuery_[HTMLElement]): JQuery_[HTMLElement] | HTMLElement = js.native
  def getFirstStickyPositionParent(element: HTMLElement): JQuery_[HTMLElement] | HTMLElement = js.native
  def getReasonIsHidden(element: JQuery_[HTMLElement]): String = js.native
  def getReasonIsHidden(element: HTMLElement): String = js.native
  def getWindowByElement(element: JQuery_[HTMLElement]): JQuery_[HTMLElement] | HTMLElement = js.native
  def getWindowByElement(element: HTMLElement): JQuery_[HTMLElement] | HTMLElement = js.native
  /**
    * Returns a boolean indicating whether an element is attached to the DOM.
    */
  def isAttached(element: JQuery_[HTMLElement]): Boolean = js.native
  def isAttached(element: Document_): Boolean = js.native
  def isAttached(element: HTMLElement): Boolean = js.native
  def isAttached(element: Window_): Boolean = js.native
  /**
    * Returns a boolean indicating whether an element is a descendent of another element.
    */
  def isDescendent(element1: JQuery_[HTMLElement], element2: JQuery_[HTMLElement]): Boolean = js.native
  def isDescendent(element1: JQuery_[HTMLElement], element2: HTMLElement): Boolean = js.native
  def isDescendent(element1: HTMLElement, element2: JQuery_[HTMLElement]): Boolean = js.native
  def isDescendent(element1: HTMLElement, element2: HTMLElement): Boolean = js.native
  /**
    * Returns a boolean indicating whether an element is detached from the DOM.
    */
  def isDetached(element: JQuery_[HTMLElement]): Boolean = js.native
  def isDetached(element: HTMLElement): Boolean = js.native
  /**
    * Returns a boolean indicating whether a node is of document type.
    */
  def isDocument(obj: js.Any): Boolean = js.native
  /**
    * Returns a boolean indicating whether an object is a DOM object.
    */
  def isDom(obj: js.Any): Boolean = js.native
  /**
    * Returns a boolean indicating whether an object is a DOM element.
    */
  def isElement(obj: js.Any): Boolean = js.native
  /**
    * Returns a boolean indicating whether an element can receive focus.
    */
  def isFocusable(element: JQuery_[HTMLElement]): Boolean = js.native
  def isFocusable(element: HTMLElement): Boolean = js.native
  /**
    * Returns a boolean indicating whether an element currently has focus.
    */
  def isFocused(element: JQuery_[HTMLElement]): Boolean = js.native
  def isFocused(element: HTMLElement): Boolean = js.native
  /**
    * Returns a boolean indicating whether an element is hidden.
    */
  def isHidden(element: JQuery_[HTMLElement]): Boolean = js.native
  def isHidden(element: HTMLElement): Boolean = js.native
  def isInputType(element: JQuery_[HTMLElement], `type`: String): Boolean = js.native
  def isInputType(element: JQuery_[HTMLElement], `type`: js.Array[String]): Boolean = js.native
  def isInputType(element: HTMLElement, `type`: String): Boolean = js.native
  def isInputType(element: HTMLElement, `type`: js.Array[String]): Boolean = js.native
  /**
    * Returns a boolean indicating whether an object is a jQuery object.
    */
  def isJquery(obj: js.Any): Boolean = js.native
  def isScrollable(element: JQuery_[HTMLElement]): Boolean = js.native
  def isScrollable(element: HTMLElement): Boolean = js.native
  /**
    * Returns a boolean indicating whether an element is scrollable.
    */
  def isScrollable(element: Window_): Boolean = js.native
  def isSelector(element: JQuery_[HTMLElement], selector: Selector): Boolean = js.native
  def isSelector(element: HTMLElement, selector: Selector): Boolean = js.native
  def isTextLike(element: JQuery_[HTMLElement]): Boolean = js.native
  def isTextLike(element: HTMLElement): Boolean = js.native
  def isType(element: JQuery_[HTMLElement], `type`: String): Boolean = js.native
  def isType(element: HTMLElement, `type`: String): Boolean = js.native
  /**
    * Returns a boolean indicating whether object is undefined or html, body, or document.
    */
  def isUndefinedOrHTMLBodyDoc(obj: js.Any): Boolean = js.native
  /**
    * Returns a boolean indicating whether an element is visible.
    */
  def isVisible(element: JQuery_[HTMLElement]): Boolean = js.native
  def isVisible(element: HTMLElement): Boolean = js.native
  /**
    * Returns a boolean indicating whether an object is a window object.
    */
  def isWindow(obj: js.Any): Boolean = js.native
  def query(selector: Selector): JQuery_[HTMLElement] = js.native
  def query(selector: Selector, context: JQuery_[HTMLElement]): JQuery_[HTMLElement] = js.native
  def query(selector: Selector, context: Element): JQuery_[HTMLElement] = js.native
  def stringify(element: JQuery_[HTMLElement], form: String): String = js.native
  def stringify(element: HTMLElement, form: String): String = js.native
  /**
    * Returns an array of raw elements pulled out from a jQuery object.
    */
  def unwrap(obj: js.Any): js.Any = js.native
  /**
    * Returns a jQuery object obtained by wrapping an object in jQuery.
    */
  def wrap(wrappingElement_function: Selector | htmlString): JQuery_[HTMLElement] = js.native
  def wrap(wrappingElement_function: js.Function1[/* index */ Double, String | JQuery_[HTMLElement]]): JQuery_[HTMLElement] = js.native
  def wrap(wrappingElement_function: JQuery_[HTMLElement]): JQuery_[HTMLElement] = js.native
  def wrap(wrappingElement_function: Element): JQuery_[HTMLElement] = js.native
}

