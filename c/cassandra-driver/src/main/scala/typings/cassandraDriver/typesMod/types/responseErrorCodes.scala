package typings.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait responseErrorCodes extends StObject
@JSImport("cassandra-driver/lib/types", "types.responseErrorCodes")
@js.native
object responseErrorCodes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[responseErrorCodes & Double] = js.native
  
  @js.native
  sealed trait alreadyExists
    extends StObject
       with responseErrorCodes
  /* 0x2400 */ val alreadyExists: typings.cassandraDriver.typesMod.types.responseErrorCodes.alreadyExists & Double = js.native
  
  @js.native
  sealed trait badCredentials
    extends StObject
       with responseErrorCodes
  /* 0x0100 */ val badCredentials: typings.cassandraDriver.typesMod.types.responseErrorCodes.badCredentials & Double = js.native
  
  @js.native
  sealed trait clientWriteFailure
    extends StObject
       with responseErrorCodes
  /* 0x8000 */ val clientWriteFailure: typings.cassandraDriver.typesMod.types.responseErrorCodes.clientWriteFailure & Double = js.native
  
  @js.native
  sealed trait configError
    extends StObject
       with responseErrorCodes
  /* 0x2300 */ val configError: typings.cassandraDriver.typesMod.types.responseErrorCodes.configError & Double = js.native
  
  @js.native
  sealed trait functionFailure
    extends StObject
       with responseErrorCodes
  /* 0x1400 */ val functionFailure: typings.cassandraDriver.typesMod.types.responseErrorCodes.functionFailure & Double = js.native
  
  @js.native
  sealed trait invalid
    extends StObject
       with responseErrorCodes
  /* 0x2200 */ val invalid: typings.cassandraDriver.typesMod.types.responseErrorCodes.invalid & Double = js.native
  
  @js.native
  sealed trait isBootstrapping
    extends StObject
       with responseErrorCodes
  /* 0x1002 */ val isBootstrapping: typings.cassandraDriver.typesMod.types.responseErrorCodes.isBootstrapping & Double = js.native
  
  @js.native
  sealed trait overloaded
    extends StObject
       with responseErrorCodes
  /* 0x1001 */ val overloaded: typings.cassandraDriver.typesMod.types.responseErrorCodes.overloaded & Double = js.native
  
  @js.native
  sealed trait protocolError
    extends StObject
       with responseErrorCodes
  /* 0x000A */ val protocolError: typings.cassandraDriver.typesMod.types.responseErrorCodes.protocolError & Double = js.native
  
  @js.native
  sealed trait readFailure
    extends StObject
       with responseErrorCodes
  /* 0x1300 */ val readFailure: typings.cassandraDriver.typesMod.types.responseErrorCodes.readFailure & Double = js.native
  
  @js.native
  sealed trait readTimeout
    extends StObject
       with responseErrorCodes
  /* 0x1200 */ val readTimeout: typings.cassandraDriver.typesMod.types.responseErrorCodes.readTimeout & Double = js.native
  
  @js.native
  sealed trait serverError
    extends StObject
       with responseErrorCodes
  /* 0x0000 */ val serverError: typings.cassandraDriver.typesMod.types.responseErrorCodes.serverError & Double = js.native
  
  @js.native
  sealed trait syntaxError
    extends StObject
       with responseErrorCodes
  /* 0x2000 */ val syntaxError: typings.cassandraDriver.typesMod.types.responseErrorCodes.syntaxError & Double = js.native
  
  @js.native
  sealed trait truncateError
    extends StObject
       with responseErrorCodes
  /* 0x1003 */ val truncateError: typings.cassandraDriver.typesMod.types.responseErrorCodes.truncateError & Double = js.native
  
  @js.native
  sealed trait unauthorized
    extends StObject
       with responseErrorCodes
  /* 0x2100 */ val unauthorized: typings.cassandraDriver.typesMod.types.responseErrorCodes.unauthorized & Double = js.native
  
  @js.native
  sealed trait unavailableException
    extends StObject
       with responseErrorCodes
  /* 0x1000 */ val unavailableException: typings.cassandraDriver.typesMod.types.responseErrorCodes.unavailableException & Double = js.native
  
  @js.native
  sealed trait unprepared
    extends StObject
       with responseErrorCodes
  /* 0x2500 */ val unprepared: typings.cassandraDriver.typesMod.types.responseErrorCodes.unprepared & Double = js.native
  
  @js.native
  sealed trait writeFailure
    extends StObject
       with responseErrorCodes
  /* 0x1500 */ val writeFailure: typings.cassandraDriver.typesMod.types.responseErrorCodes.writeFailure & Double = js.native
  
  @js.native
  sealed trait writeTimeout
    extends StObject
       with responseErrorCodes
  /* 0x1100 */ val writeTimeout: typings.cassandraDriver.typesMod.types.responseErrorCodes.writeTimeout & Double = js.native
}
