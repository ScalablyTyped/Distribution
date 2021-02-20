package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationDescriptionMessage extends StObject {
  
  /**
    *  The ApplicationDescription of the application. 
    */
  var Application: js.UndefOr[ApplicationDescription] = js.native
}
object ApplicationDescriptionMessage {
  
  @scala.inline
  def apply(): ApplicationDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationDescriptionMessage]
  }
  
  @scala.inline
  implicit class ApplicationDescriptionMessageMutableBuilder[Self <: ApplicationDescriptionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: ApplicationDescription): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "Application", js.undefined)
  }
}
