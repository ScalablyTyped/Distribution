package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSourceCredentialsOutput extends StObject {
  
  /**
    *  A list of SourceCredentialsInfo objects. Each SourceCredentialsInfo object includes the authentication type, token ARN, and type of source provider for one set of credentials. 
    */
  var sourceCredentialsInfos: js.UndefOr[SourceCredentialsInfos] = js.undefined
}
object ListSourceCredentialsOutput {
  
  inline def apply(): ListSourceCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSourceCredentialsOutput]
  }
  
  extension [Self <: ListSourceCredentialsOutput](x: Self) {
    
    inline def setSourceCredentialsInfos(value: SourceCredentialsInfos): Self = StObject.set(x, "sourceCredentialsInfos", value.asInstanceOf[js.Any])
    
    inline def setSourceCredentialsInfosUndefined: Self = StObject.set(x, "sourceCredentialsInfos", js.undefined)
    
    inline def setSourceCredentialsInfosVarargs(value: SourceCredentialsInfo*): Self = StObject.set(x, "sourceCredentialsInfos", js.Array(value*))
  }
}
