package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recommendation extends js.Object {
  
  /**
    * Describes the recommended steps to take to remediate an issue identified in a finding.
    */
  var Text: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A URL to a page or site that contains information about how to remediate a finding.
    */
  var Url: js.UndefOr[NonEmptyString] = js.native
}
object Recommendation {
  
  @scala.inline
  def apply(): Recommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recommendation]
  }
  
  @scala.inline
  implicit class RecommendationOps[Self <: Recommendation] (val x: Self) extends AnyVal {
    
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
    def setText(value: NonEmptyString): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
    
    @scala.inline
    def setUrl(value: NonEmptyString): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
}
