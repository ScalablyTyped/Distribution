package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenOptions extends StObject {
  
  var schema: js.UndefOr[js.Any] = js.native
  
  var server: String = js.native
  
  var version: Double = js.native
}
object OpenOptions {
  
  @scala.inline
  def apply(server: String, version: Double): OpenOptions = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOptions]
  }
  
  @scala.inline
  implicit class OpenOptionsMutableBuilder[Self <: OpenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
