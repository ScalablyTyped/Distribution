package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableAttributeDefinition extends js.Object {
  
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of the attribute.
    */
  var AttributeType: js.UndefOr[NonEmptyString] = js.native
}
object AwsDynamoDbTableAttributeDefinition {
  
  @scala.inline
  def apply(): AwsDynamoDbTableAttributeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableAttributeDefinition]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableAttributeDefinitionOps[Self <: AwsDynamoDbTableAttributeDefinition] (val x: Self) extends AnyVal {
    
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
    def setAttributeName(value: NonEmptyString): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("AttributeName", js.undefined)
    
    @scala.inline
    def setAttributeType(value: NonEmptyString): Self = this.set("AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeType: Self = this.set("AttributeType", js.undefined)
  }
}
