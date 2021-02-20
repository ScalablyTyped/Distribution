package typings.deku

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a DOM renderer using a container element.
    * Everything will be rendered inside of that container.
    * Returns a function that accepts new state that can replace what is currently rendered.
    */
  @JSImport("deku", "createApp")
  @js.native
  def createApp(el: HTMLElement): Render = js.native
  @JSImport("deku", "createApp")
  @js.native
  def createApp(el: HTMLElement, dispatch: Dispatch): Render = js.native
  
  object diff {
    
    @JSImport("deku", "diff.Actions")
    @js.native
    class Actions () extends StObject {
      
      var _keys: js.Array[String] = js.native
      
      var _name: String = js.native
    }
    object Actions {
      
      /* static member */
      @JSImport("deku", "diff.Actions.insertBefore")
      @js.native
      def insertBefore(a: Double): Actions = js.native
      
      /* static member */
      @JSImport("deku", "diff.Actions.insertChild")
      @js.native
      def insertChild(a: js.Any, b: Double, c: String): Actions = js.native
      
      /* static member */
      @JSImport("deku", "diff.Actions.removeAttribute")
      @js.native
      def removeAttribute(a: String, b: js.Any): Actions = js.native
      
      /* static member */
      @JSImport("deku", "diff.Actions.removeChild")
      @js.native
      def removeChild(a: Double): Actions = js.native
      
      /* static member */
      @JSImport("deku", "diff.Actions.removeNode")
      @js.native
      def removeNode(a: js.Any): Actions = js.native
      
      /* static member */
      @JSImport("deku", "diff.Actions.replaceNode")
      @js.native
      def replaceNode(a: js.Any, b: js.Any, c: String): Actions = js.native
      
      /* static member */
      @JSImport("deku", "diff.Actions.sameNode")
      @js.native
      def sameNode(): Actions = js.native
      
      /* static member */
      @JSImport("deku", "diff.Actions.setAttribute")
      @js.native
      def setAttribute(a: String, b: js.Any, c: js.Any): Actions = js.native
      
      /* static member */
      @JSImport("deku", "diff.Actions.updateChild")
      @js.native
      def updateChild(a: Double, b: js.Array[_]): Actions = js.native
      
      /* static member */
      @JSImport("deku", "diff.Actions.updateChildren")
      @js.native
      def updateChildren(a: js.Array[_]): Actions = js.native
      
      /* static member */
      @JSImport("deku", "diff.Actions.updateThunk")
      @js.native
      def updateThunk(a: js.Any, b: js.Any, c: String): Actions = js.native
      
      /* static member */
      @JSImport("deku", "diff.Actions.case")
      @js.native
      def `case`(pat: js.Any, action: Actions): js.Any = js.native
    }
    
    /**
      * Compare two virtual nodes and return an array of changes to turn the left into the right.
      */
    @JSImport("deku", "diff.diffNode")
    @js.native
    def diffNode(prevNode: VirtualElement, nextNode: VirtualElement): js.Array[_] = js.native
  }
  
  object dom {
    
    /**
      * Create a real DOM element from a virtual element, recursively looping down.
      * When it finds custom elements it will render them, cache them, and keep going,
      * so they are treated like any other native element.
      */
    @JSImport("deku", "dom.create")
    @js.native
    def create[C](vnode: VirtualElement, path: String, dispatch: Dispatch, context: C): HTMLElement = js.native
    
    /**
      * Modify a DOM element given an array of actions.
      */
    @JSImport("deku", "dom.update")
    @js.native
    def update[C, A](dispatch: Dispatch, context: C): js.Function2[/* DOMElement */ HTMLElement, /* action */ A, HTMLElement] = js.native
  }
  
  /**
    * This function lets us create virtual nodes using a simple syntax.
    * It is compatible with JSX transforms so you can use JSX to write nodes that will compile to this function.
    */
  @JSImport("deku", "element")
  @js.native
  def element(`type`: String): VirtualElement = js.native
  @JSImport("deku", "element")
  @js.native
  def element(`type`: Thunk): VirtualElement = js.native
  @JSImport("deku", "element")
  @js.native
  def element[A](`type`: String, attributes: A, children: js.Any*): VirtualElement = js.native
  @JSImport("deku", "element")
  @js.native
  def element[A](`type`: Thunk, attributes: A, children: js.Any*): VirtualElement = js.native
  
  @JSImport("deku", "h")
  @js.native
  def h(`type`: String): VirtualElement = js.native
  @JSImport("deku", "h")
  @js.native
  def h(`type`: Thunk): VirtualElement = js.native
  @JSImport("deku", "h")
  @js.native
  def h[A](`type`: String, attributes: A, children: js.Any*): VirtualElement = js.native
  @JSImport("deku", "h")
  @js.native
  def h[A](`type`: Thunk, attributes: A, children: js.Any*): VirtualElement = js.native
  
  object string {
    
    /**
      * Render a virtual element to a string. You can pass in an option state context object that will be given to all components.
      */
    @JSImport("deku", "string.render")
    @js.native
    def render(vnode: VirtualElement): String = js.native
    @JSImport("deku", "string.render")
    @js.native
    def render[C](vnode: VirtualElement, context: C): String = js.native
  }
  
  object vnode {
    
    /**
      * This function lets us create virtual nodes using a simple syntax.
      * It is compatible with JSX transforms so you can use JSX to write nodes that will compile to this function.
      */
    /* was `typeof element` */
    @JSImport("deku", "vnode.create")
    @js.native
    def create(`type`: String): VirtualElement = js.native
    /* was `typeof element` */
    @JSImport("deku", "vnode.create")
    @js.native
    def create(`type`: Thunk): VirtualElement = js.native
    /* was `typeof element` */
    @JSImport("deku", "vnode.create")
    @js.native
    def create[A](`type`: String, attributes: A, children: js.Any*): VirtualElement = js.native
    /* was `typeof element` */
    @JSImport("deku", "vnode.create")
    @js.native
    def create[A](`type`: Thunk, attributes: A, children: js.Any*): VirtualElement = js.native
    
    @JSImport("deku", "vnode.createEmptyElement")
    @js.native
    def createEmptyElement(): VirtualElement = js.native
    
    // function isValidAttribute<A>(value: A): boolean;
    /**
      * Create a node path, eg. (23,5,2,4) => '23.5.2.4'
      */
    @JSImport("deku", "vnode.createPath")
    @js.native
    def createPath(paths: (Double | String)*): String = js.native
    
    /**
      * Text nodes are stored as objects to keep things simple
      */
    @JSImport("deku", "vnode.createTextElement")
    @js.native
    def createTextElement(text: String): VirtualElement = js.native
    
    /**
      * Lazily-rendered virtual nodes
      */
    @JSImport("deku", "vnode.createThunkElement")
    @js.native
    def createThunkElement[P, T, O](
      fn: js.Function1[/* model */ Model, VirtualElement],
      key: String,
      props: P,
      children: js.Array[T],
      options: O
    ): VirtualElement = js.native
    
    @JSImport("deku", "vnode.isEmpty")
    @js.native
    def isEmpty(vnode: VirtualElement): Boolean = js.native
    
    @JSImport("deku", "vnode.isSameThunk")
    @js.native
    def isSameThunk(prevNode: VirtualElement, nextNode: VirtualElement): Boolean = js.native
    
    @JSImport("deku", "vnode.isText")
    @js.native
    def isText(vnode: VirtualElement): Boolean = js.native
    
    @JSImport("deku", "vnode.isThunk")
    @js.native
    def isThunk(vnode: VirtualElement): Boolean = js.native
  }
  
  @js.native
  trait Component extends StObject {
    
    var onCreate: js.UndefOr[js.Function1[/* model */ Model, _]] = js.native
    
    var onRemove: js.UndefOr[js.Function1[/* model */ Model, _]] = js.native
    
    var onUpdate: js.UndefOr[js.Function1[/* model */ Model, _]] = js.native
    
    def render(model: Model): VirtualElement = js.native
  }
  object Component {
    
    @scala.inline
    def apply(render: Model => VirtualElement): Component = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCreate(value: /* model */ Model => _): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* model */ Model => _): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* model */ Model => _): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setRender(value: Model => VirtualElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  type Dispatch = js.Function1[/* action */ js.Any, js.Any]
  
  @js.native
  trait Model extends StObject {
    
    var children: js.UndefOr[js.Array[_]] = js.native
    
    var context: js.UndefOr[js.Any] = js.native
    
    var dispatch: js.UndefOr[Dispatch] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var props: js.UndefOr[js.Any] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[_]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDispatch(value: /* action */ js.Any => js.Any): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  type Render = js.Function2[/* vnode */ VirtualElement, /* context */ js.UndefOr[js.Any], Unit]
  
  /**
    * Thunk object passed to `element`
    */
  type Thunk = Component | (js.Function1[/* model */ Model, VirtualElement])
  
  @js.native
  trait VirtualElement extends StObject {
    
    var `type`: String = js.native
  }
  object VirtualElement {
    
    @scala.inline
    def apply(`type`: String): VirtualElement = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualElement]
    }
    
    @scala.inline
    implicit class VirtualElementMutableBuilder[Self <: VirtualElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
