package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPSetReference extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that you are referencing in your rule group.
    */
  var ReferenceArn: js.UndefOr[ResourceArn] = js.undefined
}
object IPSetReference {
  
  inline def apply(): IPSetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPSetReference]
  }
  
  extension [Self <: IPSetReference](x: Self) {
    
    inline def setReferenceArn(value: ResourceArn): Self = StObject.set(x, "ReferenceArn", value.asInstanceOf[js.Any])
    
    inline def setReferenceArnUndefined: Self = StObject.set(x, "ReferenceArn", js.undefined)
  }
}
