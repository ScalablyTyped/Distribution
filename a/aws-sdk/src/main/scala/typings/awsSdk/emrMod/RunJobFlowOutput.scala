package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunJobFlowOutput extends StObject {
  
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  
  /**
    * An unique identifier for the job flow.
    */
  var JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.native
}
object RunJobFlowOutput {
  
  @scala.inline
  def apply(): RunJobFlowOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunJobFlowOutput]
  }
  
  @scala.inline
  implicit class RunJobFlowOutputMutableBuilder[Self <: RunJobFlowOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: ArnType): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setJobFlowId(value: XmlStringMaxLen256): Self = StObject.set(x, "JobFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobFlowIdUndefined: Self = StObject.set(x, "JobFlowId", js.undefined)
  }
}
