package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.element")
@js.native
class element protected () extends node {
  def this(element: java.lang.String) = this()
  def this(element: stdLib.HTMLElement) = this()
  def this(element: java.lang.String, ownerDocument: document) = this()
  def this(element: stdLib.HTMLElement, ownerDocument: document) = this()
  @JSName("$")
  val $_element: stdLib.HTMLElement = js.native
  val `type`: scala.Double = js.native
  def addClass(className: java.lang.String): scala.Unit = js.native
  def append(node: node): node = js.native
  def append(node: node, toStart: scala.Boolean): node = js.native
  def append(node: java.lang.String): node = js.native
  def append(node: java.lang.String, toStart: scala.Boolean): node = js.native
  def appendBogus(force: scala.Boolean): scala.Unit = js.native
  def appendHtml(html: java.lang.String): scala.Unit = js.native
  def appendText(text: java.lang.String): node = js.native
  def breakParent(parent: element): scala.Unit = js.native
  def contains(node: node): scala.Boolean = js.native
  def copyAttributes(dest: element, skipAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
  def data(name: java.lang.String): java.lang.String = js.native
  def data(name: java.lang.String, value: ckeditorLib.ckeditorLibNumbers.`false`): java.lang.String = js.native
  def data(name: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def disableContextMenu(): scala.Unit = js.native
  def find(selector: java.lang.String): nodeList = js.native
  def findOne(selector: java.lang.String): element = js.native
  def focus(): scala.Unit = js.native
  def focus(defer: scala.Boolean): scala.Unit = js.native
  def focusNext(): scala.Unit = js.native
  def focusNext(ignoreChildren: scala.Boolean): scala.Unit = js.native
  def focusNext(ignoreChildren: scala.Boolean, indexToUse: scala.Double): scala.Unit = js.native
  def focusPrevious(): scala.Unit = js.native
  def focusPrevious(ignoreChildren: scala.Boolean): scala.Unit = js.native
  def focusPrevious(ignoreChildren: scala.Boolean, indexToUse: scala.Double): scala.Unit = js.native
  def forEach(callback: js.Function1[/* node */ node, scala.Unit]): scala.Unit = js.native
  def forEach(callback: js.Function1[/* node */ node, scala.Unit], `type`: scala.Double): scala.Unit = js.native
  def forEach(callback: js.Function1[/* node */ node, scala.Unit], `type`: scala.Double, skipRoot: scala.Boolean): scala.Unit = js.native
  def getAttribute(name: java.lang.String): java.lang.String = js.native
  def getBogus(): node | scala.Boolean = js.native
  def getChild(indices: js.Array[scala.Double]): node = js.native
  def getChild(indices: scala.Double): node = js.native
  def getChildCount(): scala.Double = js.native
  def getChildren(): nodeList = js.native
  def getClientRect(): stdLib.ClientRect = js.native
  def getComputedStyle(propertyName: java.lang.String): java.lang.String = js.native
  def getDirection(useComputed: scala.Boolean): java.lang.String = js.native
  def getDocumentPosition(refDocument: document): position = js.native
  def getDtd(): ckeditorLib.CKEDITORNs.dtdDefinition = js.native
  def getEditor(): ckeditorLib.CKEDITORNs.editor = js.native
  def getElementsByTag(tagName: java.lang.String): nodeList = js.native
  def getFirst(): node = js.native
  def getFirst(evaluator: js.Function1[/* node */ node, scala.Boolean]): node = js.native
  def getFrameDocument(): document = js.native
  def getHtml(): java.lang.String = js.native
  def getId(): java.lang.String = js.native
  def getLast(): node = js.native
  def getLast(evaluator: js.Function1[/* node */ node, scala.Boolean]): node = js.native
  def getName(): java.lang.String = js.native
  def getNameAtt(): java.lang.String = js.native
  def getOuterHtml(): java.lang.String = js.native
  def getPositionedAncestor(): element = js.native
  def getSize(`type`: java.lang.String, isBorderBox: scala.Boolean): scala.Unit = js.native
  def getStyle(name: java.lang.String): java.lang.String = js.native
  def getTabIndex(): scala.Double = js.native
  def getText(): java.lang.String = js.native
  def getValue(): java.lang.String = js.native
  def getWindow(): window = js.native
  def hasAttribute(name: java.lang.String): scala.Boolean = js.native
  def hasAttributes(): scala.Boolean = js.native
  def hasClass(className: java.lang.String): scala.Boolean = js.native
  def hide(): scala.Unit = js.native
  def is(name: java.lang.String*): scala.Boolean = js.native
  def is(name: js.Any): scala.Boolean = js.native
  def isBlockBoundary(customNodeNames: org.scalablytyped.runtime.StringDictionary[ckeditorLib.ckeditorLibNumbers.`1`]): scala.Boolean = js.native
  def isEditable(): scala.Boolean = js.native
  def isEditable(textCursor: scala.Boolean): scala.Boolean = js.native
  def isEmptyInlineRemoveable(): scala.Boolean = js.native
  def isIdentical(otherElement: element): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def mergeSiblings(): scala.Unit = js.native
  def mergeSiblings(inlineOnly: scala.Boolean): scala.Unit = js.native
  def moveChildren(target: element): scala.Unit = js.native
  def moveChildren(target: element, toStart: scala.Boolean): scala.Unit = js.native
  def removeAttribute(name: java.lang.String): scala.Unit = js.native
  def removeAttributes(): scala.Unit = js.native
  def removeAttributes(attributes: js.Array[java.lang.String]): scala.Unit = js.native
  def removeClass(className: java.lang.String): scala.Unit = js.native
  def removeStyle(name: java.lang.String): scala.Unit = js.native
  def renameNode(newTag: java.lang.String): scala.Unit = js.native
  def scrollIntoParent(parent: element, alignToTop: scala.Boolean, hscroll: scala.Boolean): scala.Unit = js.native
  def scrollIntoParent(parent: window, alignToTop: scala.Boolean, hscroll: scala.Boolean): scala.Unit = js.native
  def scrollIntoView(): scala.Unit = js.native
  def scrollIntoView(alignToTop: scala.Boolean): scala.Unit = js.native
  def setAttribute(name: java.lang.String, value: java.lang.String): element = js.native
  def setAttributes(attributesPairs: org.scalablytyped.runtime.StringDictionary[java.lang.String]): element = js.native
  def setHtml(html: java.lang.String): java.lang.String = js.native
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  def setSize(`type`: java.lang.String, size: scala.Double, isBorderBox: scala.Boolean): scala.Unit = js.native
  def setState(state: scala.Double): scala.Unit = js.native
  def setState(state: scala.Double, base: java.lang.String): scala.Unit = js.native
  def setState(state: scala.Double, base: java.lang.String, useAria: scala.Boolean): scala.Unit = js.native
  def setStyle(name: java.lang.String, value: java.lang.String): element = js.native
  def setStyles(stylesPair: org.scalablytyped.runtime.StringDictionary[java.lang.String]): element = js.native
  def setText(text: java.lang.String): java.lang.String = js.native
  def setValue(value: java.lang.String): element = js.native
  def show(): scala.Unit = js.native
  def unselectable(): scala.Unit = js.native
}

@JSGlobal("CKEDITOR.dom.element")
@js.native
object element extends js.Object {
  // static method
  def clearAllMarkers(database: js.Any): js.Any = js.native
  def clearMarkers(database: js.Any, element: ckeditorLib.CKEDITORNs.domNs.element, removeFromDatabase: scala.Boolean): scala.Unit = js.native
  def createFromHtml(html: java.lang.String): ckeditorLib.CKEDITORNs.domNs.element = js.native
  def get(element: ckeditorLib.CKEDITORNs.domNs.element): ckeditorLib.CKEDITORNs.domNs.element = js.native
  def get(element: java.lang.String): ckeditorLib.CKEDITORNs.domNs.element = js.native
  def get(element: stdLib.HTMLElement): ckeditorLib.CKEDITORNs.domNs.element = js.native
  def setMarker(
    database: js.Any,
    element: ckeditorLib.CKEDITORNs.domNs.element,
    name: java.lang.String,
    value: js.Any
  ): ckeditorLib.CKEDITORNs.domNs.element = js.native
}

