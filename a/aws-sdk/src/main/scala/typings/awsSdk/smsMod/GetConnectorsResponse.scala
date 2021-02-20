package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectorsResponse extends StObject {
  
  /**
    * Information about the registered connectors.
    */
  var connectorList: js.UndefOr[ConnectorList] = js.native
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetConnectorsResponse {
  
  @scala.inline
  def apply(): GetConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectorsResponse]
  }
  
  @scala.inline
  implicit class GetConnectorsResponseMutableBuilder[Self <: GetConnectorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorList(value: ConnectorList): Self = StObject.set(x, "connectorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorListUndefined: Self = StObject.set(x, "connectorList", js.undefined)
    
    @scala.inline
    def setConnectorListVarargs(value: Connector*): Self = StObject.set(x, "connectorList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
