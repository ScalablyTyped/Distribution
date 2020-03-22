package typings.cpy.mod

import typings.fastGlob.PartialFileSystemAdapter
import typings.fastGlob.typesMod.Pattern
import typings.globby.mod.ExpandDirectoriesOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Readonly<globby.globby.GlobbyOptions> */
/* Inlined parent cp-file.cp-file.Options */
trait Options extends js.Object {
  val absolute: js.UndefOr[Boolean] = js.undefined
  val baseNameMatch: js.UndefOr[Boolean] = js.undefined
  val braceExpansion: js.UndefOr[Boolean] = js.undefined
  val caseSensitiveMatch: js.UndefOr[Boolean] = js.undefined
  /**
  		Number of files being copied concurrently.
  		@default (os.cpus().length || 1) * 2
  		*/
  val concurrency: js.UndefOr[Double] = js.undefined
  /**
  		Working directory to find source files.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.undefined
  val deep: js.UndefOr[Double] = js.undefined
  val dot: js.UndefOr[Boolean] = js.undefined
  val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.undefined
  val extglob: js.UndefOr[Boolean] = js.undefined
  val followSymbolicLinks: js.UndefOr[Boolean] = js.undefined
  val fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
  val gitignore: js.UndefOr[Boolean] = js.undefined
  val globstar: js.UndefOr[Boolean] = js.undefined
  val ignore: js.UndefOr[js.Array[Pattern]] = js.undefined
  /**
  		Ignore junk files.
  		@default true
  		*/
  val ignoreJunk: js.UndefOr[Boolean] = js.undefined
  val markDirectories: js.UndefOr[Boolean] = js.undefined
  val objectMode: js.UndefOr[Boolean] = js.undefined
  val onlyDirectories: js.UndefOr[Boolean] = js.undefined
  val onlyFiles: js.UndefOr[Boolean] = js.undefined
  /**
  		Overwrite existing destination file.
  		@default true
  		*/
  val overwrite: js.UndefOr[Boolean] = js.undefined
  /**
  		Preserve path structure.
  		@default false
  		*/
  val parents: js.UndefOr[Boolean] = js.undefined
  /**
  		Filename or function returning a filename used to rename every file in `source`.
  		@example
  		```
  		import cpy = require('cpy');
  		(async () => {
  			await cpy('foo.js', 'destination', {
  				rename: basename => `prefix-${basename}`
  			});
  		})();
  		```
  		*/
  val rename: js.UndefOr[String | (js.Function1[/* basename */ String, String])] = js.undefined
  val stats: js.UndefOr[Boolean] = js.undefined
  val suppressErrors: js.UndefOr[Boolean] = js.undefined
  val throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
  val unique: js.UndefOr[Boolean] = js.undefined
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
    expandDirectories: ExpandDirectoriesOption = null,
    extglob: js.UndefOr[Boolean] = js.undefined,
    followSymbolicLinks: js.UndefOr[Boolean] = js.undefined,
    fs: PartialFileSystemAdapter = null,
    gitignore: js.UndefOr[Boolean] = js.undefined,
    globstar: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[Pattern] = null,
    ignoreJunk: js.UndefOr[Boolean] = js.undefined,
    markDirectories: js.UndefOr[Boolean] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    onlyDirectories: js.UndefOr[Boolean] = js.undefined,
    onlyFiles: js.UndefOr[Boolean] = js.undefined,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    parents: js.UndefOr[Boolean] = js.undefined,
    rename: String | (js.Function1[/* basename */ String, String]) = null,
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
    if (expandDirectories != null) __obj.updateDynamic("expandDirectories")(expandDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(extglob)) __obj.updateDynamic("extglob")(extglob.asInstanceOf[js.Any])
    if (!js.isUndefined(followSymbolicLinks)) __obj.updateDynamic("followSymbolicLinks")(followSymbolicLinks.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (!js.isUndefined(gitignore)) __obj.updateDynamic("gitignore")(gitignore.asInstanceOf[js.Any])
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreJunk)) __obj.updateDynamic("ignoreJunk")(ignoreJunk.asInstanceOf[js.Any])
    if (!js.isUndefined(markDirectories)) __obj.updateDynamic("markDirectories")(markDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyDirectories)) __obj.updateDynamic("onlyDirectories")(onlyDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyFiles)) __obj.updateDynamic("onlyFiles")(onlyFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (!js.isUndefined(parents)) __obj.updateDynamic("parents")(parents.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(throwErrorOnBrokenSymbolicLink)) __obj.updateDynamic("throwErrorOnBrokenSymbolicLink")(throwErrorOnBrokenSymbolicLink.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

