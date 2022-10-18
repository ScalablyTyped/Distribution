package typings.copyWebpackPlugin

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  @JSImport("copy-webpack-plugin/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readFile(inputFileSystem: InputFileSystem, path: String): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(inputFileSystem.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  
  inline def stat(inputFileSystem: InputFileSystem, path: String): js.Promise[js.UndefOr[Stats]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(inputFileSystem.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Stats]]]
  
  inline def throttleAll[T](limit: Double, tasks: js.Array[Task[T]]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAll")(limit.asInstanceOf[js.Any], tasks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  
  /* Inlined webpack.webpack.Compilation['inputFileSystem'] */
  /* Rewritten from type alias, can be one of: 
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.readlink
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.realpath
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.join
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.dirname
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.readFile
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.purge
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.lstat
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.stat
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.readJson
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.readdir
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.relative
  */
  trait InputFileSystem extends StObject
  object InputFileSystem {
    
    inline def dirname: typings.copyWebpackPlugin.copyWebpackPluginStrings.dirname = "dirname".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.dirname]
    
    inline def join: typings.copyWebpackPlugin.copyWebpackPluginStrings.join = "join".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.join]
    
    inline def lstat: typings.copyWebpackPlugin.copyWebpackPluginStrings.lstat = "lstat".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.lstat]
    
    inline def purge: typings.copyWebpackPlugin.copyWebpackPluginStrings.purge = "purge".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.purge]
    
    inline def readFile: typings.copyWebpackPlugin.copyWebpackPluginStrings.readFile = "readFile".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.readFile]
    
    inline def readJson: typings.copyWebpackPlugin.copyWebpackPluginStrings.readJson = "readJson".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.readJson]
    
    inline def readdir: typings.copyWebpackPlugin.copyWebpackPluginStrings.readdir = "readdir".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.readdir]
    
    inline def readlink: typings.copyWebpackPlugin.copyWebpackPluginStrings.readlink = "readlink".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.readlink]
    
    inline def realpath: typings.copyWebpackPlugin.copyWebpackPluginStrings.realpath = "realpath".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.realpath]
    
    inline def relative: typings.copyWebpackPlugin.copyWebpackPluginStrings.relative = "relative".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.relative]
    
    inline def stat: typings.copyWebpackPlugin.copyWebpackPluginStrings.stat = "stat".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.stat]
  }
  
  type Stats = typings.node.fsMod.Stats
  
  type Task[T] = js.Function0[js.Promise[T]]
}
