package typings.browserfs.distNodeCoreFileMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSOneArgCallback
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/file", "BaseFile")
@js.native
class BaseFile () extends js.Object {
  def chmod(mode: Double, cb: BFSOneArgCallback): Unit = js.native
  def chmodSync(mode: Double): Unit = js.native
  def chown(uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
  def chownSync(uid: Double, gid: Double): Unit = js.native
  def datasync(cb: BFSOneArgCallback): Unit = js.native
  def datasyncSync(): Unit = js.native
  def sync(cb: BFSOneArgCallback): Unit = js.native
  def syncSync(): Unit = js.native
  def utimes(atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
  def utimesSync(atime: Date, mtime: Date): Unit = js.native
}

