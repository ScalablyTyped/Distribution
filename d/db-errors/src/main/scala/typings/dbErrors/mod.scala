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
  class CheckViolationError () extends DBError {
    
    var constraint: String = js.native
    
    var table: String = js.native
  }
  
  @JSImport("db-errors", "ConstraintViolationError")
  @js.native
  class ConstraintViolationError () extends DBError
  
  @JSImport("db-errors", "DBError")
  @js.native
  class DBError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var nativeError: Error = js.native
  }
  
  @JSImport("db-errors", "DataError")
  @js.native
  class DataError () extends DBError
  
  @JSImport("db-errors", "ForeignKeyViolationError")
  @js.native
  class ForeignKeyViolationError () extends ConstraintViolationError {
    
    var constraint: String = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var table: String = js.native
  }
  
  @JSImport("db-errors", "NotNullViolationError")
  @js.native
  class NotNullViolationError () extends ConstraintViolationError {
    
    var column: String = js.native
    
    var database: js.UndefOr[String] = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var table: String = js.native
  }
  
  @JSImport("db-errors", "UniqueViolationError")
  @js.native
  class UniqueViolationError () extends ConstraintViolationError {
    
    var columns: js.Array[String] = js.native
    
    var constraint: String = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var table: String = js.native
  }
  
  @scala.inline
  def wrapError(err: Error): DBError = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapError")(err.asInstanceOf[js.Any]).asInstanceOf[DBError]
}
