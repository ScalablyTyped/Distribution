package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encode extends js.Object {
  def check(script: nodeLib.Buffer): scala.Boolean
  def decode(buffer: nodeLib.Buffer): js.Array[nodeLib.Buffer]
  def encode(commitment: nodeLib.Buffer): nodeLib.Buffer
}

