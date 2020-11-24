package typings.browserfs.fileIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/generic/file_index", "FileInode")
@js.native
class FileInode[T] protected () extends Inode {
  def this(data: T) = this()
  
  var data: js.Any = js.native
  
  def getData(): T = js.native
  
  def setData(data: T): Unit = js.native
}
