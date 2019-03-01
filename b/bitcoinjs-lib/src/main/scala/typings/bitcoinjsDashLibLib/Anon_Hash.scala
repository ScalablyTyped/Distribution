package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  var hash: nodeLib.Buffer
  var version: scala.Double
}

object Anon_Hash {
  @scala.inline
  def apply(hash: nodeLib.Buffer, version: scala.Double): Anon_Hash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Hash]
  }
}

