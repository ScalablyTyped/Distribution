package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOnPremisesInstanceOutput extends StObject {
  
  /**
    *  Information about the on-premises instance. 
    */
  var instanceInfo: js.UndefOr[InstanceInfo] = js.native
}
object GetOnPremisesInstanceOutput {
  
  @scala.inline
  def apply(): GetOnPremisesInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOnPremisesInstanceOutput]
  }
  
  @scala.inline
  implicit class GetOnPremisesInstanceOutputMutableBuilder[Self <: GetOnPremisesInstanceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceInfo(value: InstanceInfo): Self = StObject.set(x, "instanceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInfoUndefined: Self = StObject.set(x, "instanceInfo", js.undefined)
  }
}
