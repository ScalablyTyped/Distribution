package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemEntry extends StObject {
  
  val filesystem: FileSystem = js.native
  
  val fullPath: java.lang.String = js.native
  
  def getParent(): Unit = js.native
  def getParent(successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def getParent(successCallback: FileSystemEntryCallback): Unit = js.native
  def getParent(successCallback: FileSystemEntryCallback, errorCallback: ErrorCallback): Unit = js.native
  
  val isDirectory: scala.Boolean = js.native
  
  val isFile: scala.Boolean = js.native
  
  val name: java.lang.String = js.native
}
