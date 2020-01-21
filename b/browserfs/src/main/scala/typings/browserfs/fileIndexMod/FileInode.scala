package typings.browserfs.fileIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/file_index", "FileInode")
@js.native
class FileInode[T] protected () extends Inode {
  def this(data: T) = this()
  var data: js.Any = js.native
  def getData(): T = js.native
  /* CompleteClass */
  override def isDir(): Boolean = js.native
  /* CompleteClass */
  override def isFile(): Boolean = js.native
  def setData(data: T): Unit = js.native
}

