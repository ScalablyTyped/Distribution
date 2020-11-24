package typings.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexUpdateMod

import typings.awsSdkClientDynamodbBrowser.typesCreateGlobalSecondaryIndexActionMod.UnmarshalledCreateGlobalSecondaryIndexAction
import typings.awsSdkClientDynamodbBrowser.typesDeleteGlobalSecondaryIndexActionMod.UnmarshalledDeleteGlobalSecondaryIndexAction
import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalSecondaryIndexActionMod.UnmarshalledUpdateGlobalSecondaryIndexAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledGlobalSecondaryIndexUpdate extends GlobalSecondaryIndexUpdate {
  
  /**
    * <p>The parameters required for creating a global secondary index on an existing table:</p> <ul> <li> <p> <code>IndexName </code> </p> </li> <li> <p> <code>KeySchema </code> </p> </li> <li> <p> <code>AttributeDefinitions </code> </p> </li> <li> <p> <code>Projection </code> </p> </li> <li> <p> <code>ProvisionedThroughput </code> </p> </li> </ul>
    */
  @JSName("Create")
  var Create_UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[UnmarshalledCreateGlobalSecondaryIndexAction] = js.native
  
  /**
    * <p>The name of an existing global secondary index to be removed.</p>
    */
  @JSName("Delete")
  var Delete_UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[UnmarshalledDeleteGlobalSecondaryIndexAction] = js.native
  
  /**
    * <p>The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.</p>
    */
  @JSName("Update")
  var Update_UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[UnmarshalledUpdateGlobalSecondaryIndexAction] = js.native
}
object UnmarshalledGlobalSecondaryIndexUpdate {
  
  @scala.inline
  def apply(): UnmarshalledGlobalSecondaryIndexUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGlobalSecondaryIndexUpdate]
  }
  
  @scala.inline
  implicit class UnmarshalledGlobalSecondaryIndexUpdateOps[Self <: UnmarshalledGlobalSecondaryIndexUpdate] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: UnmarshalledCreateGlobalSecondaryIndexAction): Self = this.set("Create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("Create", js.undefined)
    
    @scala.inline
    def setDelete(value: UnmarshalledDeleteGlobalSecondaryIndexAction): Self = this.set("Delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("Delete", js.undefined)
    
    @scala.inline
    def setUpdate(value: UnmarshalledUpdateGlobalSecondaryIndexAction): Self = this.set("Update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("Update", js.undefined)
  }
}
