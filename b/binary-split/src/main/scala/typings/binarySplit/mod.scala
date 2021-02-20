package typings.binarySplit

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.std.ArrayBuffer
import typings.std.SharedArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Split streams of binary data.
    * @param splitOn The matcher for the splitting points in the stream. Default: os.EOL
    */
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: String): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: js.Array[js.BigInt | Double]): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: js.Object): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: Buffer): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: ArrayBuffer): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: SharedArrayBuffer): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: Uint8Array): Transform = js.native
}
