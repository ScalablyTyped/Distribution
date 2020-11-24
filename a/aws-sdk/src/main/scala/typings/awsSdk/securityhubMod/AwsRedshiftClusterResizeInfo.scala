package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterResizeInfo extends js.Object {
  
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
  implicit class AwsRedshiftClusterResizeInfoOps[Self <: AwsRedshiftClusterResizeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowCancelResize(value: Boolean): Self = this.set("AllowCancelResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCancelResize: Self = this.set("AllowCancelResize", js.undefined)
    
    @scala.inline
    def setResizeType(value: NonEmptyString): Self = this.set("ResizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeType: Self = this.set("ResizeType", js.undefined)
  }
}
