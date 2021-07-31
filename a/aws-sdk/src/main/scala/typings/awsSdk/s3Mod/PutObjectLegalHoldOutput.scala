package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectLegalHoldOutput extends StObject {
  
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.undefined
}
object PutObjectLegalHoldOutput {
  
  @scala.inline
  def apply(): PutObjectLegalHoldOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectLegalHoldOutput]
  }
  
  @scala.inline
  implicit class PutObjectLegalHoldOutputMutableBuilder[Self <: PutObjectLegalHoldOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
  }
}
