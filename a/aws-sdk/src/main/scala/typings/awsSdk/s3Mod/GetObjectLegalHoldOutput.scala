package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectLegalHoldOutput extends StObject {
  
  /**
    * The current Legal Hold status for the specified object.
    */
  var LegalHold: js.UndefOr[ObjectLockLegalHold] = js.undefined
}
object GetObjectLegalHoldOutput {
  
  @scala.inline
  def apply(): GetObjectLegalHoldOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectLegalHoldOutput]
  }
  
  @scala.inline
  implicit class GetObjectLegalHoldOutputMutableBuilder[Self <: GetObjectLegalHoldOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegalHold(value: ObjectLockLegalHold): Self = StObject.set(x, "LegalHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalHoldUndefined: Self = StObject.set(x, "LegalHold", js.undefined)
  }
}
