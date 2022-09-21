package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetsOutput extends StObject {
  
  /**
    *  Information about hardware assets. 
    */
  var Assets: js.UndefOr[AssetListDefinition] = js.undefined
  
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListAssetsOutput {
  
  inline def apply(): ListAssetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssetsOutput]
  }
  
  extension [Self <: ListAssetsOutput](x: Self) {
    
    inline def setAssets(value: AssetListDefinition): Self = StObject.set(x, "Assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "Assets", js.undefined)
    
    inline def setAssetsVarargs(value: AssetInfo*): Self = StObject.set(x, "Assets", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
