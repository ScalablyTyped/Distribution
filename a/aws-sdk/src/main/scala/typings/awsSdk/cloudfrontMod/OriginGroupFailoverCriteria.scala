package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginGroupFailoverCriteria extends StObject {
  
  /**
    * The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the second origin.
    */
  var StatusCodes: typings.awsSdk.cloudfrontMod.StatusCodes = js.native
}
object OriginGroupFailoverCriteria {
  
  @scala.inline
  def apply(StatusCodes: StatusCodes): OriginGroupFailoverCriteria = {
    val __obj = js.Dynamic.literal(StatusCodes = StatusCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroupFailoverCriteria]
  }
  
  @scala.inline
  implicit class OriginGroupFailoverCriteriaMutableBuilder[Self <: OriginGroupFailoverCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusCodes(value: StatusCodes): Self = StObject.set(x, "StatusCodes", value.asInstanceOf[js.Any])
  }
}
