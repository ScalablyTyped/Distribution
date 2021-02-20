package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketCorsOutput extends StObject {
  
  /**
    * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the configuration.
    */
  var CORSRules: js.UndefOr[typings.awsSdk.s3Mod.CORSRules] = js.native
}
object GetBucketCorsOutput {
  
  @scala.inline
  def apply(): GetBucketCorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketCorsOutput]
  }
  
  @scala.inline
  implicit class GetBucketCorsOutputMutableBuilder[Self <: GetBucketCorsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCORSRules(value: CORSRules): Self = StObject.set(x, "CORSRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCORSRulesUndefined: Self = StObject.set(x, "CORSRules", js.undefined)
    
    @scala.inline
    def setCORSRulesVarargs(value: CORSRule*): Self = StObject.set(x, "CORSRules", js.Array(value :_*))
  }
}
