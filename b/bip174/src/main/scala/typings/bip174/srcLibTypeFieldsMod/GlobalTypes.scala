package typings.bip174.srcLibTypeFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GlobalTypes extends js.Object

@JSImport("bip174/src/lib/typeFields", "GlobalTypes")
@js.native
object GlobalTypes extends js.Object {
  @js.native
  sealed trait GLOBAL_XPUB extends GlobalTypes
  
  @js.native
  sealed trait UNSIGNED_TX extends GlobalTypes
  
  /* 1 */ val GLOBAL_XPUB: typings.bip174.srcLibTypeFieldsMod.GlobalTypes.GLOBAL_XPUB with Double = js.native
  /* 0 */ val UNSIGNED_TX: typings.bip174.srcLibTypeFieldsMod.GlobalTypes.UNSIGNED_TX with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GlobalTypes with Double] = js.native
}

