package typings.deku

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deku", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a DOM renderer using a container element.
    * Everything will be rendered inside of that container.
    * Returns a function that accepts new state that can replace what is currently rendered.
    */
  inline def createApp(el: HTMLElement): Render = ^.asInstanceOf[js.Dynamic].applyDynamic("createApp")(el.asInstanceOf[js.Any]).asInstanceOf[Render]
  inline def createApp(el: HTMLElement, dispatch: Dispatch): Render = (^.asInstanceOf[js.Dynamic].applyDynamic("createApp")(el.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Render]
  
  object diff {
    
    @JSImport("deku", "diff")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("deku", "diff.Actions")
    @js.native
    open class Actions () extends StObject {
      
      /* private */ var _keys: js.Array[String] = js.native
      
      /* private */ var _name: String = js.native
    }
    object Actions {
      
      @JSImport("deku", "diff.Actions")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def `case`(pat: Any, action: Actions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("case")(pat.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      /* static member */
      inline def insertBefore(a: Double): Actions = ^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(a.asInstanceOf[js.Any]).asInstanceOf[Actions]
      
      /* static member */
      inline def insertChild(a: Any, b: Double, c: String): Actions = (^.asInstanceOf[js.Dynamic].applyDynamic("insertChild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Actions]
      
      /* static member */
      inline def removeAttribute(a: String, b: Any): Actions = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAttribute")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Actions]
      
      /* static member */
      inline def removeChild(a: Double): Actions = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChild")(a.asInstanceOf[js.Any]).asInstanceOf[Actions]
      
      /* static member */
      inline def removeNode(a: Any): Actions = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(a.asInstanceOf[js.Any]).asInstanceOf[Actions]
      
      /* static member */
      inline def replaceNode(a: Any, b: Any, c: String): Actions = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceNode")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Actions]
      
      /* static member */
      inline def sameNode(): Actions = ^.asInstanceOf[js.Dynamic].applyDynamic("sameNode")().asInstanceOf[Actions]
      
      /* static member */
      inline def setAttribute(a: String, b: Any, c: Any): Actions = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttribute")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Actions]
      
      /* static member */
      inline def updateChild(a: Double, b: js.Array[Any]): Actions = (^.asInstanceOf[js.Dynamic].applyDynamic("updateChild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Actions]
      
      /* static member */
      inline def updateChildren(a: js.Array[Any]): Actions = ^.asInstanceOf[js.Dynamic].applyDynamic("updateChildren")(a.asInstanceOf[js.Any]).asInstanceOf[Actions]
      
      /* static member */
      inline def updateThunk(a: Any, b: Any, c: String): Actions = (^.asInstanceOf[js.Dynamic].applyDynamic("updateThunk")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Actions]
    }
    
    /**
      * Compare two virtual nodes and return an array of changes to turn the left into the right.
      */
    inline def diffNode(prevNode: VirtualElement, nextNode: VirtualElement): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffNode")(prevNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  }
  
  object dom {
    
    @JSImport("deku", "dom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a real DOM element from a virtual element, recursively looping down.
      * When it finds custom elements it will render them, cache them, and keep going,
      * so they are treated like any other native element.
      */
    inline def create[C](vnode: VirtualElement, path: String, dispatch: Dispatch, context: C): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any], path.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /**
      * Modify a DOM element given an array of actions.
      */
    inline def update[C, A](dispatch: Dispatch, context: C): js.Function2[/* DOMElement */ HTMLElement, /* action */ A, HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(dispatch.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* DOMElement */ HTMLElement, /* action */ A, HTMLElement]]
  }
  
  /**
    * This function lets us create virtual nodes using a simple syntax.
    * It is compatible with JSX transforms so you can use JSX to write nodes that will compile to this function.
    */
  inline def element(`type`: String): VirtualElement = ^.asInstanceOf[js.Dynamic].applyDynamic("element")(`type`.asInstanceOf[js.Any]).asInstanceOf[VirtualElement]
  inline def element(`type`: Thunk): VirtualElement = ^.asInstanceOf[js.Dynamic].applyDynamic("element")(`type`.asInstanceOf[js.Any]).asInstanceOf[VirtualElement]
  inline def element[A](`type`: String, attributes: A, children: Any*): VirtualElement = (^.asInstanceOf[js.Dynamic].applyDynamic("element")((scala.List(`type`.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VirtualElement]
  inline def element[A](`type`: Thunk, attributes: A, children: Any*): VirtualElement = (^.asInstanceOf[js.Dynamic].applyDynamic("element")((scala.List(`type`.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VirtualElement]
  
  inline def h(`type`: String): VirtualElement = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VirtualElement]
  inline def h(`type`: Thunk): VirtualElement = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VirtualElement]
  inline def h[A](`type`: String, attributes: A, children: Any*): VirtualElement = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VirtualElement]
  inline def h[A](`type`: Thunk, attributes: A, children: Any*): VirtualElement = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VirtualElement]
  
  object string {
    
    @JSImport("deku", "string")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Render a virtual element to a string. You can pass in an option state context object that will be given to all components.
      */
    inline def render(vnode: VirtualElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def render[C](vnode: VirtualElement, context: C): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object vnode {
    
    @JSImport("deku", "vnode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This function lets us create virtual nodes using a simple syntax.
      * It is compatible with JSX transforms so you can use JSX to write nodes that will compile to this function.
      */
    /* was `typeof element` */
    inline def create(`type`: String): VirtualElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any]).asInstanceOf[VirtualElement]
    /* was `typeof element` */
    inline def create(`type`: Thunk): VirtualElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any]).asInstanceOf[VirtualElement]
    /* was `typeof element` */
    inline def create[A](`type`: String, attributes: A, children: Any*): VirtualElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")((scala.List(`type`.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VirtualElement]
    /* was `typeof element` */
    inline def create[A](`type`: Thunk, attributes: A, children: Any*): VirtualElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")((scala.List(`type`.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VirtualElement]
    
    inline def createEmptyElement(): VirtualElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyElement")().asInstanceOf[VirtualElement]
    
    // function isValidAttribute<A>(value: A): boolean;
    /**
      * Create a node path, eg. (23,5,2,4) => '23.5.2.4'
      */
    inline def createPath(paths: (Double | String)*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(paths.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    /**
      * Text nodes are stored as objects to keep things simple
      */
    inline def createTextElement(text: String): VirtualElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextElement")(text.asInstanceOf[js.Any]).asInstanceOf[VirtualElement]
    
    /**
      * Lazily-rendered virtual nodes
      */
    inline def createThunkElement[P, T, O](
      fn: js.Function1[/* model */ Model, VirtualElement],
      key: String,
      props: P,
      children: js.Array[T],
      options: O
    ): VirtualElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createThunkElement")(fn.asInstanceOf[js.Any], key.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VirtualElement]
    
    inline def isEmpty(vnode: VirtualElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(vnode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isSameThunk(prevNode: VirtualElement, nextNode: VirtualElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameThunk")(prevNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isText(vnode: VirtualElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(vnode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isThunk(vnode: VirtualElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThunk")(vnode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait Component extends StObject {
    
    var onCreate: js.UndefOr[js.Function1[/* model */ Model, Any]] = js.undefined
    
    var onRemove: js.UndefOr[js.Function1[/* model */ Model, Any]] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* model */ Model, Any]] = js.undefined
    
    def render(model: Model): VirtualElement
  }
  object Component {
    
    inline def apply(render: Model => VirtualElement): Component = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      inline def setOnCreate(value: /* model */ Model => Any): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
      
      inline def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
      
      inline def setOnRemove(value: /* model */ Model => Any): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setOnUpdate(value: /* model */ Model => Any): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRender(value: Model => VirtualElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  type Dispatch = js.Function1[/* action */ Any, Any]
  
  trait Model extends StObject {
    
    var children: js.UndefOr[js.Array[Any]] = js.undefined
    
    var context: js.UndefOr[Any] = js.undefined
    
    var dispatch: js.UndefOr[Dispatch] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var props: js.UndefOr[Any] = js.undefined
  }
  object Model {
    
    inline def apply(): Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDispatch(value: /* action */ Any => Any): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  type Render = js.Function2[/* vnode */ VirtualElement, /* context */ js.UndefOr[Any], Unit]
  
  /**
    * Thunk object passed to `element`
    */
  type Thunk = Component | (js.Function1[/* model */ Model, VirtualElement])
  
  trait VirtualElement extends StObject {
    
    var `type`: String
  }
  object VirtualElement {
    
    inline def apply(`type`: String): VirtualElement = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualElement] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
