package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNFSFileShareOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the newly created file share.
    */
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.undefined
}
object CreateNFSFileShareOutput {
  
  @scala.inline
  def apply(): CreateNFSFileShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNFSFileShareOutput]
  }
  
  @scala.inline
  implicit class CreateNFSFileShareOutputMutableBuilder[Self <: CreateNFSFileShareOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
  }
}
