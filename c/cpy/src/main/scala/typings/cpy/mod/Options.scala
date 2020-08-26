package typings.cpy.mod

import typings.fastGlob.anon.PartialFileSystemAdapter
import typings.fastGlob.typesMod.Pattern
import typings.globby.mod.ExpandDirectoriesOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Readonly<globby.globby.GlobbyOptions> */
/* Inlined parent cp-file.cp-file.Options */
@js.native
trait Options extends js.Object {
  val absolute: js.UndefOr[Boolean] = js.native
  val baseNameMatch: js.UndefOr[Boolean] = js.native
  val braceExpansion: js.UndefOr[Boolean] = js.native
  val caseSensitiveMatch: js.UndefOr[Boolean] = js.native
  /**
  		Number of files being copied concurrently.
  		@default (os.cpus().length || 1) * 2
  		*/
  val concurrency: js.UndefOr[Double] = js.native
  /**
  		Working directory to find source files.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.native
  val deep: js.UndefOr[Double] = js.native
  val dot: js.UndefOr[Boolean] = js.native
  val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.native
  val extglob: js.UndefOr[Boolean] = js.native
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
  val filter: js.UndefOr[js.Function1[/* file */ SourceFile, Boolean | js.Promise[Boolean]]] = js.native
  val followSymbolicLinks: js.UndefOr[Boolean] = js.native
  val fs: js.UndefOr[PartialFileSystemAdapter] = js.native
  val gitignore: js.UndefOr[Boolean] = js.native
  val globstar: js.UndefOr[Boolean] = js.native
  val ignore: js.UndefOr[js.Array[Pattern]] = js.native
  /**
  		Ignore junk files.
  		@default true
  		*/
  val ignoreJunk: js.UndefOr[Boolean] = js.native
  val markDirectories: js.UndefOr[Boolean] = js.native
  val objectMode: js.UndefOr[Boolean] = js.native
  val onlyDirectories: js.UndefOr[Boolean] = js.native
  val onlyFiles: js.UndefOr[Boolean] = js.native
  /**
  		Overwrite existing destination file.
  		@default true
  		*/
  val overwrite: js.UndefOr[Boolean] = js.native
  /**
  		Preserve path structure.
  		@default false
  		*/
  val parents: js.UndefOr[Boolean] = js.native
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
  val rename: js.UndefOr[String | (js.Function1[/* basename */ String, String])] = js.native
  val stats: js.UndefOr[Boolean] = js.native
  val suppressErrors: js.UndefOr[Boolean] = js.native
  val throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.native
  val unique: js.UndefOr[Boolean] = js.native
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
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsolute: Self = this.set("absolute", js.undefined)
    @scala.inline
    def setBaseNameMatch(value: Boolean): Self = this.set("baseNameMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseNameMatch: Self = this.set("baseNameMatch", js.undefined)
    @scala.inline
    def setBraceExpansion(value: Boolean): Self = this.set("braceExpansion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBraceExpansion: Self = this.set("braceExpansion", js.undefined)
    @scala.inline
    def setCaseSensitiveMatch(value: Boolean): Self = this.set("caseSensitiveMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitiveMatch: Self = this.set("caseSensitiveMatch", js.undefined)
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDeep(value: Double): Self = this.set("deep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    @scala.inline
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    @scala.inline
    def setExpandDirectoriesVarargs(value: String*): Self = this.set("expandDirectories", js.Array(value :_*))
    @scala.inline
    def setExpandDirectories(value: ExpandDirectoriesOption): Self = this.set("expandDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandDirectories: Self = this.set("expandDirectories", js.undefined)
    @scala.inline
    def setExtglob(value: Boolean): Self = this.set("extglob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtglob: Self = this.set("extglob", js.undefined)
    @scala.inline
    def setFilter(value: /* file */ SourceFile => Boolean | js.Promise[Boolean]): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFollowSymbolicLinks(value: Boolean): Self = this.set("followSymbolicLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowSymbolicLinks: Self = this.set("followSymbolicLinks", js.undefined)
    @scala.inline
    def setFs(value: PartialFileSystemAdapter): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    @scala.inline
    def setGitignore(value: Boolean): Self = this.set("gitignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitignore: Self = this.set("gitignore", js.undefined)
    @scala.inline
    def setGlobstar(value: Boolean): Self = this.set("globstar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobstar: Self = this.set("globstar", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: Pattern*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[Pattern]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIgnoreJunk(value: Boolean): Self = this.set("ignoreJunk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreJunk: Self = this.set("ignoreJunk", js.undefined)
    @scala.inline
    def setMarkDirectories(value: Boolean): Self = this.set("markDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkDirectories: Self = this.set("markDirectories", js.undefined)
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
    @scala.inline
    def setOnlyDirectories(value: Boolean): Self = this.set("onlyDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyDirectories: Self = this.set("onlyDirectories", js.undefined)
    @scala.inline
    def setOnlyFiles(value: Boolean): Self = this.set("onlyFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyFiles: Self = this.set("onlyFiles", js.undefined)
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setParents(value: Boolean): Self = this.set("parents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParents: Self = this.set("parents", js.undefined)
    @scala.inline
    def setRenameFunction1(value: /* basename */ String => String): Self = this.set("rename", js.Any.fromFunction1(value))
    @scala.inline
    def setRename(value: String | (js.Function1[/* basename */ String, String])): Self = this.set("rename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    @scala.inline
    def setStats(value: Boolean): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setSuppressErrors(value: Boolean): Self = this.set("suppressErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressErrors: Self = this.set("suppressErrors", js.undefined)
    @scala.inline
    def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = this.set("throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowErrorOnBrokenSymbolicLink: Self = this.set("throwErrorOnBrokenSymbolicLink", js.undefined)
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
  
}

