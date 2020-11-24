package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AlertType extends js.Object
@JSImport("azdata", "AlertType")
@js.native
object AlertType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AlertType with Double] = js.native
  
  @js.native
  sealed trait nonSqlServerEvent extends AlertType
  /* 3 */ @js.native
  object nonSqlServerEvent extends TopLevel[nonSqlServerEvent with Double]
  
  @js.native
  sealed trait sqlServerEvent extends AlertType
  /* 1 */ @js.native
  object sqlServerEvent extends TopLevel[sqlServerEvent with Double]
  
  @js.native
  sealed trait sqlServerPerformanceCondition extends AlertType
  /* 2 */ @js.native
  object sqlServerPerformanceCondition extends TopLevel[sqlServerPerformanceCondition with Double]
  
  @js.native
  sealed trait wmiEvent extends AlertType
  /* 4 */ @js.native
  object wmiEvent extends TopLevel[wmiEvent with Double]
}
