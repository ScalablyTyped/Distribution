package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the identity pool to assign the tags to.
    */
  var ResourceArn: ARNString
  
  /**
    * The tags to assign to the identity pool.
    */
  var Tags: IdentityPoolTagsType
}
object TagResourceInput {
  
  inline def apply(ResourceArn: ARNString, Tags: IdentityPoolTagsType): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  
  extension [Self <: TagResourceInput](x: Self) {
    
    inline def setResourceArn(value: ARNString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: IdentityPoolTagsType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
