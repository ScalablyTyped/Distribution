package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpParameters extends StObject {
  
  /**
    * The headers that need to be sent as part of request invoking the API Gateway REST API.
    */
  var HeaderParameters: js.UndefOr[HeaderParametersMap] = js.native
  
  /**
    * The path parameter values to be used to populate API Gateway REST API path wildcards ("*").
    */
  var PathParameterValues: js.UndefOr[PathParameterList] = js.native
  
  /**
    * The query string keys/values that need to be sent as part of request invoking the API Gateway REST API.
    */
  var QueryStringParameters: js.UndefOr[QueryStringParametersMap] = js.native
}
object HttpParameters {
  
  @scala.inline
  def apply(): HttpParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpParameters]
  }
  
  @scala.inline
  implicit class HttpParametersMutableBuilder[Self <: HttpParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderParameters(value: HeaderParametersMap): Self = StObject.set(x, "HeaderParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderParametersUndefined: Self = StObject.set(x, "HeaderParameters", js.undefined)
    
    @scala.inline
    def setPathParameterValues(value: PathParameterList): Self = StObject.set(x, "PathParameterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathParameterValuesUndefined: Self = StObject.set(x, "PathParameterValues", js.undefined)
    
    @scala.inline
    def setPathParameterValuesVarargs(value: PathParameter*): Self = StObject.set(x, "PathParameterValues", js.Array(value :_*))
    
    @scala.inline
    def setQueryStringParameters(value: QueryStringParametersMap): Self = StObject.set(x, "QueryStringParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringParametersUndefined: Self = StObject.set(x, "QueryStringParameters", js.undefined)
  }
}
