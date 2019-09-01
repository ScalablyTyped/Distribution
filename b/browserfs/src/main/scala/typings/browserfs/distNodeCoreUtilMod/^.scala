package typings.browserfs.distNodeCoreUtilMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSOneArgCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemConstructor
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val isIE: Boolean = js.native
  val isWebWorker: Boolean = js.native
  def arrayBuffer2Buffer(ab: ArrayBuffer): Buffer = js.native
  def arrayish2Buffer(arr: Arrayish[Double]): Buffer = js.native
  def buffer2ArrayBuffer(buff: Buffer): ArrayBuffer = js.native
  def buffer2Uint8array(buff: Buffer): Uint8Array = js.native
  def bufferValidator(v: js.Object, cb: BFSOneArgCallback): Unit = js.native
  def checkOptions(fsType: FileSystemConstructor, opts: js.Any, cb: BFSOneArgCallback): Unit = js.native
  def copyingSlice(buff: Buffer): Buffer = js.native
  def copyingSlice(buff: Buffer, start: Double): Buffer = js.native
  def copyingSlice(buff: Buffer, start: Double, end: Double): Buffer = js.native
  def deprecationMessage(print: Boolean, fsName: String, opts: js.Any): Unit = js.native
  def emptyBuffer(): Buffer = js.native
  def fail(): Unit = js.native
  def mkdirpSync(p: String, mode: Double, fs: FileSystem): Unit = js.native
  def uint8Array2Buffer(u8: Uint8Array): Buffer = js.native
}

