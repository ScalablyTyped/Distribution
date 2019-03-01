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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("attribs")(attribs)
    __obj.updateDynamic("childNodes")(childNodes)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("firstChild")(firstChild)
    __obj.updateDynamic("lastChild")(lastChild)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("nextSibling")(nextSibling)
    __obj.updateDynamic("nodeValue")(nodeValue)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("parentNode")(parentNode)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("previousSibling")(previousSibling)
    __obj.updateDynamic("tagName")(tagName)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[CheerioElement]
  }
}

