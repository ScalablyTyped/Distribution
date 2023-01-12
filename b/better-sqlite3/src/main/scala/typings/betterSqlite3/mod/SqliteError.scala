package typings.betterSqlite3.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqliteError
  extends StObject
     with Error {
  
  var code: String
}
object SqliteError {
  
  inline def apply(code: String, message: String, name: String): SqliteError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqliteError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqliteError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
