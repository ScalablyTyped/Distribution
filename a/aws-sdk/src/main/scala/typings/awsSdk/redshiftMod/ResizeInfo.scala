package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeInfo extends StObject {
  
  /**
    * A boolean value indicating if the resize operation can be cancelled.
    */
  var AllowCancelResize: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns the value ClassicResize.
    */
  var ResizeType: js.UndefOr[String] = js.native
}
object ResizeInfo {
  
  @scala.inline
  def apply(): ResizeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeInfo]
  }
  
  @scala.inline
  implicit class ResizeInfoMutableBuilder[Self <: ResizeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCancelResize(value: Boolean): Self = StObject.set(x, "AllowCancelResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCancelResizeUndefined: Self = StObject.set(x, "AllowCancelResize", js.undefined)
    
    @scala.inline
    def setResizeType(value: String): Self = StObject.set(x, "ResizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeTypeUndefined: Self = StObject.set(x, "ResizeType", js.undefined)
  }
}
