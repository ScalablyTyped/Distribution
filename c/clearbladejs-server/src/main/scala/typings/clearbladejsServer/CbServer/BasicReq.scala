package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicReq extends js.Object {
  
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
  implicit class BasicReqOps[Self <: BasicReq] (val x: Self) extends AnyVal {
    
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
    def setIsLogging(value: Boolean): Self = this.set("isLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmail(value: String): Self = this.set("userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserToken(value: String): Self = this.set("userToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserid(value: String): Self = this.set("userid", value.asInstanceOf[js.Any])
  }
}
