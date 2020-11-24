package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISoundTrackOptions extends js.Object {
  
  /**
    * Define if the sound track is the main sound track of the scene
    */
  var mainTrack: js.UndefOr[Boolean] = js.native
  
  /**
    * The volume the sound track should take during creation
    */
  var volume: js.UndefOr[Double] = js.native
}
object ISoundTrackOptions {
  
  @scala.inline
  def apply(): ISoundTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISoundTrackOptions]
  }
  
  @scala.inline
  implicit class ISoundTrackOptionsOps[Self <: ISoundTrackOptions] (val x: Self) extends AnyVal {
    
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
    def setMainTrack(value: Boolean): Self = this.set("mainTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainTrack: Self = this.set("mainTrack", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
