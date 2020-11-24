package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThingIndexingConfiguration extends js.Object {
  
  /**
    * Contains custom field names and their data type.
    */
  var customFields: js.UndefOr[Fields] = js.native
  
  /**
    * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
    */
  var managedFields: js.UndefOr[Fields] = js.native
  
  /**
    * Thing connectivity indexing mode. Valid values are:    STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode must not be set to OFF.   OFF - Thing connectivity status indexing is disabled.  
    */
  var thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode] = js.native
  
  /**
    * Thing indexing mode. Valid values are:   REGISTRY – Your thing index contains registry data only.   REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.   OFF - Thing indexing is disabled.  
    */
  var thingIndexingMode: ThingIndexingMode = js.native
}
object ThingIndexingConfiguration {
  
  @scala.inline
  def apply(thingIndexingMode: ThingIndexingMode): ThingIndexingConfiguration = {
    val __obj = js.Dynamic.literal(thingIndexingMode = thingIndexingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingIndexingConfiguration]
  }
  
  @scala.inline
  implicit class ThingIndexingConfigurationOps[Self <: ThingIndexingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setThingIndexingMode(value: ThingIndexingMode): Self = this.set("thingIndexingMode", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setThingConnectivityIndexingMode(value: ThingConnectivityIndexingMode): Self = this.set("thingConnectivityIndexingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingConnectivityIndexingMode: Self = this.set("thingConnectivityIndexingMode", js.undefined)
  }
}
