package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AlertType extends js.Object

@JSImport("azdata", "AlertType")
@js.native
object AlertType extends js.Object {
  @js.native
  sealed trait nonSqlServerEvent extends AlertType
  
  @js.native
  sealed trait sqlServerEvent extends AlertType
  
  @js.native
  sealed trait sqlServerPerformanceCondition extends AlertType
  
  @js.native
  sealed trait wmiEvent extends AlertType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AlertType with Double] = js.native
  /* 3 */ @js.native
  object nonSqlServerEvent extends TopLevel[nonSqlServerEvent with Double]
  
  /* 1 */ @js.native
  object sqlServerEvent extends TopLevel[sqlServerEvent with Double]
  
  /* 2 */ @js.native
  object sqlServerPerformanceCondition extends TopLevel[sqlServerPerformanceCondition with Double]
  
  /* 4 */ @js.native
  object wmiEvent extends TopLevel[wmiEvent with Double]
  
}

