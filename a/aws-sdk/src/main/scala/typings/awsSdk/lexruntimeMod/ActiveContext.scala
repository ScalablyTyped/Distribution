package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveContext extends js.Object {
  
  /**
    * The name of the context.
    */
  var name: ActiveContextName = js.native
  
  /**
    * State variables for the current context. You can use these values as default values for slots in subsequent events.
    */
  var parameters: ActiveContextParametersMap = js.native
  
  /**
    * The length of time or number of turns that a context remains active.
    */
  var timeToLive: ActiveContextTimeToLive = js.native
}
object ActiveContext {
  
  @scala.inline
  def apply(
    name: ActiveContextName,
    parameters: ActiveContextParametersMap,
    timeToLive: ActiveContextTimeToLive
  ): ActiveContext = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], timeToLive = timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveContext]
  }
  
  @scala.inline
  implicit class ActiveContextOps[Self <: ActiveContext] (val x: Self) extends AnyVal {
    
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
    def setName(value: ActiveContextName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: ActiveContextParametersMap): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLive(value: ActiveContextTimeToLive): Self = this.set("timeToLive", value.asInstanceOf[js.Any])
  }
}
