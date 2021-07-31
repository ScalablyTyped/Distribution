package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFunctionsRequest extends StObject {
  
  /**
    * Set to ALL to include entries for all published versions of each function.
    */
  var FunctionVersion: js.UndefOr[typings.awsSdk.lambdaMod.FunctionVersion] = js.undefined
  
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * For Lambda@Edge functions, the AWS Region of the master function. For example, us-east-1 filters the list of functions to only include Lambda@Edge functions replicated from a master function in US East (N. Virginia). If specified, you must set FunctionVersion to ALL.
    */
  var MasterRegion: js.UndefOr[typings.awsSdk.lambdaMod.MasterRegion] = js.undefined
  
  /**
    * The maximum number of functions to return.
    */
  var MaxItems: js.UndefOr[MaxListItems] = js.undefined
}
object ListFunctionsRequest {
  
  @scala.inline
  def apply(): ListFunctionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionsRequest]
  }
  
  @scala.inline
  implicit class ListFunctionsRequestMutableBuilder[Self <: ListFunctionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionVersion(value: FunctionVersion): Self = StObject.set(x, "FunctionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionVersionUndefined: Self = StObject.set(x, "FunctionVersion", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMasterRegion(value: MasterRegion): Self = StObject.set(x, "MasterRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterRegionUndefined: Self = StObject.set(x, "MasterRegion", js.undefined)
    
    @scala.inline
    def setMaxItems(value: MaxListItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
