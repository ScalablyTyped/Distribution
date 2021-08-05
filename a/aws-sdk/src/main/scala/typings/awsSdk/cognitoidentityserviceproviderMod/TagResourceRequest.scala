package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user pool to assign the tags to.
    */
  var ResourceArn: ArnType
  
  /**
    * The tags to assign to the user pool.
    */
  var Tags: UserPoolTagsType
}
object TagResourceRequest {
  
  inline def apply(ResourceArn: ArnType, Tags: UserPoolTagsType): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ArnType): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: UserPoolTagsType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
