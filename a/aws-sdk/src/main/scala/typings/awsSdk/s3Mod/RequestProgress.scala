package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestProgress extends StObject {
  
  /**
    * Specifies whether periodic QueryProgress frames should be sent. Valid values: TRUE, FALSE. Default value: FALSE.
    */
  var Enabled: js.UndefOr[EnableRequestProgress] = js.undefined
}
object RequestProgress {
  
  inline def apply(): RequestProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestProgress]
  }
  
  extension [Self <: RequestProgress](x: Self) {
    
    inline def setEnabled(value: EnableRequestProgress): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
