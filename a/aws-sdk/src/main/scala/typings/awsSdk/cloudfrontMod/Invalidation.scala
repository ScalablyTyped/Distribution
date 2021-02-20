package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invalidation extends StObject {
  
  /**
    * The date and time the invalidation request was first made. 
    */
  var CreateTime: timestamp = js.native
  
  /**
    * The identifier for the invalidation request. For example: IDFDVBD632BHDS5.
    */
  var Id: String = js.native
  
  /**
    * The current invalidation information for the batch request. 
    */
  var InvalidationBatch: typings.awsSdk.cloudfrontMod.InvalidationBatch = js.native
  
  /**
    * The status of the invalidation request. When the invalidation batch is finished, the status is Completed.
    */
  var Status: String = js.native
}
object Invalidation {
  
  @scala.inline
  def apply(CreateTime: timestamp, Id: String, InvalidationBatch: InvalidationBatch, Status: String): Invalidation = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InvalidationBatch = InvalidationBatch.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invalidation]
  }
  
  @scala.inline
  implicit class InvalidationMutableBuilder[Self <: Invalidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: timestamp): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidationBatch(value: InvalidationBatch): Self = StObject.set(x, "InvalidationBatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
