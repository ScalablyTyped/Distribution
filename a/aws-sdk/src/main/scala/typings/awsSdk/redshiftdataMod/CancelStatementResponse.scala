package typings.awsSdk.redshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelStatementResponse extends StObject {
  
  /**
    * A value that indicates whether the cancel statement succeeded (true). 
    */
  var Status: js.UndefOr[Boolean] = js.native
}
object CancelStatementResponse {
  
  @scala.inline
  def apply(): CancelStatementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelStatementResponse]
  }
  
  @scala.inline
  implicit class CancelStatementResponseMutableBuilder[Self <: CancelStatementResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Boolean): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
