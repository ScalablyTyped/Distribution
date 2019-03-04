package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashType extends js.Object {
  var hashType: scala.Double
  var signature: nodeLib.Buffer
}

object Anon_HashType {
  @scala.inline
  def apply(hashType: scala.Double, signature: nodeLib.Buffer): Anon_HashType = {
    val __obj = js.Dynamic.literal(hashType = hashType, signature = signature)
  
    __obj.asInstanceOf[Anon_HashType]
  }
}

