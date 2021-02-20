package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailBlanking extends StObject {
  
  /**
    * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
    */
  var AvailBlankingImage: js.UndefOr[InputLocation] = js.native
  
  /**
    * When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added.
    */
  var State: js.UndefOr[AvailBlankingState] = js.native
}
object AvailBlanking {
  
  @scala.inline
  def apply(): AvailBlanking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailBlanking]
  }
  
  @scala.inline
  implicit class AvailBlankingMutableBuilder[Self <: AvailBlanking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailBlankingImage(value: InputLocation): Self = StObject.set(x, "AvailBlankingImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailBlankingImageUndefined: Self = StObject.set(x, "AvailBlankingImage", js.undefined)
    
    @scala.inline
    def setState(value: AvailBlankingState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
