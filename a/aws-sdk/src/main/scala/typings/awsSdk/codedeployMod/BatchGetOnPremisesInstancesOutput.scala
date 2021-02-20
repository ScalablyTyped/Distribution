package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetOnPremisesInstancesOutput extends StObject {
  
  /**
    * Information about the on-premises instances.
    */
  var instanceInfos: js.UndefOr[InstanceInfoList] = js.native
}
object BatchGetOnPremisesInstancesOutput {
  
  @scala.inline
  def apply(): BatchGetOnPremisesInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetOnPremisesInstancesOutput]
  }
  
  @scala.inline
  implicit class BatchGetOnPremisesInstancesOutputMutableBuilder[Self <: BatchGetOnPremisesInstancesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceInfos(value: InstanceInfoList): Self = StObject.set(x, "instanceInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInfosUndefined: Self = StObject.set(x, "instanceInfos", js.undefined)
    
    @scala.inline
    def setInstanceInfosVarargs(value: InstanceInfo*): Self = StObject.set(x, "instanceInfos", js.Array(value :_*))
  }
}
