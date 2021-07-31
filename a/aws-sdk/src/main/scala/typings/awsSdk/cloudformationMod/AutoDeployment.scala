package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoDeployment extends StObject {
  
  /**
    * If set to true, StackSets automatically deploys additional stack instances to AWS Organizations accounts that are added to a target organization or organizational unit (OU) in the specified Regions. If an account is removed from a target organization or OU, StackSets deletes stack instances from the account in the specified Regions.
    */
  var Enabled: js.UndefOr[AutoDeploymentNullable] = js.undefined
  
  /**
    * If set to true, stack resources are retained when an account is removed from a target organization or OU. If set to false, stack resources are deleted. Specify only if Enabled is set to True.
    */
  var RetainStacksOnAccountRemoval: js.UndefOr[RetainStacksOnAccountRemovalNullable] = js.undefined
}
object AutoDeployment {
  
  @scala.inline
  def apply(): AutoDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoDeployment]
  }
  
  @scala.inline
  implicit class AutoDeploymentMutableBuilder[Self <: AutoDeployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: AutoDeploymentNullable): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setRetainStacksOnAccountRemoval(value: RetainStacksOnAccountRemovalNullable): Self = StObject.set(x, "RetainStacksOnAccountRemoval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainStacksOnAccountRemovalUndefined: Self = StObject.set(x, "RetainStacksOnAccountRemoval", js.undefined)
  }
}
