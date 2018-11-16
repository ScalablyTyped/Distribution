package typings
package bcryptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bcrypt", JSImport.Namespace)
@js.native
object bcryptMod extends js.Object {
  def compare(data: js.Any, encrypted: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def compare(
    data: js.Any,
    encrypted: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* same */ scala.Boolean, scala.Unit]
  ): stdLib.Promise[scala.Boolean] = js.native
  def compareSync(data: js.Any, encrypted: java.lang.String): scala.Boolean = js.native
  def genSalt(): stdLib.Promise[java.lang.String] = js.native
  def genSalt(callback: js.Function2[/* err */ stdLib.Error, /* salt */ java.lang.String, scala.Unit]): stdLib.Promise[java.lang.String] = js.native
  def genSalt(rounds: scala.Double): stdLib.Promise[java.lang.String] = js.native
  def genSalt(
    rounds: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* salt */ java.lang.String, scala.Unit]
  ): stdLib.Promise[java.lang.String] = js.native
  def genSalt(rounds: scala.Double, minor: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def genSalt(
    rounds: scala.Double,
    minor: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* salt */ java.lang.String, scala.Unit]
  ): stdLib.Promise[java.lang.String] = js.native
  def genSaltSync(): java.lang.String = js.native
  def genSaltSync(rounds: scala.Double): java.lang.String = js.native
  def genSaltSync(rounds: scala.Double, minor: java.lang.String): java.lang.String = js.native
  def getRounds(encrypted: java.lang.String): scala.Double = js.native
  def hash(data: js.Any, saltOrRounds: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def hash(
    data: js.Any,
    saltOrRounds: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* encrypted */ java.lang.String, scala.Unit]
  ): stdLib.Promise[java.lang.String] = js.native
  def hash(data: js.Any, saltOrRounds: scala.Double): stdLib.Promise[java.lang.String] = js.native
  def hash(
    data: js.Any,
    saltOrRounds: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* encrypted */ java.lang.String, scala.Unit]
  ): stdLib.Promise[java.lang.String] = js.native
  def hashSync(data: js.Any, saltOrRounds: java.lang.String): java.lang.String = js.native
  def hashSync(data: js.Any, saltOrRounds: scala.Double): java.lang.String = js.native
}

