package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrequencyTypes extends js.Object
@JSImport("azdata", "FrequencyTypes")
@js.native
object FrequencyTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrequencyTypes with Double] = js.native
  
  @js.native
  sealed trait AutoStart extends FrequencyTypes
  /* 1 << 6 */ @js.native
  object AutoStart extends TopLevel[AutoStart with Double]
  
  @js.native
  sealed trait Daily extends FrequencyTypes
  /* 1 << 2 */ @js.native
  object Daily extends TopLevel[Daily with Double]
  
  @js.native
  sealed trait Monthly extends FrequencyTypes
  /* 1 << 4 */ @js.native
  object Monthly extends TopLevel[Monthly with Double]
  
  @js.native
  sealed trait MonthlyRelative extends FrequencyTypes
  /* 1 << 5 */ @js.native
  object MonthlyRelative extends TopLevel[MonthlyRelative with Double]
  
  @js.native
  sealed trait OnIdle extends FrequencyTypes
  /* 1 << 7 */ @js.native
  object OnIdle extends TopLevel[OnIdle with Double]
  
  @js.native
  sealed trait OneTime extends FrequencyTypes
  /* 1 << 1 */ @js.native
  object OneTime extends TopLevel[OneTime with Double]
  
  @js.native
  sealed trait Unknown extends FrequencyTypes
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
  @js.native
  sealed trait Weekly extends FrequencyTypes
  /* 1 << 3 */ @js.native
  object Weekly extends TopLevel[Weekly with Double]
}
