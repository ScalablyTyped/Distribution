package typings.builderIoPartytown

import typings.std.Location
import typings.std.URL
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationMod {
  
  @JSImport("@builder.io/partytown/integration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@builder.io/partytown/integration", "SCRIPT_TYPE")
  @js.native
  val SCRIPT_TYPE: /* "text/partytown" */ String = js.native
  
  inline def partytownSnippet(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("partytownSnippet")().asInstanceOf[String]
  inline def partytownSnippet(config: PartytownConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("partytownSnippet")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ApplyHook = js.Function1[/* opts */ ApplyHookOptions, Any]
  
  /**
    * @public
    */
  trait ApplyHookOptions
    extends StObject
       with HookOptions {
    
    var args: js.Array[Any]
  }
  object ApplyHookOptions {
    
    inline def apply(args: js.Array[Any], continue: js.Symbol, instance: WorkerInstance, name: String, window: Window): ApplyHookOptions = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], continue = continue.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyHookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplyHookOptions] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    }
  }
  
  type GetHook = js.Function1[/* opts */ GetHookOptions, Any]
  
  /**
    * @public
    */
  type GetHookOptions = HookOptions
  
  trait HookOptions extends StObject {
    
    var constructor: js.UndefOr[String] = js.undefined
    
    var continue: js.Symbol
    
    var instance: WorkerInstance
    
    var name: String
    
    var nodeName: js.UndefOr[String] = js.undefined
    
    var window: Window
  }
  object HookOptions {
    
    inline def apply(continue: js.Symbol, instance: WorkerInstance, name: String, window: Window): HookOptions = {
      val __obj = js.Dynamic.literal(continue = continue.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HookOptions] (val x: Self) extends AnyVal {
      
      inline def setConstructor(value: String): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setContinue(value: js.Symbol): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: WorkerInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
  
  type InstanceId = String
  
  trait PartytownConfig extends StObject {
    
    @JSName("apply")
    var apply: js.UndefOr[ApplyHook] = js.undefined
    
    /**
      * When set to `true`, Partytown scripts are not inlined and not minified.
      *
      * https://partytown.builder.io/debugging
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Many third-party scripts provide a global variable which user code calls
      * in order to send data to the service. For example, Google Tag Manager uses
      * a [Data Layer](https://developers.google.com/tag-manager/devguide) array,
      * and by pushing data to the array, the data is then sent on to GTM. Because
      * we're moving third-party scripts to a web worker, the main thread needs to
      * know which variables to patch first, and when Partytown loads, it can then
      * forward the event data on to the service.
      *
      * Below is an example of Google Tag Manager and Facebook Pixel:
      *
      * ```js
      * ['dataLayer.push', 'fbq']
      * ```
      *
      * https://partytown.builder.io/forwarding-events
      */
    var forward: js.UndefOr[js.Array[PartytownForwardProperty]] = js.undefined
    
    var get: js.UndefOr[GetHook] = js.undefined
    
    /**
      * Rarely, a script will add a named function to the global scope with the
      * intent that other scripts can call the named function (like Adobe Launch).
      * Due to how Partytown scopes each script, these named functions do not get
      * added to `window`. The `globalFns` config can be used to manually ensure
      * each function is added to the global scope. Consider this an escape hatch
      * when a third-party script rudely pollutes `window` with functions.
      */
    var globalFns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An absolute path to the root directory which Partytown library files
      * can be found. The library path must start and end with a `/`.
      * By default the files will load from the server's `/~partytown/` directory.
      * Note that the library path must be on the same origin as the html document,
      * and is also used as the `scope` of the Partytown service worker.
      */
    var lib: js.UndefOr[String] = js.undefined
    
    /**
      * This array can be used to filter which script are executed via
      * Partytown and which you would like to execute on the main thread.
      *
      * @example loadScriptsOnMainThread:['https://test.com/analytics.js', 'inline-script-id']
      * // Loads the `https://test.com/analytics.js` script on the main thread
      */
    var loadScriptsOnMainThread: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Log method calls (debug mode required)
      */
    var logCalls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Log getter calls (debug mode required)
      */
    var logGetters: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Log Image() src requests (debug mode required)
      */
    var logImageRequests: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Log calls to main access, which also shows how many tasks were sent per message (debug mode required)
      */
    var logMainAccess: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Log script executions (debug mode required)
      */
    var logScriptExecution: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Log navigator.sendBeacon() requests (debug mode required)
      */
    var logSendBeaconRequests: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Log setter calls (debug mode required)
      */
    var logSetters: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Log stack traces (debug mode required)
      */
    var logStackTraces: js.UndefOr[Boolean] = js.undefined
    
    var mainWindowAccessors: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The `resolveUrl()` hook can be used to modify the URL about to be
      * requested, which could be used to rewrite urls so they go through a proxy.
      *
      * https://partytown.builder.io/proxying-requests
      *
      * @param url - The URL to be resolved. This is a URL https://developer.mozilla.org/en-US/docs/Web/API/URL, not a string.
      * @param location - The current window location.
      * @param type - The type of resource the url is being resolved for. For example, `fetch` is the value when resolving for `fetch()`, and `a` would be the value when resolving for an anchor element's `href`.
      * @returns The returned value must be a URL interface, otherwise the default resolved URL is used.
      */
    var resolveUrl: js.UndefOr[
        js.Function3[
          /* url */ URL, 
          /* location */ Location, 
          /* type */ ResolveUrlType, 
          js.UndefOr[URL | Null]
        ]
      ] = js.undefined
    
    /**
      * The css selector where the sandbox should be placed.
      * Default: body
      */
    var sandboxParent: js.UndefOr[String] = js.undefined
    
    var set: js.UndefOr[SetHook] = js.undefined
    
    /**
      * Path to the service worker file. Defaults to `partytown-sw.js`.
      */
    var swPath: js.UndefOr[String] = js.undefined
  }
  object PartytownConfig {
    
    inline def apply(): PartytownConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartytownConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartytownConfig] (val x: Self) extends AnyVal {
      
      inline def setApply(value: /* opts */ ApplyHookOptions => Any): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setForward(value: js.Array[PartytownForwardProperty]): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
      
      inline def setForwardVarargs(value: PartytownForwardProperty*): Self = StObject.set(x, "forward", js.Array(value*))
      
      inline def setGet(value: /* opts */ GetHookOptions => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setGlobalFns(value: js.Array[String]): Self = StObject.set(x, "globalFns", value.asInstanceOf[js.Any])
      
      inline def setGlobalFnsUndefined: Self = StObject.set(x, "globalFns", js.undefined)
      
      inline def setGlobalFnsVarargs(value: String*): Self = StObject.set(x, "globalFns", js.Array(value*))
      
      inline def setLib(value: String): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      inline def setLoadScriptsOnMainThread(value: js.Array[String]): Self = StObject.set(x, "loadScriptsOnMainThread", value.asInstanceOf[js.Any])
      
      inline def setLoadScriptsOnMainThreadUndefined: Self = StObject.set(x, "loadScriptsOnMainThread", js.undefined)
      
      inline def setLoadScriptsOnMainThreadVarargs(value: String*): Self = StObject.set(x, "loadScriptsOnMainThread", js.Array(value*))
      
      inline def setLogCalls(value: Boolean): Self = StObject.set(x, "logCalls", value.asInstanceOf[js.Any])
      
      inline def setLogCallsUndefined: Self = StObject.set(x, "logCalls", js.undefined)
      
      inline def setLogGetters(value: Boolean): Self = StObject.set(x, "logGetters", value.asInstanceOf[js.Any])
      
      inline def setLogGettersUndefined: Self = StObject.set(x, "logGetters", js.undefined)
      
      inline def setLogImageRequests(value: Boolean): Self = StObject.set(x, "logImageRequests", value.asInstanceOf[js.Any])
      
      inline def setLogImageRequestsUndefined: Self = StObject.set(x, "logImageRequests", js.undefined)
      
      inline def setLogMainAccess(value: Boolean): Self = StObject.set(x, "logMainAccess", value.asInstanceOf[js.Any])
      
      inline def setLogMainAccessUndefined: Self = StObject.set(x, "logMainAccess", js.undefined)
      
      inline def setLogScriptExecution(value: Boolean): Self = StObject.set(x, "logScriptExecution", value.asInstanceOf[js.Any])
      
      inline def setLogScriptExecutionUndefined: Self = StObject.set(x, "logScriptExecution", js.undefined)
      
      inline def setLogSendBeaconRequests(value: Boolean): Self = StObject.set(x, "logSendBeaconRequests", value.asInstanceOf[js.Any])
      
      inline def setLogSendBeaconRequestsUndefined: Self = StObject.set(x, "logSendBeaconRequests", js.undefined)
      
      inline def setLogSetters(value: Boolean): Self = StObject.set(x, "logSetters", value.asInstanceOf[js.Any])
      
      inline def setLogSettersUndefined: Self = StObject.set(x, "logSetters", js.undefined)
      
      inline def setLogStackTraces(value: Boolean): Self = StObject.set(x, "logStackTraces", value.asInstanceOf[js.Any])
      
      inline def setLogStackTracesUndefined: Self = StObject.set(x, "logStackTraces", js.undefined)
      
      inline def setMainWindowAccessors(value: js.Array[String]): Self = StObject.set(x, "mainWindowAccessors", value.asInstanceOf[js.Any])
      
      inline def setMainWindowAccessorsUndefined: Self = StObject.set(x, "mainWindowAccessors", js.undefined)
      
      inline def setMainWindowAccessorsVarargs(value: String*): Self = StObject.set(x, "mainWindowAccessors", js.Array(value*))
      
      inline def setResolveUrl(
        value: (/* url */ URL, /* location */ Location, /* type */ ResolveUrlType) => js.UndefOr[URL | Null]
      ): Self = StObject.set(x, "resolveUrl", js.Any.fromFunction3(value))
      
      inline def setResolveUrlUndefined: Self = StObject.set(x, "resolveUrl", js.undefined)
      
      inline def setSandboxParent(value: String): Self = StObject.set(x, "sandboxParent", value.asInstanceOf[js.Any])
      
      inline def setSandboxParentUndefined: Self = StObject.set(x, "sandboxParent", js.undefined)
      
      inline def setSet(value: /* opts */ SetHookOptions => Any): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setSwPath(value: String): Self = StObject.set(x, "swPath", value.asInstanceOf[js.Any])
      
      inline def setSwPathUndefined: Self = StObject.set(x, "swPath", js.undefined)
    }
  }
  
  type PartytownForwardProperty = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.builderIoPartytown.builderIoPartytownStrings.fetch
    - typings.builderIoPartytown.builderIoPartytownStrings.xhr
    - typings.builderIoPartytown.builderIoPartytownStrings.script
    - typings.builderIoPartytown.builderIoPartytownStrings.iframe
    - typings.builderIoPartytown.builderIoPartytownStrings.image
  */
  trait ResolveUrlType extends StObject
  object ResolveUrlType {
    
    inline def fetch: typings.builderIoPartytown.builderIoPartytownStrings.fetch = "fetch".asInstanceOf[typings.builderIoPartytown.builderIoPartytownStrings.fetch]
    
    inline def iframe: typings.builderIoPartytown.builderIoPartytownStrings.iframe = "iframe".asInstanceOf[typings.builderIoPartytown.builderIoPartytownStrings.iframe]
    
    inline def image: typings.builderIoPartytown.builderIoPartytownStrings.image = "image".asInstanceOf[typings.builderIoPartytown.builderIoPartytownStrings.image]
    
    inline def script: typings.builderIoPartytown.builderIoPartytownStrings.script = "script".asInstanceOf[typings.builderIoPartytown.builderIoPartytownStrings.script]
    
    inline def xhr: typings.builderIoPartytown.builderIoPartytownStrings.xhr = "xhr".asInstanceOf[typings.builderIoPartytown.builderIoPartytownStrings.xhr]
  }
  
  type SetHook = js.Function1[/* opts */ SetHookOptions, Any]
  
  /**
    * @public
    */
  trait SetHookOptions
    extends StObject
       with HookOptions {
    
    var prevent: js.Symbol
    
    var value: Any
  }
  object SetHookOptions {
    
    inline def apply(
      continue: js.Symbol,
      instance: WorkerInstance,
      name: String,
      prevent: js.Symbol,
      value: Any,
      window: Window
    ): SetHookOptions = {
      val __obj = js.Dynamic.literal(continue = continue.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prevent = prevent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetHookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetHookOptions] (val x: Self) extends AnyVal {
      
      inline def setPrevent(value: js.Symbol): Self = StObject.set(x, "prevent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type WinId = String
  
  @js.native
  trait WorkerInstance extends StObject
}
