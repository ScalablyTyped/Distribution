package typings.cpy.cpyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof globby.globby.GlobbyOptions ]: globby.globby.GlobbyOptions[P]} */ trait Options
  extends typings.cpDashFile.cpDashFileMod.Options {
  /**
  		Working directory to find source files.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.undefined
  /**
  		Preserve path structure.
  		@default false
  		*/
  val parents: js.UndefOr[Boolean] = js.undefined
  /**
  		Filename or function returning a filename used to rename every file in `source`.
  		@example
  		```
  		cpy('foo.js', 'destination', {
  			rename: basename => `prefix-${basename}`
  		});
  		```
  		*/
  val rename: js.UndefOr[String | (js.Function1[/* basename */ String, String])] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: String = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    parents: js.UndefOr[Boolean] = js.undefined,
    rename: String | (js.Function1[/* basename */ String, String]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (!js.isUndefined(parents)) __obj.updateDynamic("parents")(parents)
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

