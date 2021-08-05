package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUpdateRequest extends StObject {
  
  /**
    * The name of the Amazon EKS cluster associated with the update.
    */
  var name: String
  
  /**
    * The name of the Amazon EKS node group associated with the update.
    */
  var nodegroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the update to describe.
    */
  var updateId: String
}
object DescribeUpdateRequest {
  
  inline def apply(name: String, updateId: String): DescribeUpdateRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], updateId = updateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUpdateRequest]
  }
  
  extension [Self <: DescribeUpdateRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodegroupName(value: String): Self = StObject.set(x, "nodegroupName", value.asInstanceOf[js.Any])
    
    inline def setNodegroupNameUndefined: Self = StObject.set(x, "nodegroupName", js.undefined)
    
    inline def setUpdateId(value: String): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
  }
}
