package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidationSummary extends StObject {
  
  /**
    * The time that an invalidation request was created.
    */
  var CreateTime: timestamp
  
  /**
    * The unique ID for an invalidation request.
    */
  var Id: String
  
  /**
    * The status of an invalidation request.
    */
  var Status: String
}
object InvalidationSummary {
  
  inline def apply(CreateTime: timestamp, Id: String, Status: String): InvalidationSummary = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidationSummary]
  }
  
  extension [Self <: InvalidationSummary](x: Self) {
    
    inline def setCreateTime(value: timestamp): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
