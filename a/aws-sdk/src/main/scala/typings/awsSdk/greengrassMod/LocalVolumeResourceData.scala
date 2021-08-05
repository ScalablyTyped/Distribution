package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalVolumeResourceData extends StObject {
  
  /**
    * The absolute local path of the resource inside the Lambda environment.
    */
  var DestinationPath: js.UndefOr[string] = js.undefined
  
  /**
    * Allows you to configure additional group privileges for the Lambda process. This field is optional.
    */
  var GroupOwnerSetting: js.UndefOr[typings.awsSdk.greengrassMod.GroupOwnerSetting] = js.undefined
  
  /**
    * The local absolute path of the volume resource on the host. The source path for a volume resource type cannot start with ''/sys''.
    */
  var SourcePath: js.UndefOr[string] = js.undefined
}
object LocalVolumeResourceData {
  
  inline def apply(): LocalVolumeResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalVolumeResourceData]
  }
  
  extension [Self <: LocalVolumeResourceData](x: Self) {
    
    inline def setDestinationPath(value: string): Self = StObject.set(x, "DestinationPath", value.asInstanceOf[js.Any])
    
    inline def setDestinationPathUndefined: Self = StObject.set(x, "DestinationPath", js.undefined)
    
    inline def setGroupOwnerSetting(value: GroupOwnerSetting): Self = StObject.set(x, "GroupOwnerSetting", value.asInstanceOf[js.Any])
    
    inline def setGroupOwnerSettingUndefined: Self = StObject.set(x, "GroupOwnerSetting", js.undefined)
    
    inline def setSourcePath(value: string): Self = StObject.set(x, "SourcePath", value.asInstanceOf[js.Any])
    
    inline def setSourcePathUndefined: Self = StObject.set(x, "SourcePath", js.undefined)
  }
}
