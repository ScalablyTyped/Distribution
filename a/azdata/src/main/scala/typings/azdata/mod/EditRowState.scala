package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditRowState extends js.Object
@JSImport("azdata", "EditRowState")
@js.native
object EditRowState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditRowState with Double] = js.native
  
  @js.native
  sealed trait clean extends EditRowState
  /* 0 */ @js.native
  object clean extends TopLevel[clean with Double]
  
  @js.native
  sealed trait dirtyDelete extends EditRowState
  /* 2 */ @js.native
  object dirtyDelete extends TopLevel[dirtyDelete with Double]
  
  @js.native
  sealed trait dirtyInsert extends EditRowState
  /* 1 */ @js.native
  object dirtyInsert extends TopLevel[dirtyInsert with Double]
  
  @js.native
  sealed trait dirtyUpdate extends EditRowState
  /* 3 */ @js.native
  object dirtyUpdate extends TopLevel[dirtyUpdate with Double]
}
