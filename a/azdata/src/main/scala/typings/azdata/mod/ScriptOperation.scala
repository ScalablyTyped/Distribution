package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptOperation extends StObject
@JSImport("azdata", "ScriptOperation")
@js.native
object ScriptOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptOperation with Double] = js.native
  
  @js.native
  sealed trait Alter extends ScriptOperation
  /* 6 */ val Alter: typings.azdata.mod.ScriptOperation.Alter with Double = js.native
  
  @js.native
  sealed trait Create extends ScriptOperation
  /* 1 */ val Create: typings.azdata.mod.ScriptOperation.Create with Double = js.native
  
  @js.native
  sealed trait Delete extends ScriptOperation
  /* 4 */ val Delete: typings.azdata.mod.ScriptOperation.Delete with Double = js.native
  
  @js.native
  sealed trait Execute extends ScriptOperation
  /* 5 */ val Execute: typings.azdata.mod.ScriptOperation.Execute with Double = js.native
  
  @js.native
  sealed trait Insert extends ScriptOperation
  /* 2 */ val Insert: typings.azdata.mod.ScriptOperation.Insert with Double = js.native
  
  @js.native
  sealed trait Select extends ScriptOperation
  /* 0 */ val Select: typings.azdata.mod.ScriptOperation.Select with Double = js.native
  
  @js.native
  sealed trait Update extends ScriptOperation
  /* 3 */ val Update: typings.azdata.mod.ScriptOperation.Update with Double = js.native
}
