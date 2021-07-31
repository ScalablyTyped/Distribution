package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPackageGroupSettings extends StObject {
  
  /**
    * MediaPackage channel destination.
    */
  var Destination: OutputLocationRef
}
object MediaPackageGroupSettings {
  
  @scala.inline
  def apply(Destination: OutputLocationRef): MediaPackageGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPackageGroupSettings]
  }
  
  @scala.inline
  implicit class MediaPackageGroupSettingsMutableBuilder[Self <: MediaPackageGroupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: OutputLocationRef): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
  }
}
