package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrequencyRelativeIntervals extends StObject
@JSImport("azdata", "FrequencyRelativeIntervals")
@js.native
object FrequencyRelativeIntervals extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrequencyRelativeIntervals with Double] = js.native
  
  @js.native
  sealed trait First extends FrequencyRelativeIntervals
  /* 1 */ val First: typings.azdata.mod.FrequencyRelativeIntervals.First with Double = js.native
  
  @js.native
  sealed trait Fourth extends FrequencyRelativeIntervals
  /* 8 */ val Fourth: typings.azdata.mod.FrequencyRelativeIntervals.Fourth with Double = js.native
  
  @js.native
  sealed trait Last extends FrequencyRelativeIntervals
  /* 16 */ val Last: typings.azdata.mod.FrequencyRelativeIntervals.Last with Double = js.native
  
  @js.native
  sealed trait Second extends FrequencyRelativeIntervals
  /* 2 */ val Second: typings.azdata.mod.FrequencyRelativeIntervals.Second with Double = js.native
  
  @js.native
  sealed trait Third extends FrequencyRelativeIntervals
  /* 4 */ val Third: typings.azdata.mod.FrequencyRelativeIntervals.Third with Double = js.native
}
