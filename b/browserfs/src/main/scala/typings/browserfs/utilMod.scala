package typings.browserfs

import org.scalablytyped.runtime.NumberDictionary
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.FileSystem
import typings.browserfs.fileSystemMod.FileSystemConstructor
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("browserfs/dist/node/core/util", "arrayBuffer2Buffer")
  @js.native
  def arrayBuffer2Buffer(ab: ArrayBuffer): Buffer = js.native
  
  @JSImport("browserfs/dist/node/core/util", "arrayish2Buffer")
  @js.native
  def arrayish2Buffer(arr: Arrayish[Double]): Buffer = js.native
  
  @JSImport("browserfs/dist/node/core/util", "buffer2ArrayBuffer")
  @js.native
  def buffer2ArrayBuffer(buff: Buffer): ArrayBuffer = js.native
  
  @JSImport("browserfs/dist/node/core/util", "buffer2Uint8array")
  @js.native
  def buffer2Uint8array(buff: Buffer): Uint8Array = js.native
  
  @JSImport("browserfs/dist/node/core/util", "bufferValidator")
  @js.native
  def bufferValidator(v: js.Object, cb: BFSOneArgCallback): Unit = js.native
  
  @JSImport("browserfs/dist/node/core/util", "checkOptions")
  @js.native
  def checkOptions(fsType: FileSystemConstructor, opts: js.Any, cb: BFSOneArgCallback): Unit = js.native
  
  @JSImport("browserfs/dist/node/core/util", "copyingSlice")
  @js.native
  def copyingSlice(buff: Buffer): Buffer = js.native
  @JSImport("browserfs/dist/node/core/util", "copyingSlice")
  @js.native
  def copyingSlice(buff: Buffer, start: js.UndefOr[scala.Nothing], end: Double): Buffer = js.native
  @JSImport("browserfs/dist/node/core/util", "copyingSlice")
  @js.native
  def copyingSlice(buff: Buffer, start: Double): Buffer = js.native
  @JSImport("browserfs/dist/node/core/util", "copyingSlice")
  @js.native
  def copyingSlice(buff: Buffer, start: Double, end: Double): Buffer = js.native
  
  @JSImport("browserfs/dist/node/core/util", "deprecationMessage")
  @js.native
  def deprecationMessage(print: Boolean, fsName: String, opts: js.Any): Unit = js.native
  
  @JSImport("browserfs/dist/node/core/util", "emptyBuffer")
  @js.native
  def emptyBuffer(): Buffer = js.native
  
  @JSImport("browserfs/dist/node/core/util", "fail")
  @js.native
  def fail(): Unit = js.native
  
  @JSImport("browserfs/dist/node/core/util", "isIE")
  @js.native
  val isIE: Boolean = js.native
  
  @JSImport("browserfs/dist/node/core/util", "isWebWorker")
  @js.native
  val isWebWorker: Boolean = js.native
  
  @JSImport("browserfs/dist/node/core/util", "mkdirpSync")
  @js.native
  def mkdirpSync(p: String, mode: Double, fs: FileSystem): Unit = js.native
  
  @JSImport("browserfs/dist/node/core/util", "uint8Array2Buffer")
  @js.native
  def uint8Array2Buffer(u8: Uint8Array): Buffer = js.native
  
  @js.native
  trait Arrayish[T] extends /* idx */ NumberDictionary[T] {
    
    var length: Double = js.native
  }
  object Arrayish {
    
    @scala.inline
    def apply[T](length: Double): Arrayish[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arrayish[T]]
    }
    
    @scala.inline
    implicit class ArrayishMutableBuilder[Self <: Arrayish[_], T] (val x: Self with Arrayish[T]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
