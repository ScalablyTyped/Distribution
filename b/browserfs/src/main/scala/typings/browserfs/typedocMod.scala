package typings.browserfs

import typings.browserfs.anon.AsyncMirror
import typings.browserfs.anon.FnCall
import typings.browserfs.browserfsStrings.bfs_utils
import typings.browserfs.browserfsStrings.buffer
import typings.browserfs.browserfsStrings.fs
import typings.browserfs.browserfsStrings.path
import typings.browserfs.browserfsStrings.process
import typings.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/typedoc", JSImport.Namespace)
@js.native
object typedocMod extends js.Object {
  @js.native
  trait BrowserFS extends js.Object {
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    @JSName("BFSRequire")
    var BFSRequire_Original: FnCall = js.native
    /**
      * Exposes all of the file system backends available in BrowserFS.
      */
    var FileSystem: AsyncMirror = js.native
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    def BFSRequire(module: String): js.Any = js.native
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    @JSName("BFSRequire")
    def BFSRequire_bfsutils(module: bfs_utils): /* import warning: importer.ImportType#apply Failed type conversion: typeof BFSUtils */ js.Any = js.native
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    @JSName("BFSRequire")
    def BFSRequire_buffer(module: buffer): /* import warning: importer.ImportType#apply Failed type conversion: typeof buffer */ js.Any = js.native
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    @JSName("BFSRequire")
    def BFSRequire_fs(module: fs): /* import warning: importer.ImportType#apply Failed type conversion: typeof fs */ js.Any = js.native
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    @JSName("BFSRequire")
    def BFSRequire_path(module: path): /* import warning: importer.ImportType#apply Failed type conversion: typeof path */ js.Any = js.native
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    @JSName("BFSRequire")
    def BFSRequire_process(module: process): /* import warning: importer.ImportType#apply Failed type conversion: typeof process */ js.Any = js.native
    /**
      * You must call this function with a properly-instantiated root file system
      * before using any file system API method.
      * @param rootFS The root filesystem to use for the
      *   entire BrowserFS file system.
      */
    def initialize(rootFS: FileSystem): Unit = js.native
    /**
      * Installs BrowserFS onto the given object.
      * We recommend that you run install with the 'window' object to make things
      * global, as in Node.
      *
      * Properties installed:
      *
      * * Buffer
      * * process
      * * require (we monkey-patch it)
      *
      * This allows you to write code as if you were running inside Node.
      * @param obj The object to install things onto (e.g. window)
      */
    def install(obj: js.Any): Unit = js.native
  }
  
}

