package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClientPropertiesResult extends StObject {
  
  /**
    * Information about the specified Amazon WorkSpaces clients.
    */
  var ClientPropertiesList: js.UndefOr[typings.awsSdk.workspacesMod.ClientPropertiesList] = js.undefined
}
object DescribeClientPropertiesResult {
  
  inline def apply(): DescribeClientPropertiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientPropertiesResult]
  }
  
  extension [Self <: DescribeClientPropertiesResult](x: Self) {
    
    inline def setClientPropertiesList(value: ClientPropertiesList): Self = StObject.set(x, "ClientPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setClientPropertiesListUndefined: Self = StObject.set(x, "ClientPropertiesList", js.undefined)
    
    inline def setClientPropertiesListVarargs(value: ClientPropertiesResult*): Self = StObject.set(x, "ClientPropertiesList", js.Array(value*))
  }
}
