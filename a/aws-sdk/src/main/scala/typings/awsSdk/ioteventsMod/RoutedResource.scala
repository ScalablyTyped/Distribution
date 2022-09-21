package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutedResource extends StObject {
  
  /**
    *  The ARN of the routed resource. For more information, see Amazon Resource Names (ARNs) in the AWS General Reference. 
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    *  The name of the routed resource. 
    */
  var name: js.UndefOr[ResourceName] = js.undefined
}
object RoutedResource {
  
  inline def apply(): RoutedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutedResource]
  }
  
  extension [Self <: RoutedResource](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
