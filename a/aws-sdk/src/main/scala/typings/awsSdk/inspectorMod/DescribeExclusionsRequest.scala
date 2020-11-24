package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExclusionsRequest extends js.Object {
  
  /**
    * The list of ARNs that specify the exclusions that you want to describe.
    */
  var exclusionArns: BatchDescribeExclusionsArnList = js.native
  
  /**
    * The locale into which you want to translate the exclusion's title, description, and recommendation.
    */
  var locale: js.UndefOr[Locale] = js.native
}
object DescribeExclusionsRequest {
  
  @scala.inline
  def apply(exclusionArns: BatchDescribeExclusionsArnList): DescribeExclusionsRequest = {
    val __obj = js.Dynamic.literal(exclusionArns = exclusionArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExclusionsRequest]
  }
  
  @scala.inline
  implicit class DescribeExclusionsRequestOps[Self <: DescribeExclusionsRequest] (val x: Self) extends AnyVal {
    
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
    def setExclusionArnsVarargs(value: Arn*): Self = this.set("exclusionArns", js.Array(value :_*))
    
    @scala.inline
    def setExclusionArns(value: BatchDescribeExclusionsArnList): Self = this.set("exclusionArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
}
