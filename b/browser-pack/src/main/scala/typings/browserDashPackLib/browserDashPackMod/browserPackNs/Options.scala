package typings
package browserDashPackLib.browserDashPackMod.browserPackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Used if opts.preludePath is undefined, this is used to resolve the prelude.js file location, default: 'process.cwd()'
    */
  var basedir: js.UndefOr[java.lang.String] = js.undefined
  /** A string to use in place of 'require' if opts.hasExports is specified, default is 'require'
    */
  var externalRequireName: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the bundle should include require= (or the opts.externalRequireName) so that
    * require() is available outside the bundle
    */
  var hasExports: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify a custom prelude, but know what you're doing first. See the prelude.js file in
    * this repo for the default prelude. If you specify a custom prelude, you must also specify
    * a valid opts.preludePath to the prelude source file for sourcemaps to work
    */
  var prelude: js.UndefOr[java.lang.String] = js.undefined
  /** prelude.js path if a custom opts.prelude is specified
    */
  var preludePath: js.UndefOr[java.lang.String] = js.undefined
  /** if given, the writable end of the stream will expect objects to be written to
    * it instead of expecting a stream of json text it will need to parse, default false
    */
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  /** If given and source maps are computed, the opts.sourceMapPrefix string will be used instead of default: '//#'
    */
  var sourceMapPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** External string name to use for UMD, if not provided, UMD declaration is not wrapped around output
    */
  var standalone: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the internal module name to export for standalone
    */
  var standaloneModule: js.UndefOr[java.lang.String] = js.undefined
}

