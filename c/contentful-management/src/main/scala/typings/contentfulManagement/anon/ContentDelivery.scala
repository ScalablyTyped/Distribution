package typings.contentfulManagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentDelivery extends js.Object {
  
  var ContentDelivery: js.Array[String] | String = js.native
  
  var ContentModel: js.Array[String] = js.native
  
  var EnvironmentAliases: js.Array[String] | String = js.native
  
  var Environments: js.Array[String] | String = js.native
  
  var Settings: js.Array[String] | String = js.native
}
object ContentDelivery {
  
  @scala.inline
  def apply(
    ContentDelivery: js.Array[String] | String,
    ContentModel: js.Array[String],
    EnvironmentAliases: js.Array[String] | String,
    Environments: js.Array[String] | String,
    Settings: js.Array[String] | String
  ): ContentDelivery = {
    val __obj = js.Dynamic.literal(ContentDelivery = ContentDelivery.asInstanceOf[js.Any], ContentModel = ContentModel.asInstanceOf[js.Any], EnvironmentAliases = EnvironmentAliases.asInstanceOf[js.Any], Environments = Environments.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDelivery]
  }
  
  @scala.inline
  implicit class ContentDeliveryOps[Self <: ContentDelivery] (val x: Self) extends AnyVal {
    
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
    def setContentDeliveryVarargs(value: String*): Self = this.set("ContentDelivery", js.Array(value :_*))
    
    @scala.inline
    def setContentDelivery(value: js.Array[String] | String): Self = this.set("ContentDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentModelVarargs(value: String*): Self = this.set("ContentModel", js.Array(value :_*))
    
    @scala.inline
    def setContentModel(value: js.Array[String]): Self = this.set("ContentModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentAliasesVarargs(value: String*): Self = this.set("EnvironmentAliases", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentAliases(value: js.Array[String] | String): Self = this.set("EnvironmentAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentsVarargs(value: String*): Self = this.set("Environments", js.Array(value :_*))
    
    @scala.inline
    def setEnvironments(value: js.Array[String] | String): Self = this.set("Environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsVarargs(value: String*): Self = this.set("Settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: js.Array[String] | String): Self = this.set("Settings", value.asInstanceOf[js.Any])
  }
}
