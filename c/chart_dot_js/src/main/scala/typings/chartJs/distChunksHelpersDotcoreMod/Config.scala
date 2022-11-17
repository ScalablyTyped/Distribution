package typings.chartJs.distChunksHelpersDotcoreMod

import typings.chartJs.anon.AdditionalOptionScopes
import typings.chartJs.anon.AllKeys
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends StObject {
  
  /**
    * @private
    */
  /* private */ var _cachedScopes: Any = js.native
  
  var _config: Any = js.native
  
  var _resolverCache: Map[Any, Any] = js.native
  
  var _scopeCache: Map[Any, Any] = js.native
  
  /**
    * Returns the option scopes for resolving chart options
    * @return {object[]}
    */
  def chartOptionScopes(): js.Array[js.Object] = js.native
  
  def clearCache(): Unit = js.native
  
  /**
    * @param {object[]} scopes
    * @param {object} [context]
    * @param {string[]} [prefixes]
    * @param {{scriptable: boolean, indexable: boolean, allKeys?: boolean}} [descriptorDefaults]
    */
  def createResolver(scopes: js.Array[js.Object]): Any = js.native
  def createResolver(scopes: js.Array[js.Object], context: js.Object): Any = js.native
  def createResolver(scopes: js.Array[js.Object], context: js.Object, prefixes: js.Array[String]): Any = js.native
  def createResolver(
    scopes: js.Array[js.Object],
    context: js.Object,
    prefixes: js.Array[String],
    descriptorDefaults: AllKeys
  ): Any = js.native
  def createResolver(scopes: js.Array[js.Object], context: js.Object, prefixes: Unit, descriptorDefaults: AllKeys): Any = js.native
  def createResolver(scopes: js.Array[js.Object], context: Unit, prefixes: js.Array[String]): Any = js.native
  def createResolver(
    scopes: js.Array[js.Object],
    context: Unit,
    prefixes: js.Array[String],
    descriptorDefaults: AllKeys
  ): Any = js.native
  def createResolver(scopes: js.Array[js.Object], context: Unit, prefixes: Unit, descriptorDefaults: AllKeys): Any = js.native
  
  def data: Any = js.native
  def data_=(arg: Any): Unit = js.native
  
  /**
    * Returns the option scope keys for resolving dataset animation options.
    * These keys do not include the dataset itself, because it is not under options.
    * @param {string} datasetType
    * @param {string} transition
    * @return {string[][]}
    */
  def datasetAnimationScopeKeys(datasetType: String, transition: String): js.Array[js.Array[String]] = js.native
  
  /**
    * Returns the options scope keys for resolving element options that belong
    * to an dataset. These keys do not include the dataset itself, because it
    * is not under options.
    * @param {string} datasetType
    * @param {string} elementType
    * @return {string[][]}
    */
  def datasetElementScopeKeys(datasetType: String, elementType: String): js.Array[js.Array[String]] = js.native
  
  /**
    * Returns the option scope keys for resolving dataset options.
    * These keys do not include the dataset itself, because it is not under options.
    * @param {string} datasetType
    * @return {string[][]}
    */
  def datasetScopeKeys(datasetType: String): js.Array[js.Array[String]] = js.native
  
  /**
    * Resolves the objects from options and defaults for option value resolution.
    * @param {object} mainScope - The main scope object for options
    * @param {string[][]} keyLists - The arrays of keys in resolution order
    * @param {boolean} [resetCache] - reset the cache for this mainScope
    */
  def getOptionScopes(mainScope: js.Object, keyLists: js.Array[js.Array[String]]): Any = js.native
  def getOptionScopes(mainScope: js.Object, keyLists: js.Array[js.Array[String]], resetCache: Boolean): Any = js.native
  
  def options: Any = js.native
  def options_=(arg: Any): Unit = js.native
  
  def platform: Any = js.native
  
  /**
    * Returns the options scope keys for resolving plugin options.
    * @param {{id: string, additionalOptionScopes?: string[]}} plugin
    * @return {string[][]}
    */
  def pluginScopeKeys(plugin: AdditionalOptionScopes): js.Array[js.Array[String]] = js.native
  
  def plugins: Any = js.native
  
  /**
    * @param {object[]} scopes
    * @param {string[]} names
    * @param {function|object} context
    * @param {string[]} [prefixes]
    * @return {object}
    */
  def resolveNamedOptions(scopes: js.Array[js.Object], names: js.Array[String], context: js.Function): js.Object = js.native
  def resolveNamedOptions(
    scopes: js.Array[js.Object],
    names: js.Array[String],
    context: js.Function,
    prefixes: js.Array[String]
  ): js.Object = js.native
  def resolveNamedOptions(scopes: js.Array[js.Object], names: js.Array[String], context: js.Object): js.Object = js.native
  def resolveNamedOptions(
    scopes: js.Array[js.Object],
    names: js.Array[String],
    context: js.Object,
    prefixes: js.Array[String]
  ): js.Object = js.native
  
  def `type`: Any = js.native
  def type_=(arg: Any): Unit = js.native
  
  def update(): Unit = js.native
}
