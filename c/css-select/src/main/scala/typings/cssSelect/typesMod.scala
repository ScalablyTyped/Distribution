package typings.cssSelect

import typings.cssSelect.anon.Type
import typings.cssWhat.parseMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Adapter[Node, ElementNode /* <: Node */] extends StObject {
    
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
    implicit class AdapterMutableBuilder[Self <: Adapter[_, _], Node, ElementNode /* <: Node */] (val x: Self with (Adapter[Node, ElementNode])) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: (/* a */ Node, /* b */ Node) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setExistsOne(value: (Predicate[ElementNode], js.Array[Node]) => Boolean): Self = StObject.set(x, "existsOne", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindAll(value: (Predicate[ElementNode], js.Array[Node]) => js.Array[ElementNode]): Self = StObject.set(x, "findAll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindOne(value: (Predicate[ElementNode], js.Array[Node]) => ElementNode | Null): Self = StObject.set(x, "findOne", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetAttributeValue(value: (ElementNode, String) => js.UndefOr[String]): Self = StObject.set(x, "getAttributeValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetChildren(value: Node => js.Array[Node]): Self = StObject.set(x, "getChildren", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetName(value: ElementNode => String): Self = StObject.set(x, "getName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetParent(value: ElementNode => ElementNode | Null): Self = StObject.set(x, "getParent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSiblings(value: Node => js.Array[Node]): Self = StObject.set(x, "getSiblings", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetText(value: Node => String): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasAttrib(value: (ElementNode, String) => Boolean): Self = StObject.set(x, "hasAttrib", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsActive(value: /* elem */ ElementNode => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setIsHovered(value: /* elem */ ElementNode => Boolean): Self = StObject.set(x, "isHovered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsHoveredUndefined: Self = StObject.set(x, "isHovered", js.undefined)
      
      @scala.inline
      def setIsTag(value: Node => /* is ElementNode */ Boolean): Self = StObject.set(x, "isTag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsVisited(value: /* elem */ ElementNode => Boolean): Self = StObject.set(x, "isVisited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsVisitedUndefined: Self = StObject.set(x, "isVisited", js.undefined)
      
      @scala.inline
      def setRemoveSubsets(value: js.Array[Node] => js.Array[Node]): Self = StObject.set(x, "removeSubsets", js.Any.fromFunction1(value))
    }
  }
  
  type CompileToken[Node, ElementNode /* <: Node */] = js.Function3[
    /* token */ js.Array[js.Array[InternalSelector]], 
    /* options */ InternalOptions[Node, ElementNode], 
    /* context */ js.UndefOr[js.Array[ElementNode]], 
    CompiledQuery[ElementNode]
  ]
  
  @js.native
  trait CompiledQuery[ElementNode] extends StObject {
    
    def apply(node: ElementNode): Boolean = js.native
    
    var shouldTestNextSiblings: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait InternalOptions[Node, ElementNode /* <: Node */] extends Options[Node, ElementNode] {
    
    @JSName("adapter")
    var adapter_InternalOptions: Adapter[Node, ElementNode] = js.native
    
    def equals(a: Node, b: Node): Boolean = js.native
  }
  object InternalOptions {
    
    @scala.inline
    def apply[Node, ElementNode /* <: Node */](adapter: Adapter[Node, ElementNode], equals_ : (Node, Node) => Boolean): InternalOptions[Node, ElementNode] = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[InternalOptions[Node, ElementNode]]
    }
    
    @scala.inline
    implicit class InternalOptionsMutableBuilder[Self <: InternalOptions[_, _], Node, ElementNode /* <: Node */] (val x: Self with (InternalOptions[Node, ElementNode])) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: Adapter[Node, ElementNode]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_(value: (Node, Node) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
    }
  }
  
  type InternalSelector = Selector | Type
  
  @js.native
  trait Options[Node, ElementNode /* <: Node */] extends StObject {
    
    /**
      * The adapter to use when interacting with the backing DOM structure. By
      * default it uses the `domutils` module.
      */
    var adapter: js.UndefOr[Adapter[Node, ElementNode]] = js.native
    
    /**
      * Allow css-select to cache results for some selectors, sometimes greatly
      * improving querying performance. Disable this if your document can
      * change in between queries with the same compiled selector.
      * Defaults to `true`.
      */
    var cacheResults: js.UndefOr[Boolean] = js.native
    
    /**
      * The context of the current query. Used to limit the scope of searches.
      * Can be matched directly using the `:scope` pseudo-selector.
      */
    var context: js.UndefOr[ElementNode | js.Array[ElementNode]] = js.native
    
    /**
      * The last function in the stack, will be called with the last element
      * that's looked at.
      */
    var rootFunc: js.UndefOr[js.Function1[/* element */ ElementNode, Boolean]] = js.native
    
    /**
      * Limits the module to only use CSS3 selectors. Default: false.
      */
    var strict: js.UndefOr[Boolean] = js.native
    
    /**
      * When enabled, tag names will be case-sensitive. Default: false.
      */
    var xmlMode: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[Node, ElementNode /* <: Node */](): Options[Node, ElementNode] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Node, ElementNode]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_, _], Node, ElementNode /* <: Node */] (val x: Self with (Options[Node, ElementNode])) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: Adapter[Node, ElementNode]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      @scala.inline
      def setCacheResults(value: Boolean): Self = StObject.set(x, "cacheResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheResultsUndefined: Self = StObject.set(x, "cacheResults", js.undefined)
      
      @scala.inline
      def setContext(value: ElementNode | js.Array[ElementNode]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setContextVarargs(value: ElementNode*): Self = StObject.set(x, "context", js.Array(value :_*))
      
      @scala.inline
      def setRootFunc(value: /* element */ ElementNode => Boolean): Self = StObject.set(x, "rootFunc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRootFuncUndefined: Self = StObject.set(x, "rootFunc", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setXmlMode(value: Boolean): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
    }
  }
  
  type Predicate[Value] = js.Function1[/* v */ Value, Boolean]
  
  type Query[ElementNode] = String | CompiledQuery[ElementNode]
}
