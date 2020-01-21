package typings.bcrypt

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bcrypt", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def compare(data: js.Any, encrypted: String): js.Promise[Boolean] = js.native
  def compare(data: js.Any, encrypted: String, callback: js.Function2[/* err */ Error, /* same */ Boolean, Unit]): js.Promise[Boolean] = js.native
  def compareSync(data: js.Any, encrypted: String): Boolean = js.native
  def genSalt(): js.Promise[String] = js.native
  def genSalt(callback: js.Function2[/* err */ Error, /* salt */ String, Unit]): js.Promise[String] = js.native
  def genSalt(rounds: Double): js.Promise[String] = js.native
  def genSalt(rounds: Double, callback: js.Function2[/* err */ Error, /* salt */ String, Unit]): js.Promise[String] = js.native
  def genSalt(rounds: Double, minor: String): js.Promise[String] = js.native
  def genSalt(rounds: Double, minor: String, callback: js.Function2[/* err */ Error, /* salt */ String, Unit]): js.Promise[String] = js.native
  def genSaltSync(): String = js.native
  def genSaltSync(rounds: Double): String = js.native
  def genSaltSync(rounds: Double, minor: String): String = js.native
  def getRounds(encrypted: String): Double = js.native
  def hash(data: js.Any, saltOrRounds: String): js.Promise[String] = js.native
  def hash(
    data: js.Any,
    saltOrRounds: String,
    callback: js.Function2[/* err */ Error, /* encrypted */ String, Unit]
  ): js.Promise[String] = js.native
  def hash(data: js.Any, saltOrRounds: Double): js.Promise[String] = js.native
  def hash(
    data: js.Any,
    saltOrRounds: Double,
    callback: js.Function2[/* err */ Error, /* encrypted */ String, Unit]
  ): js.Promise[String] = js.native
  def hashSync(data: js.Any, saltOrRounds: String): String = js.native
  def hashSync(data: js.Any, saltOrRounds: Double): String = js.native
}

