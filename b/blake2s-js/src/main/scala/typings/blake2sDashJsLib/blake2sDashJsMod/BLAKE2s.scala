package typings
package blake2sDashJsLib.blake2sDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BLAKE2s extends js.Object {
  def digest(): stdLib.Uint8Array = js.native
  def hexDigest(): java.lang.String = js.native
  def update(p: ByteArray): this.type = js.native
  def update(p: ByteArray, offset: scala.Double): this.type = js.native
  def update(p: ByteArray, offset: scala.Double, length: scala.Double): this.type = js.native
}

