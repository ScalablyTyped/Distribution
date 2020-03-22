package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptOperation extends js.Object

@JSImport("azdata", "ScriptOperation")
@js.native
object ScriptOperation extends js.Object {
  @js.native
  sealed trait Alter extends ScriptOperation
  
  @js.native
  sealed trait Create extends ScriptOperation
  
  @js.native
  sealed trait Delete extends ScriptOperation
  
  @js.native
  sealed trait Execute extends ScriptOperation
  
  @js.native
  sealed trait Insert extends ScriptOperation
  
  @js.native
  sealed trait Select extends ScriptOperation
  
  @js.native
  sealed trait Update extends ScriptOperation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptOperation with Double] = js.native
  /* 6 */ @js.native
  object Alter extends TopLevel[Alter with Double]
  
  /* 1 */ @js.native
  object Create extends TopLevel[Create with Double]
  
  /* 4 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 5 */ @js.native
  object Execute extends TopLevel[Execute with Double]
  
  /* 2 */ @js.native
  object Insert extends TopLevel[Insert with Double]
  
  /* 0 */ @js.native
  object Select extends TopLevel[Select with Double]
  
  /* 3 */ @js.native
  object Update extends TopLevel[Update with Double]
  
}

