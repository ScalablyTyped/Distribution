package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTagsOutput extends js.Object {
  
  /**
    * Information about the tags.
    */
  var TagDescriptions: js.UndefOr[typings.awsSdk.elbMod.TagDescriptions] = js.native
}
object DescribeTagsOutput {
  
  @scala.inline
  def apply(): DescribeTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsOutput]
  }
  
  @scala.inline
  implicit class DescribeTagsOutputOps[Self <: DescribeTagsOutput] (val x: Self) extends AnyVal {
    
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
    def setTagDescriptionsVarargs(value: TagDescription*): Self = this.set("TagDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setTagDescriptions(value: TagDescriptions): Self = this.set("TagDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagDescriptions: Self = this.set("TagDescriptions", js.undefined)
  }
}
