package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptOperation extends js.Object
@JSImport("azdata", "ScriptOperation")
@js.native
object ScriptOperation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptOperation with Double] = js.native
  
  @js.native
  sealed trait Alter extends ScriptOperation
  /* 6 */ @js.native
  object Alter extends TopLevel[Alter with Double]
  
  @js.native
  sealed trait Create extends ScriptOperation
  /* 1 */ @js.native
  object Create extends TopLevel[Create with Double]
  
  @js.native
  sealed trait Delete extends ScriptOperation
  /* 4 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  @js.native
  sealed trait Execute extends ScriptOperation
  /* 5 */ @js.native
  object Execute extends TopLevel[Execute with Double]
  
  @js.native
  sealed trait Insert extends ScriptOperation
  /* 2 */ @js.native
  object Insert extends TopLevel[Insert with Double]
  
  @js.native
  sealed trait Select extends ScriptOperation
  /* 0 */ @js.native
  object Select extends TopLevel[Select with Double]
  
  @js.native
  sealed trait Update extends ScriptOperation
  /* 3 */ @js.native
  object Update extends TopLevel[Update with Double]
}
