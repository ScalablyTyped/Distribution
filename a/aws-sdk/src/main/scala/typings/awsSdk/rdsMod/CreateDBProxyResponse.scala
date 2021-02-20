package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBProxyResponse extends StObject {
  
  /**
    * The DBProxy structure corresponding to the new proxy.
    */
  var DBProxy: js.UndefOr[typings.awsSdk.rdsMod.DBProxy] = js.native
}
object CreateDBProxyResponse {
  
  @scala.inline
  def apply(): CreateDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBProxyResponse]
  }
  
  @scala.inline
  implicit class CreateDBProxyResponseMutableBuilder[Self <: CreateDBProxyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBProxy(value: DBProxy): Self = StObject.set(x, "DBProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBProxyUndefined: Self = StObject.set(x, "DBProxy", js.undefined)
  }
}
