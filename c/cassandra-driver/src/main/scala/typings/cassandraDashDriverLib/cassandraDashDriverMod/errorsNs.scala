package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "errors")
@js.native
object errorsNs extends js.Object {
  @js.native
  class ArgumentError protected () extends DriverError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class AuthenticationError protected () extends DriverError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  abstract class DriverError protected () extends js.Object {
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, constructor: js.Any) = this()
  }
  
  @js.native
  class DriverInternalError protected () extends DriverError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class NoHostAvailableError protected () extends DriverError {
    def this(innerErrors: js.Any) = this()
    def this(innerErrors: js.Any, message: java.lang.String) = this()
  }
  
  @js.native
  class NotSupportedError protected () extends DriverError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class OperationTimedOutError () extends DriverError
  
  @js.native
  class ResponseError protected () extends DriverError {
    def this(code: scala.Double, message: java.lang.String) = this()
  }
  
}

