package typings
package convertDashHrtimeLib.convertDashHrtimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("convert-hrtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Convert the result of [`process.hrtime()`](https://nodejs.org/api/process.html#process_process_hrtime_time) to seconds, milliseconds, nanoseconds.
  @example
  ```
  import convertHrtime = require('convert-hrtime');
  convertHrtime(process.hrtime(process.hrtime()));
  //=> {seconds: 0.000002399, milliseconds: 0.002399, nanoseconds: 2399}
  ```
  */
  def apply(hrtime: js.Tuple2[scala.Double, scala.Double]): HRTime = js.native
}

