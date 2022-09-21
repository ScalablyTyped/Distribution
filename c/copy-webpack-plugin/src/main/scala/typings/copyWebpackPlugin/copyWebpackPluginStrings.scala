package typings.copyWebpackPlugin

import typings.copyWebpackPlugin.mod.ToType
import typings.copyWebpackPlugin.utilsMod.InputFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyWebpackPluginStrings {
  
  @js.native
  sealed trait dir
    extends StObject
       with ToType
  inline def dir: dir = "dir".asInstanceOf[dir]
  
  @js.native
  sealed trait dirname
    extends StObject
       with InputFileSystem
  inline def dirname: dirname = "dirname".asInstanceOf[dirname]
  
  @js.native
  sealed trait file
    extends StObject
       with ToType
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait join
    extends StObject
       with InputFileSystem
  inline def join: join = "join".asInstanceOf[join]
  
  @js.native
  sealed trait lstat
    extends StObject
       with InputFileSystem
  inline def lstat: lstat = "lstat".asInstanceOf[lstat]
  
  @js.native
  sealed trait purge
    extends StObject
       with InputFileSystem
  inline def purge: purge = "purge".asInstanceOf[purge]
  
  @js.native
  sealed trait readFile
    extends StObject
       with InputFileSystem
  inline def readFile: readFile = "readFile".asInstanceOf[readFile]
  
  @js.native
  sealed trait readJson
    extends StObject
       with InputFileSystem
  inline def readJson: readJson = "readJson".asInstanceOf[readJson]
  
  @js.native
  sealed trait readdir
    extends StObject
       with InputFileSystem
  inline def readdir: readdir = "readdir".asInstanceOf[readdir]
  
  @js.native
  sealed trait readlink
    extends StObject
       with InputFileSystem
  inline def readlink: readlink = "readlink".asInstanceOf[readlink]
  
  @js.native
  sealed trait realpath
    extends StObject
       with InputFileSystem
  inline def realpath: realpath = "realpath".asInstanceOf[realpath]
  
  @js.native
  sealed trait relative
    extends StObject
       with InputFileSystem
  inline def relative: relative = "relative".asInstanceOf[relative]
  
  @js.native
  sealed trait stat
    extends StObject
       with InputFileSystem
  inline def stat: stat = "stat".asInstanceOf[stat]
  
  @js.native
  sealed trait template
    extends StObject
       with ToType
  inline def template: template = "template".asInstanceOf[template]
}
