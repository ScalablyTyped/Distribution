package typings
package cpyLib.cpyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof globby.globby.globby.GlobbyOptions ]: globby.globby.globby.GlobbyOptions[P]} */ trait Options
  extends cpDashFileLib.cpDashFileMod.Options {
  /**
  	 * Working directory to find source files.
  	 *
  	 * @default process.cwd()
  	 */
  val cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Preserve path structure.
  	 *
  	 * @default false
  	 */
  val parents: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Filename or function returning a filename used to rename every file in `files`.
  	 *
  	 * @example
  	 *
  	 * cpy('foo.js', 'destination', {
  	 * 	rename: basename => `prefix-${basename}`
  	 * });
  	 */
  val rename: js.UndefOr[
    java.lang.String | (js.Function1[/* basename */ java.lang.String, java.lang.String])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    parents: js.UndefOr[scala.Boolean] = js.undefined,
    rename: java.lang.String | (js.Function1[/* basename */ java.lang.String, java.lang.String]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (!js.isUndefined(parents)) __obj.updateDynamic("parents")(parents)
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

