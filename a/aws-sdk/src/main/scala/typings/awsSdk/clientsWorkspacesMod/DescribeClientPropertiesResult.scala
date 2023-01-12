package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClientPropertiesResult extends StObject {
  
  /**
    * Information about the specified Amazon WorkSpaces clients.
    */
  var ClientPropertiesList: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.ClientPropertiesList] = js.undefined
}
object DescribeClientPropertiesResult {
  
  inline def apply(): DescribeClientPropertiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientPropertiesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeClientPropertiesResult] (val x: Self) extends AnyVal {
    
    inline def setClientPropertiesList(value: ClientPropertiesList): Self = StObject.set(x, "ClientPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setClientPropertiesListUndefined: Self = StObject.set(x, "ClientPropertiesList", js.undefined)
    
    inline def setClientPropertiesListVarargs(value: ClientPropertiesResult*): Self = StObject.set(x, "ClientPropertiesList", js.Array(value*))
  }
}
