package typings.cassandraDashDriver.libTypesMod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait responseErrorCodes extends js.Object

@JSImport("cassandra-driver/lib/types", "types.responseErrorCodes")
@js.native
object responseErrorCodes extends js.Object {
  @js.native
  sealed trait alreadyExists extends responseErrorCodes
  
  @js.native
  sealed trait badCredentials extends responseErrorCodes
  
  @js.native
  sealed trait configError extends responseErrorCodes
  
  @js.native
  sealed trait functionFailure extends responseErrorCodes
  
  @js.native
  sealed trait invalid extends responseErrorCodes
  
  @js.native
  sealed trait isBootstrapping extends responseErrorCodes
  
  @js.native
  sealed trait overloaded extends responseErrorCodes
  
  @js.native
  sealed trait protocolError extends responseErrorCodes
  
  @js.native
  sealed trait readFailure extends responseErrorCodes
  
  @js.native
  sealed trait readTimeout extends responseErrorCodes
  
  @js.native
  sealed trait serverError extends responseErrorCodes
  
  @js.native
  sealed trait syntaxError extends responseErrorCodes
  
  @js.native
  sealed trait truncateError extends responseErrorCodes
  
  @js.native
  sealed trait unauthorized extends responseErrorCodes
  
  @js.native
  sealed trait unavailableException extends responseErrorCodes
  
  @js.native
  sealed trait unprepared extends responseErrorCodes
  
  @js.native
  sealed trait writeFailure extends responseErrorCodes
  
  @js.native
  sealed trait writeTimeout extends responseErrorCodes
  
  /* 0x2400 */ val alreadyExists: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.alreadyExists with Double = js.native
  /* 0x0100 */ val badCredentials: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.badCredentials with Double = js.native
  /* 0x2300 */ val configError: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.configError with Double = js.native
  /* 0x1400 */ val functionFailure: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.functionFailure with Double = js.native
  /* 0x2200 */ val invalid: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.invalid with Double = js.native
  /* 0x1002 */ val isBootstrapping: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.isBootstrapping with Double = js.native
  /* 0x1001 */ val overloaded: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.overloaded with Double = js.native
  /* 0x000A */ val protocolError: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.protocolError with Double = js.native
  /* 0x1300 */ val readFailure: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.readFailure with Double = js.native
  /* 0x1200 */ val readTimeout: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.readTimeout with Double = js.native
  /* 0x0000 */ val serverError: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.serverError with Double = js.native
  /* 0x2000 */ val syntaxError: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.syntaxError with Double = js.native
  /* 0x1003 */ val truncateError: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.truncateError with Double = js.native
  /* 0x2100 */ val unauthorized: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.unauthorized with Double = js.native
  /* 0x1000 */ val unavailableException: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.unavailableException with Double = js.native
  /* 0x2500 */ val unprepared: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.unprepared with Double = js.native
  /* 0x1500 */ val writeFailure: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.writeFailure with Double = js.native
  /* 0x1100 */ val writeTimeout: typings.cassandraDashDriver.libTypesMod.types.responseErrorCodes.writeTimeout with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[responseErrorCodes with Double] = js.native
}

