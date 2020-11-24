package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorModelDefinition extends js.Object {
  
  /**
    * The state that is entered at the creation of each detector (instance).
    */
  var initialStateName: StateName = js.native
  
  /**
    * Information about the states of the detector.
    */
  var states: States = js.native
}
object DetectorModelDefinition {
  
  @scala.inline
  def apply(initialStateName: StateName, states: States): DetectorModelDefinition = {
    val __obj = js.Dynamic.literal(initialStateName = initialStateName.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorModelDefinition]
  }
  
  @scala.inline
  implicit class DetectorModelDefinitionOps[Self <: DetectorModelDefinition] (val x: Self) extends AnyVal {
    
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
    def setInitialStateName(value: StateName): Self = this.set("initialStateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesVarargs(value: State*): Self = this.set("states", js.Array(value :_*))
    
    @scala.inline
    def setStates(value: States): Self = this.set("states", value.asInstanceOf[js.Any])
  }
}
