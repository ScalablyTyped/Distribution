package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionResponse extends StObject {
  
  /**
    * The requested connection definition.
    */
  var Connection: js.UndefOr[typings.awsSdk.glueMod.Connection] = js.undefined
}
object GetConnectionResponse {
  
  @scala.inline
  def apply(): GetConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionResponse]
  }
  
  @scala.inline
  implicit class GetConnectionResponseMutableBuilder[Self <: GetConnectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Connection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
