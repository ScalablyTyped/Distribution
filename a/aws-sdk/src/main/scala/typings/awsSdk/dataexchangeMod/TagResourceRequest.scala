package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies an AWS resource.
    */
  var ResourceArn: string
  
  /**
    * A label that consists of a customer-defined key and an optional value.
    */
  var Tags: MapOfString
}
object TagResourceRequest {
  
  inline def apply(ResourceArn: string, Tags: MapOfString): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: MapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
