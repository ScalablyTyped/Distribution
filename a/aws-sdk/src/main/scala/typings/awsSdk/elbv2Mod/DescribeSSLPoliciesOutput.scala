package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSSLPoliciesOutput extends StObject {
  
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
  
  /**
    * Information about the security policies.
    */
  var SslPolicies: js.UndefOr[typings.awsSdk.elbv2Mod.SslPolicies] = js.undefined
}
object DescribeSSLPoliciesOutput {
  
  inline def apply(): DescribeSSLPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSSLPoliciesOutput]
  }
  
  extension [Self <: DescribeSSLPoliciesOutput](x: Self) {
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setSslPolicies(value: SslPolicies): Self = StObject.set(x, "SslPolicies", value.asInstanceOf[js.Any])
    
    inline def setSslPoliciesUndefined: Self = StObject.set(x, "SslPolicies", js.undefined)
    
    inline def setSslPoliciesVarargs(value: SslPolicy*): Self = StObject.set(x, "SslPolicies", js.Array(value :_*))
  }
}
