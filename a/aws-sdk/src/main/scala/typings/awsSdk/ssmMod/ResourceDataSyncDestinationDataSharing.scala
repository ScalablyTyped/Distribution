package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataSyncDestinationDataSharing extends StObject {
  
  /**
    * The sharing data type. Only Organization is supported.
    */
  var DestinationDataSharingType: js.UndefOr[ResourceDataSyncDestinationDataSharingType] = js.undefined
}
object ResourceDataSyncDestinationDataSharing {
  
  @scala.inline
  def apply(): ResourceDataSyncDestinationDataSharing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataSyncDestinationDataSharing]
  }
  
  @scala.inline
  implicit class ResourceDataSyncDestinationDataSharingMutableBuilder[Self <: ResourceDataSyncDestinationDataSharing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationDataSharingType(value: ResourceDataSyncDestinationDataSharingType): Self = StObject.set(x, "DestinationDataSharingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDataSharingTypeUndefined: Self = StObject.set(x, "DestinationDataSharingType", js.undefined)
  }
}
