package typings.cpy

import typings.cpy.cpyStrings.progress
import typings.fastGlob.anon.PartialFileSystemAdapter
import typings.fastGlob.outTypesMod.Pattern
import typings.globby.mod.ExpandDirectoriesOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cpy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: String, destination: String): js.Promise[js.Array[String]] & ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]] & ProgressEmitter]
  inline def default(source: String, destination: String, options: Options): js.Promise[js.Array[String]] & ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]] & ProgressEmitter]
  inline def default(source: js.Array[String], destination: String): js.Promise[js.Array[String]] & ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]] & ProgressEmitter]
  inline def default(source: js.Array[String], destination: String, options: Options): js.Promise[js.Array[String]] & ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]] & ProgressEmitter]
  
  trait CopyStatus extends StObject {
    
    var percent: Double
    
    var written: Double
  }
  object CopyStatus {
    
    inline def apply(percent: Double, written: Double): CopyStatus = {
      val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyStatus]
    }
    
    extension [Self <: CopyStatus](x: Self) {
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setWritten(value: Double): Self = StObject.set(x, "written", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entry extends StObject {
    
    /**
    	File extension.
    	@example 'js'
    	*/
    val `extension`: String
    
    /**
    	Filename with extension.
    	@example 'foo.js'
    	*/
    val name: String
    
    /**
    	Filename without extension.
    	@example 'foo'
    	*/
    val nameWithoutExtension: String
    
    /**
    	Resolved path to the file.
    	@example '/tmp/dir/foo.js'
    	*/
    val path: String
    
    /**
    	Relative path to the file from cwd.
    	@example 'dir/foo.js'
    	*/
    val relativePath: String
  }
  object Entry {
    
    inline def apply(
      `extension`: String,
      name: String,
      nameWithoutExtension: String,
      path: String,
      relativePath: String
    ): Entry = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nameWithoutExtension = nameWithoutExtension.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameWithoutExtension(value: String): Self = StObject.set(x, "nameWithoutExtension", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Readonly<globby.globby.Options> */
  /* Inlined parent cp-file.cp-file.Options */
  trait Options extends StObject {
    
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
    
    /**
    	[Permissions](https://en.wikipedia.org/wiki/File-system_permissions#Numeric_notation) for created directories.
    	It has no effect on Windows.
    	@default 0o777
    	*/
    val directoryMode: js.UndefOr[Double] = js.undefined
    
    val dot: js.UndefOr[Boolean] = js.undefined
    
    val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.undefined
    
    val extglob: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Function to filter files to copy.
    	Receives a source file object as the first argument.
    	Return true to include, false to exclude. You can also return a Promise that resolves to true or false.
    	@example
    	```
    	import cpy from 'cpy';
    	await cpy('foo', 'destination', {
    		filter: file => file.extension !== 'nocopy'
    	});
    	```
    	*/
    val filter: js.UndefOr[js.Function1[/* file */ Entry, Boolean | js.Promise[Boolean]]] = js.undefined
    
    /**
    	Flatten directory tree.
    	@default false
    	*/
    val flat: js.UndefOr[Boolean] = js.undefined
    
    val followSymbolicLinks: js.UndefOr[Boolean] = js.undefined
    
    val fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
    
    val gitignore: js.UndefOr[Boolean] = js.undefined
    
    val globstar: js.UndefOr[Boolean] = js.undefined
    
    val ignore: js.UndefOr[js.Array[Pattern]] = js.undefined
    
    val ignoreFiles: js.UndefOr[String | js.Array[String]] = js.undefined
    
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
    	Filename or function returning a filename used to rename every file in `source`.
    	@example
    	```
    	import cpy from 'cpy';
    	await cpy('foo.js', 'destination', {
    		rename: basename => `prefix-${basename}`
    	});
    	await cpy('foo.js', 'destination', {
    		rename: 'new-name'
    	});
    	```
    	*/
    val rename: js.UndefOr[String | (js.Function1[/* basename */ String, String])] = js.undefined
    
    val stats: js.UndefOr[Boolean] = js.undefined
    
    val suppressErrors: js.UndefOr[Boolean] = js.undefined
    
    val throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
    
    val unique: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setBaseNameMatch(value: Boolean): Self = StObject.set(x, "baseNameMatch", value.asInstanceOf[js.Any])
      
      inline def setBaseNameMatchUndefined: Self = StObject.set(x, "baseNameMatch", js.undefined)
      
      inline def setBraceExpansion(value: Boolean): Self = StObject.set(x, "braceExpansion", value.asInstanceOf[js.Any])
      
      inline def setBraceExpansionUndefined: Self = StObject.set(x, "braceExpansion", js.undefined)
      
      inline def setCaseSensitiveMatch(value: Boolean): Self = StObject.set(x, "caseSensitiveMatch", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveMatchUndefined: Self = StObject.set(x, "caseSensitiveMatch", js.undefined)
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDeep(value: Double): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setDirectoryMode(value: Double): Self = StObject.set(x, "directoryMode", value.asInstanceOf[js.Any])
      
      inline def setDirectoryModeUndefined: Self = StObject.set(x, "directoryMode", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setExpandDirectories(value: ExpandDirectoriesOption): Self = StObject.set(x, "expandDirectories", value.asInstanceOf[js.Any])
      
      inline def setExpandDirectoriesUndefined: Self = StObject.set(x, "expandDirectories", js.undefined)
      
      inline def setExpandDirectoriesVarargs(value: String*): Self = StObject.set(x, "expandDirectories", js.Array(value*))
      
      inline def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      inline def setExtglobUndefined: Self = StObject.set(x, "extglob", js.undefined)
      
      inline def setFilter(value: /* file */ Entry => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymbolicLinksUndefined: Self = StObject.set(x, "followSymbolicLinks", js.undefined)
      
      inline def setFs(value: PartialFileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setGitignore(value: Boolean): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      inline def setGitignoreUndefined: Self = StObject.set(x, "gitignore", js.undefined)
      
      inline def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      inline def setGlobstarUndefined: Self = StObject.set(x, "globstar", js.undefined)
      
      inline def setIgnore(value: js.Array[Pattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFiles(value: String | js.Array[String]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFilesUndefined: Self = StObject.set(x, "ignoreFiles", js.undefined)
      
      inline def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value*))
      
      inline def setIgnoreJunk(value: Boolean): Self = StObject.set(x, "ignoreJunk", value.asInstanceOf[js.Any])
      
      inline def setIgnoreJunkUndefined: Self = StObject.set(x, "ignoreJunk", js.undefined)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: Pattern*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMarkDirectories(value: Boolean): Self = StObject.set(x, "markDirectories", value.asInstanceOf[js.Any])
      
      inline def setMarkDirectoriesUndefined: Self = StObject.set(x, "markDirectories", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setOnlyDirectories(value: Boolean): Self = StObject.set(x, "onlyDirectories", value.asInstanceOf[js.Any])
      
      inline def setOnlyDirectoriesUndefined: Self = StObject.set(x, "onlyDirectories", js.undefined)
      
      inline def setOnlyFiles(value: Boolean): Self = StObject.set(x, "onlyFiles", value.asInstanceOf[js.Any])
      
      inline def setOnlyFilesUndefined: Self = StObject.set(x, "onlyFiles", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setRename(value: String | (js.Function1[/* basename */ String, String])): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      inline def setRenameFunction1(value: /* basename */ String => String): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
      
      inline def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setThrowErrorOnBrokenSymbolicLinkUndefined: Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", js.undefined)
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  trait ProgressData extends StObject {
    
    /**
    	Copied file count.
    	*/
    var completedFiles: Double
    
    /**
    	Completed size in bytes.
    	*/
    var completedSize: Double
    
    /**
    	Completed percentage. A value between `0` and `1`.
    	*/
    var percent: Double
    
    /**
    	Overall file count.
    	*/
    var totalFiles: Double
  }
  object ProgressData {
    
    inline def apply(completedFiles: Double, completedSize: Double, percent: Double, totalFiles: Double): ProgressData = {
      val __obj = js.Dynamic.literal(completedFiles = completedFiles.asInstanceOf[js.Any], completedSize = completedSize.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], totalFiles = totalFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressData]
    }
    
    extension [Self <: ProgressData](x: Self) {
      
      inline def setCompletedFiles(value: Double): Self = StObject.set(x, "completedFiles", value.asInstanceOf[js.Any])
      
      inline def setCompletedSize(value: Double): Self = StObject.set(x, "completedSize", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setTotalFiles(value: Double): Self = StObject.set(x, "totalFiles", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProgressEmitter extends StObject {
    
    @JSName("on")
    def on_progress(event: progress, handler: js.Function1[/* progress */ ProgressData, Unit]): js.Promise[js.Array[String]]
  }
  object ProgressEmitter {
    
    inline def apply(on: (progress, js.Function1[/* progress */ ProgressData, Unit]) => js.Promise[js.Array[String]]): ProgressEmitter = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[ProgressEmitter]
    }
    
    extension [Self <: ProgressEmitter](x: Self) {
      
      inline def setOn(value: (progress, js.Function1[/* progress */ ProgressData, Unit]) => js.Promise[js.Array[String]]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}
