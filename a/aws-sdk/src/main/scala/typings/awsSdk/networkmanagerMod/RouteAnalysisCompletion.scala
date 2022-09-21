package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteAnalysisCompletion extends StObject {
  
  /**
    * The reason code. Available only if a connection is not found.    BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND - Found a black hole route with the destination CIDR block.    CYCLIC_PATH_DETECTED - Found the same resource multiple times while traversing the path.    INACTIVE_ROUTE_FOR_DESTINATION_FOUND - Found an inactive route with the destination CIDR block.    MAX_HOPS_EXCEEDED - Analysis exceeded 64 hops without finding the destination.    ROUTE_NOT_FOUND - Cannot find a route table with the destination CIDR block.    TGW_ATTACH_ARN_NO_MATCH - Found an attachment, but not with the correct destination ARN.    TGW_ATTACH_NOT_FOUND - Cannot find an attachment.    TGW_ATTACH_NOT_IN_TGW - Found an attachment, but not to the correct transit gateway.    TGW_ATTACH_STABLE_ROUTE_TABLE_NOT_FOUND - The state of the route table association is not associated.  
    */
  var ReasonCode: js.UndefOr[RouteAnalysisCompletionReasonCode] = js.undefined
  
  /**
    * Additional information about the path. Available only if a connection is not found.
    */
  var ReasonContext: js.UndefOr[ReasonContextMap] = js.undefined
  
  /**
    * The result of the analysis. If the status is NOT_CONNECTED, check the reason code.
    */
  var ResultCode: js.UndefOr[RouteAnalysisCompletionResultCode] = js.undefined
}
object RouteAnalysisCompletion {
  
  inline def apply(): RouteAnalysisCompletion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteAnalysisCompletion]
  }
  
  extension [Self <: RouteAnalysisCompletion](x: Self) {
    
    inline def setReasonCode(value: RouteAnalysisCompletionReasonCode): Self = StObject.set(x, "ReasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "ReasonCode", js.undefined)
    
    inline def setReasonContext(value: ReasonContextMap): Self = StObject.set(x, "ReasonContext", value.asInstanceOf[js.Any])
    
    inline def setReasonContextUndefined: Self = StObject.set(x, "ReasonContext", js.undefined)
    
    inline def setResultCode(value: RouteAnalysisCompletionResultCode): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
    
    inline def setResultCodeUndefined: Self = StObject.set(x, "ResultCode", js.undefined)
  }
}
