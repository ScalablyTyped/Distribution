package typings.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.TopLevel
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
  sealed trait clientWriteFailure extends responseErrorCodes
  
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[responseErrorCodes with Double] = js.native
  /* 0x2400 */ @js.native
  object alreadyExists extends TopLevel[alreadyExists with Double]
  
  /* 0x0100 */ @js.native
  object badCredentials extends TopLevel[badCredentials with Double]
  
  /* 0x8000 */ @js.native
  object clientWriteFailure extends TopLevel[clientWriteFailure with Double]
  
  /* 0x2300 */ @js.native
  object configError extends TopLevel[configError with Double]
  
  /* 0x1400 */ @js.native
  object functionFailure extends TopLevel[functionFailure with Double]
  
  /* 0x2200 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 0x1002 */ @js.native
  object isBootstrapping extends TopLevel[isBootstrapping with Double]
  
  /* 0x1001 */ @js.native
  object overloaded extends TopLevel[overloaded with Double]
  
  /* 0x000A */ @js.native
  object protocolError extends TopLevel[protocolError with Double]
  
  /* 0x1300 */ @js.native
  object readFailure extends TopLevel[readFailure with Double]
  
  /* 0x1200 */ @js.native
  object readTimeout extends TopLevel[readTimeout with Double]
  
  /* 0x0000 */ @js.native
  object serverError extends TopLevel[serverError with Double]
  
  /* 0x2000 */ @js.native
  object syntaxError extends TopLevel[syntaxError with Double]
  
  /* 0x1003 */ @js.native
  object truncateError extends TopLevel[truncateError with Double]
  
  /* 0x2100 */ @js.native
  object unauthorized extends TopLevel[unauthorized with Double]
  
  /* 0x1000 */ @js.native
  object unavailableException extends TopLevel[unavailableException with Double]
  
  /* 0x2500 */ @js.native
  object unprepared extends TopLevel[unprepared with Double]
  
  /* 0x1500 */ @js.native
  object writeFailure extends TopLevel[writeFailure with Double]
  
  /* 0x1100 */ @js.native
  object writeTimeout extends TopLevel[writeTimeout with Double]
  
}

