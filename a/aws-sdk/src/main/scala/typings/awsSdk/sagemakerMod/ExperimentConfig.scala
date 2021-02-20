package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExperimentConfig extends StObject {
  
  /**
    * The name of an existing experiment to associate the trial component with.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  
  /**
    * The display name for the trial component. If this key isn't specified, the display name is the trial component name.
    */
  var TrialComponentDisplayName: js.UndefOr[ExperimentEntityName] = js.native
  
  /**
    * The name of an existing trial to associate the trial component with. If not specified, a new trial is created.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.native
}
object ExperimentConfig {
  
  @scala.inline
  def apply(): ExperimentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentConfig]
  }
  
  @scala.inline
  implicit class ExperimentConfigMutableBuilder[Self <: ExperimentConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentNameUndefined: Self = StObject.set(x, "ExperimentName", js.undefined)
    
    @scala.inline
    def setTrialComponentDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialComponentDisplayNameUndefined: Self = StObject.set(x, "TrialComponentDisplayName", js.undefined)
    
    @scala.inline
    def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialNameUndefined: Self = StObject.set(x, "TrialName", js.undefined)
  }
}
