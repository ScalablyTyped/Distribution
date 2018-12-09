package typings
package credentialLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Verify extends js.Object {
  def expired(hash: java.lang.String, days: scala.Double): scala.Boolean = js.native
  def hash(password: java.lang.String): js.Promise[credentialLib.credentialMod.hashObject] = js.native
  def hash(password: java.lang.String, callback: HashCallback): scala.Unit = js.native
  def verify(hash: credentialLib.credentialMod.hashObject, password: java.lang.String): js.Promise[scala.Boolean] = js.native
  // iterations(work: number, base): number;
  def verify(hash: credentialLib.credentialMod.hashObject, password: java.lang.String, callback: VerifyCallback): scala.Unit = js.native
  def verify(hash: java.lang.String, password: java.lang.String): js.Promise[scala.Boolean] = js.native
  // iterations(work: number, base): number;
  def verify(hash: java.lang.String, password: java.lang.String, callback: VerifyCallback): scala.Unit = js.native
}

