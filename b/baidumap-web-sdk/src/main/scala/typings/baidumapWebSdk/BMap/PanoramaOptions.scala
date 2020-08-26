package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoramaOptions extends js.Object {
  var albumsControl: js.UndefOr[Boolean] = js.native
  var albumsControlOptions: js.UndefOr[AlbumsControlOptions] = js.native
  var indoorSceneSwitchControl: js.UndefOr[Boolean] = js.native
  var linksControl: js.UndefOr[Boolean] = js.native
  var navigationControl: js.UndefOr[Boolean] = js.native
}

object PanoramaOptions {
  @scala.inline
  def apply(): PanoramaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanoramaOptions]
  }
  @scala.inline
  implicit class PanoramaOptionsOps[Self <: PanoramaOptions] (val x: Self) extends AnyVal {
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
    def setAlbumsControl(value: Boolean): Self = this.set("albumsControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbumsControl: Self = this.set("albumsControl", js.undefined)
    @scala.inline
    def setAlbumsControlOptions(value: AlbumsControlOptions): Self = this.set("albumsControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbumsControlOptions: Self = this.set("albumsControlOptions", js.undefined)
    @scala.inline
    def setIndoorSceneSwitchControl(value: Boolean): Self = this.set("indoorSceneSwitchControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndoorSceneSwitchControl: Self = this.set("indoorSceneSwitchControl", js.undefined)
    @scala.inline
    def setLinksControl(value: Boolean): Self = this.set("linksControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinksControl: Self = this.set("linksControl", js.undefined)
    @scala.inline
    def setNavigationControl(value: Boolean): Self = this.set("navigationControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationControl: Self = this.set("navigationControl", js.undefined)
  }
  
}

