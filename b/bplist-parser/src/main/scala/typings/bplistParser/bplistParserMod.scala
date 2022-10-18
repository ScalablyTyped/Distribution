package typings.bplistParser

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bplistParserMod {
  
  @JSImport("bplist-parser/bplistParser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseBuffer[T](buffer: String): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def parseBuffer[T](buffer: Buffer): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def parseFile[T](fileNameOrBuffer: String): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(fileNameOrBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  inline def parseFile[T](fileNameOrBuffer: String, callback: CallbackFunction[T]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(fileNameOrBuffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def parseFile[T](fileNameOrBuffer: Buffer): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(fileNameOrBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  inline def parseFile[T](fileNameOrBuffer: Buffer, callback: CallbackFunction[T]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(fileNameOrBuffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def parseFileSync[T](fileNameOrBuffer: String): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFileSync")(fileNameOrBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def parseFileSync[T](fileNameOrBuffer: Buffer): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFileSync")(fileNameOrBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  type CallbackFunction[T] = js.Function2[/* error */ js.Error | Null, /* result */ js.Array[T], Unit]
}
