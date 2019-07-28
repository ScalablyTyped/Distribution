package typings.bitcoinjsDashLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetHash extends js.Object {
  def getHash(): Buffer
}

object Anon_GetHash {
  @scala.inline
  def apply(getHash: () => Buffer): Anon_GetHash = {
    val __obj = js.Dynamic.literal(getHash = js.Any.fromFunction0(getHash))
  
    __obj.asInstanceOf[Anon_GetHash]
  }
}

