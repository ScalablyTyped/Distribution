package typings
package cordovaDashPluginDashInsomniaLib.InsomniaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insomnia extends js.Object {
  /**
  		 * After making your app practically a zombie, you can allow it to sleep again by calling allowSleepAgain.
  		 */
  def allowSleepAgain(): scala.Unit = js.native
  def allowSleepAgain(success: js.Function0[_]): scala.Unit = js.native
  def allowSleepAgain(success: js.Function0[_], fail: js.Function0[_]): scala.Unit = js.native
  /**
  		 * Prevent the screen of the mobile device from falling asleep.
  		 */
  def keepAwake(): scala.Unit = js.native
  def keepAwake(success: js.Function0[_]): scala.Unit = js.native
  def keepAwake(success: js.Function0[_], fail: js.Function0[_]): scala.Unit = js.native
}

