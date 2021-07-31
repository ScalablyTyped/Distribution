package typings.chromeApps.chrome

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.chromeAppsStrings.all__
import typings.chromeApps.chromeAppsStrings.error_
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.mediaGalleries
/////////////////////
// Media Galleries //
/////////////////////
/**
  * Use the chrome.mediaGalleries API to access media files (audio, images, video)
  * from the user's local disks (with the user's consent).
  * @since Chrome 24.
  * @requires Permissions: {'mediaGalleries': ['accessType1' | 'accessType2', ...]}
  *                        {'mediaGalleries': ['accessType1' | 'accessType2', ..., 'allAutoDetected']}
  * @see[More information]{@link https://developer.chrome.com/apps/mediaGalleries}
  */
object mediaGalleries {
  
  trait GalleryChangedEventArgs extends StObject {
    
    var galleryId: String
    
    var `type`: GalleryChangedType
  }
  object GalleryChangedEventArgs {
    
    @scala.inline
    def apply(galleryId: String, `type`: GalleryChangedType): GalleryChangedEventArgs = {
      val __obj = js.Dynamic.literal(galleryId = galleryId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GalleryChangedEventArgs]
    }
    
    @scala.inline
    implicit class GalleryChangedEventArgsMutableBuilder[Self <: GalleryChangedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGalleryId(value: String): Self = StObject.set(x, "galleryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: GalleryChangedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.contents_changed
    - typings.chromeApps.chromeAppsStrings.watch_dropped
  */
  trait GalleryChangedType extends StObject
  object GalleryChangedType {
    
    @scala.inline
    def contents_changed: typings.chromeApps.chromeAppsStrings.contents_changed = "contents_changed".asInstanceOf[typings.chromeApps.chromeAppsStrings.contents_changed]
    
    @scala.inline
    def watch_dropped: typings.chromeApps.chromeAppsStrings.watch_dropped = "watch_dropped".asInstanceOf[typings.chromeApps.chromeAppsStrings.watch_dropped]
  }
  
  trait GalleryWatchResult extends StObject {
    
    var galleryId: String
    
    var success: Boolean
  }
  object GalleryWatchResult {
    
    @scala.inline
    def apply(galleryId: String, success: Boolean): GalleryWatchResult = {
      val __obj = js.Dynamic.literal(galleryId = galleryId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[GalleryWatchResult]
    }
    
    @scala.inline
    implicit class GalleryWatchResultMutableBuilder[Self <: GalleryWatchResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGalleryId(value: String): Self = StObject.set(x, "galleryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.no
    - typings.chromeApps.chromeAppsStrings.yes
    - typings.chromeApps.chromeAppsStrings.if_needed
  */
  trait Interactive extends StObject
  object Interactive {
    
    @scala.inline
    def if_needed: typings.chromeApps.chromeAppsStrings.if_needed = "if_needed".asInstanceOf[typings.chromeApps.chromeAppsStrings.if_needed]
    
    @scala.inline
    def no: typings.chromeApps.chromeAppsStrings.no = "no".asInstanceOf[typings.chromeApps.chromeAppsStrings.no]
    
    @scala.inline
    def yes: typings.chromeApps.chromeAppsStrings.yes = "yes".asInstanceOf[typings.chromeApps.chromeAppsStrings.yes]
  }
  
  trait MediaFileSystemMetadata extends StObject {
    
    /** If the media gallery is on a removable device, a unique id for the device while the device is online. */
    var deviceId: js.UndefOr[String] = js.undefined
    
    /** A unique and persistent id for the media gallery. */
    var galleryId: String
    
    /** True if the device is currently available. */
    var isAvailable: Boolean
    
    /** True if the device the media gallery is on was detected as a media device. i.e. a PTP or MTP device, or a DCIM directory is present. */
    var isMediaDevice: Boolean
    
    /** True if the media gallery is on a removable device. */
    var isRemovable: Boolean
    
    /** The name of the file system. */
    var name: String
  }
  object MediaFileSystemMetadata {
    
    @scala.inline
    def apply(
      galleryId: String,
      isAvailable: Boolean,
      isMediaDevice: Boolean,
      isRemovable: Boolean,
      name: String
    ): MediaFileSystemMetadata = {
      val __obj = js.Dynamic.literal(galleryId = galleryId.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any], isMediaDevice = isMediaDevice.asInstanceOf[js.Any], isRemovable = isRemovable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaFileSystemMetadata]
    }
    
    @scala.inline
    implicit class MediaFileSystemMetadataMutableBuilder[Self <: MediaFileSystemMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      @scala.inline
      def setGalleryId(value: String): Self = StObject.set(x, "galleryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMediaDevice(value: Boolean): Self = StObject.set(x, "isMediaDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRemovable(value: Boolean): Self = StObject.set(x, "isRemovable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaFileSystemsOptions extends StObject {
    
    /**
      * Whether to prompt the user for permission to additional media galleries before returning
      * the permitted set. Default is silent. If the value 'yes' is passed, or if the application
      * has not been granted access to any media galleries and the value 'if_needed' is passed,
      * then the media gallery configuration dialog will be displayed.
      *
      * **no**
      * Do not act interactively.
      * **yes**
      * Ask the user to manage permitted media galleries.
      * **if_needed**
      * Ask the user to manage permitted galleries only if the return set would otherwise be empty.
      */
    var interactive: js.UndefOr[Interactive] = js.undefined
  }
  object MediaFileSystemsOptions {
    
    @scala.inline
    def apply(): MediaFileSystemsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaFileSystemsOptions]
    }
    
    @scala.inline
    implicit class MediaFileSystemsOptionsMutableBuilder[Self <: MediaFileSystemsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInteractive(value: Interactive): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    }
  }
  
  trait Metadata extends StObject {
    
    /** Defined for audio and video only. */
    var album: js.UndefOr[String] = js.undefined
    
    var artist: js.UndefOr[String] = js.undefined
    
    /**
      * The images embedded in the media file's metadata.
      * This is most often used for album art or video thumbnails.
      */
    var attachedImages: js.Array[Blob]
    
    var comment: js.UndefOr[String] = js.undefined
    
    var copyright: js.UndefOr[String] = js.undefined
    
    var disc: js.UndefOr[integer] = js.undefined
    
    /** Defined for audio and video. In seconds. */
    var duration: js.UndefOr[integer] = js.undefined
    
    var genre: js.UndefOr[String] = js.undefined
    
    /** Defined for images and video. In pixels. */
    var height: js.UndefOr[integer] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    /** The browser sniffed mime type. */
    var mimeType: String
    
    /**
      * All the metadata in the media file.
      * For formats with multiple streams, stream order will be preserved.
      * Container metadata is the first element.
      */
    var rawTags: js.Array[RawTag]
    
    /** Defined for images and video. In degrees. */
    var rotation: js.UndefOr[integer] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var track: js.UndefOr[integer] = js.undefined
    
    var width: js.UndefOr[integer] = js.undefined
  }
  object Metadata {
    
    @scala.inline
    def apply(attachedImages: js.Array[Blob], mimeType: String, rawTags: js.Array[RawTag]): Metadata = {
      val __obj = js.Dynamic.literal(attachedImages = attachedImages.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], rawTags = rawTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
      
      @scala.inline
      def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
      
      @scala.inline
      def setAttachedImages(value: js.Array[Blob]): Self = StObject.set(x, "attachedImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedImagesVarargs(value: Blob*): Self = StObject.set(x, "attachedImages", js.Array(value :_*))
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setDisc(value: integer): Self = StObject.set(x, "disc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscUndefined: Self = StObject.set(x, "disc", js.undefined)
      
      @scala.inline
      def setDuration(value: integer): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenreUndefined: Self = StObject.set(x, "genre", js.undefined)
      
      @scala.inline
      def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawTags(value: js.Array[RawTag]): Self = StObject.set(x, "rawTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawTagsVarargs(value: RawTag*): Self = StObject.set(x, "rawTags", js.Array(value :_*))
      
      @scala.inline
      def setRotation(value: integer): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTrack(value: integer): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      
      @scala.inline
      def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MetadataOptions extends StObject {
    
    var metadataType: MetadataOptionsType
  }
  object MetadataOptions {
    
    @scala.inline
    def apply(metadataType: MetadataOptionsType): MetadataOptions = {
      val __obj = js.Dynamic.literal(metadataType = metadataType.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataOptions]
    }
    
    @scala.inline
    implicit class MetadataOptionsMutableBuilder[Self <: MetadataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadataType(value: MetadataOptionsType): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.all__
    - typings.chromeApps.chromeAppsStrings.mimeTypeAndTags
    - typings.chromeApps.chromeAppsStrings.mimeTypeOnly
  */
  trait MetadataOptionsType extends StObject
  object MetadataOptionsType {
    
    @scala.inline
    def all: all__ = "all".asInstanceOf[all__]
    
    @scala.inline
    def mimeTypeAndTags: typings.chromeApps.chromeAppsStrings.mimeTypeAndTags = "mimeTypeAndTags".asInstanceOf[typings.chromeApps.chromeAppsStrings.mimeTypeAndTags]
    
    @scala.inline
    def mimeTypeOnly: typings.chromeApps.chromeAppsStrings.mimeTypeOnly = "mimeTypeOnly".asInstanceOf[typings.chromeApps.chromeAppsStrings.mimeTypeOnly]
  }
  
  trait RawTag extends StObject {
    
    /**
      * An unfiltered string->string interface of tags for the stream.
      */
    var tags: StringDictionary[String]
    
    /**
      * Describes format of container or codec of stream, i.e. 'mp3' | 'h264'.
      */
    var `type`: String
  }
  object RawTag {
    
    @scala.inline
    def apply(tags: StringDictionary[String], `type`: String): RawTag = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawTag]
    }
    
    @scala.inline
    implicit class RawTagMutableBuilder[Self <: RawTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScanProgressEventArgs extends StObject {
    
    /**
      * Appoximate number of media files found;
      * some file types can be either audio or video
      * and are included in both counts.
      */
    var audioCount: js.UndefOr[integer] = js.undefined
    
    /** The number of Galleries found. */
    var galleryCount: js.UndefOr[integer] = js.undefined
    
    var imageCount: js.UndefOr[integer] = js.undefined
    
    /** The type of progress event, i.e. start, finish, etc. */
    var `type`: ScanProgressType
    
    var videoCount: js.UndefOr[integer] = js.undefined
  }
  object ScanProgressEventArgs {
    
    @scala.inline
    def apply(`type`: ScanProgressType): ScanProgressEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanProgressEventArgs]
    }
    
    @scala.inline
    implicit class ScanProgressEventArgsMutableBuilder[Self <: ScanProgressEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioCount(value: integer): Self = StObject.set(x, "audioCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioCountUndefined: Self = StObject.set(x, "audioCount", js.undefined)
      
      @scala.inline
      def setGalleryCount(value: integer): Self = StObject.set(x, "galleryCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGalleryCountUndefined: Self = StObject.set(x, "galleryCount", js.undefined)
      
      @scala.inline
      def setImageCount(value: integer): Self = StObject.set(x, "imageCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageCountUndefined: Self = StObject.set(x, "imageCount", js.undefined)
      
      @scala.inline
      def setType(value: ScanProgressType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoCount(value: integer): Self = StObject.set(x, "videoCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoCountUndefined: Self = StObject.set(x, "videoCount", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.start
    - typings.chromeApps.chromeAppsStrings.cancel
    - typings.chromeApps.chromeAppsStrings.finish
    - typings.chromeApps.chromeAppsStrings.error_
  */
  trait ScanProgressType extends StObject
  object ScanProgressType {
    
    @scala.inline
    def cancel: typings.chromeApps.chromeAppsStrings.cancel = "cancel".asInstanceOf[typings.chromeApps.chromeAppsStrings.cancel]
    
    @scala.inline
    def error: error_ = "error".asInstanceOf[error_]
    
    @scala.inline
    def finish: typings.chromeApps.chromeAppsStrings.finish = "finish".asInstanceOf[typings.chromeApps.chromeAppsStrings.finish]
    
    @scala.inline
    def start: typings.chromeApps.chromeAppsStrings.start = "start".asInstanceOf[typings.chromeApps.chromeAppsStrings.start]
  }
}
