package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeConfigurationOptionsMessage extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of valid node configurations.
    */
  var NodeConfigurationOptionList: js.UndefOr[typings.awsSdk.redshiftMod.NodeConfigurationOptionList] = js.undefined
}
object NodeConfigurationOptionsMessage {
  
  inline def apply(): NodeConfigurationOptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfigurationOptionsMessage]
  }
  
  extension [Self <: NodeConfigurationOptionsMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setNodeConfigurationOptionList(value: NodeConfigurationOptionList): Self = StObject.set(x, "NodeConfigurationOptionList", value.asInstanceOf[js.Any])
    
    inline def setNodeConfigurationOptionListUndefined: Self = StObject.set(x, "NodeConfigurationOptionList", js.undefined)
    
    inline def setNodeConfigurationOptionListVarargs(value: NodeConfigurationOption*): Self = StObject.set(x, "NodeConfigurationOptionList", js.Array(value :_*))
  }
}
