package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveEnvironmentInfoResultMessage extends StObject {
  
  /**
    *  The EnvironmentInfoDescription of the environment. 
    */
  var EnvironmentInfo: js.UndefOr[EnvironmentInfoDescriptionList] = js.undefined
}
object RetrieveEnvironmentInfoResultMessage {
  
  @scala.inline
  def apply(): RetrieveEnvironmentInfoResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveEnvironmentInfoResultMessage]
  }
  
  @scala.inline
  implicit class RetrieveEnvironmentInfoResultMessageMutableBuilder[Self <: RetrieveEnvironmentInfoResultMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentInfo(value: EnvironmentInfoDescriptionList): Self = StObject.set(x, "EnvironmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentInfoUndefined: Self = StObject.set(x, "EnvironmentInfo", js.undefined)
    
    @scala.inline
    def setEnvironmentInfoVarargs(value: EnvironmentInfoDescription*): Self = StObject.set(x, "EnvironmentInfo", js.Array(value :_*))
  }
}
