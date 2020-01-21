package typings.blake2.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blake2", "createKeyedHash")
@js.native
object createKeyedHash extends js.Object {
  def apply(algorithm: Blake2Algorithm, key: Buffer): KeyedHash = js.native
  def apply(algorithm: Blake2Algorithm, key: Buffer, options: Blake2Options): KeyedHash = js.native
}

