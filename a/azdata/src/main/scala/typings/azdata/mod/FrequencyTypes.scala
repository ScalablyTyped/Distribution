package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrequencyTypes extends js.Object

@JSImport("azdata", "FrequencyTypes")
@js.native
object FrequencyTypes extends js.Object {
  @js.native
  sealed trait AutoStart extends FrequencyTypes
  
  @js.native
  sealed trait Daily extends FrequencyTypes
  
  @js.native
  sealed trait Monthly extends FrequencyTypes
  
  @js.native
  sealed trait MonthlyRelative extends FrequencyTypes
  
  @js.native
  sealed trait OnIdle extends FrequencyTypes
  
  @js.native
  sealed trait OneTime extends FrequencyTypes
  
  @js.native
  sealed trait Unknown extends FrequencyTypes
  
  @js.native
  sealed trait Weekly extends FrequencyTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrequencyTypes with Double] = js.native
  /* 1 << 6 */ @js.native
  object AutoStart extends TopLevel[AutoStart with Double]
  
  /* 1 << 2 */ @js.native
  object Daily extends TopLevel[Daily with Double]
  
  /* 1 << 4 */ @js.native
  object Monthly extends TopLevel[Monthly with Double]
  
  /* 1 << 5 */ @js.native
  object MonthlyRelative extends TopLevel[MonthlyRelative with Double]
  
  /* 1 << 7 */ @js.native
  object OnIdle extends TopLevel[OnIdle with Double]
  
  /* 1 << 1 */ @js.native
  object OneTime extends TopLevel[OneTime with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
  /* 1 << 3 */ @js.native
  object Weekly extends TopLevel[Weekly with Double]
  
}

