package typings.browserPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Used if opts.preludePath is undefined, this is used to resolve the prelude.js file location, default: 'process.cwd()'
    */
  var basedir: js.UndefOr[String] = js.undefined
  /** A string to use in place of 'require' if opts.hasExports is specified, default is 'require'
    */
  var externalRequireName: js.UndefOr[String] = js.undefined
  /** Whether the bundle should include require= (or the opts.externalRequireName) so that
    * require() is available outside the bundle
    */
  var hasExports: js.UndefOr[Boolean] = js.undefined
  /** Specify a custom prelude, but know what you're doing first. See the prelude.js file in
    * this repo for the default prelude. If you specify a custom prelude, you must also specify
    * a valid opts.preludePath to the prelude source file for sourcemaps to work
    */
  var prelude: js.UndefOr[String] = js.undefined
  /** prelude.js path if a custom opts.prelude is specified
    */
  var preludePath: js.UndefOr[String] = js.undefined
  /** if given, the writable end of the stream will expect objects to be written to
    * it instead of expecting a stream of json text it will need to parse, default false
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  /** If given and source maps are computed, the opts.sourceMapPrefix string will be used instead of default: '//#'
    */
  var sourceMapPrefix: js.UndefOr[String] = js.undefined
  /** External string name to use for UMD, if not provided, UMD declaration is not wrapped around output
    */
  var standalone: js.UndefOr[String] = js.undefined
  /** Sets the internal module name to export for standalone
    */
  var standaloneModule: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basedir: String = null,
    externalRequireName: String = null,
    hasExports: js.UndefOr[Boolean] = js.undefined,
    prelude: String = null,
    preludePath: String = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    sourceMapPrefix: String = null,
    standalone: String = null,
    standaloneModule: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    if (externalRequireName != null) __obj.updateDynamic("externalRequireName")(externalRequireName.asInstanceOf[js.Any])
    if (!js.isUndefined(hasExports)) __obj.updateDynamic("hasExports")(hasExports.asInstanceOf[js.Any])
    if (prelude != null) __obj.updateDynamic("prelude")(prelude.asInstanceOf[js.Any])
    if (preludePath != null) __obj.updateDynamic("preludePath")(preludePath.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (sourceMapPrefix != null) __obj.updateDynamic("sourceMapPrefix")(sourceMapPrefix.asInstanceOf[js.Any])
    if (standalone != null) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (standaloneModule != null) __obj.updateDynamic("standaloneModule")(standaloneModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

