package typings.binarySplit

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import typings.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Split streams of binary data.
    * @param splitOn The matcher for the splitting points in the stream. Default: os.EOL
    */
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(splitOn: String): Transform = ^.asInstanceOf[js.Dynamic].apply(splitOn.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(splitOn: js.Array[js.BigInt | Double]): Transform = ^.asInstanceOf[js.Dynamic].apply(splitOn.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(splitOn: js.Object): Transform = ^.asInstanceOf[js.Dynamic].apply(splitOn.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(splitOn: js.typedarray.ArrayBuffer): Transform = ^.asInstanceOf[js.Dynamic].apply(splitOn.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(splitOn: js.typedarray.Uint8Array): Transform = ^.asInstanceOf[js.Dynamic].apply(splitOn.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(splitOn: Buffer): Transform = ^.asInstanceOf[js.Dynamic].apply(splitOn.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(splitOn: SharedArrayBuffer): Transform = ^.asInstanceOf[js.Dynamic].apply(splitOn.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
