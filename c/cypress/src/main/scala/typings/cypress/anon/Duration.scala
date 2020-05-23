package typings.cypress.anon

import typings.cypress.JQuery._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration
  extends _SpeedSettings[js.Any] {
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: typings.cypress.JQuery.Duration
}

object Duration {
  @scala.inline
  def apply(duration: typings.cypress.JQuery.Duration): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

