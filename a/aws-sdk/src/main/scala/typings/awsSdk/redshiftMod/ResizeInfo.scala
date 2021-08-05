package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeInfo extends StObject {
  
  /**
    * A boolean value indicating if the resize operation can be cancelled.
    */
  var AllowCancelResize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the value ClassicResize.
    */
  var ResizeType: js.UndefOr[String] = js.undefined
}
object ResizeInfo {
  
  inline def apply(): ResizeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeInfo]
  }
  
  extension [Self <: ResizeInfo](x: Self) {
    
    inline def setAllowCancelResize(value: Boolean): Self = StObject.set(x, "AllowCancelResize", value.asInstanceOf[js.Any])
    
    inline def setAllowCancelResizeUndefined: Self = StObject.set(x, "AllowCancelResize", js.undefined)
    
    inline def setResizeType(value: String): Self = StObject.set(x, "ResizeType", value.asInstanceOf[js.Any])
    
    inline def setResizeTypeUndefined: Self = StObject.set(x, "ResizeType", js.undefined)
  }
}
