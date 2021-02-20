package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicReq extends StObject {
  
  val isLogging: Boolean = js.native
  
  val params: StringDictionary[js.Any] = js.native
  
  val systemKey: String = js.native
  
  val systemSecret: String = js.native
  
  val userEmail: String = js.native
  
  val userToken: String = js.native
  
  val userid: String = js.native
}
object BasicReq {
  
  @scala.inline
  def apply(
    isLogging: Boolean,
    params: StringDictionary[js.Any],
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
  implicit class BasicReqMutableBuilder[Self <: BasicReq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsLogging(value: Boolean): Self = StObject.set(x, "isLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserid(value: String): Self = StObject.set(x, "userid", value.asInstanceOf[js.Any])
  }
}
