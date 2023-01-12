package typings.cssSelect

import typings.cssSelect.anon.Type
import typings.cssWhat.libEsTypesMod.Selector
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait Adapter[Node, ElementNode /* <: Node */] extends StObject {
    
    /**
      * The adapter can also optionally include an equals method, if your DOM
      * structure needs a custom equality test to compare two objects which refer
      * to the same underlying node. If not provided, `css-select` will fall back to
      * `a === b`.
      */
    @JSName("equals")
    var equals_FAdapter: js.UndefOr[js.Function2[/* a */ Node, /* b */ Node, Boolean]] = js.undefined
    
    /**
      * Does at least one of passed element nodes pass the test predicate?
      */
    def existsOne(test: Predicate[ElementNode], elems: js.Array[Node]): Boolean
    
    /**
      * Finds all of the element nodes in the array that match the test predicate,
      * as well as any of their children that match it.
      */
    def findAll(test: Predicate[ElementNode], nodes: js.Array[Node]): js.Array[ElementNode]
    
    /**
      * Finds the first node in the array that matches the test predicate, or one
      * of its children.
      */
    def findOne(test: Predicate[ElementNode], elems: js.Array[Node]): ElementNode | Null
    
    /**
      * Get the attribute value.
      */
    def getAttributeValue(elem: ElementNode, name: String): js.UndefOr[String]
    
    /**
      * Get the node's children
      */
    def getChildren(node: Node): js.Array[Node]
    
    /**
      * Get the name of the tag
      */
    def getName(elem: ElementNode): String
    
    /**
      * Get the parent of the node
      */
    def getParent(node: ElementNode): Node | Null
    
    /**
      * Get the siblings of the node. Note that unlike jQuery's `siblings` method,
      * this is expected to include the current node as well
      */
    def getSiblings(node: Node): js.Array[Node]
    
    /**
      * Get the text content of the node, and its children if it has any.
      */
    def getText(node: Node): String
    
    /**
      * Does the element have the named attribute?
      */
    def hasAttrib(elem: ElementNode, name: String): Boolean
    
    /**
      * Is the element in active state?
      */
    var isActive: js.UndefOr[js.Function1[/* elem */ ElementNode, Boolean]] = js.undefined
    
    /**
      * Is the element in hovered state?
      */
    var isHovered: js.UndefOr[js.Function1[/* elem */ ElementNode, Boolean]] = js.undefined
    
    /**
      *  Is the node a tag?
      */
    def isTag(node: Node): /* is ElementNode */ Boolean
    
    /**
      * Is the element in visited state?
      */
    var isVisited: js.UndefOr[js.Function1[/* elem */ ElementNode, Boolean]] = js.undefined
    
    /**
      * Returns the previous element sibling of a node.
      */
    var prevElementSibling: js.UndefOr[js.Function1[/* node */ Node, ElementNode | Null]] = js.undefined
    
    /**
      * Takes an array of nodes, and removes any duplicates, as well as any
      * nodes whose ancestors are also in the array.
      */
    def removeSubsets(nodes: js.Array[Node]): js.Array[Node]
  }
  object Adapter {
    
    inline def apply[Node, ElementNode /* <: Node */](
      existsOne: (Predicate[ElementNode], js.Array[Node]) => Boolean,
      findAll: (Predicate[ElementNode], js.Array[Node]) => js.Array[ElementNode],
      findOne: (Predicate[ElementNode], js.Array[Node]) => ElementNode | Null,
      getAttributeValue: (ElementNode, String) => js.UndefOr[String],
      getChildren: Node => js.Array[Node],
      getName: ElementNode => String,
      getParent: ElementNode => Node | Null,
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
    implicit open class MutableBuilder[Self <: Adapter[?, ?], Node, ElementNode /* <: Node */] (val x: Self & (Adapter[Node, ElementNode])) extends AnyVal {
      
      inline def setEquals_(value: (/* a */ Node, /* b */ Node) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setExistsOne(value: (Predicate[ElementNode], js.Array[Node]) => Boolean): Self = StObject.set(x, "existsOne", js.Any.fromFunction2(value))
      
      inline def setFindAll(value: (Predicate[ElementNode], js.Array[Node]) => js.Array[ElementNode]): Self = StObject.set(x, "findAll", js.Any.fromFunction2(value))
      
      inline def setFindOne(value: (Predicate[ElementNode], js.Array[Node]) => ElementNode | Null): Self = StObject.set(x, "findOne", js.Any.fromFunction2(value))
      
      inline def setGetAttributeValue(value: (ElementNode, String) => js.UndefOr[String]): Self = StObject.set(x, "getAttributeValue", js.Any.fromFunction2(value))
      
      inline def setGetChildren(value: Node => js.Array[Node]): Self = StObject.set(x, "getChildren", js.Any.fromFunction1(value))
      
      inline def setGetName(value: ElementNode => String): Self = StObject.set(x, "getName", js.Any.fromFunction1(value))
      
      inline def setGetParent(value: ElementNode => Node | Null): Self = StObject.set(x, "getParent", js.Any.fromFunction1(value))
      
      inline def setGetSiblings(value: Node => js.Array[Node]): Self = StObject.set(x, "getSiblings", js.Any.fromFunction1(value))
      
      inline def setGetText(value: Node => String): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
      
      inline def setHasAttrib(value: (ElementNode, String) => Boolean): Self = StObject.set(x, "hasAttrib", js.Any.fromFunction2(value))
      
      inline def setIsActive(value: /* elem */ ElementNode => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction1(value))
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setIsHovered(value: /* elem */ ElementNode => Boolean): Self = StObject.set(x, "isHovered", js.Any.fromFunction1(value))
      
      inline def setIsHoveredUndefined: Self = StObject.set(x, "isHovered", js.undefined)
      
      inline def setIsTag(value: Node => /* is ElementNode */ Boolean): Self = StObject.set(x, "isTag", js.Any.fromFunction1(value))
      
      inline def setIsVisited(value: /* elem */ ElementNode => Boolean): Self = StObject.set(x, "isVisited", js.Any.fromFunction1(value))
      
      inline def setIsVisitedUndefined: Self = StObject.set(x, "isVisited", js.undefined)
      
      inline def setPrevElementSibling(value: /* node */ Node => ElementNode | Null): Self = StObject.set(x, "prevElementSibling", js.Any.fromFunction1(value))
      
      inline def setPrevElementSiblingUndefined: Self = StObject.set(x, "prevElementSibling", js.undefined)
      
      inline def setRemoveSubsets(value: js.Array[Node] => js.Array[Node]): Self = StObject.set(x, "removeSubsets", js.Any.fromFunction1(value))
    }
  }
  
  type CompileToken[Node, ElementNode /* <: Node */] = js.Function3[
    /* token */ js.Array[js.Array[InternalSelector]], 
    /* options */ InternalOptions[Node, ElementNode], 
    /* context */ js.UndefOr[js.Array[Node] | Node], 
    CompiledQuery[ElementNode]
  ]
  
  @js.native
  trait CompiledQuery[ElementNode] extends StObject {
    
    def apply(node: ElementNode): Boolean = js.native
    
    var shouldTestNextSiblings: js.UndefOr[Boolean] = js.native
  }
  
  trait InternalOptions[Node, ElementNode /* <: Node */]
    extends StObject
       with Options[Node, ElementNode] {
    
    @JSName("adapter")
    var adapter_InternalOptions: Adapter[Node, ElementNode]
    
    def equals(a: Node, b: Node): Boolean
  }
  object InternalOptions {
    
    inline def apply[Node, ElementNode /* <: Node */](adapter: Adapter[Node, ElementNode], equals_ : (Node, Node) => Boolean): InternalOptions[Node, ElementNode] = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[InternalOptions[Node, ElementNode]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalOptions[?, ?], Node, ElementNode /* <: Node */] (val x: Self & (InternalOptions[Node, ElementNode])) extends AnyVal {
      
      inline def setAdapter(value: Adapter[Node, ElementNode]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setEquals_(value: (Node, Node) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
    }
  }
  
  type InternalSelector = Selector | Type
  
  trait Options[Node, ElementNode /* <: Node */] extends StObject {
    
    /**
      * The adapter to use when interacting with the backing DOM structure. By
      * default it uses the `domutils` module.
      */
    var adapter: js.UndefOr[Adapter[Node, ElementNode]] = js.undefined
    
    /**
      * Allow css-select to cache results for some selectors, sometimes greatly
      * improving querying performance. Disable this if your document can
      * change in between queries with the same compiled selector.
      *
      * @default true
      */
    var cacheResults: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The context of the current query. Used to limit the scope of searches.
      * Can be matched directly using the `:scope` pseudo-class.
      */
    var context: js.UndefOr[Node | js.Array[Node]] = js.undefined
    
    /**
      * Lower-case attribute names.
      *
      * @default !xmlMode
      */
    var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Lower-case tag names.
      *
      * @default !xmlMode
      */
    var lowerCaseTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pseudo-classes that override the default ones.
      *
      * Maps from names to either strings of functions.
      * - A string value is a selector that the element must match to be selected.
      * - A function is called with the element as its first argument, and optional
      *  parameters second. If it returns true, the element is selected.
      */
    var pseudos: js.UndefOr[
        Record[
          String, 
          String | (js.Function2[/* elem */ ElementNode, /* value */ js.UndefOr[String | Null], Boolean])
        ]
      ] = js.undefined
    
    /**
      * Is the document in quirks mode?
      *
      * This will lead to .className and #id being case-insensitive.
      *
      * @default false
      */
    var quirksMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether to consider the selector as a relative selector.
      *
      * Relative selectors that don't include a `:scope` pseudo-class behave
      * as if they have a `:scope ` prefix (a `:scope` pseudo-class, followed by
      * a descendant selector).
      *
      * If relative selectors are disabled, selectors starting with a traversal
      * will lead to an error.
      *
      * @default true
      * @see {@link https://www.w3.org/TR/selectors-4/#relative}
      */
    var relativeSelector: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The last function in the stack, will be called with the last element
      * that's looked at.
      */
    var rootFunc: js.UndefOr[js.Function1[/* element */ ElementNode, Boolean]] = js.undefined
    
    /**
      * When enabled, tag names will be case-sensitive.
      *
      * @default false
      */
    var xmlMode: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[Node, ElementNode /* <: Node */](): Options[Node, ElementNode] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Node, ElementNode]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?, ?], Node, ElementNode /* <: Node */] (val x: Self & (Options[Node, ElementNode])) extends AnyVal {
      
      inline def setAdapter(value: Adapter[Node, ElementNode]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      inline def setCacheResults(value: Boolean): Self = StObject.set(x, "cacheResults", value.asInstanceOf[js.Any])
      
      inline def setCacheResultsUndefined: Self = StObject.set(x, "cacheResults", js.undefined)
      
      inline def setContext(value: Node | js.Array[Node]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setContextVarargs(value: Node*): Self = StObject.set(x, "context", js.Array(value*))
      
      inline def setLowerCaseAttributeNames(value: Boolean): Self = StObject.set(x, "lowerCaseAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseAttributeNamesUndefined: Self = StObject.set(x, "lowerCaseAttributeNames", js.undefined)
      
      inline def setLowerCaseTags(value: Boolean): Self = StObject.set(x, "lowerCaseTags", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseTagsUndefined: Self = StObject.set(x, "lowerCaseTags", js.undefined)
      
      inline def setPseudos(
        value: Record[
              String, 
              String | (js.Function2[/* elem */ ElementNode, /* value */ js.UndefOr[String | Null], Boolean])
            ]
      ): Self = StObject.set(x, "pseudos", value.asInstanceOf[js.Any])
      
      inline def setPseudosUndefined: Self = StObject.set(x, "pseudos", js.undefined)
      
      inline def setQuirksMode(value: Boolean): Self = StObject.set(x, "quirksMode", value.asInstanceOf[js.Any])
      
      inline def setQuirksModeUndefined: Self = StObject.set(x, "quirksMode", js.undefined)
      
      inline def setRelativeSelector(value: Boolean): Self = StObject.set(x, "relativeSelector", value.asInstanceOf[js.Any])
      
      inline def setRelativeSelectorUndefined: Self = StObject.set(x, "relativeSelector", js.undefined)
      
      inline def setRootFunc(value: /* element */ ElementNode => Boolean): Self = StObject.set(x, "rootFunc", js.Any.fromFunction1(value))
      
      inline def setRootFuncUndefined: Self = StObject.set(x, "rootFunc", js.undefined)
      
      inline def setXmlMode(value: Boolean): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      inline def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
    }
  }
  
  type Predicate[Value] = js.Function1[/* v */ Value, Boolean]
  
  type Query[ElementNode] = String | CompiledQuery[ElementNode] | js.Array[js.Array[Selector]]
}
