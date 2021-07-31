package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalDeviceResourceData extends StObject {
  
  /**
    * Group/owner related settings for local resources.
    */
  var GroupOwnerSetting: js.UndefOr[typings.awsSdk.greengrassMod.GroupOwnerSetting] = js.undefined
  
  /**
    * The local absolute path of the device resource. The source path for a device resource can refer only to a character device or block device under ''/dev''.
    */
  var SourcePath: js.UndefOr[string] = js.undefined
}
object LocalDeviceResourceData {
  
  @scala.inline
  def apply(): LocalDeviceResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalDeviceResourceData]
  }
  
  @scala.inline
  implicit class LocalDeviceResourceDataMutableBuilder[Self <: LocalDeviceResourceData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupOwnerSetting(value: GroupOwnerSetting): Self = StObject.set(x, "GroupOwnerSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupOwnerSettingUndefined: Self = StObject.set(x, "GroupOwnerSetting", js.undefined)
    
    @scala.inline
    def setSourcePath(value: string): Self = StObject.set(x, "SourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePathUndefined: Self = StObject.set(x, "SourcePath", js.undefined)
  }
}
