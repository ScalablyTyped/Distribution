package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptOperation extends StObject
@JSImport("azdata", "ScriptOperation")
@js.native
object ScriptOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptOperation & Double] = js.native
  
  @js.native
  sealed trait Alter
    extends StObject
       with ScriptOperation
  /* 6 */ val Alter: typings.azdata.mod.ScriptOperation.Alter & Double = js.native
  
  @js.native
  sealed trait Create
    extends StObject
       with ScriptOperation
  /* 1 */ val Create: typings.azdata.mod.ScriptOperation.Create & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with ScriptOperation
  /* 4 */ val Delete: typings.azdata.mod.ScriptOperation.Delete & Double = js.native
  
  @js.native
  sealed trait Execute
    extends StObject
       with ScriptOperation
  /* 5 */ val Execute: typings.azdata.mod.ScriptOperation.Execute & Double = js.native
  
  @js.native
  sealed trait Insert
    extends StObject
       with ScriptOperation
  /* 2 */ val Insert: typings.azdata.mod.ScriptOperation.Insert & Double = js.native
  
  @js.native
  sealed trait Select
    extends StObject
       with ScriptOperation
  /* 0 */ val Select: typings.azdata.mod.ScriptOperation.Select & Double = js.native
  
  @js.native
  sealed trait Update
    extends StObject
       with ScriptOperation
  /* 3 */ val Update: typings.azdata.mod.ScriptOperation.Update & Double = js.native
}
