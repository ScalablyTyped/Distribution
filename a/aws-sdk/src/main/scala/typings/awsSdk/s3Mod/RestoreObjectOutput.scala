package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreObjectOutput extends StObject {
  
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
  
  /**
    * Indicates the path in the provided S3 output location where Select results will be restored to.
    */
  var RestoreOutputPath: js.UndefOr[typings.awsSdk.s3Mod.RestoreOutputPath] = js.native
}
object RestoreObjectOutput {
  
  @scala.inline
  def apply(): RestoreObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreObjectOutput]
  }
  
  @scala.inline
  implicit class RestoreObjectOutputMutableBuilder[Self <: RestoreObjectOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    @scala.inline
    def setRestoreOutputPath(value: RestoreOutputPath): Self = StObject.set(x, "RestoreOutputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreOutputPathUndefined: Self = StObject.set(x, "RestoreOutputPath", js.undefined)
  }
}
