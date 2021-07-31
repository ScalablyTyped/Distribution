package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagsInput extends StObject {
  
  /**
    * The ARN of the resource group whose tags you want to retrieve.
    */
  var Arn: GroupArn
}
object GetTagsInput {
  
  @scala.inline
  def apply(Arn: GroupArn): GetTagsInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsInput]
  }
  
  @scala.inline
  implicit class GetTagsInputMutableBuilder[Self <: GetTagsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: GroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
