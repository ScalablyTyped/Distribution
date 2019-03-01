package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clockseq extends js.Object {
  var clockseq: scala.Double
  var msecs: scala.Double | stdLib.Date
  var node: nodeLib.Buffer
  var nsecs: scala.Double
}

object Anon_Clockseq {
  @scala.inline
  def apply(
    clockseq: scala.Double,
    msecs: scala.Double | stdLib.Date,
    node: nodeLib.Buffer,
    nsecs: scala.Double
  ): Anon_Clockseq = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clockseq")(clockseq)
    __obj.updateDynamic("msecs")(msecs.asInstanceOf[js.Any])
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("nsecs")(nsecs)
    __obj.asInstanceOf[Anon_Clockseq]
  }
}

