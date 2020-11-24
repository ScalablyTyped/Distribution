package typings.browserfs.fileIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inode extends js.Object {
  
  def isDir(): Boolean = js.native
  
  def isFile(): Boolean = js.native
}
object Inode {
  
  @scala.inline
  def apply(isDir: () => Boolean, isFile: () => Boolean): Inode = {
    val __obj = js.Dynamic.literal(isDir = js.Any.fromFunction0(isDir), isFile = js.Any.fromFunction0(isFile))
    __obj.asInstanceOf[Inode]
  }
  
  @scala.inline
  implicit class InodeOps[Self <: Inode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsDir(value: () => Boolean): Self = this.set("isDir", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFile(value: () => Boolean): Self = this.set("isFile", js.Any.fromFunction0(value))
  }
}
