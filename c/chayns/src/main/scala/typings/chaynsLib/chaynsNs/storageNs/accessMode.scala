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
  
  val PRIVATE: PRIVATE with java.lang.String = js.native
  val PROTECTED: PROTECTED with java.lang.String = js.native
  val PUBLIC: PUBLIC with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chaynsLib.chaynsNs.storageNs.accessMode with java.lang.String] = js.native
}

