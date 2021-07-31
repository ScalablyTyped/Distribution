package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleConfiguration extends StObject {
  
  /**
    * A lifecycle rule for individual objects in an Outposts bucket. 
    */
  var Rules: js.UndefOr[LifecycleRules] = js.undefined
}
object LifecycleConfiguration {
  
  @scala.inline
  def apply(): LifecycleConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleConfiguration]
  }
  
  @scala.inline
  implicit class LifecycleConfigurationMutableBuilder[Self <: LifecycleConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: LifecycleRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: LifecycleRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
