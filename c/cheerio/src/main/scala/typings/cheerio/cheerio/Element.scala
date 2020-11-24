package typings.cheerio.cheerio

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends js.Object {
  
  var attribs: StringDictionary[String] = js.native
  
  var childNodes: js.Array[Element] = js.native
  
  var children: js.Array[Element] = js.native
  
  var data: js.UndefOr[String] = js.native
  
  var firstChild: Element = js.native
  
  var lastChild: Element = js.native
  
  var name: String = js.native
  
  var next: Element = js.native
  
  var nextSibling: Element = js.native
  
  var nodeValue: String = js.native
  
  var parent: Element = js.native
  
  var parentNode: Element = js.native
  
  var prev: Element = js.native
  
  var previousSibling: Element = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
  
  // Document References
  // Node Console
  var tagName: String = js.native
  
  var `type`: String = js.native
}
object Element {
  
  @scala.inline
  def apply(
    attribs: StringDictionary[String],
    childNodes: js.Array[Element],
    children: js.Array[Element],
    firstChild: Element,
    lastChild: Element,
    name: String,
    next: Element,
    nextSibling: Element,
    nodeValue: String,
    parent: Element,
    parentNode: Element,
    prev: Element,
    previousSibling: Element,
    tagName: String,
    `type`: String
  ): Element = {
    val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttribs(value: StringDictionary[String]): Self = this.set("attribs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodesVarargs(value: Element*): Self = this.set("childNodes", js.Array(value :_*))
    
    @scala.inline
    def setChildNodes(value: js.Array[Element]): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: Element*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[Element]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstChild(value: Element): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChild(value: Element): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: Element): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSibling(value: Element): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Element): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNode(value: Element): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: Element): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSibling(value: Element): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
}
