package typings.browserfs.emscriptenMod

import typings.browserfs.fileMod.BaseFile
import typings.browserfs.fileMod.File
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.BFSThreeArgCallback
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/Emscripten", "EmscriptenFile")
@js.native
class EmscriptenFile protected ()
  extends BaseFile
     with File {
  def this(_fs: EmscriptenFileSystem, _FS: js.Any, _path: String, _stream: js.Any) = this()
  var _FS: js.Any = js.native
  var _fs: js.Any = js.native
  var _path: js.Any = js.native
  var _stream: js.Any = js.native
  /* InferMemberOverrides */
  override def chmod(mode: Double, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def chmodSync(mode: Double): Unit = js.native
  /* InferMemberOverrides */
  override def chown(uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def chownSync(uid: Double, gid: Double): Unit = js.native
  /* InferMemberOverrides */
  override def datasync(cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def datasyncSync(): Unit = js.native
  def read(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
    offset: Double,
    length: Double,
    position: Double,
    cb: BFSThreeArgCallback[Double, Buffer]
  ): Unit = js.native
  def readSync(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
    offset: Double,
    length: Double
  ): Double = js.native
  def readSync(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
    offset: Double,
    length: Double,
    position: Double
  ): Double = js.native
  /* InferMemberOverrides */
  override def sync(cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def syncSync(): Unit = js.native
  /* InferMemberOverrides */
  override def utimes(atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def utimesSync(atime: Date, mtime: Date): Unit = js.native
  def write(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
    offset: Double,
    length: Double,
    position: Double,
    cb: BFSThreeArgCallback[Double, Buffer]
  ): Unit = js.native
  def writeSync(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
    offset: Double,
    length: Double
  ): Double = js.native
  def writeSync(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
    offset: Double,
    length: Double,
    position: Double
  ): Double = js.native
}

