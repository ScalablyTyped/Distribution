package typings
package cryptexLib.cryptexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cryptex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decrypt(data: java.lang.String): js.Promise[java.lang.String] = js.native
  def decrypt(data: java.lang.String, encoding: java.lang.String): js.Promise[java.lang.String] = js.native
  def encrypt(data: java.lang.String): js.Promise[java.lang.String] = js.native
  def encrypt(data: java.lang.String, encoding: java.lang.String): js.Promise[java.lang.String] = js.native
  def getSecret(secret: java.lang.String): js.Promise[java.lang.String] = js.native
  def getSecret(secret: java.lang.String, optional: scala.Boolean): js.Promise[java.lang.String] = js.native
  def getSecrets(secrets: js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def getSecrets(secrets: js.Array[java.lang.String], optional: scala.Boolean): js.Promise[js.Array[java.lang.String]] = js.native
  def update(opts: CryptexOpts): scala.Unit = js.native
}

