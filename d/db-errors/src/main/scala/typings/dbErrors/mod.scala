package typings.dbErrors

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("db-errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("db-errors", "CheckViolationError")
  @js.native
  open class CheckViolationError () extends DBError {
    
    var constraint: String = js.native
    
    var table: String = js.native
  }
  
  @JSImport("db-errors", "ConstraintViolationError")
  @js.native
  open class ConstraintViolationError () extends DBError
  
  @JSImport("db-errors", "DBError")
  @js.native
  open class DBError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var nativeError: js.Error = js.native
  }
  
  @JSImport("db-errors", "DataError")
  @js.native
  open class DataError () extends DBError
  
  @JSImport("db-errors", "ForeignKeyViolationError")
  @js.native
  open class ForeignKeyViolationError () extends ConstraintViolationError {
    
    var constraint: String = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var table: String = js.native
  }
  
  @JSImport("db-errors", "NotNullViolationError")
  @js.native
  open class NotNullViolationError () extends ConstraintViolationError {
    
    var column: String = js.native
    
    var database: js.UndefOr[String] = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var table: String = js.native
  }
  
  @JSImport("db-errors", "UniqueViolationError")
  @js.native
  open class UniqueViolationError () extends ConstraintViolationError {
    
    var columns: js.Array[String] = js.native
    
    var constraint: String = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var table: String = js.native
  }
  
  inline def wrapError(err: js.Error): DBError = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapError")(err.asInstanceOf[js.Any]).asInstanceOf[DBError]
}
