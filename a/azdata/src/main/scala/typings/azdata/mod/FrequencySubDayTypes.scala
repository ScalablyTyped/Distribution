package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrequencySubDayTypes extends js.Object

@JSImport("azdata", "FrequencySubDayTypes")
@js.native
object FrequencySubDayTypes extends js.Object {
  @js.native
  sealed trait Hour extends FrequencySubDayTypes
  
  @js.native
  sealed trait Minute extends FrequencySubDayTypes
  
  @js.native
  sealed trait Once extends FrequencySubDayTypes
  
  @js.native
  sealed trait Second extends FrequencySubDayTypes
  
  @js.native
  sealed trait Unknown extends FrequencySubDayTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrequencySubDayTypes with Double] = js.native
  /* 8 */ @js.native
  object Hour extends TopLevel[Hour with Double]
  
  /* 4 */ @js.native
  object Minute extends TopLevel[Minute with Double]
  
  /* 1 */ @js.native
  object Once extends TopLevel[Once with Double]
  
  /* 2 */ @js.native
  object Second extends TopLevel[Second with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

