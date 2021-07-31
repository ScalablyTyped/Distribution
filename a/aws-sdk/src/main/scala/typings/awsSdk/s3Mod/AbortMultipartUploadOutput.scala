package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortMultipartUploadOutput extends StObject {
  
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.undefined
}
object AbortMultipartUploadOutput {
  
  @scala.inline
  def apply(): AbortMultipartUploadOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortMultipartUploadOutput]
  }
  
  @scala.inline
  implicit class AbortMultipartUploadOutputMutableBuilder[Self <: AbortMultipartUploadOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
  }
}
