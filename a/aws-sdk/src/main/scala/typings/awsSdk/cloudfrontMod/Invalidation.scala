package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invalidation extends StObject {
  
  /**
    * The date and time the invalidation request was first made. 
    */
  var CreateTime: js.Date
  
  /**
    * The identifier for the invalidation request. For example: IDFDVBD632BHDS5.
    */
  var Id: String
  
  /**
    * The current invalidation information for the batch request. 
    */
  var InvalidationBatch: typings.awsSdk.cloudfrontMod.InvalidationBatch
  
  /**
    * The status of the invalidation request. When the invalidation batch is finished, the status is Completed.
    */
  var Status: String
}
object Invalidation {
  
  inline def apply(CreateTime: js.Date, Id: String, InvalidationBatch: InvalidationBatch, Status: String): Invalidation = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InvalidationBatch = InvalidationBatch.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invalidation]
  }
  
  extension [Self <: Invalidation](x: Self) {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setInvalidationBatch(value: InvalidationBatch): Self = StObject.set(x, "InvalidationBatch", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
