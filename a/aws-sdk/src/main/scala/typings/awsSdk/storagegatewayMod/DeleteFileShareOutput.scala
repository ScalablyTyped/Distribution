package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileShareOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted file share.
    */
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.undefined
}
object DeleteFileShareOutput {
  
  inline def apply(): DeleteFileShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileShareOutput]
  }
  
  extension [Self <: DeleteFileShareOutput](x: Self) {
    
    inline def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    inline def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
  }
}
