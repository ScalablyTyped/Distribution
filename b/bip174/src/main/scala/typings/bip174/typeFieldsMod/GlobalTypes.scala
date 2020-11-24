package typings.bip174.typeFieldsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GlobalTypes extends js.Object
@JSImport("bip174/src/lib/typeFields", "GlobalTypes")
@js.native
object GlobalTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GlobalTypes with Double] = js.native
  
  @js.native
  sealed trait GLOBAL_XPUB extends GlobalTypes
  /* 1 */ @js.native
  object GLOBAL_XPUB extends TopLevel[GLOBAL_XPUB with Double]
  
  @js.native
  sealed trait UNSIGNED_TX extends GlobalTypes
  /* 0 */ @js.native
  object UNSIGNED_TX extends TopLevel[UNSIGNED_TX with Double]
}
