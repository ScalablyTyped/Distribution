package typings.cheerio

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheerioElement extends js.Object {
  var attribs: StringDictionary[String]
  var childNodes: js.Array[CheerioElement]
  var children: js.Array[CheerioElement]
  var data: js.UndefOr[String] = js.undefined
  var firstChild: CheerioElement
  var lastChild: CheerioElement
  var name: String
  var next: CheerioElement
  var nextSibling: CheerioElement
  var nodeValue: String
  var parent: CheerioElement
  var parentNode: CheerioElement
  var prev: CheerioElement
  var previousSibling: CheerioElement
  var startIndex: js.UndefOr[Double] = js.undefined
  // Document References
  // Node Console
  var tagName: String
  var `type`: String
}

object CheerioElement {
  @scala.inline
  def apply(
    attribs: StringDictionary[String],
    childNodes: js.Array[CheerioElement],
    children: js.Array[CheerioElement],
    firstChild: CheerioElement,
    lastChild: CheerioElement,
    name: String,
    next: CheerioElement,
    nextSibling: CheerioElement,
    nodeValue: String,
    parent: CheerioElement,
    parentNode: CheerioElement,
    prev: CheerioElement,
    previousSibling: CheerioElement,
    tagName: String,
    `type`: String,
    data: String = null,
    startIndex: Int | Double = null
  ): CheerioElement = {
    val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheerioElement]
  }
}

