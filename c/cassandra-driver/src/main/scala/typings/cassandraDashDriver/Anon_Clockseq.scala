package typings.cassandraDashDriver

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clockseq extends js.Object {
  var clockseq: Double
  var msecs: Double | Date
  var node: Buffer
  var nsecs: Double
}

object Anon_Clockseq {
  @scala.inline
  def apply(clockseq: Double, msecs: Double | Date, node: Buffer, nsecs: Double): Anon_Clockseq = {
    val __obj = js.Dynamic.literal(clockseq = clockseq, msecs = msecs.asInstanceOf[js.Any], node = node, nsecs = nsecs)
  
    __obj.asInstanceOf[Anon_Clockseq]
  }
}

