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
  
  @scala.inline
  def apply(): DescribeClientPropertiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientPropertiesResult]
  }
  
  @scala.inline
  implicit class DescribeClientPropertiesResultMutableBuilder[Self <: DescribeClientPropertiesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientPropertiesList(value: ClientPropertiesList): Self = StObject.set(x, "ClientPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientPropertiesListUndefined: Self = StObject.set(x, "ClientPropertiesList", js.undefined)
    
    @scala.inline
    def setClientPropertiesListVarargs(value: ClientPropertiesResult*): Self = StObject.set(x, "ClientPropertiesList", js.Array(value :_*))
  }
}
