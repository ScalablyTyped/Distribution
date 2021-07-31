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
  
  @scala.inline
  def apply(): JobMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMessages]
  }
  
  @scala.inline
  implicit class JobMessagesMutableBuilder[Self <: JobMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: listOfString): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "Info", js.undefined)
    
    @scala.inline
    def setInfoVarargs(value: string*): Self = StObject.set(x, "Info", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: listOfString): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
    
    @scala.inline
    def setWarningVarargs(value: string*): Self = StObject.set(x, "Warning", js.Array(value :_*))
  }
}
