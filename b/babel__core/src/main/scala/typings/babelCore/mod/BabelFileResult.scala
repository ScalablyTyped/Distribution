package typings.babelCore.mod

import typings.babelCore.anon.File
import typings.babelTypes.mod.File_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BabelFileResult extends StObject {
  
  var ast: js.UndefOr[File_ | Null] = js.native
  
  var code: js.UndefOr[String | Null] = js.native
  
  var ignored: js.UndefOr[Boolean] = js.native
  
  var map: js.UndefOr[File | Null] = js.native
  
  var metadata: js.UndefOr[BabelFileMetadata] = js.native
}
object BabelFileResult {
  
  @scala.inline
  def apply(): BabelFileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabelFileResult]
  }
  
  @scala.inline
  implicit class BabelFileResultMutableBuilder[Self <: BabelFileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: File_): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstNull: Self = StObject.set(x, "ast", null)
    
    @scala.inline
    def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNull: Self = StObject.set(x, "code", null)
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    
    @scala.inline
    def setMap(value: File): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapNull: Self = StObject.set(x, "map", null)
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMetadata(value: BabelFileMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
