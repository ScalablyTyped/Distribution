package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOutpostsOutput extends StObject {
  
  var NextToken: js.UndefOr[Token] = js.undefined
  
  var Outposts: js.UndefOr[outpostListDefinition] = js.undefined
}
object ListOutpostsOutput {
  
  inline def apply(): ListOutpostsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutpostsOutput]
  }
  
  extension [Self <: ListOutpostsOutput](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOutposts(value: outpostListDefinition): Self = StObject.set(x, "Outposts", value.asInstanceOf[js.Any])
    
    inline def setOutpostsUndefined: Self = StObject.set(x, "Outposts", js.undefined)
    
    inline def setOutpostsVarargs(value: Outpost*): Self = StObject.set(x, "Outposts", js.Array(value :_*))
  }
}
