package typings.bullBoard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Api extends StObject {
  
  var api: typings.bullBoard.distUiServicesApiMod.Api
}
object Api {
  
  inline def apply(api: typings.bullBoard.distUiServicesApiMod.Api): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
    
    inline def setApi(value: typings.bullBoard.distUiServicesApiMod.Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
  }
}
