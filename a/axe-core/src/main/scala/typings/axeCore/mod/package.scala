package typings.axeCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.axeCore.anon.Description
import typings.axeCore.anon.Enabled
import typings.axeCore.mod.^
import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Register a new reporter, optionally setting it as the default
  */
inline def addReporter[T](reporterName: String, reporter: AxeReporter[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addReporter")(reporterName.asInstanceOf[js.Any], reporter.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addReporter[T](reporterName: String, reporter: AxeReporter[T], isDefault: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addReporter")(reporterName.asInstanceOf[js.Any], reporter.asInstanceOf[js.Any], isDefault.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Function to clean up plugin configuration in document and its subframes
  */
inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]

/**
  * Method for configuring the data format used by axe. Helpful for adding new
  * rules, which must be registered with the library to execute.
  * @param  {Spec}       Spec Object with valid `branding`, `reporter`, `checks` and `rules` data
  */
inline def configure(spec: Spec): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(spec.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Create a report from axe.runPartial results
  * @param   {PartialResult[]}     partialResults  Results from axe.runPartial, calls in different frames on the page.
  * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
  */
inline def finishRun(partialResults: PartialResults, options: RunOptions): js.Promise[AxeResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("finishRun")(partialResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxeResults]]

/**
  * Set up alternative frame communication
  */
inline def frameMessenger(frameMessenger: FrameMessenger_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("frameMessenger")(frameMessenger.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Get a reporter based the name it is registered with
  */
inline def getReporter[T](reporterName: String): AxeReporter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReporter")(reporterName.asInstanceOf[js.Any]).asInstanceOf[AxeReporter[T]]

/**
  * Searches and returns rules that contain a tag in the list of tags.
  * @param  {Array}  tags  Optional array of tags
  * @return {Array}  Array of rules
  */
inline def getRules(): js.Array[RuleMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRules")().asInstanceOf[js.Array[RuleMetadata]]
inline def getRules(tags: js.Array[String]): js.Array[RuleMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRules")(tags.asInstanceOf[js.Any]).asInstanceOf[js.Array[RuleMetadata]]

/**
  * Check if a reporter is registered
  */
inline def hasReporter(reporterName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasReporter")(reporterName.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def plugins: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("plugins").asInstanceOf[Any]
inline def plugins_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])

/**
  * Function to register a plugin configuration in document and its subframes
  * @param  {Object}    plugin    A plugin configuration object
  */
inline def registerPlugin(plugin: AxePlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Restores the default axe configuration
  */
inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]

/**
  * Runs a number of rules against the provided HTML page and returns the resulting issue list
  *
  * @param   {ElementContext} context  Optional The `Context` specification object @see Context
  * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
  * @param   {RunCallback}    callback Optional The function to invoke when analysis is complete.
  * @returns {Promise<AxeResults>|void} If the callback was not defined, axe will return a Promise.
  */
inline def run[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[js.Promise[T]]
inline def run[T](callback: js.Function2[/* error */ js.Error, /* results */ T, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def run[T](context: ElementContext): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
inline def run[T](context: ElementContext, callback: RunCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def run[T](context: ElementContext, options: RunOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
inline def run[T](context: ElementContext, options: RunOptions, callback: RunCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def run[T](options: RunOptions): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
inline def run[T](options: RunOptions, callback: RunCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Run axe in the current window only
  * @param   {ElementContext} context  Optional The `Context` specification object @see Context
  * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
  * @returns {Promise<PartialResult>}  Partial result, for use in axe.finishRun.
  */
inline def runPartial(context: ElementContext, options: RunOptions): js.Promise[PartialResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runPartial")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PartialResult]]

/**
  * Setup axe-core so axe.common functions can work properly.
  */
inline def setup(): VirtualNode = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[VirtualNode]
inline def setup(node: Document): VirtualNode = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(node.asInstanceOf[js.Any]).asInstanceOf[VirtualNode]
inline def setup(node: Element): VirtualNode = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(node.asInstanceOf[js.Any]).asInstanceOf[VirtualNode]

/**
  * Source string to use as an injected script in Selenium
  */
inline def source: String = ^.asInstanceOf[js.Dynamic].selectDynamic("source").asInstanceOf[String]
inline def source_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("source")(x.asInstanceOf[js.Any])

/**
  * Clean up axe-core tree and caches. `axe.run` will call this function at the end of the run so there's no need to call it yourself afterwards.
  */
inline def teardown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("teardown")().asInstanceOf[Unit]

inline def utils: Utils_ = ^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[Utils_]
inline def utils_=(x: Utils_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])

type AxeReporter[T] = js.Function3[
/* rawResults */ js.Array[RawResult], 
/* option */ RunOptions, 
/* callback */ js.Function1[/* report */ T, Unit], 
Unit]

// Selectors within a frame
type BaseSelector = String

type CheckLocale = StringDictionary[CheckMessages]

type Close = js.Function

/**
  * @deprecated Use UnlabelledFrameSelector instead
  */
type CrossFrameSelector = UnlabelledFrameSelector

type CrossTreeSelector = BaseSelector | ShadowDomSelector

/* Rewritten from type alias, can be one of: 
  - typings.axeCore.mod.Selector
  - typings.axeCore.mod.SelectorList
  - typings.axeCore.mod.ContextObject
*/
type ElementContext = _ElementContext | SelectorList | Node | BaseSelector

// Cross-frame selectors
type FramesSelector = js.Array[CrossTreeSelector | LabelledShadowDomSelector]

/* Rewritten from type alias, can be one of: 
  - typings.axeCore.axeCoreStrings.minor
  - typings.axeCore.axeCoreStrings.moderate
  - typings.axeCore.axeCoreStrings.serious
  - typings.axeCore.axeCoreStrings.critical
  - scala.Null
*/
type ImpactValue = _ImpactValue | Null

// Array of length 2 or greater
type MultiArray[T] = Array[T]

type PartialResults = js.Array[PartialResult | Null]

type Responder = js.Function3[
/* message */ Any | js.Error, 
/* keepalive */ js.UndefOr[Boolean], 
/* replyHandler */ js.UndefOr[ReplyHandler], 
Unit]

type RuleLocale = StringDictionary[Description]

type RuleObject = StringDictionary[Enabled]

type RunCallback[T] = js.Function2[/* error */ js.Error, /* results */ T, Unit]

// Context options
/* Rewritten from type alias, can be one of: 
  - typings.std.Node
  - typings.axeCore.mod.BaseSelector
  - typings.axeCore.mod.LabelledShadowDomSelector
  - typings.axeCore.mod.LabelledFramesSelector
*/
type Selector = _Selector | Node | BaseSelector

type SelectorList = (js.Array[Selector | FramesSelector]) | NodeList

type SerialFrameSelector = SerialSelector | FramesSelector

/* Rewritten from type alias, can be one of: 
  - typings.axeCore.mod.BaseSelector
  - typings.axeCore.mod.LabelledShadowDomSelector
  - typings.axeCore.mod.LabelledFramesSelector
*/
type SerialSelector = _SerialSelector | BaseSelector

type SerialSelectorList = js.Array[SerialFrameSelector]

type ShadowDomSelector = MultiArray[BaseSelector]

type TagValue = String

type TopicHandler = js.Function2[/* data */ TopicData, /* responder */ Responder, Unit]

type UnlabelledFrameSelector = js.Array[CrossTreeSelector]
