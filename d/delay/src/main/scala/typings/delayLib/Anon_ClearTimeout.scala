package typings
package delayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ClearTimeout extends js.Object {
  var clearTimeout: js.Function1[/* handle */ scala.Double, scala.Unit]
  var setTimeout: js.Function3[
    /* handler */ stdLib.TimerHandler, 
    /* timeout */ scala.Double, 
    /* repeated */js.Any, 
    scala.Double
  ]
}

