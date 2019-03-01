package typings
package chromecastDashCafDashSenderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Framework extends js.Object {
  ////////////////////
  // Framework
  ////////////////////
  /**
    * Cast Application Framework
    * @see https://developers.google.com/cast/docs/reference/chrome/cast.framework
    */
  val frameworkNs: Anon_ActiveInputState
}

object Anon_Framework {
  @scala.inline
  def apply(frameworkNs: Anon_ActiveInputState): Anon_Framework = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frameworkNs")(frameworkNs)
    __obj.asInstanceOf[Anon_Framework]
  }
}

