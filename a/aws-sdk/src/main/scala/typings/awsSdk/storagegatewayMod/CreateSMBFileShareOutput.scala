package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSMBFileShareOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the newly created file share.
    */
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.undefined
}
object CreateSMBFileShareOutput {
  
  inline def apply(): CreateSMBFileShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSMBFileShareOutput]
  }
  
  extension [Self <: CreateSMBFileShareOutput](x: Self) {
    
    inline def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    inline def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
  }
}
