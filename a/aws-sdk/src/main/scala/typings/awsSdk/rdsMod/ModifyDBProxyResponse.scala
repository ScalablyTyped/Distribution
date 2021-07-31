package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBProxyResponse extends StObject {
  
  /**
    * The DBProxy object representing the new settings for the proxy.
    */
  var DBProxy: js.UndefOr[typings.awsSdk.rdsMod.DBProxy] = js.undefined
}
object ModifyDBProxyResponse {
  
  @scala.inline
  def apply(): ModifyDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBProxyResponse]
  }
  
  @scala.inline
  implicit class ModifyDBProxyResponseMutableBuilder[Self <: ModifyDBProxyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBProxy(value: DBProxy): Self = StObject.set(x, "DBProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBProxyUndefined: Self = StObject.set(x, "DBProxy", js.undefined)
  }
}
