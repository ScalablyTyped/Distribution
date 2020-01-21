package typings.cassandraDriver.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "errors")
@js.native
object errors extends js.Object {
  @js.native
  class ArgumentError protected () extends DriverError {
    def this(message: String) = this()
  }
  
  @js.native
  class AuthenticationError protected () extends DriverError {
    def this(message: String) = this()
  }
  
  @js.native
  class BusyConnectionError protected () extends DriverError {
    def this(address: String, maxRequestsPerConnection: Double, connectionLength: Double) = this()
  }
  
  @js.native
  abstract class DriverError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, constructor: js.Any) = this()
    var info: String = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class DriverInternalError protected () extends DriverError {
    def this(message: String) = this()
  }
  
  @js.native
  class NoHostAvailableError protected () extends DriverError {
    def this(innerErrors: js.Any) = this()
    def this(innerErrors: js.Any, message: String) = this()
    var innerErrors: js.Any = js.native
  }
  
  @js.native
  class NotSupportedError protected () extends DriverError {
    def this(message: String) = this()
  }
  
  @js.native
  class OperationTimedOutError protected () extends DriverError {
    def this(message: String) = this()
    def this(message: String, host: String) = this()
    var host: js.UndefOr[String] = js.native
  }
  
  @js.native
  class ResponseError protected () extends DriverError {
    def this(code: Double, message: String) = this()
    var code: Double = js.native
  }
  
}

