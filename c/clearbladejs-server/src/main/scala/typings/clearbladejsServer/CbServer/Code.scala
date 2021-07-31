package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  def execute(name: String, params: js.Object, loggingEnabled: Boolean, callback: CbCallback): Unit
  
  def getAllServices(callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  var user: APIUser
}
object Code {
  
  @scala.inline
  def apply(
    execute: (String, js.Object, Boolean, CbCallback) => Unit,
    getAllServices: CbCallback => Unit,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction4(execute), getAllServices = js.Any.fromFunction1(getAllServices), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: (String, js.Object, Boolean, CbCallback) => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetAllServices(value: CbCallback => Unit): Self = StObject.set(x, "getAllServices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
