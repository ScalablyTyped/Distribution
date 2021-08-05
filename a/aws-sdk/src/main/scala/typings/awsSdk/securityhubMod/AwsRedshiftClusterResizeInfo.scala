package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterResizeInfo extends StObject {
  
  /**
    * Indicates whether the resize operation can be canceled.
    */
  var AllowCancelResize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of resize operation. Valid values: ClassicResize 
    */
  var ResizeType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterResizeInfo {
  
  inline def apply(): AwsRedshiftClusterResizeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterResizeInfo]
  }
  
  extension [Self <: AwsRedshiftClusterResizeInfo](x: Self) {
    
    inline def setAllowCancelResize(value: Boolean): Self = StObject.set(x, "AllowCancelResize", value.asInstanceOf[js.Any])
    
    inline def setAllowCancelResizeUndefined: Self = StObject.set(x, "AllowCancelResize", js.undefined)
    
    inline def setResizeType(value: NonEmptyString): Self = StObject.set(x, "ResizeType", value.asInstanceOf[js.Any])
    
    inline def setResizeTypeUndefined: Self = StObject.set(x, "ResizeType", js.undefined)
  }
}
