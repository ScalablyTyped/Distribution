package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobMessages extends StObject {
  
  /**
    * List of messages that are informational only and don't indicate a problem with your job.
    */
  var Info: js.UndefOr[listOfString] = js.undefined
  
  /**
    * List of messages that warn about conditions that might cause your job not to run or to fail.
    */
  var Warning: js.UndefOr[listOfString] = js.undefined
}
object JobMessages {
  
  inline def apply(): JobMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMessages]
  }
  
  extension [Self <: JobMessages](x: Self) {
    
    inline def setInfo(value: listOfString): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "Info", js.undefined)
    
    inline def setInfoVarargs(value: string*): Self = StObject.set(x, "Info", js.Array(value :_*))
    
    inline def setWarning(value: listOfString): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
    
    inline def setWarningVarargs(value: string*): Self = StObject.set(x, "Warning", js.Array(value :_*))
  }
}
