package typings.browserfs.distNodeGenericFileUnderscoreIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inode extends js.Object {
  def isDir(): Boolean
  def isFile(): Boolean
}

object Inode {
  @scala.inline
  def apply(isDir: () => Boolean, isFile: () => Boolean): Inode = {
    val __obj = js.Dynamic.literal(isDir = js.Any.fromFunction0(isDir), isFile = js.Any.fromFunction0(isFile))
  
    __obj.asInstanceOf[Inode]
  }
}

