package typings
package centraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object centraMod {
  type CentraFactory = js.Function2[
    /* url */ nodeLib.urlMod.URL | java.lang.String, 
    /* method */ js.UndefOr[java.lang.String], 
    Request
  ]
}
