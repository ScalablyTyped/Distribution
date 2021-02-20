package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunConfigurationDescription extends StObject {
  
  /**
    * Describes the restore behavior of a restarting application.
    */
  var ApplicationRestoreConfigurationDescription: js.UndefOr[ApplicationRestoreConfiguration] = js.native
  
  var FlinkRunConfigurationDescription: js.UndefOr[FlinkRunConfiguration] = js.native
}
object RunConfigurationDescription {
  
  @scala.inline
  def apply(): RunConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunConfigurationDescription]
  }
  
  @scala.inline
  implicit class RunConfigurationDescriptionMutableBuilder[Self <: RunConfigurationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationRestoreConfigurationDescription(value: ApplicationRestoreConfiguration): Self = StObject.set(x, "ApplicationRestoreConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationRestoreConfigurationDescriptionUndefined: Self = StObject.set(x, "ApplicationRestoreConfigurationDescription", js.undefined)
    
    @scala.inline
    def setFlinkRunConfigurationDescription(value: FlinkRunConfiguration): Self = StObject.set(x, "FlinkRunConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlinkRunConfigurationDescriptionUndefined: Self = StObject.set(x, "FlinkRunConfigurationDescription", js.undefined)
  }
}
