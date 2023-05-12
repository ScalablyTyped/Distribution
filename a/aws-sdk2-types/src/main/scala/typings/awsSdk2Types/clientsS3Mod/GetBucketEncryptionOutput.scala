package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketEncryptionOutput extends StObject {
  
  var ServerSideEncryptionConfiguration: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ServerSideEncryptionConfiguration] = js.undefined
}
object GetBucketEncryptionOutput {
  
  inline def apply(): GetBucketEncryptionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketEncryptionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketEncryptionOutput] (val x: Self) extends AnyVal {
    
    inline def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "ServerSideEncryptionConfiguration", js.undefined)
  }
}
