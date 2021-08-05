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
  
  inline def apply(): RetrieveEnvironmentInfoResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveEnvironmentInfoResultMessage]
  }
  
  extension [Self <: RetrieveEnvironmentInfoResultMessage](x: Self) {
    
    inline def setEnvironmentInfo(value: EnvironmentInfoDescriptionList): Self = StObject.set(x, "EnvironmentInfo", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentInfoUndefined: Self = StObject.set(x, "EnvironmentInfo", js.undefined)
    
    inline def setEnvironmentInfoVarargs(value: EnvironmentInfoDescription*): Self = StObject.set(x, "EnvironmentInfo", js.Array(value :_*))
  }
}
