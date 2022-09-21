package typings.axeCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.axeCore.anon.Description
import typings.axeCore.anon.Enabled
import typings.axeCore.anon.Fail
import typings.axeCore.mod.^
import typings.std.Node
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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
  * Searches and returns rules that contain a tag in the list of tags.
  * @param  {Array}  tags  Optional array of tags
  * @return {Array}  Array of rules
  */
inline def getRules(): js.Array[RuleMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRules")().asInstanceOf[js.Array[RuleMetadata]]
inline def getRules(tags: js.Array[String]): js.Array[RuleMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRules")(tags.asInstanceOf[js.Any]).asInstanceOf[js.Array[RuleMetadata]]

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
inline def run(): js.Promise[AxeResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[js.Promise[AxeResults]]
inline def run(callback: js.Function2[/* error */ js.Error, /* results */ AxeResults, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def run(context: ElementContext): js.Promise[AxeResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AxeResults]]
inline def run(context: ElementContext, callback: RunCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def run(context: ElementContext, options: RunOptions): js.Promise[AxeResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxeResults]]
inline def run(context: ElementContext, options: RunOptions, callback: RunCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def run(options: RunOptions): js.Promise[AxeResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AxeResults]]
inline def run(options: RunOptions, callback: RunCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Run axe in the current window only
  * @param   {ElementContext} context  Optional The `Context` specification object @see Context
  * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
  * @returns {Promise<PartialResult>}  Partial result, for use in axe.finishRun.
  */
inline def runPartial(context: ElementContext, options: RunOptions): js.Promise[PartialResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runPartial")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PartialResult]]

/**
  * Source string to use as an injected script in Selenium
  */
inline def source: String = ^.asInstanceOf[js.Dynamic].selectDynamic("source").asInstanceOf[String]
inline def source_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("source")(x.asInstanceOf[js.Any])

inline def utils: Utils_ = ^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[Utils_]
inline def utils_=(x: Utils_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])

type BaseSelector = String

type CheckLocale = StringDictionary[Fail]

type Close = js.Function

type CrossFrameSelector = js.Array[CrossTreeSelector]

type CrossTreeSelector = BaseSelector | js.Array[BaseSelector]

type ElementContext = Node | NodeList | String | ContextObject

/* Rewritten from type alias, can be one of: 
  - typings.axeCore.axeCoreStrings.minor
  - typings.axeCore.axeCoreStrings.moderate
  - typings.axeCore.axeCoreStrings.serious
  - typings.axeCore.axeCoreStrings.critical
  - scala.Null
*/
type ImpactValue = _ImpactValue | Null

type PartialResults = js.Array[PartialResult | Null]

type Responder = js.Function3[
/* message */ Any | js.Error, 
/* keepalive */ js.UndefOr[Boolean], 
/* replyHandler */ js.UndefOr[ReplyHandler], 
Unit]

type RuleLocale = StringDictionary[Description]

type RuleObject = StringDictionary[Enabled]

type RunCallback = js.Function2[/* error */ js.Error, /* results */ AxeResults, Unit]

type TagValue = String

type TopicHandler = js.Function2[/* data */ TopicData, /* responder */ Responder, Unit]
