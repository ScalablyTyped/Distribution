package typings.bucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BucksNs {
  import typings.std.Error

  type Task = js.Function2[/* err */ js.UndefOr[Error], /* res */ js.UndefOr[js.Any], js.Any]
  type TaskWithNext = js.Function3[
    /* err */ js.UndefOr[Error], 
    /* res */ js.UndefOr[js.Any], 
    /* next */ js.UndefOr[Task], 
    js.Any
  ]
}
