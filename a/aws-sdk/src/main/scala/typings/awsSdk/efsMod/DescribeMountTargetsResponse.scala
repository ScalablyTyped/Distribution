package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMountTargetsResponse extends StObject {
  
  /**
    * If the request included the Marker, the response returns that value in this field.
    */
  var Marker: js.UndefOr[typings.awsSdk.efsMod.Marker] = js.undefined
  
  /**
    * Returns the file system's mount targets as an array of MountTargetDescription objects.
    */
  var MountTargets: js.UndefOr[MountTargetDescriptions] = js.undefined
  
  /**
    * If a value is present, there are more mount targets to return. In a subsequent request, you can provide Marker in your request with this value to retrieve the next set of mount targets.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}
object DescribeMountTargetsResponse {
  
  @scala.inline
  def apply(): DescribeMountTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMountTargetsResponse]
  }
  
  @scala.inline
  implicit class DescribeMountTargetsResponseMutableBuilder[Self <: DescribeMountTargetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMountTargets(value: MountTargetDescriptions): Self = StObject.set(x, "MountTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountTargetsUndefined: Self = StObject.set(x, "MountTargets", js.undefined)
    
    @scala.inline
    def setMountTargetsVarargs(value: MountTargetDescription*): Self = StObject.set(x, "MountTargets", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
