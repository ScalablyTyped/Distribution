package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceSpecification extends StObject {
  
  /**
    * The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
    */
  var EC2Specification: js.UndefOr[typings.awsSdk.costexplorerMod.EC2Specification] = js.native
}
object ServiceSpecification {
  
  @scala.inline
  def apply(): ServiceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSpecification]
  }
  
  @scala.inline
  implicit class ServiceSpecificationMutableBuilder[Self <: ServiceSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEC2Specification(value: EC2Specification): Self = StObject.set(x, "EC2Specification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SpecificationUndefined: Self = StObject.set(x, "EC2Specification", js.undefined)
  }
}
