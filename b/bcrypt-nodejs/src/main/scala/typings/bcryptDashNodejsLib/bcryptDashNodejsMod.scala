package typings
package bcryptDashNodejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bcrypt-nodejs", JSImport.Namespace)
@js.native
object bcryptDashNodejsMod extends js.Object {
  def compare(
    data: java.lang.String,
    hash: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def compareSync(data: java.lang.String, hash: java.lang.String): scala.Boolean = js.native
  def genSalt(
    rounds: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def genSaltSync(): java.lang.String = js.native
  def genSaltSync(rounds: scala.Double): java.lang.String = js.native
  def getRounds(hash: java.lang.String): scala.Double = js.native
  def hash(
    data: java.lang.String,
    salt: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def hash(
    data: java.lang.String,
    salt: java.lang.String,
    progressCallback: js.Function0[scala.Unit],
    callback: js.Function2[/* error */ stdLib.Error, /* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def hashSync(data: java.lang.String): java.lang.String = js.native
  def hashSync(data: java.lang.String, salt: java.lang.String): java.lang.String = js.native
}

