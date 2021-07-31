package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFileSharesOutput extends StObject {
  
  /**
    * An array of information about the file gateway's file shares.
    */
  var FileShareInfoList: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareInfoList] = js.undefined
  
  /**
    * If the request includes Marker, the response returns that value in this field.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.undefined
  
  /**
    * If a value is present, there are more file shares to return. In a subsequent request, use NextMarker as the value for Marker to retrieve the next set of file shares.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}
object ListFileSharesOutput {
  
  @scala.inline
  def apply(): ListFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFileSharesOutput]
  }
  
  @scala.inline
  implicit class ListFileSharesOutputMutableBuilder[Self <: ListFileSharesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileShareInfoList(value: FileShareInfoList): Self = StObject.set(x, "FileShareInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareInfoListUndefined: Self = StObject.set(x, "FileShareInfoList", js.undefined)
    
    @scala.inline
    def setFileShareInfoListVarargs(value: FileShareInfo*): Self = StObject.set(x, "FileShareInfoList", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
