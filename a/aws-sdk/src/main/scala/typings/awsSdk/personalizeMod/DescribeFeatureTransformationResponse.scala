package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFeatureTransformationResponse extends js.Object {
  
  /**
    * A listing of the FeatureTransformation properties.
    */
  var featureTransformation: js.UndefOr[FeatureTransformation] = js.native
}
object DescribeFeatureTransformationResponse {
  
  @scala.inline
  def apply(): DescribeFeatureTransformationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFeatureTransformationResponse]
  }
  
  @scala.inline
  implicit class DescribeFeatureTransformationResponseOps[Self <: DescribeFeatureTransformationResponse] (val x: Self) extends AnyVal {
    
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
    def setFeatureTransformation(value: FeatureTransformation): Self = this.set("featureTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureTransformation: Self = this.set("featureTransformation", js.undefined)
  }
}
