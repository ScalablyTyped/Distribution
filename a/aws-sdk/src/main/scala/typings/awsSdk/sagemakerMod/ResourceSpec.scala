package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceSpec extends StObject {
  
  /**
    * The instance type that the image version runs on.
    */
  var InstanceType: js.UndefOr[AppInstanceType] = js.native
  
  /**
    * The ARN of the SageMaker image that the image version belongs to.
    */
  var SageMakerImageArn: js.UndefOr[ImageArn] = js.native
  
  /**
    * The ARN of the image version created on the instance.
    */
  var SageMakerImageVersionArn: js.UndefOr[ImageVersionArn] = js.native
}
object ResourceSpec {
  
  @scala.inline
  def apply(): ResourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSpec]
  }
  
  @scala.inline
  implicit class ResourceSpecMutableBuilder[Self <: ResourceSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: AppInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setSageMakerImageArn(value: ImageArn): Self = StObject.set(x, "SageMakerImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSageMakerImageArnUndefined: Self = StObject.set(x, "SageMakerImageArn", js.undefined)
    
    @scala.inline
    def setSageMakerImageVersionArn(value: ImageVersionArn): Self = StObject.set(x, "SageMakerImageVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSageMakerImageVersionArnUndefined: Self = StObject.set(x, "SageMakerImageVersionArn", js.undefined)
  }
}
