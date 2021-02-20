package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseTimeRootCauseService extends StObject {
  
  /**
    * The account ID associated to the service.
    */
  var AccountId: js.UndefOr[String] = js.native
  
  /**
    * The path of root cause entities found on the service. 
    */
  var EntityPath: js.UndefOr[ResponseTimeRootCauseEntityPath] = js.native
  
  /**
    * A Boolean value indicating if the service is inferred from the trace.
    */
  var Inferred: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The service name.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * A collection of associated service names.
    */
  var Names: js.UndefOr[ServiceNames] = js.native
  
  /**
    * The type associated to the service.
    */
  var Type: js.UndefOr[String] = js.native
}
object ResponseTimeRootCauseService {
  
  @scala.inline
  def apply(): ResponseTimeRootCauseService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseTimeRootCauseService]
  }
  
  @scala.inline
  implicit class ResponseTimeRootCauseServiceMutableBuilder[Self <: ResponseTimeRootCauseService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setEntityPath(value: ResponseTimeRootCauseEntityPath): Self = StObject.set(x, "EntityPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityPathUndefined: Self = StObject.set(x, "EntityPath", js.undefined)
    
    @scala.inline
    def setEntityPathVarargs(value: ResponseTimeRootCauseEntity*): Self = StObject.set(x, "EntityPath", js.Array(value :_*))
    
    @scala.inline
    def setInferred(value: NullableBoolean): Self = StObject.set(x, "Inferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferredUndefined: Self = StObject.set(x, "Inferred", js.undefined)
    
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
