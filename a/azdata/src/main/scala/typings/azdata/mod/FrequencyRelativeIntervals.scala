package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrequencyRelativeIntervals extends js.Object

@JSImport("azdata", "FrequencyRelativeIntervals")
@js.native
object FrequencyRelativeIntervals extends js.Object {
  @js.native
  sealed trait First extends FrequencyRelativeIntervals
  
  @js.native
  sealed trait Fourth extends FrequencyRelativeIntervals
  
  @js.native
  sealed trait Last extends FrequencyRelativeIntervals
  
  @js.native
  sealed trait Second extends FrequencyRelativeIntervals
  
  @js.native
  sealed trait Third extends FrequencyRelativeIntervals
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrequencyRelativeIntervals with Double] = js.native
  /* 1 */ @js.native
  object First extends TopLevel[First with Double]
  
  /* 8 */ @js.native
  object Fourth extends TopLevel[Fourth with Double]
  
  /* 16 */ @js.native
  object Last extends TopLevel[Last with Double]
  
  /* 2 */ @js.native
  object Second extends TopLevel[Second with Double]
  
  /* 4 */ @js.native
  object Third extends TopLevel[Third with Double]
  
}

