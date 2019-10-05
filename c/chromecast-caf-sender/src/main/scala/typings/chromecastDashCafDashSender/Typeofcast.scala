package typings.chromecastDashCafDashSender

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
  val framework: Typeofframework
}

object Typeofcast {
  @scala.inline
  def apply(framework: Typeofframework): Typeofcast = {
    val __obj = js.Dynamic.literal(framework = framework)
  
    __obj.asInstanceOf[Typeofcast]
  }
}

