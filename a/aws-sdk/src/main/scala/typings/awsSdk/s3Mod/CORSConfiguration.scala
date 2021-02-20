package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CORSConfiguration extends StObject {
  
  /**
    * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the configuration.
    */
  var CORSRules: typings.awsSdk.s3Mod.CORSRules = js.native
}
object CORSConfiguration {
  
  @scala.inline
  def apply(CORSRules: CORSRules): CORSConfiguration = {
    val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSConfiguration]
  }
  
  @scala.inline
  implicit class CORSConfigurationMutableBuilder[Self <: CORSConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCORSRules(value: CORSRules): Self = StObject.set(x, "CORSRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCORSRulesVarargs(value: CORSRule*): Self = StObject.set(x, "CORSRules", js.Array(value :_*))
  }
}
