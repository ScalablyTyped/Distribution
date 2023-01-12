package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicReq extends StObject {
  
  val isLogging: Boolean
  
  val params: StringDictionary[Any]
  
  val systemKey: String
  
  val systemSecret: String
  
  val userEmail: String
  
  val userToken: String
  
  val userid: String
}
object BasicReq {
  
  inline def apply(
    isLogging: Boolean,
    params: StringDictionary[Any],
    systemKey: String,
    systemSecret: String,
    userEmail: String,
    userToken: String,
    userid: String
  ): BasicReq = {
    val __obj = js.Dynamic.literal(isLogging = isLogging.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], userEmail = userEmail.asInstanceOf[js.Any], userToken = userToken.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicReq]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicReq] (val x: Self) extends AnyVal {
    
    inline def setIsLogging(value: Boolean): Self = StObject.set(x, "isLogging", value.asInstanceOf[js.Any])
    
    inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    inline def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
    
    inline def setUserid(value: String): Self = StObject.set(x, "userid", value.asInstanceOf[js.Any])
  }
}
