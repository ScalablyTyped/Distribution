package typings.cassandraDriver.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errors {
  
  @JSImport("cassandra-driver", "errors.ArgumentError")
  @js.native
  class ArgumentError protected () extends DriverError {
    def this(message: String) = this()
  }
  
  @JSImport("cassandra-driver", "errors.AuthenticationError")
  @js.native
  class AuthenticationError protected () extends DriverError {
    def this(message: String) = this()
  }
  
  @JSImport("cassandra-driver", "errors.BusyConnectionError")
  @js.native
  class BusyConnectionError protected () extends DriverError {
    def this(address: String, maxRequestsPerConnection: Double, connectionLength: Double) = this()
  }
  
  @JSImport("cassandra-driver", "errors.DriverError")
  @js.native
  abstract class DriverError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, constructor: js.Any) = this()
    
    var info: String = js.native
  }
  
  @JSImport("cassandra-driver", "errors.DriverInternalError")
  @js.native
  class DriverInternalError protected () extends DriverError {
    def this(message: String) = this()
  }
  
  @JSImport("cassandra-driver", "errors.NoHostAvailableError")
  @js.native
  class NoHostAvailableError protected () extends DriverError {
    def this(innerErrors: js.Any) = this()
    def this(innerErrors: js.Any, message: String) = this()
    
    var innerErrors: js.Any = js.native
  }
  
  @JSImport("cassandra-driver", "errors.NotSupportedError")
  @js.native
  class NotSupportedError protected () extends DriverError {
    def this(message: String) = this()
  }
  
  @JSImport("cassandra-driver", "errors.OperationTimedOutError")
  @js.native
  class OperationTimedOutError protected () extends DriverError {
    def this(message: String) = this()
    def this(message: String, host: String) = this()
    
    var host: js.UndefOr[String] = js.native
  }
  
  @JSImport("cassandra-driver", "errors.ResponseError")
  @js.native
  class ResponseError protected () extends DriverError {
    def this(code: Double, message: String) = this()
    
    var code: Double = js.native
  }
}
