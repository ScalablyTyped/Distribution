package typings.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait responseErrorCodes extends StObject
@JSImport("cassandra-driver/lib/types", "types.responseErrorCodes")
@js.native
object responseErrorCodes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[responseErrorCodes with Double] = js.native
  
  @js.native
  sealed trait alreadyExists extends responseErrorCodes
  /* 0x2400 */ val alreadyExists: typings.cassandraDriver.typesMod.types.responseErrorCodes.alreadyExists with Double = js.native
  
  @js.native
  sealed trait badCredentials extends responseErrorCodes
  /* 0x0100 */ val badCredentials: typings.cassandraDriver.typesMod.types.responseErrorCodes.badCredentials with Double = js.native
  
  @js.native
  sealed trait clientWriteFailure extends responseErrorCodes
  /* 0x8000 */ val clientWriteFailure: typings.cassandraDriver.typesMod.types.responseErrorCodes.clientWriteFailure with Double = js.native
  
  @js.native
  sealed trait configError extends responseErrorCodes
  /* 0x2300 */ val configError: typings.cassandraDriver.typesMod.types.responseErrorCodes.configError with Double = js.native
  
  @js.native
  sealed trait functionFailure extends responseErrorCodes
  /* 0x1400 */ val functionFailure: typings.cassandraDriver.typesMod.types.responseErrorCodes.functionFailure with Double = js.native
  
  @js.native
  sealed trait invalid extends responseErrorCodes
  /* 0x2200 */ val invalid: typings.cassandraDriver.typesMod.types.responseErrorCodes.invalid with Double = js.native
  
  @js.native
  sealed trait isBootstrapping extends responseErrorCodes
  /* 0x1002 */ val isBootstrapping: typings.cassandraDriver.typesMod.types.responseErrorCodes.isBootstrapping with Double = js.native
  
  @js.native
  sealed trait overloaded extends responseErrorCodes
  /* 0x1001 */ val overloaded: typings.cassandraDriver.typesMod.types.responseErrorCodes.overloaded with Double = js.native
  
  @js.native
  sealed trait protocolError extends responseErrorCodes
  /* 0x000A */ val protocolError: typings.cassandraDriver.typesMod.types.responseErrorCodes.protocolError with Double = js.native
  
  @js.native
  sealed trait readFailure extends responseErrorCodes
  /* 0x1300 */ val readFailure: typings.cassandraDriver.typesMod.types.responseErrorCodes.readFailure with Double = js.native
  
  @js.native
  sealed trait readTimeout extends responseErrorCodes
  /* 0x1200 */ val readTimeout: typings.cassandraDriver.typesMod.types.responseErrorCodes.readTimeout with Double = js.native
  
  @js.native
  sealed trait serverError extends responseErrorCodes
  /* 0x0000 */ val serverError: typings.cassandraDriver.typesMod.types.responseErrorCodes.serverError with Double = js.native
  
  @js.native
  sealed trait syntaxError extends responseErrorCodes
  /* 0x2000 */ val syntaxError: typings.cassandraDriver.typesMod.types.responseErrorCodes.syntaxError with Double = js.native
  
  @js.native
  sealed trait truncateError extends responseErrorCodes
  /* 0x1003 */ val truncateError: typings.cassandraDriver.typesMod.types.responseErrorCodes.truncateError with Double = js.native
  
  @js.native
  sealed trait unauthorized extends responseErrorCodes
  /* 0x2100 */ val unauthorized: typings.cassandraDriver.typesMod.types.responseErrorCodes.unauthorized with Double = js.native
  
  @js.native
  sealed trait unavailableException extends responseErrorCodes
  /* 0x1000 */ val unavailableException: typings.cassandraDriver.typesMod.types.responseErrorCodes.unavailableException with Double = js.native
  
  @js.native
  sealed trait unprepared extends responseErrorCodes
  /* 0x2500 */ val unprepared: typings.cassandraDriver.typesMod.types.responseErrorCodes.unprepared with Double = js.native
  
  @js.native
  sealed trait writeFailure extends responseErrorCodes
  /* 0x1500 */ val writeFailure: typings.cassandraDriver.typesMod.types.responseErrorCodes.writeFailure with Double = js.native
  
  @js.native
  sealed trait writeTimeout extends responseErrorCodes
  /* 0x1100 */ val writeTimeout: typings.cassandraDriver.typesMod.types.responseErrorCodes.writeTimeout with Double = js.native
}
