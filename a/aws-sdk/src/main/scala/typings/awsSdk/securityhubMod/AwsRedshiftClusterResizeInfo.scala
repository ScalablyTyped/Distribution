package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterResizeInfo extends StObject {
  
  /**
    * Indicates whether the resize operation can be canceled.
    */
  var AllowCancelResize: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of resize operation. Valid values: ClassicResize 
    */
  var ResizeType: js.UndefOr[NonEmptyString] = js.native
}
object AwsRedshiftClusterResizeInfo {
  
  @scala.inline
  def apply(): AwsRedshiftClusterResizeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterResizeInfo]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterResizeInfoMutableBuilder[Self <: AwsRedshiftClusterResizeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCancelResize(value: Boolean): Self = StObject.set(x, "AllowCancelResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCancelResizeUndefined: Self = StObject.set(x, "AllowCancelResize", js.undefined)
    
    @scala.inline
    def setResizeType(value: NonEmptyString): Self = StObject.set(x, "ResizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeTypeUndefined: Self = StObject.set(x, "ResizeType", js.undefined)
  }
}
