package typings.blake2.mod

import typings.node.Buffer
import typings.node.cryptoMod.HexBase64Latin1Encoding
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blake2", "Hash")
@js.native
class Hash protected () extends Transform {
  def this(algorithm: Blake2Algorithm) = this()
  def this(algorithm: Blake2Algorithm, options: Blake2Options) = this()
  
  def copy(): this.type = js.native
  
  def digest(): Buffer = js.native
  def digest(encoding: HexBase64Latin1Encoding): String = js.native
  
  def update(buf: Buffer): this.type = js.native
}
