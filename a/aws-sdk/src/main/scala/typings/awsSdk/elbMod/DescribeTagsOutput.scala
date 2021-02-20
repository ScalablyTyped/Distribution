package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTagsOutput extends StObject {
  
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
  implicit class DescribeTagsOutputMutableBuilder[Self <: DescribeTagsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagDescriptions(value: TagDescriptions): Self = StObject.set(x, "TagDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagDescriptionsUndefined: Self = StObject.set(x, "TagDescriptions", js.undefined)
    
    @scala.inline
    def setTagDescriptionsVarargs(value: TagDescription*): Self = StObject.set(x, "TagDescriptions", js.Array(value :_*))
  }
}
