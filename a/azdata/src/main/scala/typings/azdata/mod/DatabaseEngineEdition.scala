package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DatabaseEngineEdition extends StObject
@JSImport("azdata", "DatabaseEngineEdition")
@js.native
object DatabaseEngineEdition extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DatabaseEngineEdition with Double] = js.native
  
  @js.native
  sealed trait Enterprise extends DatabaseEngineEdition
  /* 3 */ val Enterprise: typings.azdata.mod.DatabaseEngineEdition.Enterprise with Double = js.native
  
  @js.native
  sealed trait Express extends DatabaseEngineEdition
  /* 4 */ val Express: typings.azdata.mod.DatabaseEngineEdition.Express with Double = js.native
  
  @js.native
  sealed trait Personal extends DatabaseEngineEdition
  /* 1 */ val Personal: typings.azdata.mod.DatabaseEngineEdition.Personal with Double = js.native
  
  @js.native
  sealed trait SqlDataWarehouse extends DatabaseEngineEdition
  /* 6 */ val SqlDataWarehouse: typings.azdata.mod.DatabaseEngineEdition.SqlDataWarehouse with Double = js.native
  
  @js.native
  sealed trait SqlDatabase extends DatabaseEngineEdition
  /* 5 */ val SqlDatabase: typings.azdata.mod.DatabaseEngineEdition.SqlDatabase with Double = js.native
  
  @js.native
  sealed trait SqlManagedInstance extends DatabaseEngineEdition
  /* 8 */ val SqlManagedInstance: typings.azdata.mod.DatabaseEngineEdition.SqlManagedInstance with Double = js.native
  
  @js.native
  sealed trait SqlOnDemand extends DatabaseEngineEdition
  /* 11 */ val SqlOnDemand: typings.azdata.mod.DatabaseEngineEdition.SqlOnDemand with Double = js.native
  
  @js.native
  sealed trait SqlStretchDatabase extends DatabaseEngineEdition
  /* 7 */ val SqlStretchDatabase: typings.azdata.mod.DatabaseEngineEdition.SqlStretchDatabase with Double = js.native
  
  @js.native
  sealed trait Standard extends DatabaseEngineEdition
  /* 2 */ val Standard: typings.azdata.mod.DatabaseEngineEdition.Standard with Double = js.native
  
  @js.native
  sealed trait Unknown extends DatabaseEngineEdition
  /* 0 */ val Unknown: typings.azdata.mod.DatabaseEngineEdition.Unknown with Double = js.native
}
