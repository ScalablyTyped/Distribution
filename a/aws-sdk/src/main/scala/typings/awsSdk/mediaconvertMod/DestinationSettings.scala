package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationSettings extends StObject {
  
  /**
    * Settings associated with S3 destination
    */
  var S3Settings: js.UndefOr[S3DestinationSettings] = js.undefined
}
object DestinationSettings {
  
  @scala.inline
  def apply(): DestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationSettings]
  }
  
  @scala.inline
  implicit class DestinationSettingsMutableBuilder[Self <: DestinationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Settings(value: S3DestinationSettings): Self = StObject.set(x, "S3Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3SettingsUndefined: Self = StObject.set(x, "S3Settings", js.undefined)
  }
}
