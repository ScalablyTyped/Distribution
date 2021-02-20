package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentDelivery extends StObject {
  
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
  implicit class ContentDeliveryMutableBuilder[Self <: ContentDelivery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentDelivery(value: js.Array[String] | String): Self = StObject.set(x, "ContentDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDeliveryVarargs(value: String*): Self = StObject.set(x, "ContentDelivery", js.Array(value :_*))
    
    @scala.inline
    def setContentModel(value: js.Array[String]): Self = StObject.set(x, "ContentModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentModelVarargs(value: String*): Self = StObject.set(x, "ContentModel", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentAliases(value: js.Array[String] | String): Self = StObject.set(x, "EnvironmentAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentAliasesVarargs(value: String*): Self = StObject.set(x, "EnvironmentAliases", js.Array(value :_*))
    
    @scala.inline
    def setEnvironments(value: js.Array[String] | String): Self = StObject.set(x, "Environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentsVarargs(value: String*): Self = StObject.set(x, "Environments", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: js.Array[String] | String): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsVarargs(value: String*): Self = StObject.set(x, "Settings", js.Array(value :_*))
  }
}
