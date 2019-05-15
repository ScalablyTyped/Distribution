package typings
package cryptexLib.cryptexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cryptex", "Cryptex")
@js.native
class Cryptex protected () extends js.Object {
  def this(opts: CryptexOpts) = this()
  def decrypt(data: java.lang.String): java.lang.String = js.native
  def decrypt(data: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def encrypt(data: java.lang.String): java.lang.String = js.native
  def encrypt(data: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def getSecret(secret: java.lang.String): js.Promise[java.lang.String] = js.native
  def getSecret(secret: java.lang.String, optional: scala.Boolean): js.Promise[java.lang.String] = js.native
  def getSecrets(secrets: js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def getSecrets(secrets: js.Array[java.lang.String], optional: scala.Boolean): js.Promise[js.Array[java.lang.String]] = js.native
  def update(opts: CryptexOpts): scala.Unit = js.native
}

