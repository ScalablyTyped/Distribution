package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterSetting extends StObject {
  
  /**
    * The name of the cluster setting. The only supported value is containerInsights.
    */
  var name: js.UndefOr[ClusterSettingName] = js.native
  
  /**
    * The value to set for the cluster setting. The supported values are enabled and disabled. If enabled is specified, CloudWatch Container Insights will be enabled for the cluster, otherwise it will be disabled unless the containerInsights account setting is enabled. If a cluster value is specified, it will override the containerInsights value set with PutAccountSetting or PutAccountSettingDefault.
    */
  var value: js.UndefOr[String] = js.native
}
object ClusterSetting {
  
  @scala.inline
  def apply(): ClusterSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSetting]
  }
  
  @scala.inline
  implicit class ClusterSettingMutableBuilder[Self <: ClusterSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ClusterSettingName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
