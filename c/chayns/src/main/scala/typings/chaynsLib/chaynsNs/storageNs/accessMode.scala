package typings
package chaynsLib.chaynsNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait accessMode extends js.Object

@JSGlobal("chayns.storage.accessMode")
@js.native
object accessMode extends js.Object {
  @js.native
  sealed trait PRIVATE
    extends chaynsLib.chaynsNs.storageNs.accessMode
  
  @js.native
  sealed trait PROTECTED
    extends chaynsLib.chaynsNs.storageNs.accessMode
  
  @js.native
  sealed trait PUBLIC
    extends chaynsLib.chaynsNs.storageNs.accessMode
  
  /* 2 */ val PRIVATE: PRIVATE with scala.Double = js.native
  /* 1 */ val PROTECTED: PROTECTED with scala.Double = js.native
  /* 0 */ val PUBLIC: PUBLIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[chaynsLib.chaynsNs.storageNs.accessMode with scala.Double] = js.native
}

