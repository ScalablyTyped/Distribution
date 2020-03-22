package typings.del.mod

import typings.fastGlob.PartialFileSystemAdapter
import typings.fastGlob.typesMod.Pattern
import typings.globby.mod.ExpandDirectoriesOption
import typings.globby.mod.GlobbyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends GlobbyOptions {
  /**
  		See what would be deleted.
  		@default false
  		@example
  		```
  		import del = require('del');
  		(async () => {
  			const deletedPaths = await del(['temp/ *.js'], {dryRun: true});
  			console.log('Files and directories that would be deleted:\n', deletedPaths.join('\n'));
  		})();
  		```
  		*/
  val dryRun: js.UndefOr[Boolean] = js.undefined
  /**
  		Allow deleting the current working directory and outside.
  		@default false
  		*/
  val force: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    baseNameMatch: js.UndefOr[Boolean] = js.undefined,
    braceExpansion: js.UndefOr[Boolean] = js.undefined,
    caseSensitiveMatch: js.UndefOr[Boolean] = js.undefined,
    concurrency: Int | Double = null,
    cwd: String = null,
    deep: Int | Double = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    expandDirectories: ExpandDirectoriesOption = null,
    extglob: js.UndefOr[Boolean] = js.undefined,
    followSymbolicLinks: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    fs: PartialFileSystemAdapter = null,
    gitignore: js.UndefOr[Boolean] = js.undefined,
    globstar: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[Pattern] = null,
    markDirectories: js.UndefOr[Boolean] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    onlyDirectories: js.UndefOr[Boolean] = js.undefined,
    onlyFiles: js.UndefOr[Boolean] = js.undefined,
    stats: js.UndefOr[Boolean] = js.undefined,
    suppressErrors: js.UndefOr[Boolean] = js.undefined,
    throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (!js.isUndefined(baseNameMatch)) __obj.updateDynamic("baseNameMatch")(baseNameMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(braceExpansion)) __obj.updateDynamic("braceExpansion")(braceExpansion.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitiveMatch)) __obj.updateDynamic("caseSensitiveMatch")(caseSensitiveMatch.asInstanceOf[js.Any])
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (deep != null) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (expandDirectories != null) __obj.updateDynamic("expandDirectories")(expandDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(extglob)) __obj.updateDynamic("extglob")(extglob.asInstanceOf[js.Any])
    if (!js.isUndefined(followSymbolicLinks)) __obj.updateDynamic("followSymbolicLinks")(followSymbolicLinks.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (!js.isUndefined(gitignore)) __obj.updateDynamic("gitignore")(gitignore.asInstanceOf[js.Any])
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(markDirectories)) __obj.updateDynamic("markDirectories")(markDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyDirectories)) __obj.updateDynamic("onlyDirectories")(onlyDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyFiles)) __obj.updateDynamic("onlyFiles")(onlyFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(throwErrorOnBrokenSymbolicLink)) __obj.updateDynamic("throwErrorOnBrokenSymbolicLink")(throwErrorOnBrokenSymbolicLink.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

