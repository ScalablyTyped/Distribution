package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadBlockBlobOptions
  extends StObject
     with UploadBlobOptions {
  
  var blockIdPrefix: js.UndefOr[String] = js.undefined
}
object UploadBlockBlobOptions {
  
  inline def apply(): UploadBlockBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadBlockBlobOptions]
  }
  
  extension [Self <: UploadBlockBlobOptions](x: Self) {
    
    inline def setBlockIdPrefix(value: String): Self = StObject.set(x, "blockIdPrefix", value.asInstanceOf[js.Any])
    
    inline def setBlockIdPrefixUndefined: Self = StObject.set(x, "blockIdPrefix", js.undefined)
  }
}
