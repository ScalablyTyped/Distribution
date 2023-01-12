package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TvShowMediaMetadata extends StObject {
  
  var episode: Double
  
  /** @deprecated. Use episode instead. */
  var episodeNumber: Double
  
  /** @deprecated. Use title instead. */
  var episodeTitle: String
  
  var images: js.Array[Image]
  
  var metadataType: MetadataType
  
  var originalAirdate: String
  
  /** @deprecated. Use originalAirdate instead. */
  var releaseYear: Double
  
  var season: Double
  
  /** @deprecated. Use season instead. */
  var seasonNumber: Double
  
  var seriesTitle: String
  
  var title: String
  
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType
}
object TvShowMediaMetadata {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: TvShowMediaMetadata] (val x: Self) extends AnyVal {
    
    inline def setEpisode(value: Double): Self = StObject.set(x, "episode", value.asInstanceOf[js.Any])
    
    inline def setEpisodeNumber(value: Double): Self = StObject.set(x, "episodeNumber", value.asInstanceOf[js.Any])
    
    inline def setEpisodeTitle(value: String): Self = StObject.set(x, "episodeTitle", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setMetadataType(value: MetadataType): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
    
    inline def setOriginalAirdate(value: String): Self = StObject.set(x, "originalAirdate", value.asInstanceOf[js.Any])
    
    inline def setReleaseYear(value: Double): Self = StObject.set(x, "releaseYear", value.asInstanceOf[js.Any])
    
    inline def setSeason(value: Double): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
    
    inline def setSeasonNumber(value: Double): Self = StObject.set(x, "seasonNumber", value.asInstanceOf[js.Any])
    
    inline def setSeriesTitle(value: String): Self = StObject.set(x, "seriesTitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
