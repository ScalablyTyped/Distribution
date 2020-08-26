package typings.bandagedbdBdapi.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.bandagedbdBdapi.anon.TypeofComponent
import typings.bandagedbdBdapi.bandagedbdBdapiStrings.input
import typings.react.anon.Default
import typings.react.experimentalMod.reactAugmentingMod.SuspenseConfig
import typings.react.experimentalMod.reactAugmentingMod.SuspenseListProps
import typings.react.experimentalMod.reactAugmentingMod.TimeoutConfig
import typings.react.experimentalMod.reactAugmentingMod.TransitionStartFunction
import typings.react.mod.Attributes
import typings.react.mod.CElement
import typings.react.mod.CFactory
import typings.react.mod.ClassAttributes
import typings.react.mod.ClassType
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.DOMFactory
import typings.react.mod.DependencyList
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.Dispatch
import typings.react.mod.DispatchWithoutAction
import typings.react.mod.EffectCallback
import typings.react.mod.ExoticComponent
import typings.react.mod.Factory
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ForwardRefRenderFunction
import typings.react.mod.FunctionComponent
import typings.react.mod.FunctionComponentElement
import typings.react.mod.FunctionComponentFactory
import typings.react.mod.HTMLAttributes
import typings.react.mod.HTMLFactory
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.LazyExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.MutableRefObject
import typings.react.mod.NamedExoticComponent
import typings.react.mod.ProfilerProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactChildren
import typings.react.mod.ReactElement
import typings.react.mod.ReactHTMLElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.react.mod.ReactSVGElement
import typings.react.mod.Reducer
import typings.react.mod.ReducerAction
import typings.react.mod.ReducerState
import typings.react.mod.ReducerStateWithoutAction
import typings.react.mod.ReducerWithoutAction
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.react.mod.SVGFactory
import typings.react.mod.SetStateAction
import typings.react.mod.SuspenseProps
import typings.reactDom.mod.Renderer
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Partial
import typings.std.SVGElement
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@bandagedbd/bdapi", "BdApiModule")
@js.native
object BdApiModule extends js.Object {
  /**
    * Creates an shows an alert modal to the user. A preview of how it may look can be found [here](https://i.zackrauen.com/7qnnNC.png).
    */
  def alert(title: String, content: String): Unit = js.native
  /**
    * Removes a style added with [`injectCSS`](#injectcssid-css) below.
    */
  def clearCSS(id: String): Unit = js.native
  /**
    * Deletes some saved data for plugin `pluginName` with key `key`.
    */
  def deleteData(pluginName: String, key: String): Unit = js.native
  /**
    * Searches for multiple internal Discord webpack module based on `filter`. It's the same as [`findModule`](#findmodulefilter) but will return all matches
    */
  def findAllModules(filter: js.Function0[Unit]): js.Array[_] = js.native
  /**
    * Searches for an internal Discord webpack module based on `filter`.
    */
  def findModule(filter: js.Function0[Unit]): js.Any = js.native
  /**
    * Searches for an internal Discord webpack module that has every property passed.
    */
  def findModuleByProps(props: String*): js.Any = js.native
  /**
    * Returns BandagedBD's instance of the core module. Only use this if you know what you are doing.
    */
  def getCore(): js.Any = js.native
  /**
    * Alias for [loadData(pluginName, key)](#loaddatapluginname-key)
    */
  def getData(pluginName: String, key: String): js.Any = js.native
  /**
    * Gets the internal react instance for a particular node.
    */
  def getInternalInstance(node: HTMLElement): js.UndefOr[js.Object] = js.native
  /**
    * Gets the instance of another plugin with the name `name`.
    */
  def getPlugin(name: String): js.Object | Null = js.native
  /**
    * Adds a block of css to the current document's `head`.
    */
  def injectCSS(id: String, css: String): js.Object | Null = js.native
  /**
    * Links some remote JavaScript to be added to the page. Useful for libraries like `Sortable.js`.
    */
  def linkJS(id: String, url: String): Unit = js.native
  /**
    * Gets some saved data for plugin `pluginName` with key `key`. Data can be saved with [`saveData`](#savedatapluginname-key-data).
    */
  def loadData(pluginName: String, key: String): js.Any = js.native
  /**
    * This function monkey-patches a method on an object. The patching callback may be run before, after or instead of target method.
    * - Be careful when monkey-patching. Think not only about original functionality of target method and your changes,
    * but also about developers of other plugins, who may also patch this method before or after you.
    * Try to change target method behaviour as little as possible, and avoid changing method signatures.
    * - Display name of patched method is changed, so you can see if a function has been patched (and how many times) while debugging or in the stack trace.
    * Also, patched methods have property `__monkeyPatched` set to `true`, in case you want to check something programmatically.
    */
  def monkeyPatch(module: js.Object, methodName: String, options: MonkeyPatchOptions): CancelPatch = js.native
  /**
    * Adds a listener for when the node is removed from the document body.
    */
  def onRemoved(node: HTMLElement, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Saved some `data` for plugin `pluginName` under `key` key. Gets saved in the plugins folder under `pluginName.config.json`. Data can be saved with [`loadData`](#loaddatapluginname-key).
    */
  def saveData(pluginName: String, key: String, data: js.Any): Unit = js.native
  /**
    * Alias for [saveData(pluginName, key, data)](#savedatapluginname-key-data)
    *
    */
  def setData(pluginName: String, key: String, data: js.Any): Unit = js.native
  /**
    * Shows a simple toast message similar to on Android. An example of the `success` toast can be seen [here](https://i.zackrauen.com/zIagVa.png).
    */
  def showToast(content: String): Unit = js.native
  def showToast(content: String, options: ToastOptions): Unit = js.native
  /**
    * Wraps a function in a try catch block.
    */
  def suppressErrors(method: js.Function0[Unit]): js.Function0[Unit] = js.native
  def suppressErrors(method: js.Function0[Unit], message: String): js.Function0[Unit] = js.native
  /**
    * Determines if the input is valid and parseable JSON.
    */
  def testJSON(data: String): Boolean = js.native
  /**
    * Removes some previously linked JS by [`linkJS`](#linkjsid-url).
    */
  def unlinkJS(id: String): Unit = js.native
  /**
    * The React module being used inside Discord.
    */
  @js.native
  object React extends js.Object {
    @js.native
    class PureComponent[P, S, SS] ()
      extends typings.react.mod.PureComponent[P, S, SS]
    
    val Children: ReactChildren = js.native
    // Base component for plain JS classes
    // tslint:disable-next-line:no-empty-interface
    var Component: TypeofComponent = js.native
    val Fragment: ExoticComponent[typings.react.anon.Children] = js.native
    val Profiler: ExoticComponent[ProfilerProps] = js.native
    val StrictMode: ExoticComponent[typings.react.anon.Children] = js.native
    /**
      * This feature is not yet available for server-side rendering.
      * Suspense support will be added in a later release.
      */
    val Suspense: ExoticComponent[SuspenseProps] = js.native
    val unstable_SuspenseList: ExoticComponent[SuspenseListProps] = js.native
    val version: String = js.native
    // Custom components
    def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: ReactNode*): FunctionComponentElement[P] = js.native
    def cloneElement[P](element: FunctionComponentElement[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): FunctionComponentElement[P] = js.native
    def cloneElement[P](element: ReactElement, props: Partial[P] with Attributes, children: ReactNode*): ReactElement = js.native
    def cloneElement[P](element: ReactElement, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
    def cloneElement[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: ReactNode*): CElement[P, T] = js.native
    def cloneElement[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactNode*): CElement[P, T] = js.native
    // DOM Element (has to be the last, because type checking stops at first overload that fits)
    def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
    def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactNode*): DOMElement[P, T] = js.native
    // DOM Elements
    // ReactHTMLElement
    def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
    def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
    // SVGElement
    def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactNode*): ReactSVGElement = js.native
    def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactSVGElement = js.native
    // ReactHTMLElement, less specific
    @JSName("cloneElement")
    def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactNode*): ReactHTMLElement[T] = js.native
    @JSName("cloneElement")
    def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactHTMLElement[T] = js.native
    def createContext[T](
      // If you thought this should be optional, see
    // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
    defaultValue: T
    ): Context[T] = js.native
    def createElement[P /* <: js.Object */](`type`: String, props: Attributes with P, children: ReactNode*): ReactElement = js.native
    def createElement[P /* <: js.Object */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
    def createElement[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = js.native
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
      props: (ClassAttributes[ClassicComponent[P, ComponentState]]) with P,
      children: ReactNode*
    ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
      props: js.UndefOr[scala.Nothing],
      children: ReactNode*
    ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
      props: Null,
      children: ReactNode*
    ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
    def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes with P, children: ReactNode*): ReactElement = js.native
    def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
    def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = js.native
    // Custom components
    def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): FunctionComponentElement[P] = js.native
    def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): FunctionComponentElement[P] = js.native
    def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = js.native
    def createElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
    def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
      props: ClassAttributes[T] with P,
      children: ReactNode*
    ): ReactSVGElement = js.native
    def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
      props: js.UndefOr[scala.Nothing],
      children: ReactNode*
    ): ReactSVGElement = js.native
    def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
      props: Null,
      children: ReactNode*
    ): ReactSVGElement = js.native
    def createElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: ReactNode*): CElement[P, T] = js.native
    def createElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: js.UndefOr[scala.Nothing], children: ReactNode*): CElement[P, T] = js.native
    def createElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = js.native
    @JSName("createElement")
    def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): DOMElement[P, T] = js.native
    @JSName("createElement")
    def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = js.native
    @JSName("createElement")
    def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
      props: ClassAttributes[T] with P,
      children: ReactNode*
    ): DetailedReactHTMLElement[P, T] = js.native
    @JSName("createElement")
    def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
      props: js.UndefOr[scala.Nothing],
      children: ReactNode*
    ): DetailedReactHTMLElement[P, T] = js.native
    @JSName("createElement")
    def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
      props: Null,
      children: ReactNode*
    ): DetailedReactHTMLElement[P, T] = js.native
    @JSName("createElement")
    def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): ReactElement = js.native
    @JSName("createElement")
    def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
    @JSName("createElement")
    def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = js.native
    // DOM Elements
    // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
    @JSName("createElement")
    def createElement_input(
      `type`: input,
      props: InputHTMLAttributes[HTMLInputElement] with ClassAttributes[HTMLInputElement],
      children: ReactNode*
    ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    @JSName("createElement")
    def createElement_input(`type`: input, props: js.UndefOr[scala.Nothing], children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    @JSName("createElement")
    def createElement_input(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    def createFactory(`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): SVGFactory = js.native
    def createFactory[P](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): CFactory[P, ClassicComponent[P, ComponentState]] = js.native
    def createFactory[P](`type`: ComponentClass[P, ComponentState]): Factory[P] = js.native
    // Custom components
    def createFactory[P](`type`: FunctionComponent[P]): FunctionComponentFactory[P] = js.native
    def createFactory[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String): DOMFactory[P, T] = js.native
    def createFactory[P, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C]): CFactory[P, T] = js.native
    //
    // Top Level API
    // ----------------------------------------------------------------------
    // DOM Elements
    @JSName("createFactory")
    def createFactory_T_HTMLElement_HTMLFactory[T /* <: HTMLElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any): HTMLFactory[T] = js.native
    def createRef[T](): RefObject[T] = js.native
    def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[T]] = js.native
    def isValidElement[P](): /* is react.react.ReactElement */ Boolean = js.native
    def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
    def `lazy`[T /* <: ComponentType[_] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = js.native
    def memo[T /* <: ComponentType[_] */](Component: T): MemoExoticComponent[T] = js.native
    def memo[T /* <: ComponentType[_] */](
      Component: T,
      propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
    ): MemoExoticComponent[T] = js.native
    def memo[P /* <: js.Object */](Component: SFC[P]): NamedExoticComponent[P] = js.native
    def memo[P /* <: js.Object */](
      Component: SFC[P],
      propsAreEqual: js.Function2[/* prevProps */ PropsWithChildren[P], /* nextProps */ PropsWithChildren[P], Boolean]
    ): NamedExoticComponent[P] = js.native
    def unstable_useDeferredValue[T](value: T): T = js.native
    def unstable_useDeferredValue[T](value: T, config: TimeoutConfig): T = js.native
    def unstable_useTransition(): js.Tuple2[TransitionStartFunction, Boolean] = js.native
    def unstable_useTransition(config: SuspenseConfig): js.Tuple2[TransitionStartFunction, Boolean] = js.native
    def unstable_withSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]]): Unit = js.native
    def unstable_withSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]], config: SuspenseConfig): Unit = js.native
    // I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
    // useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
    /**
      * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
      * has changed.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usecallback
      */
    // TODO (TypeScript 3.0): <T extends (...args: never[]) => unknown>
    def useCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, deps: DependencyList): T = js.native
    // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
    /**
      * Accepts a context object (the value returned from `React.createContext`) and returns the current
      * context value, as given by the nearest context provider for the given context.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usecontext
      */
    def useContext[T](context: Context[T]): T = js.native
    /**
      * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
      *
      * NOTE: We don’t recommend adding debug values to every custom hook.
      * It’s most valuable for custom hooks that are part of shared libraries.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usedebugvalue
      */
    // the name of the custom hook is itself derived from the function name at runtime:
    // it's just the function name without the "use" prefix.
    def useDebugValue[T](value: T): Unit = js.native
    def useDebugValue[T](value: T, format: js.Function1[/* value */ T, _]): Unit = js.native
    /**
      * Accepts a function that contains imperative, possibly effectful code.
      *
      * @param effect Imperative function that can return a cleanup function
      * @param deps If present, effect will only activate if the values in the list change.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#useeffect
      */
    def useEffect(effect: EffectCallback): Unit = js.native
    def useEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
    // NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
    /**
      * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
      * `ref`. As always, imperative code using refs should be avoided in most cases.
      *
      * `useImperativeHandle` should be used with `React.forwardRef`.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#useimperativehandle
      */
    def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[Ref[T]], init: js.Function0[R]): Unit = js.native
    def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[Ref[T]], init: js.Function0[R], deps: DependencyList): Unit = js.native
    /**
      * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
      * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
      * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
      *
      * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
      *
      * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
      * `componentDidMount` and `componentDidUpdate`.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#uselayouteffect
      */
    def useLayoutEffect(effect: EffectCallback): Unit = js.native
    def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
    /**
      * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
      *
      * Usage note: if calling `useMemo` with a referentially stable function, also give it as the input in
      * the second argument.
      *
      * ```ts
      * function expensive () { ... }
      *
      * function Component () {
      *   const expensiveResult = useMemo(expensive, [expensive])
      *   return ...
      * }
      * ```
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usememo
      */
    // allow undefined, but don't make it optional as that is very likely a mistake
    def useMemo[T](factory: js.Function0[T]): T = js.native
    def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = js.native
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usereducer
      */
    // I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
    // The Flow types do have an overload for 3-ary invocation with undefined initializer.
    // NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
    // supertype between the reducer's return type and the initialState (or the initializer's return type),
    // which would prevent autocompletion from ever working.
    // TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
    // in older versions, or a regression in newer versions of the typescript completion service.
    def useReducer[R /* <: Reducer[_, _] */](reducer: R, initialState: ReducerState[R], initializer: js.UndefOr[scala.Nothing]): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = js.native
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usereducer
      */
    // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
    // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be ommitted.
    // the last overload effectively behaves as if the identity function (x => x) is the initializer.
    // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
    def useReducer[R /* <: Reducer[_, _] */, I](
      reducer: R,
      initializerArg: (I with ReducerState[R]) | I,
      initializer: js.Function1[(/* arg */ I with ReducerState[R]) | (/* arg */ I), ReducerState[R]]
    ): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = js.native
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usereducer
      */
    // overload where dispatch could accept 0 arguments.
    @JSName("useReducer")
    def useReducer_R_ReducerWithoutActionWildcard[R /* <: ReducerWithoutAction[_] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: js.UndefOr[scala.Nothing]): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usereducer
      */
    // overload where dispatch could accept 0 arguments.
    @JSName("useReducer")
    def useReducer_R_ReducerWithoutActionWildcardI[R /* <: ReducerWithoutAction[_] */, I](
      reducer: R,
      initializerArg: I,
      initializer: js.Function1[/* arg */ I, ReducerStateWithoutAction[R]]
    ): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
    // convenience overload for refs given as a ref prop as they typically start with a null value
    /**
      * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
      * (`initialValue`). The returned object will persist for the full lifetime of the component.
      *
      * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
      * value around similar to how you’d use instance fields in classes.
      *
      * Usage note: if you need the result of useRef to be directly mutable, include `| null` in the type
      * of the generic argument.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#useref
      */
    // TODO (TypeScript 3.0): <T extends unknown>
    def useRef[T](): RefObject[T] = js.native
    def useRef[T](initialValue: T): RefObject[T] = js.native
    // convenience overload for potentially undefined initialValue / call with 0 arguments
    // has a default to stop it from defaulting to {} instead
    /**
      * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
      * (`initialValue`). The returned object will persist for the full lifetime of the component.
      *
      * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
      * value around similar to how you’d use instance fields in classes.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#useref
      */
    // TODO (TypeScript 3.0): <T extends unknown>
    @JSName("useRef")
    def useRef_T_MutableRefObject[T](): MutableRefObject[js.UndefOr[T]] = js.native
    /**
      * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
      * (`initialValue`). The returned object will persist for the full lifetime of the component.
      *
      * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
      * value around similar to how you’d use instance fields in classes.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#useref
      */
    // TODO (TypeScript 3.0): <T extends unknown>
    @JSName("useRef")
    def useRef_T_MutableRefObject[T](initialValue: T): MutableRefObject[T] = js.native
    // convenience overload when first argument is ommitted
    /**
      * Returns a stateful value, and a function to update it.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usestate
      */
    def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = js.native
    /**
      * Returns a stateful value, and a function to update it.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usestate
      */
    def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
    def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
    @js.native
    object PureComponent
      extends TopLevel[Instantiable0[typings.react.mod.PureComponent[js.Object, js.Object, js.Object]]]
    
  }
  
  /**
    * The ReactDOM module being used inside Discord.
    */
  @js.native
  object ReactDOM extends js.Object {
    val hydrate: Renderer = js.native
    val render: Renderer = js.native
    val version: String = js.native
    def createPortal(children: ReactNode, container: Element): ReactPortal = js.native
    def createPortal(children: ReactNode, container: Element, key: String): ReactPortal = js.native
    def findDOMNode(): Element | Null | Text = js.native
    def findDOMNode(instance: ReactInstance): Element | Null | Text = js.native
    def unmountComponentAtNode(container: DocumentFragment): Boolean = js.native
    def unmountComponentAtNode(container: Element): Boolean = js.native
    def unstable_batchedUpdates(callback: js.Function0[_]): Unit = js.native
    def unstable_batchedUpdates[A](callback: js.Function1[/* a */ A, _], a: A): Unit = js.native
    def unstable_batchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, _], a: A, b: B): Unit = js.native
    def unstable_renderSubtreeIntoContainer[T /* <: Element */](
      parentComponent: Component[_, js.Object, _],
      element: DOMElement[DOMAttributes[T], T],
      container: Element
    ): T = js.native
    def unstable_renderSubtreeIntoContainer[T /* <: Element */](
      parentComponent: Component[_, js.Object, _],
      element: DOMElement[DOMAttributes[T], T],
      container: Element,
      callback: js.Function1[/* element */ T, _]
    ): T = js.native
    def unstable_renderSubtreeIntoContainer[P](parentComponent: Component[_, js.Object, _], element: ReactElement, container: Element): (Component[P, ComponentState, _]) | Element | Unit = js.native
    def unstable_renderSubtreeIntoContainer[P](
      parentComponent: Component[_, js.Object, _],
      element: ReactElement,
      container: Element,
      callback: js.Function1[/* component */ js.UndefOr[(Component[P, ComponentState, _]) | Element], _]
    ): (Component[P, ComponentState, _]) | Element | Unit = js.native
    def unstable_renderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, _] */](parentComponent: Component[_, js.Object, _], element: CElement[P, T], container: Element): T = js.native
    def unstable_renderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, _] */](
      parentComponent: Component[_, js.Object, _],
      element: CElement[P, T],
      container: Element,
      callback: js.Function1[/* component */ T, _]
    ): T = js.native
  }
  
}

