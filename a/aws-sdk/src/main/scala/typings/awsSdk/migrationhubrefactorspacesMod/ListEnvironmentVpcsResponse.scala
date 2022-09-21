package typings.awsSdk.migrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentVpcsResponse extends StObject {
  
  /**
    * The list of EnvironmentVpc objects. 
    */
  var EnvironmentVpcList: js.UndefOr[EnvironmentVpcs] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.migrationhubrefactorspacesMod.NextToken] = js.undefined
}
object ListEnvironmentVpcsResponse {
  
  inline def apply(): ListEnvironmentVpcsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentVpcsResponse]
  }
  
  extension [Self <: ListEnvironmentVpcsResponse](x: Self) {
    
    inline def setEnvironmentVpcList(value: EnvironmentVpcs): Self = StObject.set(x, "EnvironmentVpcList", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVpcListUndefined: Self = StObject.set(x, "EnvironmentVpcList", js.undefined)
    
    inline def setEnvironmentVpcListVarargs(value: EnvironmentVpc*): Self = StObject.set(x, "EnvironmentVpcList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
