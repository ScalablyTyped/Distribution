package typings.browserfs.anon

import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.FileSystem
import typings.browserfs.fileSystemMod.FileSystemConstructor
import typings.browserfs.utilMod.Arrayish
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBFSUtils extends StObject {
  
  def arrayBuffer2Buffer(ab: js.typedarray.ArrayBuffer): Buffer = js.native
  
  def arrayish2Buffer(arr: Arrayish[Double]): Buffer = js.native
  
  def buffer2ArrayBuffer(buff: Buffer): js.typedarray.ArrayBuffer = js.native
  
  def buffer2Uint8array(buff: Buffer): js.typedarray.Uint8Array = js.native
  
  def bufferValidator(v: js.Object, cb: BFSOneArgCallback): Unit = js.native
  
  def checkOptions(fsType: FileSystemConstructor, opts: Any, cb: BFSOneArgCallback): Unit = js.native
  
  def copyingSlice(buff: Buffer): Buffer = js.native
  def copyingSlice(buff: Buffer, start: Double): Buffer = js.native
  def copyingSlice(buff: Buffer, start: Double, end: Double): Buffer = js.native
  def copyingSlice(buff: Buffer, start: Unit, end: Double): Buffer = js.native
  
  def deprecationMessage(print: Boolean, fsName: String, opts: Any): Unit = js.native
  
  def emptyBuffer(): Buffer = js.native
  
  def fail(): Unit = js.native
  
  val isIE: Boolean = js.native
  
  val isWebWorker: Boolean = js.native
  
  def mkdirpSync(p: String, mode: Double, fs: FileSystem): Unit = js.native
  
  def uint8Array2Buffer(u8: js.typedarray.Uint8Array): Buffer = js.native
}
