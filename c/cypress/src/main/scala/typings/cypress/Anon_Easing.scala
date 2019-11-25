package typings.cypress

import typings.cypress.JQuery._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Easing
  extends _SpeedSettings[js.Any] {
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: String
}

object Anon_Easing {
  @scala.inline
  def apply(easing: String): Anon_Easing = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Easing]
  }
}

