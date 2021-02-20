package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTagsOutput extends StObject {
  
  /**
    * The ARN of the tagged resource group.
    */
  var Arn: js.UndefOr[GroupArn] = js.native
  
  /**
    * The tags associated with the specified resource group.
    */
  var Tags: js.UndefOr[typings.awsSdk.resourcegroupsMod.Tags] = js.native
}
object GetTagsOutput {
  
  @scala.inline
  def apply(): GetTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagsOutput]
  }
  
  @scala.inline
  implicit class GetTagsOutputMutableBuilder[Self <: GetTagsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: GroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
