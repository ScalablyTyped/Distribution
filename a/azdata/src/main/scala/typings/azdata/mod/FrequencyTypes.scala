package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrequencyTypes extends StObject
@JSImport("azdata", "FrequencyTypes")
@js.native
object FrequencyTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrequencyTypes with Double] = js.native
  
  @js.native
  sealed trait AutoStart extends FrequencyTypes
  /* 1 << 6 */ val AutoStart: typings.azdata.mod.FrequencyTypes.AutoStart with Double = js.native
  
  @js.native
  sealed trait Daily extends FrequencyTypes
  /* 1 << 2 */ val Daily: typings.azdata.mod.FrequencyTypes.Daily with Double = js.native
  
  @js.native
  sealed trait Monthly extends FrequencyTypes
  /* 1 << 4 */ val Monthly: typings.azdata.mod.FrequencyTypes.Monthly with Double = js.native
  
  @js.native
  sealed trait MonthlyRelative extends FrequencyTypes
  /* 1 << 5 */ val MonthlyRelative: typings.azdata.mod.FrequencyTypes.MonthlyRelative with Double = js.native
  
  @js.native
  sealed trait OnIdle extends FrequencyTypes
  /* 1 << 7 */ val OnIdle: typings.azdata.mod.FrequencyTypes.OnIdle with Double = js.native
  
  @js.native
  sealed trait OneTime extends FrequencyTypes
  /* 1 << 1 */ val OneTime: typings.azdata.mod.FrequencyTypes.OneTime with Double = js.native
  
  @js.native
  sealed trait Unknown extends FrequencyTypes
  /* 0 */ val Unknown: typings.azdata.mod.FrequencyTypes.Unknown with Double = js.native
  
  @js.native
  sealed trait Weekly extends FrequencyTypes
  /* 1 << 3 */ val Weekly: typings.azdata.mod.FrequencyTypes.Weekly with Double = js.native
}
