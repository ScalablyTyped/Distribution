package typings.d3Selection

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.d3Selection.d3SelectionStrings.important
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Iterable
import typings.std.Iterator
import typings.std.Node
import typings.std.NodeListOf
import typings.std.SVGGElement
import typings.std.SVGSVGElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-selection", "create")
  @js.native
  def create[K /* <: /* keyof d3-selection.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](name: K): Selection_[
    /* import warning: importer.ImportType#apply Failed type conversion: d3-selection.anon.ElementTagNameMap[K] */ js.Any, 
    js.UndefOr[scala.Nothing], 
    Null, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  @JSImport("d3-selection", "create")
  @js.native
  def create[NewGElement /* <: Element */](name: String): Selection_[NewGElement, js.UndefOr[scala.Nothing], Null, js.UndefOr[scala.Nothing]] = js.native
  
  @JSImport("d3-selection", "creator")
  @js.native
  def creator[K /* <: /* keyof d3-selection.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](name: K): js.ThisFunction0[
    /* this */ BaseType, 
    /* import warning: importer.ImportType#apply Failed type conversion: d3-selection.anon.ElementTagNameMap[K] */ js.Any
  ] = js.native
  @JSImport("d3-selection", "creator")
  @js.native
  def creator[NewGElement /* <: Element */](name: String): js.ThisFunction0[/* this */ BaseType, NewGElement] = js.native
  
  @JSImport("d3-selection", "local")
  @js.native
  def local[T](): Local_[T] = js.native
  
  @JSImport("d3-selection", "matcher")
  @js.native
  def matcher(selector: String): js.ThisFunction0[/* this */ BaseType, Boolean] = js.native
  
  @JSImport("d3-selection", "namespace")
  @js.native
  def namespace(prefixedLocal: String): NamespaceLocalObject | String = js.native
  
  @JSImport("d3-selection", "namespaces")
  @js.native
  val namespaces: NamespaceMap = js.native
  
  @JSImport("d3-selection", "pointer")
  @js.native
  def pointer(event: js.Any): js.Tuple2[Double, Double] = js.native
  @JSImport("d3-selection", "pointer")
  @js.native
  def pointer(event: js.Any, target: js.Any): js.Tuple2[Double, Double] = js.native
  
  @JSImport("d3-selection", "pointers")
  @js.native
  def pointers(event: js.Any): js.Array[js.Tuple2[Double, Double]] = js.native
  @JSImport("d3-selection", "pointers")
  @js.native
  def pointers(event: js.Any, target: js.Any): js.Array[js.Tuple2[Double, Double]] = js.native
  
  @JSImport("d3-selection", "select")
  @js.native
  def select[OldDatum](node: Null): Selection_[Null, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-selection", "select")
  @js.native
  def select[OldDatum](node: EnterElement): Selection_[EnterElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-selection", "select")
  @js.native
  def select[OldDatum](node: Document): Selection_[Document, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-selection", "select")
  @js.native
  def select[OldDatum](node: Element): Selection_[Element, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-selection", "select")
  @js.native
  def select[OldDatum](node: Window): Selection_[Window, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-selection", "select")
  @js.native
  def select[GElement /* <: BaseType */, OldDatum](selector: String): Selection_[GElement, OldDatum, HTMLElement, _] = js.native
  
  @JSImport("d3-selection", "selectAll")
  @js.native
  def selectAll(): Selection_[Null, js.UndefOr[scala.Nothing], Null, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-selection", "selectAll")
  @js.native
  def selectAll(selector: js.UndefOr[scala.Nothing]): Selection_[Null, js.UndefOr[scala.Nothing], Null, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-selection", "selectAll")
  @js.native
  def selectAll(selector: Null): Selection_[Null, js.UndefOr[scala.Nothing], Null, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-selection", "selectAll")
  @js.native
  def selectAll[GElement /* <: BaseType */, OldDatum](nodes: js.Array[GElement]): Selection_[GElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-selection", "selectAll")
  @js.native
  def selectAll[GElement /* <: BaseType */, OldDatum](nodes: ArrayLike[GElement]): Selection_[GElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-selection", "selectAll")
  @js.native
  def selectAll[GElement /* <: BaseType */, OldDatum](nodes: Iterable[GElement]): Selection_[GElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-selection", "selectAll")
  @js.native
  def selectAll[GElement /* <: BaseType */, OldDatum](selector: String): Selection_[GElement, OldDatum, HTMLElement, _] = js.native
  
  @JSImport("d3-selection", "selection")
  @js.native
  val selection: SelectionFn = js.native
  
  @JSImport("d3-selection", "selector")
  @js.native
  def selector[DescElement /* <: Element */](selector: String): js.ThisFunction0[/* this */ BaseType, DescElement] = js.native
  
  @JSImport("d3-selection", "selectorAll")
  @js.native
  def selectorAll[DescElement /* <: Element */](selector: String): js.ThisFunction0[/* this */ BaseType, NodeListOf[DescElement]] = js.native
  
  @JSImport("d3-selection", "style")
  @js.native
  def style(node: Element, name: String): String = js.native
  
  @JSImport("d3-selection", "window")
  @js.native
  def window(DOMNode: Document): Window = js.native
  @JSImport("d3-selection", "window")
  @js.native
  def window(DOMNode: Element): Window = js.native
  @JSImport("d3-selection", "window")
  @js.native
  def window(DOMNode: Window): Window = js.native
  
  @js.native
  trait ArrayLike[T] extends /* index */ NumberDictionary[T] {
    
    def item(index: Double): T | Null = js.native
    
    var length: Double = js.native
  }
  object ArrayLike {
    
    @scala.inline
    def apply[T](item: Double => T | Null, length: Double): ArrayLike[T] = {
      val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayLike[T]]
    }
    
    @scala.inline
    implicit class ArrayLikeMutableBuilder[Self <: ArrayLike[_], T] (val x: Self with ArrayLike[T]) extends AnyVal {
      
      @scala.inline
      def setItem(value: Double => T | Null): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  type BaseType = Element | EnterElement | Document | Window | Null
  
  @js.native
  trait ClientPointEvent extends StObject {
    
    var clientX: Double = js.native
    
    var clientY: Double = js.native
  }
  object ClientPointEvent {
    
    @scala.inline
    def apply(clientX: Double, clientY: Double): ClientPointEvent = {
      val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientPointEvent]
    }
    
    @scala.inline
    implicit class ClientPointEventMutableBuilder[Self <: ClientPointEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    }
  }
  
  type ContainerElement = HTMLElement | SVGSVGElement | SVGGElement
  
  @js.native
  trait CustomEventParameters extends StObject {
    
    /**
      * If true, the event is dispatched to ancestors in reverse tree order
      */
    var bubbles: Boolean = js.native
    
    /**
      * If true, event.preventDefault is allowed
      */
    var cancelable: Boolean = js.native
    
    /**
      * Any custom data associated with the event
      */
    var detail: js.Any = js.native
  }
  object CustomEventParameters {
    
    @scala.inline
    def apply(bubbles: Boolean, cancelable: Boolean, detail: js.Any): CustomEventParameters = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomEventParameters]
    }
    
    @scala.inline
    implicit class CustomEventParametersMutableBuilder[Self <: CustomEventParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: js.Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnterElement extends StObject {
    
    def appendChild(newChild: Node): Node = js.native
    
    def insertBefore(newChild: Node, refChild: Node): Node = js.native
    
    var namespaceURI: String = js.native
    
    var ownerDocument: Document = js.native
    
    def querySelector(selectors: String): Element = js.native
    
    def querySelectorAll(selectors: String): NodeListOf[Element] = js.native
  }
  object EnterElement {
    
    @scala.inline
    def apply(
      appendChild: Node => Node,
      insertBefore: (Node, Node) => Node,
      namespaceURI: String,
      ownerDocument: Document,
      querySelector: String => Element,
      querySelectorAll: String => NodeListOf[Element]
    ): EnterElement = {
      val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), insertBefore = js.Any.fromFunction2(insertBefore), namespaceURI = namespaceURI.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll))
      __obj.asInstanceOf[EnterElement]
    }
    
    @scala.inline
    implicit class EnterElementMutableBuilder[Self <: EnterElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendChild(value: Node => Node): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertBefore(value: (Node, Node) => Node): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerySelector(value: String => Element): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuerySelectorAll(value: String => NodeListOf[Element]): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
    }
  }
  
  type KeyType = String | Double
  
  @js.native
  trait Local_[T] extends StObject {
    
    /**
      * Retrieves a local variable stored on the node (or one of its parents).
      *
      * @param node A node element.
      */
    def get(node: Element): js.UndefOr[T] = js.native
    
    /**
      * Deletes the value associated with the given node. Values stored on ancestors are not affected, meaning that child nodes will still see inherited values.
      *
      * This function returns true if there was a value stored directly on the node, and false otherwise.
      *
      * @param node A node element.
      */
    def remove(node: Element): Boolean = js.native
    
    /**
      * Store a value for this local variable. Calling `.get()` on children of this node will also retrieve the variable's value.
      *
      * @param node A node element.
      * @param value Value to store locally
      */
    def set(node: Element, value: T): Element = js.native
  }
  object Local_ {
    
    @scala.inline
    def apply[T](get: Element => js.UndefOr[T], remove: Element => Boolean, set: (Element, T) => Element): Local_[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Local_[T]]
    }
    
    @scala.inline
    implicit class Local_MutableBuilder[Self <: Local_[_], T] (val x: Self with Local_[T]) extends AnyVal {
      
      @scala.inline
      def setGet(value: Element => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: Element => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (Element, T) => Element): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait NamespaceLocalObject extends StObject {
    
    /**
      * Name of the local to be namespaced.
      */
    var local: String = js.native
    
    /**
      * Fully qualified namespace
      */
    var space: String = js.native
  }
  object NamespaceLocalObject {
    
    @scala.inline
    def apply(local: String, space: String): NamespaceLocalObject = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamespaceLocalObject]
    }
    
    @scala.inline
    implicit class NamespaceLocalObjectMutableBuilder[Self <: NamespaceLocalObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    }
  }
  
  type NamespaceMap = StringDictionary[String]
  
  type SelectionFn = js.Function0[Selection_[HTMLElement, js.Any, Null, js.UndefOr[scala.Nothing]]]
  
  @js.native
  trait Selection_[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends StObject {
    
    /**
      * Appends a new element of this type (tag name) as the last child of each selected element,
      * or before the next following sibling in the update selection if this is an enter selection.
      * The latter behavior for enter selections allows you to insert elements into the DOM in an order consistent with the new bound data;
      * however, note that selection.order may still be required if updating elements change order
      * (i.e., if the order of new data is inconsistent with old data).
      *
      * This method returns a new selection containing the appended elements.
      * Each new element inherits the data of the current elements, if any.
      *
      * @param type A string representing the tag name.
      */
    def append[K /* <: /* keyof d3-selection.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](`type`: K): Selection_[
        /* import warning: importer.ImportType#apply Failed type conversion: d3-selection.anon.ElementTagNameMap[K] */ js.Any, 
        Datum, 
        PElement, 
        PDatum
      ] = js.native
    /**
      * Appends a new element of this type (tag name) as the last child of each selected element,
      * or before the next following sibling in the update selection if this is an enter selection.
      * The latter behavior for enter selections allows you to insert elements into the DOM in an order consistent with the new bound data;
      * however, note that selection.order may still be required if updating elements change order
      * (i.e., if the order of new data is inconsistent with old data).
      *
      * This method returns a new selection containing the appended elements.
      * Each new element inherits the data of the current elements, if any.
      *
      * The generic refers to the type of the child element to be appended.
      *
      * @param type A string representing the tag name. The specified name may have a namespace prefix, such as svg:text
      * to specify a text attribute in the SVG namespace. If no namespace is specified, the namespace will be inherited
      * from the parent element; or, if the name is one of the known prefixes, the corresponding namespace will be used
      * (for example, svg implies svg:svg)
      */
    def append[ChildElement /* <: BaseType */](`type`: String): Selection_[ChildElement, Datum, PElement, PDatum] = js.native
    /**
      * Appends a new element of the type provided by the element creator function as the last child of each selected element,
      * or before the next following sibling in the update selection if this is an enter selection.
      * The latter behavior for enter selections allows you to insert elements into the DOM in an order consistent with the new bound data;
      * however, note that selection.order may still be required if updating elements change order
      * (i.e., if the order of new data is inconsistent with old data).
      *
      * This method returns a new selection containing the appended elements.
      * Each new element inherits the data of the current elements, if any.
      *
      * The generic refers to the type of the child element to be appended.
      *
      * @param type A creator function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). This function should return
      * an element to be appended. (The function typically creates a new element, but it may instead return an existing element.)
      */
    def append[ChildElement /* <: BaseType */](`type`: ValueFn[GElement, Datum, ChildElement]): Selection_[ChildElement, Datum, PElement, PDatum] = js.native
    
    // Modifying -------------------------------
    /**
      * Return the current value of the specified attribute for the first (non-null) element in the selection.
      * This is generally useful only if you know that the selection contains exactly one element.
      *
      * @param name Name of the attribute
      */
    def attr(name: String): String = js.native
    /**
      * Sets the value of the attribute with the specified name for the selected elements and returns this selection.
      * All elements are given the same attribute value.
      *
      * @param name Name of the attribute
      * @param value Constant value for the attribute
      */
    def attr(name: String, value: String): this.type = js.native
    def attr(name: String, value: Boolean): this.type = js.native
    def attr(name: String, value: Double): this.type = js.native
    /**
      * Clear the attribute with the specified name for the selected elements and returns this selection.
      *
      * @param name Name of the attribute
      * @param value null,to clear the attribute
      */
    def attr(name: String, value: Null): this.type = js.native
    /**
      * Sets the value of the attribute with the specified name for the selected elements and returns this selection.
      * The value for the individual selected elements is determined by the value function.
      *
      * @param name Name of the attribute
      * @param value A value function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).  A null value will clear the attribute.
      */
    def attr(name: String, value: ValueFn[GElement, Datum, String | Double | Boolean | Null]): this.type = js.native
    
    /**
      * Invoke the specified function exactly once, passing in this selection along with any optional arguments.
      * Returns this selection.
      *
      * @param func A function which is passed this selection as the first argument along with any optional arguments.
      * @param args List of optional arguments to be passed to the callback function.
      */
    def call(
      func: js.Function2[
          /* selection */ Selection_[GElement, Datum, PElement, PDatum], 
          /* repeated */ js.Any, 
          Unit
        ],
      args: js.Any*
    ): this.type = js.native
    
    /**
      * Returns true if and only if the first (non-null) selected element has the specified classes.
      * This is generally useful only if you know the selection contains exactly one element.
      *
      * @param names A string of space-separated class names.
      */
    def classed(names: String): Boolean = js.native
    /**
      * Assigns or unassigns the specified CSS class names on the selected elements by setting
      * the class attribute or modifying the classList property and returns this selection.
      * If the constant value is truthy, then all elements are assigned the specified classes; otherwise, the classes are unassigned.
      *
      * @param names A string of space-separated class names.
      * @param value A boolean flag (true = assign / false = unassign)
      */
    def classed(names: String, value: Boolean): this.type = js.native
    /**
      * Assigns or unassigns the specified CSS class names on the selected elements by setting
      * the class attribute or modifying the classList property and returns this selection.
      * The assign/unassign status for the individual selected elements is determined by the boolean return
      * value of the value function.
      *
      * @param names A string of space-separated class names.
      * @param value A value function which is evaluated for each selected element, in order,
      * being passed the current datum (d), the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).
      * The function’s return value is then used to assign or unassign classes on each element.
      */
    def classed(names: String, value: ValueFn[GElement, Datum, Boolean]): this.type = js.native
    
    def clone(deep: Boolean): Selection_[GElement, Datum, PElement, PDatum] = js.native
    
    // Data Join ---------------------------------
    /**
      * Returns the array of data for the selected elements.
      */
    def data(): js.Array[Datum] = js.native
    /**
      * Joins the specified array of data with the selected elements, returning a new selection that represents
      * the update selection: the elements successfully bound to data. Also defines the enter and exit selections on
      * the returned selection, which can be used to add or remove elements to correspond to the new data.
      *
      * The data is specified for each group in the selection. If the selection has multiple groups
      * (such as d3.selectAll followed by selection.selectAll), then data should typically be specified as a function.
      *
      * If a key function is not specified, then the first datum in data is assigned to the first selected element,
      * the second datum to the second selected element, and so on.
      * A key function may be specified to control which datum is assigned to which element, replacing the default join-by-index,
      * by computing a string identifier for each datum and element.
      *
      * The update and enter selections are returned in data order, while the exit selection preserves the selection
      * order prior to the join. If a key function is specified, the order of elements in the selection may not match
      * their order in the document; use selection.order or selection.sort as needed.
      *
      * This method cannot be used to clear bound data; use selection.datum instead.
      *
      * For details see: {@link https://github.com/d3/d3-selection#joining-data }
      *
      * The generic refers to the type of the new datum to be used for the selected elements.
      *
      * @param data The specified data is an array or iterable of arbitrary values (e.g., numbers or objects).
      * @param key An optional key function which is evaluated for each selected element, in order, being passed the
      * current datum (d), the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]); the returned string is the element’s key.
      * The key function is then also evaluated for each new datum in data, being passed the current datum (d),
      * the current index (i), and the group’s new data, with this as the group’s parent DOM element (nodes[i]); the returned string is the datum’s key.
      * The datum for a given key is assigned to the element with the matching key. If multiple elements have the same key,
      * the duplicate elements are put into the exit selection; if multiple data have the same key, the duplicate data are put into the enter selection.
      */
    def data[NewDatum](data: js.Array[NewDatum]): Selection_[GElement, NewDatum, PElement, PDatum] = js.native
    def data[NewDatum](data: js.Array[NewDatum], key: ValueFn[GElement | PElement, Datum | NewDatum, KeyType]): Selection_[GElement, NewDatum, PElement, PDatum] = js.native
    /**
      * Joins the data returned by the specified value function with the selected elements, returning a new selection that it represents
      * the update selection: the elements successfully bound to data. Also defines the enter and exit selections on
      * the returned selection, which can be used to add or remove elements to correspond to the new data.
      *
      * The data is specified for each group in the selection.
      *
      * If a key function is not specified, then the first datum in data is assigned to the first selected element,
      * the second datum to the second selected element, and so on.
      * A key function may be specified to control which datum is assigned to which element, replacing the default join-by-index,
      * by computing a string identifier for each datum and element.
      *
      * The update and enter selections are returned in data order, while the exit selection preserves the selection
      * order prior to the join. If a key function is specified, the order of elements in the selection may not match
      * their order in the document; use selection.order or selection.sort as needed.
      *
      * This method cannot be used to clear bound data; use selection.datum instead.
      *
      * For details see: {@link https://github.com/d3/d3-selection#joining-data }
      *
      * The generic refers to the type of the new datum to be used for the selected elements.
      *
      * @param data A value function which will be evaluated for each group in order, being passed the group’s parent datum
      * (d, which may be undefined), the group index (i), and the selection’s parent nodes (nodes),
      * with this as the group’s parent element. The function returns an array or iterable of values for each group.
      * @param key An optional key function which is evaluated for each selected element, in order, being passed the
      * current datum (d), the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]); the returned string is the element’s key.
      * The key function is then also evaluated for each new datum in data, being passed the current datum (d),
      * the current index (i), and the group’s new data, with this as the group’s parent DOM element (nodes[i]); the returned string is the datum’s key.
      * The datum for a given key is assigned to the element with the matching key. If multiple elements have the same key,
      * the duplicate elements are put into the exit selection; if multiple data have the same key, the duplicate data are put into the enter selection.
      */
    def data[NewDatum](data: ValueFn[PElement, PDatum, js.Array[NewDatum] | Iterable[NewDatum]]): Selection_[GElement, NewDatum, PElement, PDatum] = js.native
    def data[NewDatum](
      data: ValueFn[PElement, PDatum, js.Array[NewDatum] | Iterable[NewDatum]],
      key: ValueFn[GElement | PElement, Datum | NewDatum, KeyType]
    ): Selection_[GElement, NewDatum, PElement, PDatum] = js.native
    def data[NewDatum](data: Iterable[NewDatum]): Selection_[GElement, NewDatum, PElement, PDatum] = js.native
    def data[NewDatum](data: Iterable[NewDatum], key: ValueFn[GElement | PElement, Datum | NewDatum, KeyType]): Selection_[GElement, NewDatum, PElement, PDatum] = js.native
    
    /**
      * Returns the bound datum for the first (non-null) element in the selection.
      * This is generally useful only if you know the selection contains exactly one element.
      */
    def datum(): Datum = js.native
    /**
      * Delete the bound data for each element in the selection.
      */
    def datum(value: Null): Selection_[GElement, js.UndefOr[scala.Nothing], PElement, PDatum] = js.native
    /**
      * Sets the element’s bound data to the specified value on all selected elements.
      * Unlike selection.data, this method does not compute a join and does not affect
      * indexes or the enter and exit selections.
      *
      * The generic refers to the type of the new datum to be used for the selected elements.
      *
      * @param value A value object to be used as the datum for each element.
      */
    def datum[NewDatum](value: NewDatum): Selection_[GElement, NewDatum, PElement, PDatum] = js.native
    /**
      * Sets the element’s bound data using the specified value function on all selected elements.
      * Unlike selection.data, this method does not compute a join and does not affect
      * indexes or the enter and exit selections.
      *
      * The generic refers to the type of the new datum to be used for the selected elements.
      *
      * @param value A value function which is evaluated for each selected element, in order,
      * being passed the current datum (d), the current index (i), and the current group (nodes),
      * with this as the current DOM element (nodes[i]). The function is then used to set each element’s new data.
      * A null value will delete the bound data.
      */
    def datum[NewDatum](value: ValueFn[GElement, Datum, NewDatum]): Selection_[GElement, NewDatum, PElement, PDatum] = js.native
    
    /**
      * Dispatches a custom event of the specified type to each selected element, in order.
      * An optional parameters map may be specified to set additional properties of the event.
      *
      * @param type Name of event to dispatch
      * @param parameters An optional value map with custom event parameters
      */
    def dispatch(`type`: String): this.type = js.native
    def dispatch(`type`: String, parameters: CustomEventParameters): this.type = js.native
    def dispatch(`type`: String, parameters: ValueFn[GElement, Datum, CustomEventParameters]): this.type = js.native
    
    // Control Flow ----------------------
    /**
      * Invoke the specified function for each selected element, passing in the current datum (d),
      * the current index (i), and the current group (nodes), with this of the current DOM element (nodes[i]).
      * This method can be used to invoke arbitrary code for each selected element, and is useful for creating a context to access parent and child data simultaneously.
      *
      * @param func A function which is invoked for each selected element,
      *             being passed the current datum (d), the current index (i), and the current group (nodes), with this of the current DOM element (nodes[i]).
      */
    def each(func: ValueFn[GElement, Datum, Unit]): this.type = js.native
    
    /**
      * Return true if this selection contains no (non-null) elements.
      */
    def empty(): Boolean = js.native
    
    /**
      * Return the enter selection: placeholder nodes for each datum that had no corresponding DOM element
      * in the selection. (The enter selection is empty for selections not returned by selection.data.)
      */
    def enter(): Selection_[EnterElement, Datum, PElement, PDatum] = js.native
    
    /**
      * Returns the exit selection: existing DOM elements in the selection for which no new datum was found.
      * (The exit selection is empty for selections not returned by selection.data.)
      *
      * IMPORTANT: The generic refers to the type of the old datum associated with the exit selection elements.
      * Ensure you set the generic to the correct type, if you need to access the data on the exit selection in
      * follow-up steps, e.g. to set styles as part of an exit transition before removing them.
      */
    def exit[OldDatum](): Selection_[GElement, OldDatum, PElement, PDatum] = js.native
    
    /**
      * Filters the selection, returning a new selection that contains only the elements for
      * which the specified filter is true.
      *
      * The returned filtered selection preserves the parents of this selection, but like array.filter,
      * it does not preserve indexes as some elements may be removed; use selection.select to preserve the index, if needed.
      *
      * @param selector A CSS selector string to match when filtering.
      */
    def filter(selector: String): Selection_[GElement, Datum, PElement, PDatum] = js.native
    /**
      * Filter the selection, returning a new selection that contains only the elements for
      * which the specified filter is true.
      *
      * The returned filtered selection preserves the parents of this selection, but like array.filter,
      * it does not preserve indexes as some elements may be removed; use selection.select to preserve the index, if needed.
      *
      * @param selector  A value function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). This function should return true
      * for an element to be included, and false otherwise.
      */
    def filter(selector: ValueFn[GElement, Datum, Boolean]): Selection_[GElement, Datum, PElement, PDatum] = js.native
    /**
      * Filters the selection, returning a new selection that contains only the elements for
      * which the specified filter is true.
      *
      * The returned filtered selection preserves the parents of this selection, but like array.filter,
      * it does not preserve indexes as some elements may be removed; use selection.select to preserve the index, if needed.
      *
      * The generic refers to the type of element which will be selected after applying the filter, i.e. if the element types
      * contained in a pre-filter selection are narrowed to a subset as part of the filtering.
      *
      * @param selector A CSS selector string to match when filtering.
      */
    @JSName("filter")
    def filter_FilteredElement_BaseType[FilteredElement /* <: BaseType */](selector: String): Selection_[FilteredElement, Datum, PElement, PDatum] = js.native
    /**
      * Filter the selection, returning a new selection that contains only the elements for
      * which the specified filter is true.
      *
      * The returned filtered selection preserves the parents of this selection, but like array.filter,
      * it does not preserve indexes as some elements may be removed; use selection.select to preserve the index, if needed.
      *
      * @param selector  A value function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). This function should return true
      * for an element to be included, and false otherwise.
      */
    @JSName("filter")
    def filter_FilteredElement_BaseType[FilteredElement /* <: BaseType */](selector: ValueFn[GElement, Datum, Boolean]): Selection_[FilteredElement, Datum, PElement, PDatum] = js.native
    
    /**
      * Returns a string representation of the inner HTML for the first (non-null) element in the selection.
      * This is generally useful only if you know the selection contains exactly one element.
      */
    def html(): String = js.native
    /**
      * Sets the inner HTML to the specified value on all selected elements, replacing any existing child elements.
      * All elements are given the same inner HTML
      *
      * @param value String representation of inner HTML.
      */
    def html(value: String): this.type = js.native
    /**
      * Clear the html content of the selected elements and return the selection.
      */
    def html(value: Null): this.type = js.native
    /**
      * Sets the inner HTML to the specified value on all selected elements, replacing any existing child elements.
      * The inner HTML is determined for each individual element using a value function.
      *
      * @param value A value function which is evaluated for each selected element, in order, being passed the current
      * datum (d), the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).
      * The function’s return value is then used to set each element’s inner HTML. A null value will clear the content.
      */
    def html(value: ValueFn[GElement, Datum, String | Null]): this.type = js.native
    
    /**
      * Inserts a new element of the specified type (tag name) before the first element matching the specified
      * before selector for each selected element. For example, a before selector :first-child will prepend nodes before the first child.
      * If before is not specified, it defaults to null. (To append elements in an order consistent with bound data, use selection.append.)
      *
      * This method returns a new selection containing the appended elements.
      * Each new element inherits the data of the current elements, if any.
      *
      * The generic refers to the type of the child element to be appended.
      *
      * @param type A string representing the tag name for the element type to be inserted.
      * @param before One of:
      *   * A CSS selector string for the element before which the insertion should occur.
      *   * A child selector function which is evaluated for each selected element, in order, being passed the current datum (d),
      *     the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). This function should return the child element
      *     before which the element should be inserted.
      */
    def insert[K /* <: /* keyof d3-selection.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](`type`: K): Selection_[
        /* import warning: importer.ImportType#apply Failed type conversion: d3-selection.anon.ElementTagNameMap[K] */ js.Any, 
        Datum, 
        PElement, 
        PDatum
      ] = js.native
    def insert[K /* <: /* keyof d3-selection.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](`type`: K, before: String): Selection_[
        /* import warning: importer.ImportType#apply Failed type conversion: d3-selection.anon.ElementTagNameMap[K] */ js.Any, 
        Datum, 
        PElement, 
        PDatum
      ] = js.native
    def insert[K /* <: /* keyof d3-selection.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](`type`: K, before: ValueFn[GElement, Datum, BaseType]): Selection_[
        /* import warning: importer.ImportType#apply Failed type conversion: d3-selection.anon.ElementTagNameMap[K] */ js.Any, 
        Datum, 
        PElement, 
        PDatum
      ] = js.native
    /**
      * Inserts a new element of the specified type (tag name) before the first element matching the specified
      * before selector for each selected element. For example, a before selector :first-child will prepend nodes before the first child.
      * If before is not specified, it defaults to null. (To append elements in an order consistent with bound data, use selection.append.)
      *
      * This method returns a new selection containing the appended elements.
      * Each new element inherits the data of the current elements, if any.
      *
      * The generic refers to the type of the child element to be appended.
      *
      * @param type One of:
      *   * A string representing the tag name for the element type to be inserted. The specified name may have a namespace prefix,
      *     such as svg:text to specify a text attribute in the SVG namespace. If no namespace is specified, the namespace will be inherited
      *     from the parent element; or, if the name is one of the known prefixes, the corresponding namespace will be used
      *     (for example, svg implies svg:svg)
      *   * A creator function which is evaluated for each selected element, in order, being passed the current datum (d),
      *     the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). This function should return
      *     an element to be inserted. (The function typically creates a new element, but it may instead return an existing element.)
      * @param before One of:
      *   * A CSS selector string for the element before which the insertion should occur.
      *   * A child selector function which is evaluated for each selected element, in order, being passed the current datum (d),
      *     the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). This function should return the child element
      *     before which the element should be inserted.
      */
    def insert[ChildElement /* <: BaseType */](`type`: String): Selection_[ChildElement, Datum, PElement, PDatum] = js.native
    def insert[ChildElement /* <: BaseType */](`type`: String, before: String): Selection_[ChildElement, Datum, PElement, PDatum] = js.native
    def insert[ChildElement /* <: BaseType */](`type`: String, before: ValueFn[GElement, Datum, BaseType]): Selection_[ChildElement, Datum, PElement, PDatum] = js.native
    def insert[ChildElement /* <: BaseType */](`type`: ValueFn[GElement, Datum, ChildElement]): Selection_[ChildElement, Datum, PElement, PDatum] = js.native
    def insert[ChildElement /* <: BaseType */](`type`: ValueFn[GElement, Datum, ChildElement], before: String): Selection_[ChildElement, Datum, PElement, PDatum] = js.native
    def insert[ChildElement /* <: BaseType */](`type`: ValueFn[GElement, Datum, ChildElement], before: ValueFn[GElement, Datum, BaseType]): Selection_[ChildElement, Datum, PElement, PDatum] = js.native
    
    /**
      * Returns an iterator over the selected (non-null) elements.
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Iterator[GElement, _, js.UndefOr[scala.Nothing]]] = js.native
    
    /**
      * Appends, removes and reorders elements as necessary to match the data that was previously bound by `selection.data`, returning the merged enter and update selection.
      * This method is a convenient alternative to the more explicit `selection.enter`, `selection.exit`, `selection.append` and `selection.remove`.
      *
      * The "matching" logic is determined by the key function passed to `selection.data`.
      */
    def join[K /* <: /* keyof d3-selection.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */, OldDatum](enter: K): Selection_[
        GElement | (/* import warning: importer.ImportType#apply Failed type conversion: d3-selection.anon.ElementTagNameMap[K] */ js.Any), 
        Datum, 
        PElement, 
        PDatum
      ] = js.native
    def join[K /* <: /* keyof d3-selection.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */, OldDatum](
      enter: K,
      update: js.UndefOr[scala.Nothing],
      exit: js.Function1[/* elem */ Selection_[GElement, OldDatum, PElement, PDatum], Unit]
    ): Selection_[
        GElement | (/* import warning: importer.ImportType#apply Failed type conversion: d3-selection.anon.ElementTagNameMap[K] */ js.Any), 
        Datum, 
        PElement, 
        PDatum
      ] = js.native
    def join[K /* <: /* keyof d3-selection.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */, OldDatum](
      enter: K,
      update: js.Function1[
          /* elem */ Selection_[GElement, Datum, PElement, PDatum], 
          js.UndefOr[Selection_[GElement, Datum, PElement, PDatum]]
        ]
    ): Selection_[
        GElement | (/* import warning: importer.ImportType#apply Failed type conversion: d3-selection.anon.ElementTagNameMap[K] */ js.Any), 
        Datum, 
        PElement, 
        PDatum
      ] = js.native
    def join[K /* <: /* keyof d3-selection.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */, OldDatum](
      enter: K,
      update: js.Function1[
          /* elem */ Selection_[GElement, Datum, PElement, PDatum], 
          js.UndefOr[Selection_[GElement, Datum, PElement, PDatum]]
        ],
      exit: js.Function1[/* elem */ Selection_[GElement, OldDatum, PElement, PDatum], Unit]
    ): Selection_[
        GElement | (/* import warning: importer.ImportType#apply Failed type conversion: d3-selection.anon.ElementTagNameMap[K] */ js.Any), 
        Datum, 
        PElement, 
        PDatum
      ] = js.native
    /**
      * Appends, removes and reorders elements as necessary to match the data that was previously bound by `selection.data`, returning the merged enter and update selection.
      * This method is a convenient alternative to the more explicit `selection.enter`, `selection.exit`, `selection.append` and `selection.remove`.
      *
      * The "matching" logic is determined by the key function passed to `selection.data`.
      */
    def join[ChildElement /* <: BaseType */, OldDatum](enter: String): Selection_[ChildElement | GElement, Datum, PElement, PDatum] = js.native
    def join[ChildElement /* <: BaseType */, OldDatum](
      enter: String,
      update: js.UndefOr[scala.Nothing],
      exit: js.Function1[/* elem */ Selection_[GElement, OldDatum, PElement, PDatum], Unit]
    ): Selection_[ChildElement | GElement, Datum, PElement, PDatum] = js.native
    def join[ChildElement /* <: BaseType */, OldDatum](
      enter: String,
      update: js.Function1[
          /* elem */ Selection_[GElement, Datum, PElement, PDatum], 
          js.UndefOr[Selection_[GElement, Datum, PElement, PDatum]]
        ]
    ): Selection_[ChildElement | GElement, Datum, PElement, PDatum] = js.native
    def join[ChildElement /* <: BaseType */, OldDatum](
      enter: String,
      update: js.Function1[
          /* elem */ Selection_[GElement, Datum, PElement, PDatum], 
          js.UndefOr[Selection_[GElement, Datum, PElement, PDatum]]
        ],
      exit: js.Function1[/* elem */ Selection_[GElement, OldDatum, PElement, PDatum], Unit]
    ): Selection_[ChildElement | GElement, Datum, PElement, PDatum] = js.native
    /**
      * Appends, removes and reorders elements as necessary to match the data that was previously bound by `selection.data`, returning the merged enter and update selection.
      * This method is a convenient alternative to the more explicit `selection.enter`, `selection.exit`, `selection.append` and `selection.remove`.
      *
      * The "matching" logic is determined by the key function passed to `selection.data`.
      */
    def join[ChildElement /* <: BaseType */, OldDatum](
      enter: js.Function1[
          /* elem */ Selection_[EnterElement, Datum, PElement, PDatum], 
          Selection_[ChildElement, Datum, PElement, PDatum]
        ]
    ): Selection_[ChildElement | GElement, Datum, PElement, PDatum] = js.native
    def join[ChildElement /* <: BaseType */, OldDatum](
      enter: js.Function1[
          /* elem */ Selection_[EnterElement, Datum, PElement, PDatum], 
          Selection_[ChildElement, Datum, PElement, PDatum]
        ],
      update: js.UndefOr[scala.Nothing],
      exit: js.Function1[/* elem */ Selection_[GElement, OldDatum, PElement, PDatum], Unit]
    ): Selection_[ChildElement | GElement, Datum, PElement, PDatum] = js.native
    def join[ChildElement /* <: BaseType */, OldDatum](
      enter: js.Function1[
          /* elem */ Selection_[EnterElement, Datum, PElement, PDatum], 
          Selection_[ChildElement, Datum, PElement, PDatum]
        ],
      update: js.Function1[
          /* elem */ Selection_[GElement, Datum, PElement, PDatum], 
          js.UndefOr[Selection_[GElement, Datum, PElement, PDatum]]
        ]
    ): Selection_[ChildElement | GElement, Datum, PElement, PDatum] = js.native
    def join[ChildElement /* <: BaseType */, OldDatum](
      enter: js.Function1[
          /* elem */ Selection_[EnterElement, Datum, PElement, PDatum], 
          Selection_[ChildElement, Datum, PElement, PDatum]
        ],
      update: js.Function1[
          /* elem */ Selection_[GElement, Datum, PElement, PDatum], 
          js.UndefOr[Selection_[GElement, Datum, PElement, PDatum]]
        ],
      exit: js.Function1[/* elem */ Selection_[GElement, OldDatum, PElement, PDatum], Unit]
    ): Selection_[ChildElement | GElement, Datum, PElement, PDatum] = js.native
    
    /**
      * Re-insert each selected element, in order, as the first child of its parent.
      */
    def lower(): this.type = js.native
    
    /**
      * Returns a new selection merging this selection with the specified other selection.
      * The returned selection has the same number of groups and the same parents as this selection.
      * Any missing (null) elements in this selection are filled with the corresponding element,
      * if present (not null), from the specified selection. (If the other selection has additional groups or parents,
      * they are ignored.)
      *
      * This method is commonly used to merge the enter and update selections after a data-join.
      * After modifying the entering and updating elements separately, you can merge the two selections and
      * perform operations on both without duplicate code.
      *
      * This method is not intended for concatenating arbitrary selections, however: if both this selection
      * and the specified other selection have (non-null) elements at the same index, this selection’s element
      * is returned in the merge and the other selection’s element is ignored.
      *
      * @param other Selection to be merged.
      */
    def merge(other: Selection_[GElement, Datum, PElement, PDatum]): Selection_[GElement, Datum, PElement, PDatum] = js.native
    
    /**
      * Return the first (non-null) element in this selection. If the selection is empty, returns null.
      */
    def node(): GElement | Null = js.native
    
    /**
      * Return an array of all (non-null) elements in this selection.
      */
    def nodes(): js.Array[GElement] = js.native
    
    // Event Handling -------------------
    /**
      * Return the currently-assigned listener for the specified event typename on the first (non-null) selected element,
      * if any, If multiple typenames are specified, the first matching listener is returned.
      *
      * @param typenames The typenames is a string event type, such as click, mouseover, or submit; any DOM event type supported by your browser may be used.
      * The type may be optionally followed by a period (.) and a name; the optional name allows multiple callbacks to be registered
      * to receive events of the same type, such as click.foo and click.bar. To specify multiple typenames, separate typenames with spaces,
      * such as "input change"" or "click.foo click.bar".
      */
    def on(typenames: String): js.UndefOr[js.ThisFunction2[/* this */ GElement, /* event */ js.Any, /* d */ Datum, Unit]] = js.native
    /**
      * Add an event listener for the specified event type names. If an event listener was previously registered for the same typename
      * on a selected element, the old listener is removed before the new listener is added.
      *
      * When a specified event is dispatched on a selected node, the specified listener will be evaluated for each selected element.
      *
      * @param typenames The typenames is a string event type, such as click, mouseover, or submit; any DOM event type supported by your browser may be used.
      * The type may be optionally followed by a period (.) and a name; the optional name allows multiple callbacks to be registered
      * to receive events of the same type, such as click.foo and click.bar. To specify multiple typenames, separate typenames with spaces,
      * such as "input change"" or "click.foo click.bar".
      * @param listener A listener function which will be evaluated for each selected element,
      * being passed the current event (event) and the current datum (d), with this as the current DOM element (event.currentTarget).
      * Listeners always see the latest datum for their element.
      * Note: while you can use event.pageX and event.pageY directly,
      * it is often convenient to transform the event position to the local coordinate system of that element that received the event using d3.pointer.
      * @param options An optional options object may specify characteristics about the event listener, such as wehether it is captures or passive; see element.addEventListener.
      */
    def on(
      typenames: String,
      listener: js.ThisFunction2[/* this */ GElement, /* event */ js.Any, /* d */ Datum, Unit]
    ): this.type = js.native
    def on(
      typenames: String,
      listener: js.ThisFunction2[/* this */ GElement, /* event */ js.Any, /* d */ Datum, Unit],
      options: js.Any
    ): this.type = js.native
    /**
      * Remove a listener for the specified event type names. To remove all listeners for a given name,
      * pass null as the listener and ".foo" as the typename, where foo is the name; to remove all listeners with no name, specify "." as the typename.
      *
      * @param typenames The typenames is a string event type, such as click, mouseover, or submit; any DOM event type supported by your browser may be used.
      * The type may be optionally followed by a period (.) and a name; the optional name allows multiple callbacks to be registered
      * to receive events of the same type, such as click.foo and click.bar. To specify multiple typenames, separate typenames with spaces,
      * such as "input change"" or "click.foo click.bar".
      * @param listener null to indicate removal of listener
      */
    def on(typenames: String, listener: Null): this.type = js.native
    
    /**
      * Re-insert elements into the document such that the document order of each group matches the selection order.
      * This is equivalent to calling selection.sort if the data is already sorted, but much faster.
      */
    def order(): this.type = js.native
    
    /**
      * Return the current value of the specified property for the first (non-null) element in the selection.
      * This is generally useful only if you know that the selection contains exactly one element.
      *
      * @param name Name of the property
      */
    def property(name: String): js.Any = js.native
    /**
      * Sets the value of the property with the specified name for the selected elements and returns this selection.
      * All elements are given the same property value.
      *
      * @param name Name of the property
      * @param value Constant value for the property
      */
    def property(name: String, value: js.Any): this.type = js.native
    /**
      * Clears the property with the specified name for the selected elements and returns this selection.
      *
      * @param name Name of the property
      * @param value null,to clear the property
      */
    def property(name: String, value: Null): this.type = js.native
    /**
      * Sets the value of the property with the specified name for the selected elements and returns this selection.
      * The value for the individual selected elements is determined by the value function.
      *
      * Some HTML elements have special properties that are not addressable using attributes or styles,
      * such as a form field’s text value and a checkbox’s checked boolean. Use this method to get or set these properties.
      *
      * @param name Name of the property
      * @param value A value function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).  A null value will clear the property.
      */
    def property(name: String, value: ValueFn[GElement, Datum, _]): this.type = js.native
    /**
      * Look up a local variable on the first node of this selection. Note that this is not equivalent to `local.get(selection.node())` in that it will not look up locals set on the parent node(s).
      *
      * @param name The `d3.local` variable to look up.
      */
    def property[T](name: Local_[T]): js.UndefOr[T] = js.native
    /**
      * Store a value in a `d3.local` variable for each node in the selection.
      * This is equivalent to `selection.each(function () { name.set(this, value); })` but more concise.
      *
      * @param name A `d3.local` variable
      * @param value A callback that returns the value to store
      */
    def property[T](name: Local_[T], value: T): this.type = js.native
    /**
      * Store a value in a `d3.local` variable.
      * This is equivalent to `selection.each(function (d, i, g) { name.set(this, value.call(this, d, i, g)); })` but more concise.
      *
      * @param name A `d3.local` variable
      * @param value A callback that returns the value to store
      */
    def property[T](name: Local_[T], value: ValueFn[GElement, Datum, T]): this.type = js.native
    
    /**
      * Re-insert each selected element, in order, as the last child of its parent.
      */
    def raise(): this.type = js.native
    
    /**
      * Removes the selected elements from the document.
      * Returns this selection (the removed elements) which are now detached from the DOM.
      */
    def remove(): this.type = js.native
    
    // Sub-selection -------------------------
    /**
      * For each selected element, select the first descendant element that matches the specified selector string.
      * If no element matches the specified selector for the current element, the element at the current index will
      * be null in the returned selection. If multiple elements match the selector, only the first matching element
      * in document order is selected. Selection.select does not affect grouping: it preserves the existing group
      * structure and indexes, and propagates data (if any) to selected children.
      *
      * If the current element has associated data, this data is propagated to the
      * corresponding selected element.
      *
      * The generic represents the type of the descendant element to be selected.
      *
      * @param selector CSS selector string
      */
    def select[DescElement /* <: BaseType */](selector: String): Selection_[DescElement, Datum, PElement, PDatum] = js.native
    /**
      * Create an empty sub-selection. Selection.select does not affect grouping: it preserves the existing group
      * structure and indexes.
      */
    def select[DescElement /* <: BaseType */](selector: Null): Selection_[Null, js.UndefOr[scala.Nothing], PElement, PDatum] = js.native
    /**
      * For each selected element, select the descendant element returned by the selector function.
      * If no element is returned by the selector function for the current element, the element at the
      * current index will be null in the returned selection. Selection.select does not affect grouping:
      * it preserves the existing group structure and indexes, and propagates data (if any) to selected children.
      *
      * If the current element has associated data, this data is propagated to the
      * corresponding selected element.
      *
      * The generic represents the type of the descendant element to be selected.
      *
      * @param selector A selector function, which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).
      * It must return an element, or null if there is no matching element.
      */
    def select[DescElement /* <: BaseType */](selector: ValueFn[GElement, Datum, DescElement]): Selection_[DescElement, Datum, PElement, PDatum] = js.native
    
    /**
      * Create an empty sub-selection. Selection.selectAll does affect grouping: The elements in the returned
      * selection are grouped by their corresponding parent node in this selection, the group at the current index will be empty.
      */
    def selectAll(): Selection_[Null, js.UndefOr[scala.Nothing], GElement, Datum] = js.native
    /**
      * Create an empty sub-selection. Selection.selectAll does affect grouping: The elements in the returned
      * selection are grouped by their corresponding parent node in this selection, the group at the current index will be empty.
      */
    def selectAll(selector: js.UndefOr[scala.Nothing]): Selection_[Null, js.UndefOr[scala.Nothing], GElement, Datum] = js.native
    /**
      * Create an empty sub-selection. Selection.selectAll does affect grouping: The elements in the returned
      * selection are grouped by their corresponding parent node in this selection, the group at the current index will be empty.
      */
    def selectAll(selector: Null): Selection_[Null, js.UndefOr[scala.Nothing], GElement, Datum] = js.native
    /**
      * For each selected element, selects the descendant elements that match the specified selector string. The elements in the returned
      * selection are grouped by their corresponding parent node in this selection. If no element matches the specified selector
      * for the current element, the group at the current index will be empty. Selection.selectAll does affect grouping: each selected descendant
      * is grouped by the parent element in the originating selection.
      *
      * The selected elements do not inherit data from this selection; use selection.data to propagate data to children.
      *
      * The first generic "DescElement" refers to the type of descendant element to be selected. The second generic "OldDatum" refers to the type of the
      * datum, of a selected element. This is useful when re-selecting elements with a previously set, know datum type.
      *
      * @param selector CSS selector string
      */
    def selectAll[DescElement /* <: BaseType */, OldDatum](selector: String): Selection_[DescElement, OldDatum, GElement, Datum] = js.native
    /**
      * For each selected element, selects the descendant elements returned by the selector function. The elements in the returned
      * selection are grouped by their corresponding parent node in this selection. If no element matches the specified selector
      * for the current element, the group at the current index will be empty. Selection.selectAll does affect grouping: each selected descendant
      * is grouped by the parent element in the originating selection.
      *
      * The selected elements do not inherit data from this selection; use selection.data to propagate data to children.
      *
      * The first generic "DescElement" refers to the type of descendant element to be selected. The second generic "OldDatum" refers to the type of the
      * datum, of a selected element. This is useful when re-selecting elements with a previously set, know datum type.
      *
      * @param selector A selector function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). It must return an array of elements
      * (or an iterable, or a pseudo-array, such as a NodeList), or the empty array if there are no matching elements.
      */
    def selectAll[DescElement /* <: BaseType */, OldDatum](
      selector: ValueFn[
          GElement, 
          Datum, 
          js.Array[DescElement] | ArrayLike[DescElement] | Iterable[DescElement]
        ]
    ): Selection_[DescElement, OldDatum, GElement, Datum] = js.native
    
    /**
      * Returns a new selection with the (first) child of each element of the current selection matching the selector.
      * Selects the first child (if any).
      *
      * The generic represents the type of the descendant element to be selected.
      */
    def selectChild[DescElement /* <: BaseType */](): Selection_[DescElement, Datum, PElement, PDatum] = js.native
    /**
      * Returns a new selection with the (first) child of each element of the current selection matching the selector.
      * Selects the first child that matches (if any).
      *
      * The generic represents the type of the descendant element to be selected.
      *
      * @param selector CSS selector string
      */
    def selectChild[DescElement /* <: BaseType */](selector: String): Selection_[DescElement, Datum, PElement, PDatum] = js.native
    /**
      * Returns a new selection with the (first) child of each element of the current selection matching the selector.
      *
      * The first generic represents the type of the descendant element to be selected.
      * The second generic represents the type of any of the child elements.
      *
      * @param selector A selector function, which is evaluated for each of the children nodes, in order, being passed the child (child), the child’s index (i), and the list of children (children);
      * the method selects the first child for which the selector return truthy, if any.
      */
    def selectChild[ResultElement /* <: BaseType */, ChildElement /* <: BaseType */](
      selector: js.Function3[
          /* child */ ChildElement, 
          /* i */ Double, 
          /* children */ js.Array[ChildElement], 
          Boolean
        ]
    ): Selection_[ResultElement, Datum, PElement, PDatum] = js.native
    
    /**
      * Returns a new selection with the children of each element of the current selection matching the selector.
      * Selects all the children
      *
      * The first generic represents the type of the descendant element to be selected.
      * The second generic refers to the type of the datum of the element to be selected.
      */
    def selectChildren[DescElement /* <: BaseType */, OldDatum](): Selection_[DescElement, OldDatum, GElement, Datum] = js.native
    /**
      * Returns a new selection with the children of each element of the current selection matching the selector.
      * Selects the children that match (if any)
      *
      * The first generic represents the type of the descendant element to be selected.
      * The second generic refers to the type of the datum of the element to be selected.
      *
      * @param selector CSS selector string
      */
    def selectChildren[DescElement /* <: BaseType */, OldDatum](selector: String): Selection_[DescElement, OldDatum, GElement, Datum] = js.native
    /**
      * Returns a new selection with the children of each element of the current selection matching the selector.
      *
      * The first generic represents the type of the descendant element to be selected.
      * The second generic refers to the type of the datum of the element to be selected.
      * The third generic represents the type of any of the child elements.
      *
      * @param selector A selector function, which is evaluated for each of the children nodes, in order, being passed the child (child), the child’s index (i), and the list of children (children);
      * the method selects the first child for which the selector return truthy, if any.
      */
    def selectChildren[ResultElement /* <: BaseType */, ResultDatum, ChildElement /* <: BaseType */](
      selector: js.Function3[
          /* child */ ChildElement, 
          /* i */ Double, 
          /* children */ js.Array[ChildElement], 
          Boolean
        ]
    ): Selection_[ResultElement, ResultDatum, GElement, Datum] = js.native
    
    /**
      * Returns the selection (for symmetry with transition.selection).
      */
    def selection(): this.type = js.native
    
    /**
      * Returns the total number of elements in this selection.
      */
    def size(): Double = js.native
    
    /**
      * Return a new selection that contains a copy of each group in this selection sorted according
      * to the compare function. After sorting, re-inserts elements to match the resulting order (per selection.order).
      *
      * Note that sorting is not guaranteed to be stable; however, it is guaranteed to have the same
      * behavior as your browser’s built-in sort method on arrays.
      *
      * @param comparator An optional comparator function, which defaults to "ascending". The function is passed
      * two elements’ data a and b to compare. It should return either a negative, positive, or zero value.
      * If negative, then a should be before b; if positive, then a should be after b; otherwise, a and b are
      * considered equal and the order is arbitrary.
      */
    def sort(): this.type = js.native
    def sort(comparator: js.Function2[/* a */ Datum, /* b */ Datum, Double]): this.type = js.native
    
    /**
      * Returns the current value of the specified style property for the first (non-null) element in the selection.
      * The current value is defined as the element’s inline value, if present, and otherwise its computed value.
      * Accessing the current style value is generally useful only if you know the selection contains exactly one element.
      *
      * @param name Name of the style
      */
    def style(name: String): String = js.native
    /**
      * Sets the value of the style with the specified name for the selected elements and returns this selection.
      * All elements are given the same style value.
      *
      * @param name Name of the style
      * @param value Constant value for the style
      * @param priority An optional priority flag, either null or the string important (without the exclamation point)
      */
    def style(name: String, value: String): this.type = js.native
    def style(name: String, value: Boolean): this.type = js.native
    def style(name: String, value: Double): this.type = js.native
    /**
      * Clear the style with the specified name for the selected elements and returns this selection.
      *
      * @param name Name of the style
      * @param value null,to clear the style
      */
    def style(name: String, value: Null): this.type = js.native
    /**
      * Sets the value of the style with the specified name for the selected elements and returns this selection.
      * The value for the individual selected elements is determined by the value function.
      *
      * @param name Name of the style
      * @param value A value function which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).  A null value will clear the style.
      * @param priority An optional priority flag, either null or the string important (without the exclamation point)
      */
    def style(name: String, value: ValueFn[GElement, Datum, String | Double | Boolean | Null]): this.type = js.native
    @JSName("style")
    def style_important(name: String, value: String, priority: important): this.type = js.native
    @JSName("style")
    def style_important(name: String, value: Boolean, priority: important): this.type = js.native
    @JSName("style")
    def style_important(name: String, value: Double, priority: important): this.type = js.native
    @JSName("style")
    def style_important(
      name: String,
      value: ValueFn[GElement, Datum, String | Double | Boolean | Null],
      priority: important
    ): this.type = js.native
    
    /**
      * Returns the text content for the first (non-null) element in the selection.
      * This is generally useful only if you know the selection contains exactly one element.
      */
    def text(): String = js.native
    /**
      * Sets the text content to the specified value on all selected elements, replacing any existing child elements.
      * All elements are given the same text content.
      *
      * @param value Text content value for the elements.
      */
    def text(value: String): this.type = js.native
    def text(value: Boolean): this.type = js.native
    def text(value: Double): this.type = js.native
    /**
      * Clear the text content of the selected elements and return the selection.
      */
    def text(value: Null): this.type = js.native
    /**
      * Sets the text content to the specified value on all selected elements, replacing any existing child elements.
      * All elements are given the same text content.
      *
      * @param value A value unction which is evaluated for each selected element, in order, being passed the current datum (d),
      * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).
      * The function’s return value is then used to set each element’s text content. A null value will clear the content.
      */
    def text(value: ValueFn[GElement, Datum, String | Double | Boolean | Null]): this.type = js.native
  }
  
  @js.native
  trait TransitionLike[GElement /* <: BaseType */, Datum] extends StObject {
    
    def on(`type`: String, listener: Null): TransitionLike[GElement, Datum] = js.native
    def on(`type`: String, listener: ValueFn[GElement, Datum, Unit]): TransitionLike[GElement, Datum] = js.native
    
    def selection(): Selection_[GElement, Datum, _, _] = js.native
    
    def tween(name: String, tweenFn: Null): TransitionLike[GElement, Datum] = js.native
    def tween(name: String, tweenFn: ValueFn[GElement, Datum, js.Function1[/* t */ Double, Unit]]): TransitionLike[GElement, Datum] = js.native
  }
  
  type ValueFn[T /* <: BaseType */, Datum, Result] = js.ThisFunction3[
    /* this */ T, 
    /* datum */ Datum, 
    /* index */ Double, 
    /* groups */ js.Array[T] | ArrayLike[T], 
    Result
  ]
}
