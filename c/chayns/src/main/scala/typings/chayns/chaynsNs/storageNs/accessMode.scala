package typings.chayns.chaynsNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait accessMode extends js.Object

@JSGlobal("chayns.storage.accessMode")
@js.native
object accessMode extends js.Object {
  @js.native
  sealed trait PRIVATE extends accessMode
  
  @js.native
  sealed trait PROTECTED extends accessMode
  
  @js.native
  sealed trait PUBLIC extends accessMode
  
  /* 2 */ val PRIVATE: typings.chayns.chaynsNs.storageNs.accessMode.PRIVATE with Double = js.native
  /* 1 */ val PROTECTED: typings.chayns.chaynsNs.storageNs.accessMode.PROTECTED with Double = js.native
  /* 0 */ val PUBLIC: typings.chayns.chaynsNs.storageNs.accessMode.PUBLIC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[accessMode with Double] = js.native
}

