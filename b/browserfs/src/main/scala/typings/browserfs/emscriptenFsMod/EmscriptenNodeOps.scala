package typings.browserfs.emscriptenFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenNodeOps extends js.Object {
  def getattr(node: EmscriptenFSNode): Stats = js.native
  def lookup(parent: EmscriptenFSNode, name: String): EmscriptenFSNode = js.native
  def mknod(parent: EmscriptenFSNode, name: String, mode: Double, dev: js.Any): EmscriptenFSNode = js.native
  def readdir(node: EmscriptenFSNode): js.Array[String] = js.native
  def readlink(node: EmscriptenFSNode): String = js.native
  def rename(oldNode: EmscriptenFSNode, newDir: EmscriptenFSNode, newName: String): Unit = js.native
  def rmdir(parent: EmscriptenFSNode, name: String): Unit = js.native
  def setattr(node: EmscriptenFSNode, attr: Stats): Unit = js.native
  def symlink(parent: EmscriptenFSNode, newName: String, oldPath: String): Unit = js.native
  def unlink(parent: EmscriptenFSNode, name: String): Unit = js.native
}

object EmscriptenNodeOps {
  @scala.inline
  def apply(
    getattr: EmscriptenFSNode => Stats,
    lookup: (EmscriptenFSNode, String) => EmscriptenFSNode,
    mknod: (EmscriptenFSNode, String, Double, js.Any) => EmscriptenFSNode,
    readdir: EmscriptenFSNode => js.Array[String],
    readlink: EmscriptenFSNode => String,
    rename: (EmscriptenFSNode, EmscriptenFSNode, String) => Unit,
    rmdir: (EmscriptenFSNode, String) => Unit,
    setattr: (EmscriptenFSNode, Stats) => Unit,
    symlink: (EmscriptenFSNode, String, String) => Unit,
    unlink: (EmscriptenFSNode, String) => Unit
  ): EmscriptenNodeOps = {
    val __obj = js.Dynamic.literal(getattr = js.Any.fromFunction1(getattr), lookup = js.Any.fromFunction2(lookup), mknod = js.Any.fromFunction4(mknod), readdir = js.Any.fromFunction1(readdir), readlink = js.Any.fromFunction1(readlink), rename = js.Any.fromFunction3(rename), rmdir = js.Any.fromFunction2(rmdir), setattr = js.Any.fromFunction2(setattr), symlink = js.Any.fromFunction3(symlink), unlink = js.Any.fromFunction2(unlink))
    __obj.asInstanceOf[EmscriptenNodeOps]
  }
  @scala.inline
  implicit class EmscriptenNodeOpsOps[Self <: EmscriptenNodeOps] (val x: Self) extends AnyVal {
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
    def setGetattr(value: EmscriptenFSNode => Stats): Self = this.set("getattr", js.Any.fromFunction1(value))
    @scala.inline
    def setLookup(value: (EmscriptenFSNode, String) => EmscriptenFSNode): Self = this.set("lookup", js.Any.fromFunction2(value))
    @scala.inline
    def setMknod(value: (EmscriptenFSNode, String, Double, js.Any) => EmscriptenFSNode): Self = this.set("mknod", js.Any.fromFunction4(value))
    @scala.inline
    def setReaddir(value: EmscriptenFSNode => js.Array[String]): Self = this.set("readdir", js.Any.fromFunction1(value))
    @scala.inline
    def setReadlink(value: EmscriptenFSNode => String): Self = this.set("readlink", js.Any.fromFunction1(value))
    @scala.inline
    def setRename(value: (EmscriptenFSNode, EmscriptenFSNode, String) => Unit): Self = this.set("rename", js.Any.fromFunction3(value))
    @scala.inline
    def setRmdir(value: (EmscriptenFSNode, String) => Unit): Self = this.set("rmdir", js.Any.fromFunction2(value))
    @scala.inline
    def setSetattr(value: (EmscriptenFSNode, Stats) => Unit): Self = this.set("setattr", js.Any.fromFunction2(value))
    @scala.inline
    def setSymlink(value: (EmscriptenFSNode, String, String) => Unit): Self = this.set("symlink", js.Any.fromFunction3(value))
    @scala.inline
    def setUnlink(value: (EmscriptenFSNode, String) => Unit): Self = this.set("unlink", js.Any.fromFunction2(value))
  }
  
}

