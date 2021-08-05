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
  
  inline def apply(): TagOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOutput]
  }
  
  extension [Self <: TagOutput](x: Self) {
    
    inline def setArn(value: GroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
