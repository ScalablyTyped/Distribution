package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceUtilization extends StObject {
  
  /**
    * Utilization of current Amazon EC2 instance. 
    */
  var EC2ResourceUtilization: js.UndefOr[typings.awsSdk.costexplorerMod.EC2ResourceUtilization] = js.native
}
object ResourceUtilization {
  
  @scala.inline
  def apply(): ResourceUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUtilization]
  }
  
  @scala.inline
  implicit class ResourceUtilizationMutableBuilder[Self <: ResourceUtilization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEC2ResourceUtilization(value: EC2ResourceUtilization): Self = StObject.set(x, "EC2ResourceUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2ResourceUtilizationUndefined: Self = StObject.set(x, "EC2ResourceUtilization", js.undefined)
  }
}
