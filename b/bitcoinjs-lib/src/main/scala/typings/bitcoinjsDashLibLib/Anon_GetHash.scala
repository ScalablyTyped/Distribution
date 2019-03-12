package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetHash extends js.Object {
  def getHash(): nodeLib.Buffer
}

object Anon_GetHash {
  @scala.inline
  def apply(getHash: () => nodeLib.Buffer): Anon_GetHash = {
    val __obj = js.Dynamic.literal(getHash = js.Any.fromFunction0(getHash))
  
    __obj.asInstanceOf[Anon_GetHash]
  }
}

