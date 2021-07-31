package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditRowState extends StObject
@JSImport("azdata", "EditRowState")
@js.native
object EditRowState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditRowState & Double] = js.native
  
  @js.native
  sealed trait clean
    extends StObject
       with EditRowState
  /* 0 */ val clean: typings.azdata.mod.EditRowState.clean & Double = js.native
  
  @js.native
  sealed trait dirtyDelete
    extends StObject
       with EditRowState
  /* 2 */ val dirtyDelete: typings.azdata.mod.EditRowState.dirtyDelete & Double = js.native
  
  @js.native
  sealed trait dirtyInsert
    extends StObject
       with EditRowState
  /* 1 */ val dirtyInsert: typings.azdata.mod.EditRowState.dirtyInsert & Double = js.native
  
  @js.native
  sealed trait dirtyUpdate
    extends StObject
       with EditRowState
  /* 3 */ val dirtyUpdate: typings.azdata.mod.EditRowState.dirtyUpdate & Double = js.native
}
