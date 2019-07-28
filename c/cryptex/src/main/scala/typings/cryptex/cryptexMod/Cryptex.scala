package typings.cryptex.cryptexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cryptex", "Cryptex")
@js.native
class Cryptex protected () extends js.Object {
  def this(opts: CryptexOpts) = this()
  def decrypt(data: String): String = js.native
  def decrypt(data: String, encoding: String): String = js.native
  def encrypt(data: String): String = js.native
  def encrypt(data: String, encoding: String): String = js.native
  def getSecret(secret: String): js.Promise[String] = js.native
  def getSecret(secret: String, optional: Boolean): js.Promise[String] = js.native
  def getSecrets(secrets: js.Array[String]): js.Promise[js.Array[String]] = js.native
  def getSecrets(secrets: js.Array[String], optional: Boolean): js.Promise[js.Array[String]] = js.native
  def update(opts: CryptexOpts): Unit = js.native
}

