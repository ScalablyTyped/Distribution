package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRecorderManagerStopOptions extends StObject {
  
  var tempFilePath: String
}
object OnRecorderManagerStopOptions {
  
  @scala.inline
  def apply(tempFilePath: String): OnRecorderManagerStopOptions = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRecorderManagerStopOptions]
  }
  
  @scala.inline
  implicit class OnRecorderManagerStopOptionsMutableBuilder[Self <: OnRecorderManagerStopOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
