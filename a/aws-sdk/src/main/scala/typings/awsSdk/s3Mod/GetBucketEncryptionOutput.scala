package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketEncryptionOutput extends StObject {
  
  var ServerSideEncryptionConfiguration: js.UndefOr[typings.awsSdk.s3Mod.ServerSideEncryptionConfiguration] = js.native
}
object GetBucketEncryptionOutput {
  
  @scala.inline
  def apply(): GetBucketEncryptionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketEncryptionOutput]
  }
  
  @scala.inline
  implicit class GetBucketEncryptionOutputMutableBuilder[Self <: GetBucketEncryptionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "ServerSideEncryptionConfiguration", js.undefined)
  }
}
