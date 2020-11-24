package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThingGroupIndexingConfiguration extends js.Object {
  
  /**
    * A list of thing group fields to index. This list cannot contain any managed fields. Use the GetIndexingConfiguration API to get a list of managed fields. Contains custom field names and their data type.
    */
  var customFields: js.UndefOr[Fields] = js.native
  
  /**
    * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
    */
  var managedFields: js.UndefOr[Fields] = js.native
  
  /**
    * Thing group indexing mode.
    */
  var thingGroupIndexingMode: ThingGroupIndexingMode = js.native
}
object ThingGroupIndexingConfiguration {
  
  @scala.inline
  def apply(thingGroupIndexingMode: ThingGroupIndexingMode): ThingGroupIndexingConfiguration = {
    val __obj = js.Dynamic.literal(thingGroupIndexingMode = thingGroupIndexingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingGroupIndexingConfiguration]
  }
  
  @scala.inline
  implicit class ThingGroupIndexingConfigurationOps[Self <: ThingGroupIndexingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThingGroupIndexingMode(value: ThingGroupIndexingMode): Self = this.set("thingGroupIndexingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsVarargs(value: Field*): Self = this.set("customFields", js.Array(value :_*))
    
    @scala.inline
    def setCustomFields(value: Fields): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    
    @scala.inline
    def setManagedFieldsVarargs(value: Field*): Self = this.set("managedFields", js.Array(value :_*))
    
    @scala.inline
    def setManagedFields(value: Fields): Self = this.set("managedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedFields: Self = this.set("managedFields", js.undefined)
  }
}
