package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationResourceLifecycleDescriptionMessage extends js.Object {
  
  /**
    * The name of the application.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  
  /**
    * The lifecycle configuration.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.native
}
object ApplicationResourceLifecycleDescriptionMessage {
  
  @scala.inline
  def apply(): ApplicationResourceLifecycleDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationResourceLifecycleDescriptionMessage]
  }
  
  @scala.inline
  implicit class ApplicationResourceLifecycleDescriptionMessageOps[Self <: ApplicationResourceLifecycleDescriptionMessage] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("ApplicationName", js.undefined)
    
    @scala.inline
    def setResourceLifecycleConfig(value: ApplicationResourceLifecycleConfig): Self = this.set("ResourceLifecycleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLifecycleConfig: Self = this.set("ResourceLifecycleConfig", js.undefined)
  }
}
