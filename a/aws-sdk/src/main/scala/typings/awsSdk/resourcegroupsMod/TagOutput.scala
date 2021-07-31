package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagOutput extends StObject {
  
  /**
    * The ARN of the tagged resource.
    */
  var Arn: js.UndefOr[GroupArn] = js.undefined
  
  /**
    * The tags that have been added to the specified resource group.
    */
  var Tags: js.UndefOr[typings.awsSdk.resourcegroupsMod.Tags] = js.undefined
}
object TagOutput {
  
  @scala.inline
  def apply(): TagOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOutput]
  }
  
  @scala.inline
  implicit class TagOutputMutableBuilder[Self <: TagOutput] (val x: Self) extends AnyVal {
    
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
