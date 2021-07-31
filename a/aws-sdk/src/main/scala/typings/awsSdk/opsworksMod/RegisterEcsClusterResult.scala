package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterEcsClusterResult extends StObject {
  
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: js.UndefOr[String] = js.undefined
}
object RegisterEcsClusterResult {
  
  @scala.inline
  def apply(): RegisterEcsClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterEcsClusterResult]
  }
  
  @scala.inline
  implicit class RegisterEcsClusterResultMutableBuilder[Self <: RegisterEcsClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEcsClusterArn(value: String): Self = StObject.set(x, "EcsClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsClusterArnUndefined: Self = StObject.set(x, "EcsClusterArn", js.undefined)
  }
}
