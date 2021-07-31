package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DatabaseEngineEdition extends StObject
@JSImport("azdata", "DatabaseEngineEdition")
@js.native
object DatabaseEngineEdition extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DatabaseEngineEdition & Double] = js.native
  
  @js.native
  sealed trait Enterprise
    extends StObject
       with DatabaseEngineEdition
  /* 3 */ val Enterprise: typings.azdata.mod.DatabaseEngineEdition.Enterprise & Double = js.native
  
  @js.native
  sealed trait Express
    extends StObject
       with DatabaseEngineEdition
  /* 4 */ val Express: typings.azdata.mod.DatabaseEngineEdition.Express & Double = js.native
  
  @js.native
  sealed trait Personal
    extends StObject
       with DatabaseEngineEdition
  /* 1 */ val Personal: typings.azdata.mod.DatabaseEngineEdition.Personal & Double = js.native
  
  @js.native
  sealed trait SqlDataWarehouse
    extends StObject
       with DatabaseEngineEdition
  /* 6 */ val SqlDataWarehouse: typings.azdata.mod.DatabaseEngineEdition.SqlDataWarehouse & Double = js.native
  
  @js.native
  sealed trait SqlDatabase
    extends StObject
       with DatabaseEngineEdition
  /* 5 */ val SqlDatabase: typings.azdata.mod.DatabaseEngineEdition.SqlDatabase & Double = js.native
  
  @js.native
  sealed trait SqlManagedInstance
    extends StObject
       with DatabaseEngineEdition
  /* 8 */ val SqlManagedInstance: typings.azdata.mod.DatabaseEngineEdition.SqlManagedInstance & Double = js.native
  
  @js.native
  sealed trait SqlOnDemand
    extends StObject
       with DatabaseEngineEdition
  /* 11 */ val SqlOnDemand: typings.azdata.mod.DatabaseEngineEdition.SqlOnDemand & Double = js.native
  
  @js.native
  sealed trait SqlStretchDatabase
    extends StObject
       with DatabaseEngineEdition
  /* 7 */ val SqlStretchDatabase: typings.azdata.mod.DatabaseEngineEdition.SqlStretchDatabase & Double = js.native
  
  @js.native
  sealed trait Standard
    extends StObject
       with DatabaseEngineEdition
  /* 2 */ val Standard: typings.azdata.mod.DatabaseEngineEdition.Standard & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with DatabaseEngineEdition
  /* 0 */ val Unknown: typings.azdata.mod.DatabaseEngineEdition.Unknown & Double = js.native
}
