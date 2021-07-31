package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameCaptureOutputSettings extends StObject {
  
  /**
    * Required if the output group contains more than one output. This modifier forms part of the output file name.
    */
  var NameModifier: js.UndefOr[string] = js.undefined
}
object FrameCaptureOutputSettings {
  
  @scala.inline
  def apply(): FrameCaptureOutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameCaptureOutputSettings]
  }
  
  @scala.inline
  implicit class FrameCaptureOutputSettingsMutableBuilder[Self <: FrameCaptureOutputSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameModifier(value: string): Self = StObject.set(x, "NameModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameModifierUndefined: Self = StObject.set(x, "NameModifier", js.undefined)
  }
}
