package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunJobFlowOutput extends StObject {
  
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * An unique identifier for the job flow.
    */
  var JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined
}
object RunJobFlowOutput {
  
  inline def apply(): RunJobFlowOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunJobFlowOutput]
  }
  
  extension [Self <: RunJobFlowOutput](x: Self) {
    
    inline def setClusterArn(value: ArnType): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setJobFlowId(value: XmlStringMaxLen256): Self = StObject.set(x, "JobFlowId", value.asInstanceOf[js.Any])
    
    inline def setJobFlowIdUndefined: Self = StObject.set(x, "JobFlowId", js.undefined)
  }
}
