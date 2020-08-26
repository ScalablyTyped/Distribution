package typings.dbErrors

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("db-errors", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CheckViolationError () extends DBError {
    var constraint: String = js.native
    var table: String = js.native
  }
  
  @js.native
  class ConstraintViolationError () extends DBError
  
  @js.native
  class DBError () extends Error {
    var nativeError: Error = js.native
  }
  
  @js.native
  class DataError () extends DBError
  
  @js.native
  class ForeignKeyViolationError () extends DBError {
    var constraint: String = js.native
    var schema: js.UndefOr[String] = js.native
    var table: String = js.native
  }
  
  @js.native
  class NotNullViolationError () extends DBError {
    var column: String = js.native
    var database: js.UndefOr[String] = js.native
    var schema: js.UndefOr[String] = js.native
    var table: String = js.native
  }
  
  @js.native
  class UniqueViolationError () extends DBError {
    var columns: js.Array[String] = js.native
    var constraint: String = js.native
    var schema: js.UndefOr[String] = js.native
    var table: String = js.native
  }
  
  def wrapError(err: Error): DBError = js.native
}

