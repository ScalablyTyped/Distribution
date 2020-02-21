package typings.bcryptNodejs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bcrypt-nodejs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def compare(data: String, hash: String, callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): Unit = js.native
  def compareSync(data: String, hash: String): Boolean = js.native
  def genSalt(rounds: Double, callback: js.Function2[/* error */ Error, /* result */ String, Unit]): Unit = js.native
  def genSaltSync(): String = js.native
  def genSaltSync(rounds: Double): String = js.native
  def getRounds(hash: String): Double = js.native
  def hash(data: String, salt: String, callback: js.Function2[/* error */ Error, /* result */ String, Unit]): Unit = js.native
  def hash(
    data: String,
    salt: String,
    progressCallback: js.Function0[Unit],
    callback: js.Function2[/* error */ Error, /* result */ String, Unit]
  ): Unit = js.native
  def hash(
    data: String,
    salt: String,
    progressCallback: Null,
    callback: js.Function2[/* error */ Error, /* result */ String, Unit]
  ): Unit = js.native
  def hashSync(data: String): String = js.native
  def hashSync(data: String, salt: String): String = js.native
}

