package typings.bip174.srcLibTypeFieldsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GlobalTypes with Double] = js.native
  /* 1 */ @js.native
  object GLOBAL_XPUB extends TopLevel[GLOBAL_XPUB with Double]
  
  /* 0 */ @js.native
  object UNSIGNED_TX extends TopLevel[UNSIGNED_TX with Double]
  
}

