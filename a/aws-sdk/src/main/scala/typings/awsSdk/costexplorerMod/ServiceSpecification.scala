package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSpecification extends StObject {
  
  /**
    * The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
    */
  var EC2Specification: js.UndefOr[typings.awsSdk.costexplorerMod.EC2Specification] = js.undefined
}
object ServiceSpecification {
  
  inline def apply(): ServiceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSpecification]
  }
  
  extension [Self <: ServiceSpecification](x: Self) {
    
    inline def setEC2Specification(value: EC2Specification): Self = StObject.set(x, "EC2Specification", value.asInstanceOf[js.Any])
    
    inline def setEC2SpecificationUndefined: Self = StObject.set(x, "EC2Specification", js.undefined)
  }
}
