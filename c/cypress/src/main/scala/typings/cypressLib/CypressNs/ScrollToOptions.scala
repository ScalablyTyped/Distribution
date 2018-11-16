package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollToOptions
  extends Loggable
     with Timeoutable {
  /**
       * Scrolls over the duration (in ms)
       *
       * @default 0
       */
  var duration: scala.Double
  /**
       * Will scroll with the easing animation
       *
       * @default 'swing'
       */
  var easing: cypressLib.cypressLibStrings.swing | cypressLib.cypressLibStrings.linear
}

