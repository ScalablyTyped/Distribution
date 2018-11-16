package typings
package bucksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BucksNs {
  type Task = js.Function2[/* err */ js.UndefOr[stdLib.Error], /* res */ js.UndefOr[js.Any], js.Any]
  type TaskWithNext = js.Function3[
    /* err */ js.UndefOr[stdLib.Error], 
    /* res */ js.UndefOr[js.Any], 
    /* next */ js.UndefOr[Task], 
    js.Any
  ]
}
