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
  class BusyConnectionError protected () extends DriverError {
    def this(address: java.lang.String, maxRequestsPerConnection: scala.Double, connectionLength: scala.Double) = this()
  }
  
  @js.native
  abstract class DriverError protected ()
    extends stdLib.Error {
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, constructor: js.Any) = this()
    var info: java.lang.String = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  @js.native
  class DriverInternalError protected () extends DriverError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class NoHostAvailableError protected () extends DriverError {
    def this(innerErrors: js.Any) = this()
    def this(innerErrors: js.Any, message: java.lang.String) = this()
    var innerErrors: js.Any = js.native
  }
  
  @js.native
  class NotSupportedError protected () extends DriverError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class OperationTimedOutError protected () extends DriverError {
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, host: java.lang.String) = this()
    var host: js.UndefOr[java.lang.String] = js.native
  }
  
  @js.native
  class ResponseError protected () extends DriverError {
    def this(code: scala.Double, message: java.lang.String) = this()
    var code: scala.Double = js.native
  }
  
}

