package typings.cssModulesRequireHook.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Appends custom plugins to the end of the PostCSS pipeline. */
  var append: js.UndefOr[js.Array[_]] = js.undefined
  /** Camelizes exported class names. */
  var camelCase: js.UndefOr[Boolean] = js.undefined
  /** Short alias for the postcss-modules-extract-imports plugin's createImportedName option. */
  var createImportedName: js.UndefOr[js.Function] = js.undefined
  /** Helps you to invalidate cache of all require calls. */
  var devMode: js.UndefOr[Boolean] = js.undefined
  /** Attach the require hook to additional file extensions. */
  var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
  /** Short alias for the postcss-modules-scope plugin's option. */
  var generateScopedName: js.UndefOr[String | js.Function] = js.undefined
  /** Short alias for the generic-names helper option. */
  var hashPrefix: js.UndefOr[String] = js.undefined
  /** Provides possibility to exclude particular files from processing. */
  var ignore: js.UndefOr[String | RegExp | (js.Function1[/* filepath */ String, Boolean])] = js.undefined
  /** Short alias for the postcss-modules-local-by-default plugin's option. */
  var mode: js.UndefOr[String] = js.undefined
  /** Prepends custom plugins to the beginning of the PostCSS pipeline. */
  var prepend: js.UndefOr[js.Array[_]] = js.undefined
  /** In rare cases you may want to precompile styles, before they will be passed to the PostCSS pipeline. */
  var preprocessCss: js.UndefOr[js.Function] = js.undefined
  /** In rare cases you may want to get compiled styles in runtime, so providing this option helps. */
  var processCss: js.UndefOr[js.Function] = js.undefined
  /** Provides possibility to pass custom options to the LazyResult instance. */
  var processorOpts: js.UndefOr[js.Object] = js.undefined
  /** Provides absolute path to the project directory. */
  var rootDir: js.UndefOr[String] = js.undefined
  /** Provides the full list of PostCSS plugins to the pipeline. */
  var use: js.UndefOr[js.Array[_]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    append: js.Array[_] = null,
    camelCase: js.UndefOr[Boolean] = js.undefined,
    createImportedName: js.Function = null,
    devMode: js.UndefOr[Boolean] = js.undefined,
    extensions: String | js.Array[String] = null,
    generateScopedName: String | js.Function = null,
    hashPrefix: String = null,
    ignore: String | RegExp | (js.Function1[/* filepath */ String, Boolean]) = null,
    mode: String = null,
    prepend: js.Array[_] = null,
    preprocessCss: js.Function = null,
    processCss: js.Function = null,
    processorOpts: js.Object = null,
    rootDir: String = null,
    use: js.Array[_] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (!js.isUndefined(camelCase)) __obj.updateDynamic("camelCase")(camelCase.get.asInstanceOf[js.Any])
    if (createImportedName != null) __obj.updateDynamic("createImportedName")(createImportedName.asInstanceOf[js.Any])
    if (!js.isUndefined(devMode)) __obj.updateDynamic("devMode")(devMode.get.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (generateScopedName != null) __obj.updateDynamic("generateScopedName")(generateScopedName.asInstanceOf[js.Any])
    if (hashPrefix != null) __obj.updateDynamic("hashPrefix")(hashPrefix.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (prepend != null) __obj.updateDynamic("prepend")(prepend.asInstanceOf[js.Any])
    if (preprocessCss != null) __obj.updateDynamic("preprocessCss")(preprocessCss.asInstanceOf[js.Any])
    if (processCss != null) __obj.updateDynamic("processCss")(processCss.asInstanceOf[js.Any])
    if (processorOpts != null) __obj.updateDynamic("processorOpts")(processorOpts.asInstanceOf[js.Any])
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

