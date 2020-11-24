package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableKeySchema extends js.Object {
  
  /**
    * The name of the key schema attribute.
    */
  var AttributeName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of key used for the key schema attribute.
    */
  var KeyType: js.UndefOr[NonEmptyString] = js.native
}
object AwsDynamoDbTableKeySchema {
  
  @scala.inline
  def apply(): AwsDynamoDbTableKeySchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableKeySchema]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableKeySchemaOps[Self <: AwsDynamoDbTableKeySchema] (val x: Self) extends AnyVal {
    
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
    def setKeyType(value: NonEmptyString): Self = this.set("KeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyType: Self = this.set("KeyType", js.undefined)
  }
}
