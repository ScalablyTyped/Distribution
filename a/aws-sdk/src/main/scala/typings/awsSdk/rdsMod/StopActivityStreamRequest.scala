package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopActivityStreamRequest extends StObject {
  
  /**
    * Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the maintenance window for the database.
    */
  var ApplyImmediately: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the DB cluster for the database activity stream. For example, arn:aws:rds:us-east-1:12345667890:cluster:das-cluster. 
    */
  var ResourceArn: String = js.native
}
object StopActivityStreamRequest {
  
  @scala.inline
  def apply(ResourceArn: String): StopActivityStreamRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopActivityStreamRequest]
  }
  
  @scala.inline
  implicit class StopActivityStreamRequestMutableBuilder[Self <: StopActivityStreamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyImmediately(value: BooleanOptional): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyImmediatelyUndefined: Self = StObject.set(x, "ApplyImmediately", js.undefined)
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
