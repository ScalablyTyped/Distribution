package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionHttpParameters extends StObject {
  
  /**
    * Contains additional body string parameters for the connection.
    */
  var BodyParameters: js.UndefOr[ConnectionBodyParametersList] = js.undefined
  
  /**
    * Contains additional header parameters for the connection.
    */
  var HeaderParameters: js.UndefOr[ConnectionHeaderParametersList] = js.undefined
  
  /**
    * Contains additional query string parameters for the connection.
    */
  var QueryStringParameters: js.UndefOr[ConnectionQueryStringParametersList] = js.undefined
}
object ConnectionHttpParameters {
  
  inline def apply(): ConnectionHttpParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionHttpParameters]
  }
  
  extension [Self <: ConnectionHttpParameters](x: Self) {
    
    inline def setBodyParameters(value: ConnectionBodyParametersList): Self = StObject.set(x, "BodyParameters", value.asInstanceOf[js.Any])
    
    inline def setBodyParametersUndefined: Self = StObject.set(x, "BodyParameters", js.undefined)
    
    inline def setBodyParametersVarargs(value: ConnectionBodyParameter*): Self = StObject.set(x, "BodyParameters", js.Array(value*))
    
    inline def setHeaderParameters(value: ConnectionHeaderParametersList): Self = StObject.set(x, "HeaderParameters", value.asInstanceOf[js.Any])
    
    inline def setHeaderParametersUndefined: Self = StObject.set(x, "HeaderParameters", js.undefined)
    
    inline def setHeaderParametersVarargs(value: ConnectionHeaderParameter*): Self = StObject.set(x, "HeaderParameters", js.Array(value*))
    
    inline def setQueryStringParameters(value: ConnectionQueryStringParametersList): Self = StObject.set(x, "QueryStringParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryStringParametersUndefined: Self = StObject.set(x, "QueryStringParameters", js.undefined)
    
    inline def setQueryStringParametersVarargs(value: ConnectionQueryStringParameter*): Self = StObject.set(x, "QueryStringParameters", js.Array(value*))
  }
}
