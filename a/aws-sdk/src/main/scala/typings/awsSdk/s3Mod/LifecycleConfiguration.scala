package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleConfiguration extends StObject {
  
  /**
    * Specifies lifecycle configuration rules for an Amazon S3 bucket. 
    */
  var Rules: typings.awsSdk.s3Mod.Rules = js.native
}
object LifecycleConfiguration {
  
  @scala.inline
  def apply(Rules: Rules): LifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleConfiguration]
  }
  
  @scala.inline
  implicit class LifecycleConfigurationMutableBuilder[Self <: LifecycleConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
