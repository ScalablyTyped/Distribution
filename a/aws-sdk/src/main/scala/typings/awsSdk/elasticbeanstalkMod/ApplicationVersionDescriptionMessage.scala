package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationVersionDescriptionMessage extends js.Object {
  
  /**
    *  The ApplicationVersionDescription of the application version. 
    */
  var ApplicationVersion: js.UndefOr[ApplicationVersionDescription] = js.native
}
object ApplicationVersionDescriptionMessage {
  
  @scala.inline
  def apply(): ApplicationVersionDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionDescriptionMessage]
  }
  
  @scala.inline
  implicit class ApplicationVersionDescriptionMessageOps[Self <: ApplicationVersionDescriptionMessage] (val x: Self) extends AnyVal {
    
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
    def setApplicationVersion(value: ApplicationVersionDescription): Self = this.set("ApplicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationVersion: Self = this.set("ApplicationVersion", js.undefined)
  }
}
