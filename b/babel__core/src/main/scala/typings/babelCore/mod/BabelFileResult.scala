package typings.babelCore.mod

import typings.babelCore.anon.File
import typings.babelTypes.mod.File_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BabelFileResult extends StObject {
  
  var ast: js.UndefOr[File_ | Null] = js.undefined
  
  var code: js.UndefOr[String | Null] = js.undefined
  
  var ignored: js.UndefOr[Boolean] = js.undefined
  
  var map: js.UndefOr[File | Null] = js.undefined
  
  var metadata: js.UndefOr[BabelFileMetadata] = js.undefined
}
object BabelFileResult {
  
  inline def apply(): BabelFileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabelFileResult]
  }
  
  extension [Self <: BabelFileResult](x: Self) {
    
    inline def setAst(value: File_): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstNull: Self = StObject.set(x, "ast", null)
    
    inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    
    inline def setMap(value: File): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMetadata(value: BabelFileMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
