package typings
package cheerioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheerioElement extends js.Object {
  var attribs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var childNodes: js.Array[CheerioElement]
  var children: js.Array[CheerioElement]
  var data: js.UndefOr[java.lang.String] = js.undefined
  var firstChild: CheerioElement
  var lastChild: CheerioElement
  var name: java.lang.String
  var next: CheerioElement
  var nextSibling: CheerioElement
  var nodeValue: java.lang.String
  var parent: CheerioElement
  var parentNode: CheerioElement
  var prev: CheerioElement
  var previousSibling: CheerioElement
  // Document References
  // Node Console
  var tagName: java.lang.String
  var `type`: java.lang.String
}

object CheerioElement {
  @scala.inline
  def apply(
    attribs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    childNodes: js.Array[CheerioElement],
    children: js.Array[CheerioElement],
    firstChild: CheerioElement,
    lastChild: CheerioElement,
    name: java.lang.String,
    next: CheerioElement,
    nextSibling: CheerioElement,
    nodeValue: java.lang.String,
    parent: CheerioElement,
    parentNode: CheerioElement,
    prev: CheerioElement,
    previousSibling: CheerioElement,
    tagName: java.lang.String,
    `type`: java.lang.String,
    data: java.lang.String = null
  ): CheerioElement = {
    val __obj = js.Dynamic.literal(attribs = attribs, childNodes = childNodes, children = children, firstChild = firstChild, lastChild = lastChild, name = name, next = next, nextSibling = nextSibling, nodeValue = nodeValue, parent = parent, parentNode = parentNode, prev = prev, previousSibling = previousSibling, tagName = tagName)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[CheerioElement]
  }
}

