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
    val __obj = js.Dynamic.literal(clockseq = clockseq, msecs = msecs.asInstanceOf[js.Any], node = node, nsecs = nsecs)
  
    __obj.asInstanceOf[Anon_Clockseq]
  }
}

