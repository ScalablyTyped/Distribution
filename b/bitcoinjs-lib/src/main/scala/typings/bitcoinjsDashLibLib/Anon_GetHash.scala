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
  def apply(getHash: js.Function0[nodeLib.Buffer]): Anon_GetHash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getHash")(getHash)
    __obj.asInstanceOf[Anon_GetHash]
  }
}

