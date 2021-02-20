package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrequencySubDayTypes extends StObject
@JSImport("azdata", "FrequencySubDayTypes")
@js.native
object FrequencySubDayTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrequencySubDayTypes with Double] = js.native
  
  @js.native
  sealed trait Hour extends FrequencySubDayTypes
  /* 8 */ val Hour: typings.azdata.mod.FrequencySubDayTypes.Hour with Double = js.native
  
  @js.native
  sealed trait Minute extends FrequencySubDayTypes
  /* 4 */ val Minute: typings.azdata.mod.FrequencySubDayTypes.Minute with Double = js.native
  
  @js.native
  sealed trait Once extends FrequencySubDayTypes
  /* 1 */ val Once: typings.azdata.mod.FrequencySubDayTypes.Once with Double = js.native
  
  @js.native
  sealed trait Second extends FrequencySubDayTypes
  /* 2 */ val Second: typings.azdata.mod.FrequencySubDayTypes.Second with Double = js.native
  
  @js.native
  sealed trait Unknown extends FrequencySubDayTypes
  /* 0 */ val Unknown: typings.azdata.mod.FrequencySubDayTypes.Unknown with Double = js.native
}
