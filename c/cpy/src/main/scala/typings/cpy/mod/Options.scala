package typings.cpy.mod

import typings.fastGlob.anon.PartialFileSystemAdapter
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
  /**
  		Function to filter files to copy.
  		Receives a source file object as the first argument.
  		Return true to include, false to exclude. You can also return a Promise that resolves to true or false.
  		@example
  		```
  		import cpy = require('cpy');
  		(async () => {
  			await cpy('foo', 'destination', {
  				filter: file => file.extension !== '.nocopy'
  			});
  		})();
  		```
  		*/
  val filter: js.UndefOr[js.Function1[/* file */ SourceFile, Boolean | js.Promise[Boolean]]] = js.undefined
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
    concurrency: js.UndefOr[Double] = js.undefined,
    cwd: String = null,
    deep: js.UndefOr[Double] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    expandDirectories: ExpandDirectoriesOption = null,
    extglob: js.UndefOr[Boolean] = js.undefined,
    filter: /* file */ SourceFile => Boolean | js.Promise[Boolean] = null,
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
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baseNameMatch)) __obj.updateDynamic("baseNameMatch")(baseNameMatch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(braceExpansion)) __obj.updateDynamic("braceExpansion")(braceExpansion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitiveMatch)) __obj.updateDynamic("caseSensitiveMatch")(caseSensitiveMatch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (expandDirectories != null) __obj.updateDynamic("expandDirectories")(expandDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(extglob)) __obj.updateDynamic("extglob")(extglob.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(followSymbolicLinks)) __obj.updateDynamic("followSymbolicLinks")(followSymbolicLinks.get.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (!js.isUndefined(gitignore)) __obj.updateDynamic("gitignore")(gitignore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreJunk)) __obj.updateDynamic("ignoreJunk")(ignoreJunk.get.asInstanceOf[js.Any])
    if (!js.isUndefined(markDirectories)) __obj.updateDynamic("markDirectories")(markDirectories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyDirectories)) __obj.updateDynamic("onlyDirectories")(onlyDirectories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyFiles)) __obj.updateDynamic("onlyFiles")(onlyFiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parents)) __obj.updateDynamic("parents")(parents.get.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throwErrorOnBrokenSymbolicLink)) __obj.updateDynamic("throwErrorOnBrokenSymbolicLink")(throwErrorOnBrokenSymbolicLink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

