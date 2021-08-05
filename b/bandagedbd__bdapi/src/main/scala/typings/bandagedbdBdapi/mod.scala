package typings.bandagedbdBdapi

import typings.bandagedbdBdapi.bandagedbdBdapiStrings.input
import typings.react.anon.Default
import typings.react.experimentalMod.reactAugmentingMod.OpaqueIdentifier
import typings.react.experimentalMod.reactAugmentingMod.SuspenseConfig
import typings.react.experimentalMod.reactAugmentingMod.SuspenseListProps
import typings.react.experimentalMod.reactAugmentingMod.TransitionFunction
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@bandagedbd/bdapi", "AddonAPI")
  @js.native
  class AddonAPI () extends StObject {
    
    /**
      * Disables the given addon.
      * @param name The name/identifier of the addon.
      */
    def disable(name: String): Unit = js.native
    
    /**
      * Enables the given addon
      * @param name The name/identifier of the addon.
      */
    def enable(name: String): Unit = js.native
    
    /**
      * String representing the resolved location of the user's addon folder.
      */
    val folder: String = js.native
    
    /**
      * Gets the "instance" of the given addon.
      * @param name The name/identifier of the addon.
      * @returns For plugins, this is the plugin instance, for themes this is the meta + css.
      */
    def get(name: String): js.Object = js.native
    
    /**
      * Gets all the "instances" of addon type.
      * @returns An array matching the output of get.
      */
    def getAll(): Unit = js.native
    
    /**
      * Checks if the given addon is currently enabled.
      * @param name The name/identifier of the addon.
      * @returns Indicates if the addon is enabled.
      */
    def isEnabled(name: String): Boolean = js.native
    
    /**
      * Toggle the enablement the given addon.
      * @param name The name/identifier of the addon.
      */
    def toggle(name: String): Unit = js.native
  }
  
  object BdApi {
    
    @JSImport("@bandagedbd/bdapi", "BdApi")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * An instance of AddonAPI to access plugins.
      */
    @JSImport("@bandagedbd/bdapi", "BdApi.Plugins")
    @js.native
    val Plugins: /* import warning: importer.ImportType#apply Failed type conversion: typeof AddonAPI */ js.Any = js.native
    
    /**
      * The React module being used inside Discord.
      */
    @JSImport("@bandagedbd/bdapi", "BdApi.React")
    @js.native
    val React: /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactInstance */ js.Any = js.native
    
    /**
      * The ReactDOM module being used inside Discord.
      */
    @JSImport("@bandagedbd/bdapi", "BdApi.ReactDOM")
    @js.native
    val ReactDOM: /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactDOMInstance */ js.Any = js.native
    
    /**
      * Creates an shows an alert modal to the user. A preview of how it may look can be found [here](https://i.zackrauen.com/7qnnNC.png).
      * @param title The title to show on the modal.
      * @param content Content to show in the modal (can be html string).
      */
    inline def alert(title: String, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Removes a style added with `injectCSS` below.
      * @param id ID of the node to remove.
      */
    inline def clearCSS(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCSS")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Deletes some saved data for plugin `pluginName` with key `key`.
      * @param pluginName Which plugin this is being used for.
      * @param key Key for which data should be deleted.
      */
    inline def deleteData(pluginName: String, key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Disables a BBD setting by id.
      * @param id Id for the setting.
      */
    inline def disableSetting(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableSetting")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Gives access to BBD's internal emotes object and is therefore subject to change.
      */
    @JSImport("@bandagedbd/bdapi", "BdApi.emotes")
    @js.native
    val emotes: js.Any = js.native
    
    /**
      * Enables a BBD setting by id.
      * @param id Id for the setting.
      */
    inline def enableSetting(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableSetting")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Searches for multiple internal Discord webpack module based on `filter`. It's the same as `findModule` but will return all matches.
      * @param filter A function to use to filter modules.
      * @returns The modules found or null if none were found.
      */
    inline def findAllModules(filter: js.Function0[Unit]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllModules")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    
    /**
      * Searches for an internal Discord webpack module based on `filter`.
      * @param filter A function to use to filter modules.
      * @returns The modules found or null if none were found.
      */
    inline def findModule(filter: js.Function0[Unit]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findModule")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Searches for an internal Discord webpack module with a specific `displayName` value.
      * @param name The `displayName` to look for.
      * @returns The modules found or null if none were found.
      */
    inline def findModuleByDisplayName(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findModuleByDisplayName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Searches for an internal Discord webpack module that has every property passed.
      * @param props A series of properties to check for.
      * @returns The modules found or null if none were found.
      */
    inline def findModuleByProps(props: String*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findModuleByProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Searches for an internal Discord webpack module that has every property passed on its prototype.
      * @param props A series of prototype properties to check for
      * @returns The modules found or null if none were found..
      */
    inline def findModuleByPrototypes(props: String*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findModuleByPrototypes")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Returns BandagedBD's instance of the core module. Only use this if you know what you are doing.
      * @deprecated since 2020.3.27
      * @returns BBD's instantiated core module.
      */
    inline def getCore(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCore")().asInstanceOf[js.Any]
    
    // TODO: This should not return 'any' but instead 'Core'
    // Not worth it in my opinion because it's deprecated (commit caf3406e0a22a24dc5ad76d9c51edb3330d379b7)
    /**
      * Alias for loadData(pluginName, key)
      * @param pluginName Which plugin this is being used for.
      * @param key Key for which data should be returned.
      * @returns The information that was saved previously, or null otherwise.
      */
    inline def getData(pluginName: String, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * Gets the internal react instance for a particular node.
      * @param node jQuery
      * @returns The instance if found or undefined otherwise.
      */
    inline def getInternalInstance(node: HTMLElement): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalInstance")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object]]
    
    /**
      * Gets the instance of another plugin with the name `name`.
      * @deprecated since unknown
      * @param name Name of the plugin to retreive.
      * @returns The plugin if found or null otherwise.
      */
    inline def getPlugin(name: String): js.Object | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(name.asInstanceOf[js.Any]).asInstanceOf[js.Object | Null]
    
    /**
      * Adds a block of css to the current document's `head`.
      * @param id Identifier for the node to be added. Can be used later with `clearCSS` from above.
      * @param css String of css to be added.
      * @returns The plugin if found or null otherwise.
      */
    inline def injectCSS(id: String, css: String): js.Object | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("injectCSS")(id.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[js.Object | Null]
    
    /**
      * Links some remote JavaScript to be added to the page. Useful for libraries like `Sortable.js`.
      * @param id Identifier for the node to be added. Can be used later with `unlinkJS` below.
      * @param url URL of the js.
      */
    inline def linkJS(id: String, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linkJS")(id.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gets some saved data for plugin `pluginName` with key `key`. Data can be saved with `saveData`.
      * @param pluginName Which plugin this is being used for.
      * @param key Key for which data should be returned.
      * @returns The information that was saved previously, or null otherwise.
      */
    inline def loadData(pluginName: String, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("loadData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * This function monkey-patches a method on an object. The patching callback may be run before, after or instead of target method.
      * - Be careful when monkey-patching. Think not only about original functionality of target method and your changes,
      * but also about developers of other plugins, who may also patch this method before or after you.
      * Try to change target method behaviour as little as possible, and avoid changing method signatures.
      * - Display name of patched method is changed, so you can see if a function has been patched (and how many times) while debugging or in the stack trace.
      * Also, patched methods have property `__monkeyPatched` set to `true`, in case you want to check something programmatically.
      * @param module Object to be patched. You can can also pass class prototypes to patch all class instances.
      * @param methodName The name of the target message to be patched.
      * @param options Options object. You should provide at least one of `before`, `after` or `instead` parameters. Other parameters are optional.
      * @param options.once Set to `true` if you want to automatically unpatch method after first call.
      * @param options.silent Set to `true` if you want to suppress log messages about patching and unpatching.
      * Useful to avoid clogging the console in case of frequent conditional patching/unpatching, for example from another monkeyPatch callback.
      * @param options.displayName You can provide meaningful name for class/object provided in `what` param for logging purposes.
      * By default, this function will try to determine name automatically.
      * @param options.before Callback that will be called before original target method call. You can modify arguments here, so it will be passed to original method.Can be combined with `after`.
      * @param options.after Callback that will be called after original target method call. You can modify return value here, so it will be passed to external code which calls target method.
      * Can be combined with `before`.
      * @param options.instead Callback that will be called instead of original target method call.
      * You can get access to original method using `originalMethod` parameter if you want to call it, but you do not have to.
      * Can't be combined with `before` and `after`.
      * @returns A cancel function which allows you to undo the patch.
      */
    inline def monkeyPatch(module: js.Object, methodName: String, options: MonkeyPatchOptions): CancelPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("monkeyPatch")(module.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelPatch]
    
    /**
      * Adds a listener for when the node is removed from the document body.
      * @param node Node to wait for.
      * @param callback Function to be performed on event.
      */
    inline def onRemoved(node: HTMLElement, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onRemoved")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Saved some `data` for plugin `pluginName` under `key` key. Gets saved in the plugins folder under `pluginName.config.json`. Data can be saved with `loadData`.
      * @param pluginName Which plugin this is being used for.
      * @param key Key for the data should be saved under.
      * @param data Data to save.
      */
    inline def saveData(pluginName: String, key: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Yields the total active height of the application.
      */
    @JSImport("@bandagedbd/bdapi", "BdApi.screenHeight")
    @js.native
    val screenHeight: Double = js.native
    
    /**
      * Yields the total active width of the application.
      */
    @JSImport("@bandagedbd/bdapi", "BdApi.screenWidth")
    @js.native
    val screenWidth: Double = js.native
    
    /**
      * Alias for saveData(pluginName, key, data)
      * @param pluginName Which plugin this is being used for.
      * @param key Key for the data should be saved under.
      * @param data Data to save.
      */
    inline def setData(pluginName: String, key: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gives access to BBD's internal settings object and is therefore subject to change.
      */
    @JSImport("@bandagedbd/bdapi", "BdApi.settings")
    @js.native
    val settings: js.Any = js.native
    
    /**
      * Shows a generic but very customizable confirmation modal with optional confirm and cancel callbacks.
      * @param title Title of the modal.
      * @param content A single or mixed array of react elements and strings. Everything is wrapped in Discord's `TextElement` component so strings will show and render properly.
      * @param options Options to modify the modal.
      * @param options.danger Whether the main button should be red or not.
      * @param options.confirmText Text for the confirmation/submit button.
      * @param options.canceltext Text for the cancel button.
      * @param options.onConfirm Callback to occur when clicking the submit button.
      * @param options.onCancel Callback to occur when clicking the cancel button.
      */
    inline def showConfirmationModal(title: String, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showConfirmationModal")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def showConfirmationModal(title: String, content: String, options: ConfirmationModalOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showConfirmationModal")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Shows a simple toast message similar to on Android. An example of the `success` toast can be seen [here](https://i.zackrauen.com/zIagVa.png).
      * @param content Content to show inside the toast.
      * @param options Options for the toast.
      * @param options.type Changes the type of the toast stylistically and semantically. Choices: "", "info", "success", "danger"/"error", "warning"/"warn". Default: ""
      * @param options.icon Determines whether the icon should show corresponding to the type. A toast without type will always have no icon. Default: true
      * @param options.timeout Adjusts the time (in ms) the toast should be shown for before disappearing automatically. Default: 3000
      */
    inline def showToast(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showToast")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def showToast(content: String, options: ToastOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showToast")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wraps a function in a try catch block.
      * @param method Function to wrap.
      * @param message Additional info for any errors.
      */
    inline def suppressErrors(method: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressErrors")(method.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
    inline def suppressErrors(method: js.Function0[Unit], message: String): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("suppressErrors")(method.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    /**
      * Determines if the input is valid and parseable JSON.
      * @param data Data to test.
      * @returns True if the data is valid, false otherwise.
      */
    inline def testJSON(data: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("testJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Toggles a BBD setting by id.
      * @param id Id for the setting.
      */
    inline def toggleOption(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleOption")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Removes some previously linked JS by `linkJS`.
      * @param id ID of the node to remove.
      */
    inline def unlinkJS(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkJS")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object BdApiModule {
    
    @JSImport("@bandagedbd/bdapi", "BdApiModule")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof AddonAPI` */
    @JSImport("@bandagedbd/bdapi", "BdApiModule.Plugins")
    @js.native
    class Plugins () extends AddonAPI
    
    /* was `typeof ReactInstance` */
    object React {
      
      @JSImport("@bandagedbd/bdapi", "BdApiModule.React")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@bandagedbd/bdapi", "BdApiModule.React.Children")
      @js.native
      val Children: ReactChildren = js.native
      
      // Base component for plain JS classes
      @JSImport("@bandagedbd/bdapi", "BdApiModule.React.Component")
      @js.native
      class Component[P, S, SS] protected ()
        extends typings.react.mod.Component[P, S, SS] {
        def this(props: P) = this()
        /**
          * @deprecated
          * @see https://reactjs.org/docs/legacy-context.html
          */
        def this(props: P, context: js.Any) = this()
      }
      object Component {
        
        @JSImport("@bandagedbd/bdapi", "BdApiModule.React.Component")
        @js.native
        val ^ : js.Any = js.native
        
        // tslint won't let me format the sample code in a way that vscode likes it :(
        /**
          * If set, `this.context` will be set at runtime to the current value of the given Context.
          *
          * Usage:
          *
          * ```ts
          * type MyContext = number
          * const Ctx = React.createContext<MyContext>(0)
          *
          * class Foo extends React.Component {
          *   static contextType = Ctx
          *   context!: React.ContextType<typeof Ctx>
          *   render () {
          *     return <>My context's value: {this.context}</>;
          *   }
          * }
          * ```
          *
          * @see https://reactjs.org/docs/context.html#classcontexttype
          */
        /* static member */
        @JSImport("@bandagedbd/bdapi", "BdApiModule.React.Component.contextType")
        @js.native
        def contextType: js.UndefOr[Context[js.Any]] = js.native
        inline def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      }
      
      @JSImport("@bandagedbd/bdapi", "BdApiModule.React.Fragment")
      @js.native
      val Fragment: ExoticComponent[typings.react.anon.Children] = js.native
      
      @JSImport("@bandagedbd/bdapi", "BdApiModule.React.Profiler")
      @js.native
      val Profiler: ExoticComponent[ProfilerProps] = js.native
      
      @JSImport("@bandagedbd/bdapi", "BdApiModule.React.PureComponent")
      @js.native
      class PureComponent[P, S, SS] protected ()
        extends typings.react.mod.PureComponent[P, S, SS] {
        def this(props: P) = this()
        /**
          * @deprecated
          * @see https://reactjs.org/docs/legacy-context.html
          */
        def this(props: P, context: js.Any) = this()
      }
      
      @JSImport("@bandagedbd/bdapi", "BdApiModule.React.StrictMode")
      @js.native
      val StrictMode: ExoticComponent[typings.react.anon.Children] = js.native
      
      /**
        * This feature is not yet available for server-side rendering.
        * Suspense support will be added in a later release.
        */
      @JSImport("@bandagedbd/bdapi", "BdApiModule.React.Suspense")
      @js.native
      val Suspense: ExoticComponent[SuspenseProps] = js.native
      
      // Custom components
      inline def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] & Attributes, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
      inline def cloneElement[P](element: FunctionComponentElement[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
      inline def cloneElement[P](element: ReactElement, props: Partial[P] & Attributes, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
      inline def cloneElement[P](element: ReactElement, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
      inline def cloneElement[P, T /* <: typings.react.mod.Component[P, ComponentState, js.Any] */](element: CElement[P, T], props: Partial[P] & ClassAttributes[T], children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
      inline def cloneElement[P, T /* <: typings.react.mod.Component[P, ComponentState, js.Any] */](element: CElement[P, T], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
      // DOM Element (has to be the last, because type checking stops at first overload that fits)
      inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
      inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
      // DOM Elements
      // ReactHTMLElement
      inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactNode*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
      inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: Unit, children: ReactNode*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
      // SVGElement
      inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactNode*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
      inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: Unit, children: ReactNode*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
      
      // ReactHTMLElement, less specific
      inline def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactNode*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactHTMLElement[T]]
      inline def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: Unit, children: ReactNode*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactHTMLElement[T]]
      
      inline def createContext[T](
        // If you thought this should be optional, see
      // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
      defaultValue: T
      ): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
      
      inline def createElement[P /* <: js.Object */](`type`: String, props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
      inline def createElement[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
      inline def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
      inline def createElement[P /* <: js.Object */](
        `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
        props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
        children: ReactNode*
      ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
      inline def createElement[P /* <: js.Object */](
        `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
        props: Null,
        children: ReactNode*
      ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
      inline def createElement[P /* <: js.Object */](
        `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
        props: Unit,
        children: ReactNode*
      ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
      inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
      inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
      inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
      // Custom components
      inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
      inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
      inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
      inline def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
        `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
        props: ClassAttributes[T] & P,
        children: ReactNode*
      ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
      inline def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
        `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
        props: Null,
        children: ReactNode*
      ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
      inline def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
        `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
        props: Unit,
        children: ReactNode*
      ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
      inline def createElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
      inline def createElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
      inline def createElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
      
      inline def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
      inline def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
      inline def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
      
      inline def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
        `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
        props: ClassAttributes[T] & P,
        children: ReactNode*
      ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
      inline def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
        `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
        props: Null,
        children: ReactNode*
      ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
      inline def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
        `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
        props: Unit,
        children: ReactNode*
      ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
      
      inline def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
      inline def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
      inline def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
      
      // DOM Elements
      // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
      inline def createElement_input(
        `type`: input,
        props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
        children: ReactNode*
      ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
      inline def createElement_input(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
      inline def createElement_input(`type`: input, props: Unit, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
      
      inline def createFactory(`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): SVGFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[SVGFactory]
      inline def createFactory[P](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): CFactory[P, ClassicComponent[P, ComponentState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CFactory[P, ClassicComponent[P, ComponentState]]]
      inline def createFactory[P](`type`: ComponentClass[P, ComponentState]): Factory[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[Factory[P]]
      // Custom components
      inline def createFactory[P](`type`: FunctionComponent[P]): FunctionComponentFactory[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentFactory[P]]
      inline def createFactory[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String): DOMFactory[P, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[DOMFactory[P, T]]
      inline def createFactory[P, T /* <: typings.react.mod.Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C]): CFactory[P, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CFactory[P, T]]
      
      //
      // Top Level API
      // ----------------------------------------------------------------------
      // DOM Elements
      inline def createFactory_T_HTMLElement_HTMLFactory[T /* <: HTMLElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any): HTMLFactory[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[HTMLFactory[T]]
      
      inline def createRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefObject[T]]
      
      inline def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]]]
      
      inline def isValidElement[P](): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ Boolean]
      inline def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]
      
      inline def `lazy`[T /* <: ComponentType[js.Any] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[LazyExoticComponent[T]]
      
      inline def memo[T /* <: ComponentType[js.Any] */](Component: T): MemoExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[MemoExoticComponent[T]]
      inline def memo[T /* <: ComponentType[js.Any] */](
        Component: T,
        propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
      ): MemoExoticComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[T]]
      inline def memo[P /* <: js.Object */](Component: SFC[P]): NamedExoticComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[NamedExoticComponent[P]]
      inline def memo[P /* <: js.Object */](
        Component: SFC[P],
        propsAreEqual: js.Function2[/* prevProps */ PropsWithChildren[P], /* nextProps */ PropsWithChildren[P], Boolean]
      ): NamedExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[NamedExoticComponent[P]]
      
      inline def unstableStartTransition(scope: TransitionFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_startTransition")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @JSImport("@bandagedbd/bdapi", "BdApiModule.React.unstable_SuspenseList")
      @js.native
      val unstableSuspenseList: ExoticComponent[SuspenseListProps] = js.native
      
      inline def unstableUseDeferredValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
      
      inline def unstableUseOpaqueIdentifier(): OpaqueIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useOpaqueIdentifier")().asInstanceOf[OpaqueIdentifier]
      
      inline def unstableUseTransition(): js.Tuple2[TransitionStartFunction, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useTransition")().asInstanceOf[js.Tuple2[TransitionStartFunction, Boolean]]
      inline def unstableUseTransition(config: SuspenseConfig): js.Tuple2[TransitionStartFunction, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useTransition")(config.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TransitionStartFunction, Boolean]]
      
      inline def unstableWithSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_withSuspenseConfig")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def unstableWithSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]], config: SuspenseConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_withSuspenseConfig")(scope.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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
      inline def useCallback[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](callback: T, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
      
      // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
      /**
        * Accepts a context object (the value returned from `React.createContext`) and returns the current
        * context value, as given by the nearest context provider for the given context.
        *
        * @version 16.8.0
        * @see https://reactjs.org/docs/hooks-reference.html#usecontext
        */
      inline def useContext[T](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]
      
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
      inline def useDebugValue[T](value: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def useDebugValue[T](value: T, format: js.Function1[/* value */ T, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Accepts a function that contains imperative, possibly effectful code.
        *
        * @param effect Imperative function that can return a cleanup function
        * @param deps If present, effect will only activate if the values in the list change.
        *
        * @version 16.8.0
        * @see https://reactjs.org/docs/hooks-reference.html#useeffect
        */
      inline def useEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def useEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
      inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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
      inline def useLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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
      inline def useMemo[T](factory: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
      inline def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
      
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
      inline def useReducer[R /* <: ReducerWithoutAction[js.Any] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: Unit): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
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
      inline def useReducer[R /* <: ReducerWithoutAction[js.Any] */, I](
        reducer: R,
        initializerArg: I,
        initializer: js.Function1[/* arg */ I, ReducerStateWithoutAction[R]]
      ): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
      
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
      inline def useReducer_R_ReducerAnyAny[R /* <: Reducer[js.Any, js.Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
      
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
      // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
      // the last overload effectively behaves as if the identity function (x => x) is the initializer.
      // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
      inline def useReducer_R_ReducerAnyAnyI[R /* <: Reducer[js.Any, js.Any] */, I](
        reducer: R,
        initializerArg: (I & ReducerState[R]) | I,
        initializer: js.Function1[(/* arg */ I & ReducerState[R]) | (/* arg */ I), ReducerState[R]]
      ): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
      
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
      inline def useRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[RefObject[T]]
      inline def useRef[T](initialValue: T): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[RefObject[T]]
      
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
      inline def useRef_T_MutableRefObject[T](): MutableRefObject[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[MutableRefObject[js.UndefOr[T]]]
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
      inline def useRef_T_MutableRefObject[T](initialValue: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
      
      // convenience overload when first argument is omitted
      /**
        * Returns a stateful value, and a function to update it.
        *
        * @version 16.8.0
        * @see https://reactjs.org/docs/hooks-reference.html#usestate
        */
      inline def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
      /**
        * Returns a stateful value, and a function to update it.
        *
        * @version 16.8.0
        * @see https://reactjs.org/docs/hooks-reference.html#usestate
        */
      inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
      inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
      
      @JSImport("@bandagedbd/bdapi", "BdApiModule.React.version")
      @js.native
      val version: String = js.native
    }
    
    /* was `typeof ReactDOMInstance` */
    object ReactDOM {
      
      @JSImport("@bandagedbd/bdapi", "BdApiModule.ReactDOM")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createPortal(children: ReactNode, container: Element): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
      inline def createPortal(children: ReactNode, container: Element, key: String): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
      
      inline def findDOMNode(): Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")().asInstanceOf[Element | Null | Text]
      inline def findDOMNode(instance: ReactInstance): Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")(instance.asInstanceOf[js.Any]).asInstanceOf[Element | Null | Text]
      
      @JSImport("@bandagedbd/bdapi", "BdApiModule.ReactDOM.hydrate")
      @js.native
      val hydrate: Renderer = js.native
      
      @JSImport("@bandagedbd/bdapi", "BdApiModule.ReactDOM.render")
      @js.native
      val render: Renderer = js.native
      
      inline def unmountComponentAtNode(container: DocumentFragment): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def unmountComponentAtNode(container: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def unstableBatchedUpdates(callback: js.Function0[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def unstableBatchedUpdates[A](callback: js.Function1[/* a */ A, js.Any], a: A): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def unstableBatchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, js.Any], a: A, b: B): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def unstableRenderSubtreeIntoContainer[T /* <: Element */](
        parentComponent: Component[js.Any, js.Object, js.Any],
        element: DOMElement[DOMAttributes[T], T],
        container: Element
      ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[T]
      inline def unstableRenderSubtreeIntoContainer[T /* <: Element */](
        parentComponent: Component[js.Any, js.Object, js.Any],
        element: DOMElement[DOMAttributes[T], T],
        container: Element,
        callback: js.Function1[/* element */ T, js.Any]
      ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
      inline def unstableRenderSubtreeIntoContainer[P](parentComponent: Component[js.Any, js.Object, js.Any], element: ReactElement, container: Element): (Component[P, ComponentState, js.Any]) | Element | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[(Component[P, ComponentState, js.Any]) | Element | Unit]
      inline def unstableRenderSubtreeIntoContainer[P](
        parentComponent: Component[js.Any, js.Object, js.Any],
        element: ReactElement,
        container: Element,
        callback: js.Function1[
              /* component */ js.UndefOr[(Component[P, ComponentState, js.Any]) | Element], 
              js.Any
            ]
      ): (Component[P, ComponentState, js.Any]) | Element | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[(Component[P, ComponentState, js.Any]) | Element | Unit]
      inline def unstableRenderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, js.Any] */](parentComponent: Component[js.Any, js.Object, js.Any], element: CElement[P, T], container: Element): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[T]
      inline def unstableRenderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, js.Any] */](
        parentComponent: Component[js.Any, js.Object, js.Any],
        element: CElement[P, T],
        container: Element,
        callback: js.Function1[/* component */ T, js.Any]
      ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
      
      @JSImport("@bandagedbd/bdapi", "BdApiModule.ReactDOM.version")
      @js.native
      val version: String = js.native
    }
    
    /**
      * Creates an shows an alert modal to the user. A preview of how it may look can be found [here](https://i.zackrauen.com/7qnnNC.png).
      * @param title The title to show on the modal.
      * @param content Content to show in the modal (can be html string).
      */
    inline def alert(title: String, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Removes a style added with `injectCSS` below.
      * @param id ID of the node to remove.
      */
    inline def clearCSS(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCSS")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Deletes some saved data for plugin `pluginName` with key `key`.
      * @param pluginName Which plugin this is being used for.
      * @param key Key for which data should be deleted.
      */
    inline def deleteData(pluginName: String, key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Disables a BBD setting by id.
      * @param id Id for the setting.
      */
    inline def disableSetting(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableSetting")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Gives access to BBD's internal emotes object and is therefore subject to change.
      */
    @JSImport("@bandagedbd/bdapi", "BdApiModule.emotes")
    @js.native
    val emotes: js.Any = js.native
    
    /**
      * Enables a BBD setting by id.
      * @param id Id for the setting.
      */
    inline def enableSetting(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableSetting")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Searches for multiple internal Discord webpack module based on `filter`. It's the same as `findModule` but will return all matches.
      * @param filter A function to use to filter modules.
      * @returns The modules found or null if none were found.
      */
    inline def findAllModules(filter: js.Function0[Unit]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllModules")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    
    /**
      * Searches for an internal Discord webpack module based on `filter`.
      * @param filter A function to use to filter modules.
      * @returns The modules found or null if none were found.
      */
    inline def findModule(filter: js.Function0[Unit]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findModule")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Searches for an internal Discord webpack module with a specific `displayName` value.
      * @param name The `displayName` to look for.
      * @returns The modules found or null if none were found.
      */
    inline def findModuleByDisplayName(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findModuleByDisplayName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Searches for an internal Discord webpack module that has every property passed.
      * @param props A series of properties to check for.
      * @returns The modules found or null if none were found.
      */
    inline def findModuleByProps(props: String*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findModuleByProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Searches for an internal Discord webpack module that has every property passed on its prototype.
      * @param props A series of prototype properties to check for
      * @returns The modules found or null if none were found..
      */
    inline def findModuleByPrototypes(props: String*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findModuleByPrototypes")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Returns BandagedBD's instance of the core module. Only use this if you know what you are doing.
      * @deprecated since 2020.3.27
      * @returns BBD's instantiated core module.
      */
    inline def getCore(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCore")().asInstanceOf[js.Any]
    
    // TODO: This should not return 'any' but instead 'Core'
    // Not worth it in my opinion because it's deprecated (commit caf3406e0a22a24dc5ad76d9c51edb3330d379b7)
    /**
      * Alias for loadData(pluginName, key)
      * @param pluginName Which plugin this is being used for.
      * @param key Key for which data should be returned.
      * @returns The information that was saved previously, or null otherwise.
      */
    inline def getData(pluginName: String, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * Gets the internal react instance for a particular node.
      * @param node jQuery
      * @returns The instance if found or undefined otherwise.
      */
    inline def getInternalInstance(node: HTMLElement): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalInstance")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object]]
    
    /**
      * Gets the instance of another plugin with the name `name`.
      * @deprecated since unknown
      * @param name Name of the plugin to retreive.
      * @returns The plugin if found or null otherwise.
      */
    inline def getPlugin(name: String): js.Object | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(name.asInstanceOf[js.Any]).asInstanceOf[js.Object | Null]
    
    /**
      * Adds a block of css to the current document's `head`.
      * @param id Identifier for the node to be added. Can be used later with `clearCSS` from above.
      * @param css String of css to be added.
      * @returns The plugin if found or null otherwise.
      */
    inline def injectCSS(id: String, css: String): js.Object | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("injectCSS")(id.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[js.Object | Null]
    
    /**
      * Links some remote JavaScript to be added to the page. Useful for libraries like `Sortable.js`.
      * @param id Identifier for the node to be added. Can be used later with `unlinkJS` below.
      * @param url URL of the js.
      */
    inline def linkJS(id: String, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linkJS")(id.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gets some saved data for plugin `pluginName` with key `key`. Data can be saved with `saveData`.
      * @param pluginName Which plugin this is being used for.
      * @param key Key for which data should be returned.
      * @returns The information that was saved previously, or null otherwise.
      */
    inline def loadData(pluginName: String, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("loadData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * This function monkey-patches a method on an object. The patching callback may be run before, after or instead of target method.
      * - Be careful when monkey-patching. Think not only about original functionality of target method and your changes,
      * but also about developers of other plugins, who may also patch this method before or after you.
      * Try to change target method behaviour as little as possible, and avoid changing method signatures.
      * - Display name of patched method is changed, so you can see if a function has been patched (and how many times) while debugging or in the stack trace.
      * Also, patched methods have property `__monkeyPatched` set to `true`, in case you want to check something programmatically.
      * @param module Object to be patched. You can can also pass class prototypes to patch all class instances.
      * @param methodName The name of the target message to be patched.
      * @param options Options object. You should provide at least one of `before`, `after` or `instead` parameters. Other parameters are optional.
      * @param options.once Set to `true` if you want to automatically unpatch method after first call.
      * @param options.silent Set to `true` if you want to suppress log messages about patching and unpatching.
      * Useful to avoid clogging the console in case of frequent conditional patching/unpatching, for example from another monkeyPatch callback.
      * @param options.displayName You can provide meaningful name for class/object provided in `what` param for logging purposes.
      * By default, this function will try to determine name automatically.
      * @param options.before Callback that will be called before original target method call. You can modify arguments here, so it will be passed to original method.Can be combined with `after`.
      * @param options.after Callback that will be called after original target method call. You can modify return value here, so it will be passed to external code which calls target method.
      * Can be combined with `before`.
      * @param options.instead Callback that will be called instead of original target method call.
      * You can get access to original method using `originalMethod` parameter if you want to call it, but you do not have to.
      * Can't be combined with `before` and `after`.
      * @returns A cancel function which allows you to undo the patch.
      */
    inline def monkeyPatch(module: js.Object, methodName: String, options: MonkeyPatchOptions): CancelPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("monkeyPatch")(module.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelPatch]
    
    /**
      * Adds a listener for when the node is removed from the document body.
      * @param node Node to wait for.
      * @param callback Function to be performed on event.
      */
    inline def onRemoved(node: HTMLElement, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onRemoved")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Saved some `data` for plugin `pluginName` under `key` key. Gets saved in the plugins folder under `pluginName.config.json`. Data can be saved with `loadData`.
      * @param pluginName Which plugin this is being used for.
      * @param key Key for the data should be saved under.
      * @param data Data to save.
      */
    inline def saveData(pluginName: String, key: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Yields the total active height of the application.
      */
    @JSImport("@bandagedbd/bdapi", "BdApiModule.screenHeight")
    @js.native
    val screenHeight: Double = js.native
    
    /**
      * Yields the total active width of the application.
      */
    @JSImport("@bandagedbd/bdapi", "BdApiModule.screenWidth")
    @js.native
    val screenWidth: Double = js.native
    
    /**
      * Alias for saveData(pluginName, key, data)
      * @param pluginName Which plugin this is being used for.
      * @param key Key for the data should be saved under.
      * @param data Data to save.
      */
    inline def setData(pluginName: String, key: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gives access to BBD's internal settings object and is therefore subject to change.
      */
    @JSImport("@bandagedbd/bdapi", "BdApiModule.settings")
    @js.native
    val settings: js.Any = js.native
    
    /**
      * Shows a generic but very customizable confirmation modal with optional confirm and cancel callbacks.
      * @param title Title of the modal.
      * @param content A single or mixed array of react elements and strings. Everything is wrapped in Discord's `TextElement` component so strings will show and render properly.
      * @param options Options to modify the modal.
      * @param options.danger Whether the main button should be red or not.
      * @param options.confirmText Text for the confirmation/submit button.
      * @param options.canceltext Text for the cancel button.
      * @param options.onConfirm Callback to occur when clicking the submit button.
      * @param options.onCancel Callback to occur when clicking the cancel button.
      */
    inline def showConfirmationModal(title: String, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showConfirmationModal")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def showConfirmationModal(title: String, content: String, options: ConfirmationModalOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showConfirmationModal")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Shows a simple toast message similar to on Android. An example of the `success` toast can be seen [here](https://i.zackrauen.com/zIagVa.png).
      * @param content Content to show inside the toast.
      * @param options Options for the toast.
      * @param options.type Changes the type of the toast stylistically and semantically. Choices: "", "info", "success", "danger"/"error", "warning"/"warn". Default: ""
      * @param options.icon Determines whether the icon should show corresponding to the type. A toast without type will always have no icon. Default: true
      * @param options.timeout Adjusts the time (in ms) the toast should be shown for before disappearing automatically. Default: 3000
      */
    inline def showToast(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showToast")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def showToast(content: String, options: ToastOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showToast")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wraps a function in a try catch block.
      * @param method Function to wrap.
      * @param message Additional info for any errors.
      */
    inline def suppressErrors(method: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressErrors")(method.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
    inline def suppressErrors(method: js.Function0[Unit], message: String): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("suppressErrors")(method.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    /**
      * Determines if the input is valid and parseable JSON.
      * @param data Data to test.
      * @returns True if the data is valid, false otherwise.
      */
    inline def testJSON(data: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("testJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Toggles a BBD setting by id.
      * @param id Id for the setting.
      */
    inline def toggleOption(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleOption")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Removes some previously linked JS by `linkJS`.
      * @param id ID of the node to remove.
      */
    inline def unlinkJS(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkJS")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  type CancelPatch = js.Function0[Unit]
  
  trait ConfirmationModalOptions extends StObject {
    
    var cancelText: js.UndefOr[String] = js.undefined
    
    var confirmText: js.UndefOr[String] = js.undefined
    
    var danger: js.UndefOr[Boolean] = js.undefined
    
    var onCancel: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onConfirm: js.UndefOr[js.Function0[js.Any]] = js.undefined
  }
  object ConfirmationModalOptions {
    
    inline def apply(): ConfirmationModalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmationModalOptions]
    }
    
    extension [Self <: ConfirmationModalOptions](x: Self) {
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
      
      inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
      
      inline def setDanger(value: Boolean): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      inline def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
      
      inline def setOnCancel(value: () => js.Any): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnConfirm(value: () => js.Any): Self = StObject.set(x, "onConfirm", js.Any.fromFunction0(value))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    }
  }
  
  trait MonkeyPatchOptions extends StObject {
    
    var after: js.UndefOr[PatchFunction] = js.undefined
    
    var before: js.UndefOr[PatchFunction] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var instead: js.UndefOr[PatchFunction] = js.undefined
    
    var once: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object MonkeyPatchOptions {
    
    inline def apply(): MonkeyPatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MonkeyPatchOptions]
    }
    
    extension [Self <: MonkeyPatchOptions](x: Self) {
      
      inline def setAfter(value: /* data */ PatchData => js.Any): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: /* data */ PatchData => js.Any): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setInstead(value: /* data */ PatchData => js.Any): Self = StObject.set(x, "instead", js.Any.fromFunction1(value))
      
      inline def setInsteadUndefined: Self = StObject.set(x, "instead", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait PatchData extends StObject {
    
    var CancelPatch: typings.bandagedbdBdapi.mod.CancelPatch
    
    def callOriginalMethod(): Unit
    
    var methodArguments: js.Array[js.Any]
    
    def originalMethod(): Unit
    
    var returnValue: js.Any
    
    var thisObject: js.Object
  }
  object PatchData {
    
    inline def apply(
      CancelPatch: () => Unit,
      callOriginalMethod: () => Unit,
      methodArguments: js.Array[js.Any],
      originalMethod: () => Unit,
      returnValue: js.Any,
      thisObject: js.Object
    ): PatchData = {
      val __obj = js.Dynamic.literal(CancelPatch = js.Any.fromFunction0(CancelPatch), callOriginalMethod = js.Any.fromFunction0(callOriginalMethod), methodArguments = methodArguments.asInstanceOf[js.Any], originalMethod = js.Any.fromFunction0(originalMethod), returnValue = returnValue.asInstanceOf[js.Any], thisObject = thisObject.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatchData]
    }
    
    extension [Self <: PatchData](x: Self) {
      
      inline def setCallOriginalMethod(value: () => Unit): Self = StObject.set(x, "callOriginalMethod", js.Any.fromFunction0(value))
      
      inline def setCancelPatch(value: () => Unit): Self = StObject.set(x, "CancelPatch", js.Any.fromFunction0(value))
      
      inline def setMethodArguments(value: js.Array[js.Any]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
      
      inline def setMethodArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "methodArguments", js.Array(value :_*))
      
      inline def setOriginalMethod(value: () => Unit): Self = StObject.set(x, "originalMethod", js.Any.fromFunction0(value))
      
      inline def setReturnValue(value: js.Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setThisObject(value: js.Object): Self = StObject.set(x, "thisObject", value.asInstanceOf[js.Any])
    }
  }
  
  type PatchFunction = js.Function1[/* data */ PatchData, js.Any]
  
  trait ToastOptions extends StObject {
    
    var icon: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToastOptions {
    
    inline def apply(): ToastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOptions]
    }
    
    extension [Self <: ToastOptions](x: Self) {
      
      inline def setIcon(value: Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
