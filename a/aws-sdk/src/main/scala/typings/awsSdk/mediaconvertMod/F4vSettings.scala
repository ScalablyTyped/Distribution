package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait F4vSettings extends StObject {
  
  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  var MoovPlacement: js.UndefOr[F4vMoovPlacement] = js.native
}
object F4vSettings {
  
  @scala.inline
  def apply(): F4vSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[F4vSettings]
  }
  
  @scala.inline
  implicit class F4vSettingsMutableBuilder[Self <: F4vSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMoovPlacement(value: F4vMoovPlacement): Self = StObject.set(x, "MoovPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoovPlacementUndefined: Self = StObject.set(x, "MoovPlacement", js.undefined)
  }
}
