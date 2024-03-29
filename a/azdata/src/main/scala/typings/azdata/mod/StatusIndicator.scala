package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusIndicator extends StObject
@JSImport("azdata", "StatusIndicator")
@js.native
object StatusIndicator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusIndicator & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with StatusIndicator
  /* 3 */ val Error: typings.azdata.mod.StatusIndicator.Error & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with StatusIndicator
  /* 0 */ val None: typings.azdata.mod.StatusIndicator.None & Double = js.native
  
  @js.native
  sealed trait Ok
    extends StObject
       with StatusIndicator
  /* 1 */ val Ok: typings.azdata.mod.StatusIndicator.Ok & Double = js.native
  
  @js.native
  sealed trait Warning
    extends StObject
       with StatusIndicator
  /* 2 */ val Warning: typings.azdata.mod.StatusIndicator.Warning & Double = js.native
}
