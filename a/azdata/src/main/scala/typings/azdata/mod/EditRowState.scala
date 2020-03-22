package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditRowState extends js.Object

@JSImport("azdata", "EditRowState")
@js.native
object EditRowState extends js.Object {
  @js.native
  sealed trait clean extends EditRowState
  
  @js.native
  sealed trait dirtyDelete extends EditRowState
  
  @js.native
  sealed trait dirtyInsert extends EditRowState
  
  @js.native
  sealed trait dirtyUpdate extends EditRowState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditRowState with Double] = js.native
  /* 0 */ @js.native
  object clean extends TopLevel[clean with Double]
  
  /* 2 */ @js.native
  object dirtyDelete extends TopLevel[dirtyDelete with Double]
  
  /* 1 */ @js.native
  object dirtyInsert extends TopLevel[dirtyInsert with Double]
  
  /* 3 */ @js.native
  object dirtyUpdate extends TopLevel[dirtyUpdate with Double]
  
}

