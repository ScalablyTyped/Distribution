package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceId extends StObject {
  
  /**
    * 
    */
  var AccountId: js.UndefOr[String] = js.native
  
  /**
    * 
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * 
    */
  var Names: js.UndefOr[ServiceNames] = js.native
  
  /**
    * 
    */
  var Type: js.UndefOr[String] = js.native
}
object ServiceId {
  
  @scala.inline
  def apply(): ServiceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceId]
  }
  
  @scala.inline
  implicit class ServiceIdMutableBuilder[Self <: ServiceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNames(value: ServiceNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
