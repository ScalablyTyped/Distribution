package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditRowState extends StObject
@JSImport("azdata", "EditRowState")
@js.native
object EditRowState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditRowState with Double] = js.native
  
  @js.native
  sealed trait clean extends EditRowState
  /* 0 */ val clean: typings.azdata.mod.EditRowState.clean with Double = js.native
  
  @js.native
  sealed trait dirtyDelete extends EditRowState
  /* 2 */ val dirtyDelete: typings.azdata.mod.EditRowState.dirtyDelete with Double = js.native
  
  @js.native
  sealed trait dirtyInsert extends EditRowState
  /* 1 */ val dirtyInsert: typings.azdata.mod.EditRowState.dirtyInsert with Double = js.native
  
  @js.native
  sealed trait dirtyUpdate extends EditRowState
  /* 3 */ val dirtyUpdate: typings.azdata.mod.EditRowState.dirtyUpdate with Double = js.native
}
