package typings.chromecastApi

import typings.chromecastApi.anon.BackgroundColor
import typings.chromecastApi.anon.ContentId
import typings.chromecastApi.anon.Language
import typings.chromecastApi.anon.Title
import typings.chromecastApi.chromecastApiNumbers.`0`
import typings.chromecastApi.chromecastApiNumbers.`1`
import typings.chromecastApi.chromecastApiNumbers.`2`
import typings.chromecastApi.chromecastApiNumbers.`3`
import typings.chromecastApi.chromecastApiNumbers.`4`
import typings.chromecastApi.chromecastApiStrings.BUFFERING
import typings.chromecastApi.chromecastApiStrings.CANCELLED
import typings.chromecastApi.chromecastApiStrings.ERROR
import typings.chromecastApi.chromecastApiStrings.FINISHED
import typings.chromecastApi.chromecastApiStrings.IDLE
import typings.chromecastApi.chromecastApiStrings.INTERRUPTED
import typings.chromecastApi.chromecastApiStrings.PAUSED
import typings.chromecastApi.chromecastApiStrings.PLAYING
import typings.chromecastApi.chromecastApiStrings.connected
import typings.chromecastApi.chromecastApiStrings.finished_
import typings.chromecastApi.chromecastApiStrings.status
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceMod {
  
  @JSImport("chromecast-api/lib/device", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Device {
    def this(options: DeviceOptions) = this()
  }
  
  @js.native
  trait Device extends EventEmitter {
    
    def _connect(callback: js.Function0[Unit]): Unit = js.native
    
    def _tryConnect(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Choose the subtitles font size with fontSize. The default is 1.0.
      */
    def changeSubtitleSize(fontScale: Double): Unit = js.native
    def changeSubtitleSize(fontScale: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      * Change the subtitles by passing the index of the subtitle you want based on the list you passed before.
      */
    def changeSubtitles(subId: Double): Unit = js.native
    def changeSubtitles(subId: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    var friendlyName: String = js.native
    
    /**
      * Get the current time of the media playing (in seconds). It's a shortcut for getting the currentTime from the status.
      */
    def getCurrentTime(): Unit = js.native
    def getCurrentTime(callback: js.Function2[/* error */ js.UndefOr[js.Error], /* time */ js.UndefOr[Double], Unit]): Unit = js.native
    
    /**
      * Gets the current status of the cast device including data about current media playback.
      */
    def getReceiverStatus(): Unit = js.native
    def getReceiverStatus(
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* status */ js.UndefOr[DeviceStatus], Unit]
    ): Unit = js.native
    
    /**
      * Gets the current status of the cast device including data about current media playback.
      */
    def getStatus(): Unit = js.native
    def getStatus(
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* status */ js.UndefOr[DeviceStatus], Unit]
    ): Unit = js.native
    
    /**
      * Gets the volume of the current playback, if any.
      */
    def getVolume(): Unit = js.native
    def getVolume(
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* volume */ js.UndefOr[DeviceVolume], Unit]
    ): Unit = js.native
    
    var host: String = js.native
    
    var name: String = js.native
    
    def on(event: connected | finished_, callback: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_status(event: status, callback: js.Function1[/* status */ DeviceStatus, Unit]): this.type = js.native
    
    /**
      * Pause playback.
      */
    def pause(): Unit = js.native
    def pause(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def play(resource: String): Unit = js.native
    def play(resource: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    /**
      * Use this function to play any media in the chromecast device. Make sure mediaURL is accessible by the chromecast.
      * Pass an attribute startTime in the opts object to set where to start an audio or video content (in seconds).
      */
    def play(resource: String, options: PlaybackOptions): Unit = js.native
    def play(
      resource: String,
      options: PlaybackOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def play(resource: MediaResource): Unit = js.native
    def play(resource: MediaResource, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def play(resource: MediaResource, options: PlaybackOptions): Unit = js.native
    def play(
      resource: MediaResource,
      options: PlaybackOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    /**
      * Resume playback.
      */
    def resume(): Unit = js.native
    def resume(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      * Seek forward seconds in time relative to the current position.
      */
    def seek(seconds: Double): Unit = js.native
    def seek(seconds: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      * Seek to the specificTime in seconds.
      */
    def seekTo(newCurrentTime: Double): Unit = js.native
    def seekTo(newCurrentTime: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      * Set the volume to a specific level (from 0.0 to 1.0).
      */
    def setVolume(volume: Double): Unit = js.native
    def setVolume(volume: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      * Mutes or unmutes the audio of the playback.
      */
    def setVolumeMuted(muted: Boolean): Unit = js.native
    def setVolumeMuted(muted: Boolean, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      * Stop playing the media.
      */
    def stop(): Unit = js.native
    def stop(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      * Turn the subtitles off.
      */
    def subtitlesOff(): Unit = js.native
    def subtitlesOff(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      * Resume playback.
      */
    def unpause(): Unit = js.native
    def unpause(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
  
  trait DeviceOptions extends StObject {
    
    var friendlyName: String
    
    var host: String
    
    var name: String
  }
  object DeviceOptions {
    
    inline def apply(friendlyName: String, host: String, name: String): DeviceOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceOptions]
    }
    
    extension [Self <: DeviceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeviceStatus extends StObject {
    
    var currentTime: Double
    
    var customData: js.UndefOr[js.Object] = js.undefined
    
    var idleReason: js.UndefOr[CANCELLED | INTERRUPTED | FINISHED | ERROR] = js.undefined
    
    var media: js.UndefOr[ContentId] = js.undefined
    
    var mediaSessionId: Double
    
    var playbackRate: Double
    
    var playerState: IDLE | PLAYING | PAUSED | BUFFERING
    
    var supportedMediaCommands: Double
    
    /* Flags using bits: 1 Pause; 2 Seek; 4 Stream volume; 8 Stream mute; 16 Skip forward; 32 Skip backward */
    var volume: DeviceVolume
  }
  object DeviceStatus {
    
    inline def apply(
      currentTime: Double,
      mediaSessionId: Double,
      playbackRate: Double,
      playerState: IDLE | PLAYING | PAUSED | BUFFERING,
      supportedMediaCommands: Double,
      volume: DeviceVolume
    ): DeviceStatus = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], mediaSessionId = mediaSessionId.asInstanceOf[js.Any], playbackRate = playbackRate.asInstanceOf[js.Any], playerState = playerState.asInstanceOf[js.Any], supportedMediaCommands = supportedMediaCommands.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceStatus]
    }
    
    extension [Self <: DeviceStatus](x: Self) {
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setIdleReason(value: CANCELLED | INTERRUPTED | FINISHED | ERROR): Self = StObject.set(x, "idleReason", value.asInstanceOf[js.Any])
      
      inline def setIdleReasonUndefined: Self = StObject.set(x, "idleReason", js.undefined)
      
      inline def setMedia(value: ContentId): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaSessionId(value: Double): Self = StObject.set(x, "mediaSessionId", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
      
      inline def setPlayerState(value: IDLE | PLAYING | PAUSED | BUFFERING): Self = StObject.set(x, "playerState", value.asInstanceOf[js.Any])
      
      inline def setSupportedMediaCommands(value: Double): Self = StObject.set(x, "supportedMediaCommands", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: DeviceVolume): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeviceVolume extends StObject {
    
    var level: js.UndefOr[Double] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
  }
  object DeviceVolume {
    
    inline def apply(): DeviceVolume = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceVolume]
    }
    
    extension [Self <: DeviceVolume](x: Self) {
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    }
  }
  
  trait GenericMediaMetadata extends StObject {
    
    var images: js.UndefOr[js.Array[Image]] = js.undefined
    
    var metadataType: `0`
    
    var releaseDate: js.UndefOr[String] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object GenericMediaMetadata {
    
    inline def apply(): GenericMediaMetadata = {
      val __obj = js.Dynamic.literal(metadataType = 0)
      __obj.asInstanceOf[GenericMediaMetadata]
    }
    
    extension [Self <: GenericMediaMetadata](x: Self) {
      
      inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setMetadataType(value: `0`): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
      
      inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Image extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var url: String
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Image {
    
    inline def apply(url: String): Image = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MediaResource extends StObject {
    
    var cover: js.UndefOr[Title] = js.undefined
    
    var subtitles: js.UndefOr[js.Array[Language]] = js.undefined
    
    var subtitles_style: js.UndefOr[BackgroundColor] = js.undefined
    
    var url: String
  }
  object MediaResource {
    
    inline def apply(url: String): MediaResource = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaResource]
    }
    
    extension [Self <: MediaResource](x: Self) {
      
      inline def setCover(value: Title): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      inline def setSubtitles(value: js.Array[Language]): Self = StObject.set(x, "subtitles", value.asInstanceOf[js.Any])
      
      inline def setSubtitlesUndefined: Self = StObject.set(x, "subtitles", js.undefined)
      
      inline def setSubtitlesVarargs(value: Language*): Self = StObject.set(x, "subtitles", js.Array(value*))
      
      inline def setSubtitles_style(value: BackgroundColor): Self = StObject.set(x, "subtitles_style", value.asInstanceOf[js.Any])
      
      inline def setSubtitles_styleUndefined: Self = StObject.set(x, "subtitles_style", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait MovieMediaMetadata extends StObject {
    
    var images: js.UndefOr[js.Array[Image]] = js.undefined
    
    var metadataType: `1`
    
    var releaseDate: js.UndefOr[String] = js.undefined
    
    var studio: js.UndefOr[String] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object MovieMediaMetadata {
    
    inline def apply(): MovieMediaMetadata = {
      val __obj = js.Dynamic.literal(metadataType = 1)
      __obj.asInstanceOf[MovieMediaMetadata]
    }
    
    extension [Self <: MovieMediaMetadata](x: Self) {
      
      inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setMetadataType(value: `1`): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
      
      inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
      
      inline def setStudio(value: String): Self = StObject.set(x, "studio", value.asInstanceOf[js.Any])
      
      inline def setStudioUndefined: Self = StObject.set(x, "studio", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait MusicTrackMediaMetadata extends StObject {
    
    var albumArtist: js.UndefOr[String] = js.undefined
    
    var albumName: js.UndefOr[String] = js.undefined
    
    var artist: js.UndefOr[String] = js.undefined
    
    var composer: js.UndefOr[String] = js.undefined
    
    var discNumber: js.UndefOr[Double] = js.undefined
    
    var images: js.UndefOr[js.Array[Image]] = js.undefined
    
    var metadataType: `3`
    
    var releaseDate: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var trackNumber: js.UndefOr[Double] = js.undefined
  }
  object MusicTrackMediaMetadata {
    
    inline def apply(): MusicTrackMediaMetadata = {
      val __obj = js.Dynamic.literal(metadataType = 3)
      __obj.asInstanceOf[MusicTrackMediaMetadata]
    }
    
    extension [Self <: MusicTrackMediaMetadata](x: Self) {
      
      inline def setAlbumArtist(value: String): Self = StObject.set(x, "albumArtist", value.asInstanceOf[js.Any])
      
      inline def setAlbumArtistUndefined: Self = StObject.set(x, "albumArtist", js.undefined)
      
      inline def setAlbumName(value: String): Self = StObject.set(x, "albumName", value.asInstanceOf[js.Any])
      
      inline def setAlbumNameUndefined: Self = StObject.set(x, "albumName", js.undefined)
      
      inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
      
      inline def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
      
      inline def setComposer(value: String): Self = StObject.set(x, "composer", value.asInstanceOf[js.Any])
      
      inline def setComposerUndefined: Self = StObject.set(x, "composer", js.undefined)
      
      inline def setDiscNumber(value: Double): Self = StObject.set(x, "discNumber", value.asInstanceOf[js.Any])
      
      inline def setDiscNumberUndefined: Self = StObject.set(x, "discNumber", js.undefined)
      
      inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setMetadataType(value: `3`): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
      
      inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
      
      inline def setTrackNumberUndefined: Self = StObject.set(x, "trackNumber", js.undefined)
    }
  }
  
  trait PhotoMediaMetadata extends StObject {
    
    var artist: js.UndefOr[String] = js.undefined
    
    var creationDateTime: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var latitude: js.UndefOr[Double] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var longitude: js.UndefOr[Double] = js.undefined
    
    var metadataType: `4`
    
    var title: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PhotoMediaMetadata {
    
    inline def apply(): PhotoMediaMetadata = {
      val __obj = js.Dynamic.literal(metadataType = 4)
      __obj.asInstanceOf[PhotoMediaMetadata]
    }
    
    extension [Self <: PhotoMediaMetadata](x: Self) {
      
      inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
      
      inline def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
      
      inline def setCreationDateTime(value: String): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
      
      inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      inline def setMetadataType(value: `4`): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PlaybackOptions extends StObject {
    
    var startTime: js.UndefOr[Double] = js.undefined
  }
  object PlaybackOptions {
    
    inline def apply(): PlaybackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaybackOptions]
    }
    
    extension [Self <: PlaybackOptions](x: Self) {
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
  
  trait TvShowMediaMetadata extends StObject {
    
    var episode: js.UndefOr[Double] = js.undefined
    
    var images: js.UndefOr[js.Array[Image]] = js.undefined
    
    var metadataType: `2`
    
    var originalAirDate: js.UndefOr[String] = js.undefined
    
    var season: js.UndefOr[Double] = js.undefined
    
    var seriesTitle: js.UndefOr[String] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
  }
  object TvShowMediaMetadata {
    
    inline def apply(): TvShowMediaMetadata = {
      val __obj = js.Dynamic.literal(metadataType = 2)
      __obj.asInstanceOf[TvShowMediaMetadata]
    }
    
    extension [Self <: TvShowMediaMetadata](x: Self) {
      
      inline def setEpisode(value: Double): Self = StObject.set(x, "episode", value.asInstanceOf[js.Any])
      
      inline def setEpisodeUndefined: Self = StObject.set(x, "episode", js.undefined)
      
      inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setMetadataType(value: `2`): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
      
      inline def setOriginalAirDate(value: String): Self = StObject.set(x, "originalAirDate", value.asInstanceOf[js.Any])
      
      inline def setOriginalAirDateUndefined: Self = StObject.set(x, "originalAirDate", js.undefined)
      
      inline def setSeason(value: Double): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      inline def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
      
      inline def setSeriesTitle(value: String): Self = StObject.set(x, "seriesTitle", value.asInstanceOf[js.Any])
      
      inline def setSeriesTitleUndefined: Self = StObject.set(x, "seriesTitle", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    }
  }
}
