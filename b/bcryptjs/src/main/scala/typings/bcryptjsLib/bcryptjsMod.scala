package typings
package bcryptjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bcryptjs", JSImport.Namespace)
@js.native
object bcryptjsMod extends js.Object {
  def compare(s: java.lang.String, hash: java.lang.String): js.Promise[scala.Boolean] = js.native
  def compare(
    s: java.lang.String,
    hash: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def compare(
    s: java.lang.String,
    hash: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* success */ scala.Boolean, scala.Unit],
    progressCallback: js.Function1[/* percent */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def compareSync(s: java.lang.String, hash: java.lang.String): scala.Boolean = js.native
  @JSName("compare")
  def compare_Unit(s: java.lang.String, hash: java.lang.String): scala.Unit = js.native
  def decodeBase64(s: java.lang.String, len: scala.Double): js.Array[scala.Double] = js.native
  def encodeBase64(b: stdLib.ArrayLike[scala.Double], len: scala.Double): java.lang.String = js.native
  def genSalt(): js.Promise[java.lang.String] = js.native
  def genSalt(callback: js.Function2[/* err */ stdLib.Error, /* salt */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def genSalt(rounds: scala.Double): js.Promise[java.lang.String] = js.native
  def genSalt(
    rounds: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* salt */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def genSaltSync(): java.lang.String = js.native
  def genSaltSync(rounds: scala.Double): java.lang.String = js.native
  def getRounds(hash: java.lang.String): scala.Double = js.native
  def getSalt(hash: java.lang.String): java.lang.String = js.native
  def hash(s: java.lang.String, salt: java.lang.String): js.Promise[java.lang.String] = js.native
  def hash(
    s: java.lang.String,
    salt: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* hash */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def hash(
    s: java.lang.String,
    salt: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* hash */ java.lang.String, scala.Unit],
    progressCallback: js.Function1[/* percent */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def hash(s: java.lang.String, salt: scala.Double): js.Promise[java.lang.String] = js.native
  def hash(
    s: java.lang.String,
    salt: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* hash */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def hash(
    s: java.lang.String,
    salt: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* hash */ java.lang.String, scala.Unit],
    progressCallback: js.Function1[/* percent */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def hashSync(s: java.lang.String): java.lang.String = js.native
  def hashSync(s: java.lang.String, salt: java.lang.String): java.lang.String = js.native
  def hashSync(s: java.lang.String, salt: scala.Double): java.lang.String = js.native
  @JSName("hash")
  def hash_Unit(s: java.lang.String, salt: java.lang.String): scala.Unit = js.native
  @JSName("hash")
  def hash_Unit(s: java.lang.String, salt: scala.Double): scala.Unit = js.native
  def setRandomFallback(random: js.Function1[/* random */ scala.Double, js.Array[scala.Double]]): scala.Unit = js.native
}

