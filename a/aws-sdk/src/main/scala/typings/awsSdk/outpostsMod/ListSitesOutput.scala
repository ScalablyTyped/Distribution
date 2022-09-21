package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSitesOutput extends StObject {
  
  var NextToken: js.UndefOr[Token] = js.undefined
  
  var Sites: js.UndefOr[siteListDefinition] = js.undefined
}
object ListSitesOutput {
  
  inline def apply(): ListSitesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSitesOutput]
  }
  
  extension [Self <: ListSitesOutput](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSites(value: siteListDefinition): Self = StObject.set(x, "Sites", value.asInstanceOf[js.Any])
    
    inline def setSitesUndefined: Self = StObject.set(x, "Sites", js.undefined)
    
    inline def setSitesVarargs(value: Site*): Self = StObject.set(x, "Sites", js.Array(value*))
  }
}
