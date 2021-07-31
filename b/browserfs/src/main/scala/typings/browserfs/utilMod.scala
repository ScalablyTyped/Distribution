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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("browserfs/dist/node/core/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrayBuffer2Buffer(ab: ArrayBuffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBuffer2Buffer")(ab.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def arrayish2Buffer(arr: Arrayish[Double]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayish2Buffer")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def buffer2ArrayBuffer(buff: Buffer): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer2ArrayBuffer")(buff.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  @scala.inline
  def buffer2Uint8array(buff: Buffer): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer2Uint8array")(buff.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def bufferValidator(v: js.Object, cb: BFSOneArgCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferValidator")(v.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def checkOptions(fsType: FileSystemConstructor, opts: js.Any, cb: BFSOneArgCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkOptions")(fsType.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def copyingSlice(buff: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("copyingSlice")(buff.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def copyingSlice(buff: Buffer, start: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("copyingSlice")(buff.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def copyingSlice(buff: Buffer, start: Double, end: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("copyingSlice")(buff.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def copyingSlice(buff: Buffer, start: Unit, end: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("copyingSlice")(buff.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def deprecationMessage(print: Boolean, fsName: String, opts: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecationMessage")(print.asInstanceOf[js.Any], fsName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def emptyBuffer(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyBuffer")().asInstanceOf[Buffer]
  
  @scala.inline
  def fail(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[Unit]
  
  @JSImport("browserfs/dist/node/core/util", "isIE")
  @js.native
  val isIE: Boolean = js.native
  
  @JSImport("browserfs/dist/node/core/util", "isWebWorker")
  @js.native
  val isWebWorker: Boolean = js.native
  
  @scala.inline
  def mkdirpSync(p: String, mode: Double, fs: FileSystem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpSync")(p.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def uint8Array2Buffer(u8: Uint8Array): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("uint8Array2Buffer")(u8.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  trait Arrayish[T]
    extends StObject
       with /* idx */ NumberDictionary[T] {
    
    var length: Double
  }
  object Arrayish {
    
    @scala.inline
    def apply[T](length: Double): Arrayish[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arrayish[T]]
    }
    
    @scala.inline
    implicit class ArrayishMutableBuilder[Self <: Arrayish[?], T] (val x: Self & Arrayish[T]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
