package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendationSource extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the recommendation source.
    */
  var recommendationSourceArn: js.UndefOr[RecommendationSourceArn] = js.native
  
  /**
    * The resource type of the recommendation source.
    */
  var recommendationSourceType: js.UndefOr[RecommendationSourceType] = js.native
}
object RecommendationSource {
  
  @scala.inline
  def apply(): RecommendationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationSource]
  }
  
  @scala.inline
  implicit class RecommendationSourceOps[Self <: RecommendationSource] (val x: Self) extends AnyVal {
    
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
    def setRecommendationSourceArn(value: RecommendationSourceArn): Self = this.set("recommendationSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationSourceArn: Self = this.set("recommendationSourceArn", js.undefined)
    
    @scala.inline
    def setRecommendationSourceType(value: RecommendationSourceType): Self = this.set("recommendationSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationSourceType: Self = this.set("recommendationSourceType", js.undefined)
  }
}
