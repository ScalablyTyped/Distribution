package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsSmoothOutputSettings extends StObject {
  
  /**
    * Only applicable when this output is referencing an H.265 video description.
  Specifies whether MP4 segments should be packaged as HEV1 or HVC1.
    */
  var H265PackagingType: js.UndefOr[MsSmoothH265PackagingType] = js.undefined
  
  /**
    * String concatenated to the end of the destination filename.  Required for multiple outputs of the same type.
    */
  var NameModifier: js.UndefOr[string] = js.undefined
}
object MsSmoothOutputSettings {
  
  @scala.inline
  def apply(): MsSmoothOutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsSmoothOutputSettings]
  }
  
  @scala.inline
  implicit class MsSmoothOutputSettingsMutableBuilder[Self <: MsSmoothOutputSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH265PackagingType(value: MsSmoothH265PackagingType): Self = StObject.set(x, "H265PackagingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH265PackagingTypeUndefined: Self = StObject.set(x, "H265PackagingType", js.undefined)
    
    @scala.inline
    def setNameModifier(value: string): Self = StObject.set(x, "NameModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameModifierUndefined: Self = StObject.set(x, "NameModifier", js.undefined)
  }
}
