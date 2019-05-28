package typings
package chromecastDashCafDashSenderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcast extends js.Object {
  ////////////////////
  // Framework
  ////////////////////
  /**
    * Cast Application Framework
    * @see https://developers.google.com/cast/docs/reference/chrome/cast.framework
    */
  val frameworkNs: Typeofframework
}

object Typeofcast {
  @scala.inline
  def apply(frameworkNs: Typeofframework): Typeofcast = {
    val __obj = js.Dynamic.literal(frameworkNs = frameworkNs)
  
    __obj.asInstanceOf[Typeofcast]
  }
}

