package typings
package cssDashModulesDashRequireDashHookLib.cssDashModulesDashRequireDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Appends custom plugins to the end of the PostCSS pipeline. */
  var append: js.UndefOr[js.Array[_]] = js.undefined
  /** Camelizes exported class names. */
  var camelCase: js.UndefOr[scala.Boolean] = js.undefined
  /** Short alias for the postcss-modules-extract-imports plugin's createImportedName option. */
  var createImportedName: js.UndefOr[js.Function] = js.undefined
  /** Helps you to invalidate cache of all require calls. */
  var devMode: js.UndefOr[scala.Boolean] = js.undefined
  /** Attach the require hook to additional file extensions. */
  var extensions: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Short alias for the postcss-modules-scope plugin's option. */
  var generateScopedName: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /** Short alias for the generic-names helper option. */
  var hashPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Provides possibility to exclude particular files from processing. */
  var ignore: js.UndefOr[
    java.lang.String | stdLib.RegExp | (js.Function1[/* filepath */ java.lang.String, scala.Boolean])
  ] = js.undefined
  /** Short alias for the postcss-modules-local-by-default plugin's option. */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /** Prepends custom plugins to the beginning of the PostCSS pipeline. */
  var prepend: js.UndefOr[js.Array[_]] = js.undefined
  /** In rare cases you may want to precompile styles, before they will be passed to the PostCSS pipeline. */
  var preprocessCss: js.UndefOr[js.Function] = js.undefined
  /** In rare cases you may want to get compiled styles in runtime, so providing this option helps. */
  var processCss: js.UndefOr[js.Function] = js.undefined
  /** Provides possibility to pass custom options to the LazyResult instance. */
  var processorOpts: js.UndefOr[js.Object] = js.undefined
  /** Provides absolute path to the project directory. */
  var rootDir: js.UndefOr[java.lang.String] = js.undefined
  /** Provides the full list of PostCSS plugins to the pipeline. */
  var use: js.UndefOr[js.Array[_]] = js.undefined
}

