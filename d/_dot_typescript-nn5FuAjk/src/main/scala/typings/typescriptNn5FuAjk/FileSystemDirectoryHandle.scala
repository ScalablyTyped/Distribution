package typings.typescriptNn5FuAjk

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.directory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
@js.native
trait FileSystemDirectoryHandle
  extends StObject
     with FileSystemHandle {
  
  def getDirectoryHandle(name: java.lang.String): Promise[FileSystemDirectoryHandle] = js.native
  def getDirectoryHandle(name: java.lang.String, options: FileSystemGetDirectoryOptions): Promise[FileSystemDirectoryHandle] = js.native
  
  def getFileHandle(name: java.lang.String): Promise[FileSystemFileHandle] = js.native
  def getFileHandle(name: java.lang.String, options: FileSystemGetFileOptions): Promise[FileSystemFileHandle] = js.native
  
  @JSName("kind")
  val kind_FileSystemDirectoryHandle: directory = js.native
  
  def removeEntry(name: java.lang.String): Promise[Unit] = js.native
  def removeEntry(name: java.lang.String, options: FileSystemRemoveOptions): Promise[Unit] = js.native
  
  def resolve(possibleDescendant: FileSystemHandle): Promise[Array[java.lang.String] | Null] = js.native
}
