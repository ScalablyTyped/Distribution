package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedResponseAction extends StObject {
  
  /**
    * The HTTP response code.
    */
  var statusCode: HttpStatusCode
}
object FixedResponseAction {
  
  inline def apply(statusCode: HttpStatusCode): FixedResponseAction = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedResponseAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FixedResponseAction] (val x: Self) extends AnyVal {
    
    inline def setStatusCode(value: HttpStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
