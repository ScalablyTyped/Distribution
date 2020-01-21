package typings.browserfs.emscriptenFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmscriptenNodeOps extends js.Object {
  def getattr(node: EmscriptenFSNode): Stats
  def lookup(parent: EmscriptenFSNode, name: String): EmscriptenFSNode
  def mknod(parent: EmscriptenFSNode, name: String, mode: Double, dev: js.Any): EmscriptenFSNode
  def readdir(node: EmscriptenFSNode): js.Array[String]
  def readlink(node: EmscriptenFSNode): String
  def rename(oldNode: EmscriptenFSNode, newDir: EmscriptenFSNode, newName: String): Unit
  def rmdir(parent: EmscriptenFSNode, name: String): Unit
  def setattr(node: EmscriptenFSNode, attr: Stats): Unit
  def symlink(parent: EmscriptenFSNode, newName: String, oldPath: String): Unit
  def unlink(parent: EmscriptenFSNode, name: String): Unit
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
}

