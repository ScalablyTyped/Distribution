package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrequencySubDayTypes extends js.Object
@JSImport("azdata", "FrequencySubDayTypes")
@js.native
object FrequencySubDayTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrequencySubDayTypes with Double] = js.native
  
  @js.native
  sealed trait Hour extends FrequencySubDayTypes
  /* 8 */ @js.native
  object Hour extends TopLevel[Hour with Double]
  
  @js.native
  sealed trait Minute extends FrequencySubDayTypes
  /* 4 */ @js.native
  object Minute extends TopLevel[Minute with Double]
  
  @js.native
  sealed trait Once extends FrequencySubDayTypes
  /* 1 */ @js.native
  object Once extends TopLevel[Once with Double]
  
  @js.native
  sealed trait Second extends FrequencySubDayTypes
  /* 2 */ @js.native
  object Second extends TopLevel[Second with Double]
  
  @js.native
  sealed trait Unknown extends FrequencySubDayTypes
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
