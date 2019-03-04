package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: nodeLib.Buffer
  var prefix: java.lang.String
  var version: scala.Double
}

object Anon_Data {
  @scala.inline
  def apply(data: nodeLib.Buffer, prefix: java.lang.String, version: scala.Double): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, prefix = prefix, version = version)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

