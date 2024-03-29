package typings.browserfs

import typings.browserfs.anon.AsyncMirror
import typings.browserfs.anon.FnCall
import typings.browserfs.browserfsStrings.bfs_utils
import typings.browserfs.browserfsStrings.buffer
import typings.browserfs.browserfsStrings.fs
import typings.browserfs.browserfsStrings.path
import typings.browserfs.browserfsStrings.process
import typings.browserfs.distNodeCoreFileSystemMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeTypedocMod {
  
  trait BrowserFS extends StObject {
    
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    def BFSRequire(module: String): Any
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    @JSName("BFSRequire")
    var BFSRequire_Original: FnCall
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    @JSName("BFSRequire")
    def BFSRequire_bfsutils(module: bfs_utils): /* import warning: importer.ImportType#apply Failed type conversion: typeof BFSUtils */ js.Any
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    @JSName("BFSRequire")
    def BFSRequire_buffer(module: buffer): /* import warning: importer.ImportType#apply Failed type conversion: typeof buffer */ js.Any
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    @JSName("BFSRequire")
    def BFSRequire_fs(module: fs): /* import warning: importer.ImportType#apply Failed type conversion: typeof fs */ js.Any
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    @JSName("BFSRequire")
    def BFSRequire_path(module: path): /* import warning: importer.ImportType#apply Failed type conversion: typeof path */ js.Any
    /**
      * Emulates Node's `require()` function for filesystem-related modules (`'fs'`, `'path'`, `'buffer'`, etc).
      */
    @JSName("BFSRequire")
    def BFSRequire_process(module: process): /* import warning: importer.ImportType#apply Failed type conversion: typeof process */ js.Any
    
    /**
      * Exposes all of the file system backends available in BrowserFS.
      */
    var FileSystem: AsyncMirror
    
    /**
      * You must call this function with a properly-instantiated root file system
      * before using any file system API method.
      * @param rootFS The root filesystem to use for the
      *   entire BrowserFS file system.
      */
    def initialize(rootFS: FileSystem): Unit
    
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
    def install(obj: Any): Unit
  }
  object BrowserFS {
    
    inline def apply(BFSRequire: FnCall, FileSystem: AsyncMirror, initialize: FileSystem => Unit, install: Any => Unit): BrowserFS = {
      val __obj = js.Dynamic.literal(BFSRequire = BFSRequire.asInstanceOf[js.Any], FileSystem = FileSystem.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), install = js.Any.fromFunction1(install))
      __obj.asInstanceOf[BrowserFS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserFS] (val x: Self) extends AnyVal {
      
      inline def setBFSRequire(value: FnCall): Self = StObject.set(x, "BFSRequire", value.asInstanceOf[js.Any])
      
      inline def setFileSystem(value: AsyncMirror): Self = StObject.set(x, "FileSystem", value.asInstanceOf[js.Any])
      
      inline def setInitialize(value: FileSystem => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      inline def setInstall(value: Any => Unit): Self = StObject.set(x, "install", js.Any.fromFunction1(value))
    }
  }
}
