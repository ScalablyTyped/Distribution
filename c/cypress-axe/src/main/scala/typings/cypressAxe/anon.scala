package typings.cypressAxe

import typings.axeCore.mod.AxePlugin
import typings.axeCore.mod.AxeReporter
import typings.axeCore.mod.AxeResults
import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.FrameMessenger_
import typings.axeCore.mod.PartialResult
import typings.axeCore.mod.PartialResults
import typings.axeCore.mod.RuleMetadata
import typings.axeCore.mod.RunCallback
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import typings.axeCore.mod.Utils_
import typings.axeCore.mod.VirtualNode
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofaxe extends StObject {
    
    /**
      * Object for axe Results
      */
    var AxeResults: typings.axeCore.mod.AxeResults = js.native
    
    /**
      * Register a new reporter, optionally setting it as the default
      */
    def addReporter[T](reporterName: String, reporter: AxeReporter[T]): Unit = js.native
    def addReporter[T](reporterName: String, reporter: AxeReporter[T], isDefault: Boolean): Unit = js.native
    
    /**
      * Function to clean up plugin configuration in document and its subframes
      */
    def cleanup(): Unit = js.native
    
    /**
      * Method for configuring the data format used by axe. Helpful for adding new
      * rules, which must be registered with the library to execute.
      * @param  {Spec}       Spec Object with valid `branding`, `reporter`, `checks` and `rules` data
      */
    def configure(spec: Spec): Unit = js.native
    
    /**
      * Create a report from axe.runPartial results
      * @param   {PartialResult[]}     partialResults  Results from axe.runPartial, calls in different frames on the page.
      * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
      */
    def finishRun(partialResults: PartialResults, options: RunOptions): js.Promise[AxeResults] = js.native
    
    /**
      * Set up alternative frame communication
      */
    def frameMessenger(frameMessenger: FrameMessenger_): Unit = js.native
    
    /**
      * Get a reporter based the name it is registered with
      */
    def getReporter[T](reporterName: String): AxeReporter[T] = js.native
    
    /**
      * Searches and returns rules that contain a tag in the list of tags.
      * @param  {Array}  tags  Optional array of tags
      * @return {Array}  Array of rules
      */
    def getRules(): js.Array[RuleMetadata] = js.native
    def getRules(tags: js.Array[String]): js.Array[RuleMetadata] = js.native
    
    /**
      * Check if a reporter is registered
      */
    def hasReporter(reporterName: String): Boolean = js.native
    
    var plugins: Any = js.native
    
    /**
      * Function to register a plugin configuration in document and its subframes
      * @param  {Object}    plugin    A plugin configuration object
      */
    def registerPlugin(plugin: AxePlugin): Unit = js.native
    
    /**
      * Restores the default axe configuration
      */
    def reset(): Unit = js.native
    
    /**
      * Runs a number of rules against the provided HTML page and returns the resulting issue list
      *
      * @param   {ElementContext} context  Optional The `Context` specification object @see Context
      * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
      * @param   {RunCallback}    callback Optional The function to invoke when analysis is complete.
      * @returns {Promise<AxeResults>|void} If the callback was not defined, axe will return a Promise.
      */
    def run[T](): js.Promise[T] = js.native
    def run[T](callback: js.Function2[/* error */ js.Error, /* results */ T, Unit]): Unit = js.native
    def run[T](context: ElementContext): js.Promise[T] = js.native
    def run[T](context: ElementContext, callback: RunCallback[T]): Unit = js.native
    def run[T](context: ElementContext, options: RunOptions): js.Promise[T] = js.native
    def run[T](context: ElementContext, options: RunOptions, callback: RunCallback[T]): Unit = js.native
    def run[T](options: RunOptions): js.Promise[T] = js.native
    def run[T](options: RunOptions, callback: RunCallback[T]): Unit = js.native
    
    /**
      * Run axe in the current window only
      * @param   {ElementContext} context  Optional The `Context` specification object @see Context
      * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
      * @returns {Promise<PartialResult>}  Partial result, for use in axe.finishRun.
      */
    def runPartial(context: ElementContext, options: RunOptions): js.Promise[PartialResult] = js.native
    
    /**
      * Setup axe-core so axe.common functions can work properly.
      */
    def setup(): VirtualNode = js.native
    def setup(node: Document): VirtualNode = js.native
    def setup(node: Element): VirtualNode = js.native
    
    /**
      * Source string to use as an injected script in Selenium
      */
    var source: String = js.native
    
    /**
      * Clean up axe-core tree and caches. `axe.run` will call this function at the end of the run so there's no need to call it yourself afterwards.
      */
    def teardown(): Unit = js.native
    
    var utils: Utils_ = js.native
    
    var version: String = js.native
  }
}
