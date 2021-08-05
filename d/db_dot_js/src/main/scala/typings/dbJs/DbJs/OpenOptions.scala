package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenOptions extends StObject {
  
  var schema: js.UndefOr[js.Any] = js.undefined
  
  var server: String
  
  var version: Double
}
object OpenOptions {
  
  inline def apply(server: String, version: Double): OpenOptions = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOptions]
  }
  
  extension [Self <: OpenOptions](x: Self) {
    
    inline def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
