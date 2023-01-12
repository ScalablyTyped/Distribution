package typings.azureKeyvaultKeys.mod

import typings.azureCoreClient.mod.OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyOptions
  extends StObject
     with OperationOptions {
  
  /**
    * The version of the secret to retrieve. If not
    * specified the latest version of the secret will be retrieved.
    */
  var version: js.UndefOr[String] = js.undefined
}
object GetKeyOptions {
  
  inline def apply(): GetKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetKeyOptions] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
