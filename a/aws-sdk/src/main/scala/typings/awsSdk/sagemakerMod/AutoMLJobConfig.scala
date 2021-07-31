package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLJobConfig extends StObject {
  
  /**
    * How long a job is allowed to run, or how many candidates a job is allowed to generate.
    */
  var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.undefined
  
  /**
    * Security configuration for traffic encryption or Amazon VPC settings.
    */
  var SecurityConfig: js.UndefOr[AutoMLSecurityConfig] = js.undefined
}
object AutoMLJobConfig {
  
  @scala.inline
  def apply(): AutoMLJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobConfig]
  }
  
  @scala.inline
  implicit class AutoMLJobConfigMutableBuilder[Self <: AutoMLJobConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionCriteria(value: AutoMLJobCompletionCriteria): Self = StObject.set(x, "CompletionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionCriteriaUndefined: Self = StObject.set(x, "CompletionCriteria", js.undefined)
    
    @scala.inline
    def setSecurityConfig(value: AutoMLSecurityConfig): Self = StObject.set(x, "SecurityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigUndefined: Self = StObject.set(x, "SecurityConfig", js.undefined)
  }
}
