package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeploymentsResult extends StObject {
  
  /**
    * An array of Deployment objects that describe the deployments.
    */
  var Deployments: js.UndefOr[typings.awsSdk.opsworksMod.Deployments] = js.undefined
}
object DescribeDeploymentsResult {
  
  @scala.inline
  def apply(): DescribeDeploymentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeploymentsResult]
  }
  
  @scala.inline
  implicit class DescribeDeploymentsResultMutableBuilder[Self <: DescribeDeploymentsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployments(value: Deployments): Self = StObject.set(x, "Deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentsUndefined: Self = StObject.set(x, "Deployments", js.undefined)
    
    @scala.inline
    def setDeploymentsVarargs(value: Deployment*): Self = StObject.set(x, "Deployments", js.Array(value :_*))
  }
}
