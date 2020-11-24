package typings.awsSdkClientLambdaNode.typesEventSourceMappingConfigurationMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledEventSourceMappingConfiguration extends EventSourceMappingConfiguration {
  
  /**
    * <p>The UTC time string indicating the last time the event mapping was updated.</p>
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledEventSourceMappingConfiguration: js.UndefOr[Date] = js.native
}
object UnmarshalledEventSourceMappingConfiguration {
  
  @scala.inline
  def apply(): UnmarshalledEventSourceMappingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEventSourceMappingConfiguration]
  }
  
  @scala.inline
  implicit class UnmarshalledEventSourceMappingConfigurationOps[Self <: UnmarshalledEventSourceMappingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setLastModified(value: Date): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
  }
}
