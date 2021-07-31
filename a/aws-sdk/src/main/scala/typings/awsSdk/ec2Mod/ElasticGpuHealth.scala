package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticGpuHealth extends StObject {
  
  /**
    * The health status.
    */
  var Status: js.UndefOr[ElasticGpuStatus] = js.undefined
}
object ElasticGpuHealth {
  
  @scala.inline
  def apply(): ElasticGpuHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticGpuHealth]
  }
  
  @scala.inline
  implicit class ElasticGpuHealthMutableBuilder[Self <: ElasticGpuHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ElasticGpuStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
