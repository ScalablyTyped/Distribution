package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectRetentionOutput extends StObject {
  
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.undefined
}
object PutObjectRetentionOutput {
  
  @scala.inline
  def apply(): PutObjectRetentionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectRetentionOutput]
  }
  
  @scala.inline
  implicit class PutObjectRetentionOutputMutableBuilder[Self <: PutObjectRetentionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
  }
}
