package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectLegalHoldOutput extends StObject {
  
  var RequestCharged: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.RequestCharged] = js.undefined
}
object PutObjectLegalHoldOutput {
  
  inline def apply(): PutObjectLegalHoldOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectLegalHoldOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutObjectLegalHoldOutput] (val x: Self) extends AnyVal {
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
  }
}
