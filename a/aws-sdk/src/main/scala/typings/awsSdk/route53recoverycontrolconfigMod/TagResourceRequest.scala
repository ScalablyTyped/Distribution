package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the resource that's tagged.
    */
  var ResourceArn: string
  
  /**
    * The tags associated with the resource.
    */
  var Tags: mapOfStringMin0Max256PatternS
}
object TagResourceRequest {
  
  inline def apply(ResourceArn: string, Tags: mapOfStringMin0Max256PatternS): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfStringMin0Max256PatternS): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
