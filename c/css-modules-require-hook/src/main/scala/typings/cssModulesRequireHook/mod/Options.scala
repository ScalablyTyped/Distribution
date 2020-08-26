package typings.cssModulesRequireHook.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Appends custom plugins to the end of the PostCSS pipeline. */
  var append: js.UndefOr[js.Array[_]] = js.native
  /** Camelizes exported class names. */
  var camelCase: js.UndefOr[Boolean] = js.native
  /** Short alias for the postcss-modules-extract-imports plugin's createImportedName option. */
  var createImportedName: js.UndefOr[js.Function] = js.native
  /** Helps you to invalidate cache of all require calls. */
  var devMode: js.UndefOr[Boolean] = js.native
  /** Attach the require hook to additional file extensions. */
  var extensions: js.UndefOr[String | js.Array[String]] = js.native
  /** Short alias for the postcss-modules-scope plugin's option. */
  var generateScopedName: js.UndefOr[String | js.Function] = js.native
  /** Short alias for the generic-names helper option. */
  var hashPrefix: js.UndefOr[String] = js.native
  /** Provides possibility to exclude particular files from processing. */
  var ignore: js.UndefOr[String | RegExp | (js.Function1[/* filepath */ String, Boolean])] = js.native
  /** Short alias for the postcss-modules-local-by-default plugin's option. */
  var mode: js.UndefOr[String] = js.native
  /** Prepends custom plugins to the beginning of the PostCSS pipeline. */
  var prepend: js.UndefOr[js.Array[_]] = js.native
  /** In rare cases you may want to precompile styles, before they will be passed to the PostCSS pipeline. */
  var preprocessCss: js.UndefOr[js.Function] = js.native
  /** In rare cases you may want to get compiled styles in runtime, so providing this option helps. */
  var processCss: js.UndefOr[js.Function] = js.native
  /** Provides possibility to pass custom options to the LazyResult instance. */
  var processorOpts: js.UndefOr[js.Object] = js.native
  /** Provides absolute path to the project directory. */
  var rootDir: js.UndefOr[String] = js.native
  /** Provides the full list of PostCSS plugins to the pipeline. */
  var use: js.UndefOr[js.Array[_]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendVarargs(value: js.Any*): Self = this.set("append", js.Array(value :_*))
    @scala.inline
    def setAppend(value: js.Array[_]): Self = this.set("append", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setCamelCase(value: Boolean): Self = this.set("camelCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCamelCase: Self = this.set("camelCase", js.undefined)
    @scala.inline
    def setCreateImportedName(value: js.Function): Self = this.set("createImportedName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateImportedName: Self = this.set("createImportedName", js.undefined)
    @scala.inline
    def setDevMode(value: Boolean): Self = this.set("devMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevMode: Self = this.set("devMode", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: String | js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setGenerateScopedName(value: String | js.Function): Self = this.set("generateScopedName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateScopedName: Self = this.set("generateScopedName", js.undefined)
    @scala.inline
    def setHashPrefix(value: String): Self = this.set("hashPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashPrefix: Self = this.set("hashPrefix", js.undefined)
    @scala.inline
    def setIgnoreFunction1(value: /* filepath */ String => Boolean): Self = this.set("ignore", js.Any.fromFunction1(value))
    @scala.inline
    def setIgnore(value: String | RegExp | (js.Function1[/* filepath */ String, Boolean])): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPrependVarargs(value: js.Any*): Self = this.set("prepend", js.Array(value :_*))
    @scala.inline
    def setPrepend(value: js.Array[_]): Self = this.set("prepend", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
    @scala.inline
    def setPreprocessCss(value: js.Function): Self = this.set("preprocessCss", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreprocessCss: Self = this.set("preprocessCss", js.undefined)
    @scala.inline
    def setProcessCss(value: js.Function): Self = this.set("processCss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessCss: Self = this.set("processCss", js.undefined)
    @scala.inline
    def setProcessorOpts(value: js.Object): Self = this.set("processorOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessorOpts: Self = this.set("processorOpts", js.undefined)
    @scala.inline
    def setRootDir(value: String): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDir: Self = this.set("rootDir", js.undefined)
    @scala.inline
    def setUseVarargs(value: js.Any*): Self = this.set("use", js.Array(value :_*))
    @scala.inline
    def setUse(value: js.Array[_]): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
  
}

