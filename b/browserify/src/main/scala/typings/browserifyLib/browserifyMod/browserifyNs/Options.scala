package typings
package browserifyLib.browserifyMod.browserifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options pertaining to a Browserify instance.
  */
trait Options extends CustomOptions {
  // sets the list of built-ins to use, which by default is set in lib/builtins.js in this distribution.
  var builtins: js.UndefOr[
    js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Boolean
  ] = js.undefined
  // set if external modules should be bundled. Defaults to true.
  var bundleExternal: js.UndefOr[scala.Boolean] = js.undefined
  // sets the algorithm used to parse out the common paths. Use false to turn this off, otherwise it uses the commondir module.
  var commondir: js.UndefOr[scala.Boolean] = js.undefined
  // When true, add a source map inline to the end of the bundle. This makes debugging easier because you can see all the original files if you are in a modern enough browser.
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  // When true, scan all files for process, global, __filename, and __dirname, defining as necessary.
  // With this option npm modules are more likely to work but bundling takes longer. Default true.
  var detectGlobals: js.UndefOr[scala.Boolean] = js.undefined
  // String, file object, or array of those types (they may be mixed) specifying entry file(s).
  var entries: js.UndefOr[InputFile | js.Array[InputFile]] = js.undefined
  // an array of optional extra extensions for the module lookup machinery to use when the extension has not been specified.
  // By default Browserify considers only .js and .json files in such cases.
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // defaults to 'require' in expose mode but you can use another name.
  var externalRequireName: js.UndefOr[java.lang.String] = js.undefined
  // disables converting module ids into numerical indexes. This is useful for preserving the original paths that a bundle was generated with.
  var fullPaths: js.UndefOr[scala.Boolean] = js.undefined
  // will be passed to insert-module-globals as the opts.vars parameter.
  var insertGlobalVars: js.UndefOr[
    insertDashModuleDashGlobalsLib.insertDashModuleDashGlobalsMod.InsertModuleGlobalsNs.VarsOption
  ] = js.undefined
  // When true, always insert process, global, __filename, and __dirname without analyzing the AST for faster builds but larger output bundles. Default false.
  var insertGlobals: js.UndefOr[scala.Boolean] = js.undefined
  // an array which will skip all require() and global parsing for each file in the array.
  // Use this for giant libs like jquery or threejs that don't have any requires or node-style globals but take forever to parse.
  var noParse: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // an array of directories that Browserify searches when looking for modules which are not referenced using relative path.
  // Can be absolute or relative to basedir. Equivalent of setting NODE_PATH environmental variable when calling Browserify command.
  var paths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // When a non-empty string, a standalone module is created with that name and a umd wrapper.
  // You can use namespaces in the standalone global export using a . in the string name as a separator, for example 'A.B.C'.
  // The global export will be sanitized and camel cased.
  var standalone: js.UndefOr[java.lang.String] = js.undefined
}

