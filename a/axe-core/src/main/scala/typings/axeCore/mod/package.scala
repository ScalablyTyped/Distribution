package typings.axeCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CheckLocale = org.scalablytyped.runtime.StringDictionary[typings.axeCore.anon.Fail]
  
  type ElementContext = typings.std.Node | java.lang.String | typings.axeCore.mod.ContextObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.axeCore.axeCoreStrings.minor
    - typings.axeCore.axeCoreStrings.moderate
    - typings.axeCore.axeCoreStrings.serious
    - typings.axeCore.axeCoreStrings.critical
    - scala.Null
  */
  type ImpactValue = typings.axeCore.mod._ImpactValue | scala.Null
  
  type RuleLocale = org.scalablytyped.runtime.StringDictionary[typings.axeCore.anon.Description]
  
  type RuleObject = org.scalablytyped.runtime.StringDictionary[typings.axeCore.anon.Enabled]
  
  type RunCallback = js.Function2[
    /* error */ typings.std.Error, 
    /* results */ typings.axeCore.mod.AxeResults, 
    scala.Unit
  ]
  
  type TagValue = java.lang.String
  
  /**
  	 * Function to clean up plugin configuration in document and its subframes
  	 */
  @scala.inline
  def cleanup(): scala.Unit = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[scala.Unit]
  
  /**
  	 * Method for configuring the data format used by axe. Helpful for adding new
  	 * rules, which must be registered with the library to execute.
  	 * @param  {Spec}       Spec Object with valid `branding`, `reporter`, `checks` and `rules` data
  	 */
  @scala.inline
  def configure(spec: typings.axeCore.mod.Spec): scala.Unit = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("configure")(spec.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
  	 * Searches and returns rules that contain a tag in the list of tags.
  	 * @param  {Array}  tags  Optional array of tags
  	 * @return {Array}  Array of rules
  	 */
  @scala.inline
  def getRules(): js.Array[typings.axeCore.mod.RuleMetadata] = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getRules")().asInstanceOf[js.Array[typings.axeCore.mod.RuleMetadata]]
  @scala.inline
  def getRules(tags: js.Array[java.lang.String]): js.Array[typings.axeCore.mod.RuleMetadata] = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getRules")(tags.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.axeCore.mod.RuleMetadata]]
  
  @scala.inline
  def plugins: js.Any = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("plugins").asInstanceOf[js.Any]
  @scala.inline
  def plugins_=(x: js.Any): scala.Unit = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
  
  /**
  	 * Function to register a plugin configuration in document and its subframes
  	 * @param  {Object}    plugin    A plugin configuration object
  	 */
  @scala.inline
  def registerPlugin(plugin: typings.axeCore.mod.AxePlugin): scala.Unit = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
  	 * Restores the default axe configuration
  	 */
  @scala.inline
  def reset(): scala.Unit = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[scala.Unit]
  
  /**
  	 * Runs a number of rules against the provided HTML page and returns the resulting issue list
  	 *
  	 * @param   {ElementContext} context  Optional The `Context` specification object @see Context
  	 * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
  	 * @param   {RunCallback}    callback Optional The function to invoke when analysis is complete.
  	 * @returns {Promise<AxeResults>|void} If the callback was not defined, axe will return a Promise.
  	 */
  @scala.inline
  def run(): js.Promise[typings.axeCore.mod.AxeResults] = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[js.Promise[typings.axeCore.mod.AxeResults]]
  @scala.inline
  def run(
    callback: js.Function2[
      /* error */ typings.std.Error, 
      /* results */ typings.axeCore.mod.AxeResults, 
      scala.Unit
    ]
  ): scala.Unit = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def run(context: typings.axeCore.mod.ElementContext): js.Promise[typings.axeCore.mod.AxeResults] = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.axeCore.mod.AxeResults]]
  @scala.inline
  def run(context: typings.axeCore.mod.ElementContext, callback: typings.axeCore.mod.RunCallback): scala.Unit = (typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def run(context: typings.axeCore.mod.ElementContext, options: typings.axeCore.mod.RunOptions): js.Promise[typings.axeCore.mod.AxeResults] = (typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.axeCore.mod.AxeResults]]
  @scala.inline
  def run(
    context: typings.axeCore.mod.ElementContext,
    options: typings.axeCore.mod.RunOptions,
    callback: typings.axeCore.mod.RunCallback
  ): scala.Unit = (typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def run(options: typings.axeCore.mod.RunOptions): js.Promise[typings.axeCore.mod.AxeResults] = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.axeCore.mod.AxeResults]]
  @scala.inline
  def run(options: typings.axeCore.mod.RunOptions, callback: typings.axeCore.mod.RunCallback): scala.Unit = (typings.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
  	 * Source string to use as an injected script in Selenium
  	 */
  @scala.inline
  def source: java.lang.String = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("source").asInstanceOf[java.lang.String]
  @scala.inline
  def source_=(x: java.lang.String): scala.Unit = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].updateDynamic("source")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def version: java.lang.String = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  @scala.inline
  def version_=(x: java.lang.String): scala.Unit = typings.axeCore.mod.^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
