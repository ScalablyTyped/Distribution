package typings.bitcoinjsDashLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Buffer
  var prefix: String
  var version: Double
}

object Anon_Data {
  @scala.inline
  def apply(data: Buffer, prefix: String, version: Double): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, prefix = prefix, version = version)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

