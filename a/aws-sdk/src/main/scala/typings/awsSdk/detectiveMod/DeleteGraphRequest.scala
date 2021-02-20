package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGraphRequest extends StObject {
  
  /**
    * The ARN of the behavior graph to disable.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
}
object DeleteGraphRequest {
  
  @scala.inline
  def apply(GraphArn: GraphArn): DeleteGraphRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGraphRequest]
  }
  
  @scala.inline
  implicit class DeleteGraphRequestMutableBuilder[Self <: DeleteGraphRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
