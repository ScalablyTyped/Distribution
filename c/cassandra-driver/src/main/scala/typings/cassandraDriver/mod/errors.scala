package typings.cassandraDriver.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errors {
  
  @JSImport("cassandra-driver", "errors.ArgumentError")
  @js.native
  open class ArgumentError protected () extends DriverError {
    def this(message: String) = this()
  }
  
  @JSImport("cassandra-driver", "errors.AuthenticationError")
  @js.native
  open class AuthenticationError protected () extends DriverError {
    def this(message: String) = this()
  }
  
  @JSImport("cassandra-driver", "errors.BusyConnectionError")
  @js.native
  open class BusyConnectionError protected () extends DriverError {
    def this(address: String, maxRequestsPerConnection: Double, connectionLength: Double) = this()
  }
  
  /* note: abstract class */ @JSImport("cassandra-driver", "errors.DriverError")
  @js.native
  open class DriverError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, constructor: Any) = this()
    
    var info: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("cassandra-driver", "errors.DriverInternalError")
  @js.native
  open class DriverInternalError protected () extends DriverError {
    def this(message: String) = this()
  }
  
  @JSImport("cassandra-driver", "errors.NoHostAvailableError")
  @js.native
  open class NoHostAvailableError protected () extends DriverError {
    def this(innerErrors: Any) = this()
    def this(innerErrors: Any, message: String) = this()
    
    var innerErrors: Any = js.native
  }
  
  @JSImport("cassandra-driver", "errors.NotSupportedError")
  @js.native
  open class NotSupportedError protected () extends DriverError {
    def this(message: String) = this()
  }
  
  @JSImport("cassandra-driver", "errors.OperationTimedOutError")
  @js.native
  open class OperationTimedOutError protected () extends DriverError {
    def this(message: String) = this()
    def this(message: String, host: String) = this()
    
    var host: js.UndefOr[String] = js.native
  }
  
  @JSImport("cassandra-driver", "errors.ResponseError")
  @js.native
  open class ResponseError protected () extends DriverError {
    def this(code: Double, message: String) = this()
    
    var code: Double = js.native
  }
}
