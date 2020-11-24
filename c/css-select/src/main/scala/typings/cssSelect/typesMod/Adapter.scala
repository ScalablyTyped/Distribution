package typings.cssSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adapter[Node, ElementNode /* <: Node */] extends js.Object {
  
  /**
    * The adapter can also optionally include an equals method, if your DOM
    * structure needs a custom equality test to compare two objects which refer
    * to the same underlying node. If not provided, `css-select` will fall back to
    * `a === b`.
    */
  @JSName("equals")
  var equals_FAdapter: js.UndefOr[js.Function2[/* a */ Node, /* b */ Node, Boolean]] = js.native
  
  /**
    * Does at least one of passed element nodes pass the test predicate?
    */
  def existsOne(test: Predicate[ElementNode], elems: js.Array[Node]): Boolean = js.native
  
  /**
    * Finds all of the element nodes in the array that match the test predicate,
    * as well as any of their children that match it.
    */
  def findAll(test: Predicate[ElementNode], nodes: js.Array[Node]): js.Array[ElementNode] = js.native
  
  /**
    * Finds the first node in the array that matches the test predicate, or one
    * of its children.
    */
  def findOne(test: Predicate[ElementNode], elems: js.Array[Node]): ElementNode | Null = js.native
  
  /**
    * Get the attribute value.
    */
  def getAttributeValue(elem: ElementNode, name: String): js.UndefOr[String] = js.native
  
  /**
    * Get the node's children
    */
  def getChildren(node: Node): js.Array[Node] = js.native
  
  /**
    * Get the name of the tag
    */
  def getName(elem: ElementNode): String = js.native
  
  /**
    * Get the parent of the node
    */
  def getParent(node: ElementNode): ElementNode | Null = js.native
  
  /**
    * Get the siblings of the node. Note that unlike jQuery's `siblings` method,
    * this is expected to include the current node as well
    */
  def getSiblings(node: Node): js.Array[Node] = js.native
  
  /**
    * Get the text content of the node, and its children if it has any.
    */
  def getText(node: Node): String = js.native
  
  /**
    * Does the element have the named attribute?
    */
  def hasAttrib(elem: ElementNode, name: String): Boolean = js.native
  
  /**
    * Is the element in active state?
    */
  var isActive: js.UndefOr[js.Function1[/* elem */ ElementNode, Boolean]] = js.native
  
  /**
    * Is the element in hovered state?
    */
  var isHovered: js.UndefOr[js.Function1[/* elem */ ElementNode, Boolean]] = js.native
  
  /**
    *  Is the node a tag?
    */
  def isTag(node: Node): /* is ElementNode */ Boolean = js.native
  
  /**
    * Is the element in visited state?
    */
  var isVisited: js.UndefOr[js.Function1[/* elem */ ElementNode, Boolean]] = js.native
  
  /**
    * Takes an array of nodes, and removes any duplicates, as well as any
    * nodes whose ancestors are also in the array.
    */
  def removeSubsets(nodes: js.Array[Node]): js.Array[Node] = js.native
}
object Adapter {
  
  @scala.inline
  def apply[Node, ElementNode /* <: Node */](
    existsOne: (Predicate[ElementNode], js.Array[Node]) => Boolean,
    findAll: (Predicate[ElementNode], js.Array[Node]) => js.Array[ElementNode],
    findOne: (Predicate[ElementNode], js.Array[Node]) => ElementNode | Null,
    getAttributeValue: (ElementNode, String) => js.UndefOr[String],
    getChildren: Node => js.Array[Node],
    getName: ElementNode => String,
    getParent: ElementNode => ElementNode | Null,
    getSiblings: Node => js.Array[Node],
    getText: Node => String,
    hasAttrib: (ElementNode, String) => Boolean,
    isTag: Node => /* is ElementNode */ Boolean,
    removeSubsets: js.Array[Node] => js.Array[Node]
  ): Adapter[Node, ElementNode] = {
    val __obj = js.Dynamic.literal(existsOne = js.Any.fromFunction2(existsOne), findAll = js.Any.fromFunction2(findAll), findOne = js.Any.fromFunction2(findOne), getAttributeValue = js.Any.fromFunction2(getAttributeValue), getChildren = js.Any.fromFunction1(getChildren), getName = js.Any.fromFunction1(getName), getParent = js.Any.fromFunction1(getParent), getSiblings = js.Any.fromFunction1(getSiblings), getText = js.Any.fromFunction1(getText), hasAttrib = js.Any.fromFunction2(hasAttrib), isTag = js.Any.fromFunction1(isTag), removeSubsets = js.Any.fromFunction1(removeSubsets))
    __obj.asInstanceOf[Adapter[Node, ElementNode]]
  }
  
  @scala.inline
  implicit class AdapterOps[Self <: Adapter[_, _], Node, ElementNode /* <: Node */] (val x: Self with (Adapter[Node, ElementNode])) extends AnyVal {
    
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
    def setExistsOne(value: (Predicate[ElementNode], js.Array[Node]) => Boolean): Self = this.set("existsOne", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindAll(value: (Predicate[ElementNode], js.Array[Node]) => js.Array[ElementNode]): Self = this.set("findAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindOne(value: (Predicate[ElementNode], js.Array[Node]) => ElementNode | Null): Self = this.set("findOne", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAttributeValue(value: (ElementNode, String) => js.UndefOr[String]): Self = this.set("getAttributeValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetChildren(value: Node => js.Array[Node]): Self = this.set("getChildren", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetName(value: ElementNode => String): Self = this.set("getName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParent(value: ElementNode => ElementNode | Null): Self = this.set("getParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSiblings(value: Node => js.Array[Node]): Self = this.set("getSiblings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetText(value: Node => String): Self = this.set("getText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasAttrib(value: (ElementNode, String) => Boolean): Self = this.set("hasAttrib", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsTag(value: Node => /* is ElementNode */ Boolean): Self = this.set("isTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSubsets(value: js.Array[Node] => js.Array[Node]): Self = this.set("removeSubsets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: (/* a */ Node, /* b */ Node) => Boolean): Self = this.set("equals", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setIsActive(value: /* elem */ ElementNode => Boolean): Self = this.set("isActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setIsHovered(value: /* elem */ ElementNode => Boolean): Self = this.set("isHovered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsHovered: Self = this.set("isHovered", js.undefined)
    
    @scala.inline
    def setIsVisited(value: /* elem */ ElementNode => Boolean): Self = this.set("isVisited", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsVisited: Self = this.set("isVisited", js.undefined)
  }
}
