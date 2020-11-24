package typings.cordovaPluginMedia

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  iOS optional parameters for media.play
  *  See https://github.com/apache/cordova-plugin-media#ios-quirks
  */
@js.native
trait IosPlayOptions extends js.Object {
  
  var numberOfLoops: js.UndefOr[Double] = js.native
  
  var playAudioWhenScreenIsLocked: js.UndefOr[Boolean] = js.native
}
object IosPlayOptions {
  
  @scala.inline
  def apply(): IosPlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosPlayOptions]
  }
  
  @scala.inline
  implicit class IosPlayOptionsOps[Self <: IosPlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNumberOfLoops(value: Double): Self = this.set("numberOfLoops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfLoops: Self = this.set("numberOfLoops", js.undefined)
    
    @scala.inline
    def setPlayAudioWhenScreenIsLocked(value: Boolean): Self = this.set("playAudioWhenScreenIsLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayAudioWhenScreenIsLocked: Self = this.set("playAudioWhenScreenIsLocked", js.undefined)
  }
}
