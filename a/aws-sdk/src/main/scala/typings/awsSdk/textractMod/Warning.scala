package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warning extends StObject {
  
  /**
    * The error code for the warning.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.textractMod.ErrorCode] = js.undefined
  
  /**
    * A list of the pages that the warning applies to.
    */
  var Pages: js.UndefOr[typings.awsSdk.textractMod.Pages] = js.undefined
}
object Warning {
  
  @scala.inline
  def apply(): Warning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Warning]
  }
  
  @scala.inline
  implicit class WarningMutableBuilder[Self <: Warning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setPages(value: Pages): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "Pages", js.undefined)
    
    @scala.inline
    def setPagesVarargs(value: UInteger*): Self = StObject.set(x, "Pages", js.Array(value :_*))
  }
}
