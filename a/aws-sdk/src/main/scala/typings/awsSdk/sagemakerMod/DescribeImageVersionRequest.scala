package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImageVersionRequest extends StObject {
  
  /**
    * The name of the image.
    */
  var ImageName: typings.awsSdk.sagemakerMod.ImageName = js.native
  
  /**
    * The version of the image. If not specified, the latest version is described.
    */
  var Version: js.UndefOr[ImageVersionNumber] = js.native
}
object DescribeImageVersionRequest {
  
  @scala.inline
  def apply(ImageName: ImageName): DescribeImageVersionRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageVersionRequest]
  }
  
  @scala.inline
  implicit class DescribeImageVersionRequestMutableBuilder[Self <: DescribeImageVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: ImageVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
