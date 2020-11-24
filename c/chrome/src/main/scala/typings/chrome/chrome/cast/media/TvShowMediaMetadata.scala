package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TvShowMediaMetadata extends js.Object {
  
  var episode: Double = js.native
  
  /** @deprecated. Use episode instead. */
  var episodeNumber: Double = js.native
  
  /** @deprecated. Use title instead. */
  var episodeTitle: String = js.native
  
  var images: js.Array[Image] = js.native
  
  var metadataType: MetadataType = js.native
  
  var originalAirdate: String = js.native
  
  /** @deprecated. Use originalAirdate instead. */
  var releaseYear: Double = js.native
  
  var season: Double = js.native
  
  /** @deprecated. Use season instead. */
  var seasonNumber: Double = js.native
  
  var seriesTitle: String = js.native
  
  var title: String = js.native
  
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}
object TvShowMediaMetadata {
  
  @scala.inline
  def apply(
    episode: Double,
    episodeNumber: Double,
    episodeTitle: String,
    images: js.Array[Image],
    metadataType: MetadataType,
    originalAirdate: String,
    releaseYear: Double,
    season: Double,
    seasonNumber: Double,
    seriesTitle: String,
    title: String,
    `type`: MetadataType
  ): TvShowMediaMetadata = {
    val __obj = js.Dynamic.literal(episode = episode.asInstanceOf[js.Any], episodeNumber = episodeNumber.asInstanceOf[js.Any], episodeTitle = episodeTitle.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], originalAirdate = originalAirdate.asInstanceOf[js.Any], releaseYear = releaseYear.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], seasonNumber = seasonNumber.asInstanceOf[js.Any], seriesTitle = seriesTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TvShowMediaMetadata]
  }
  
  @scala.inline
  implicit class TvShowMediaMetadataOps[Self <: TvShowMediaMetadata] (val x: Self) extends AnyVal {
    
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
    def setEpisode(value: Double): Self = this.set("episode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpisodeNumber(value: Double): Self = this.set("episodeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpisodeTitle(value: String): Self = this.set("episodeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[Image]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataType(value: MetadataType): Self = this.set("metadataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalAirdate(value: String): Self = this.set("originalAirdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseYear(value: Double): Self = this.set("releaseYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeason(value: Double): Self = this.set("season", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeasonNumber(value: Double): Self = this.set("seasonNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesTitle(value: String): Self = this.set("seriesTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MetadataType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
