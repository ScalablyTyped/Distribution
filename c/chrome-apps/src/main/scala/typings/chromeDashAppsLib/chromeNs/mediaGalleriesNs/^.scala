package typings
package chromeDashAppsLib.chromeNs.mediaGalleriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mediaGalleries")
@js.native
object ^ extends js.Object {
  /**
    * Fired when a media gallery is changed or a gallery watch is dropped
    * @since Chrome 38.
    */
  val onGalleryChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* args */ chromeDashAppsLib.chromeNs.mediaGalleriesNs.GalleryChangedEventArgs, 
      scala.Unit
    ]
  ] = js.native
  /**
    * @deprecated Deprecated since Chrome 51. The mediaGalleries API no longer supports scanning.
    * The pending media scan has changed state. See details for more information.
    */
  val onScanProgress: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* args */ chromeDashAppsLib.chromeNs.mediaGalleriesNs.ScanProgressEventArgs, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Adds a gallery watch for the gallery with the specified gallery ID.
    * The given callback is then fired with a success or failure result.
    * @since Chrome 39.
    */
  def addGalleryWatch(
    galleryId: java.lang.String,
    callback: js.Function1[
      /* result */ chromeDashAppsLib.chromeNs.mediaGalleriesNs.GalleryWatchResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * @deprecated Deprecated since Chrome 51. The mediaGalleries API no longer supports scanning.
    * @description
    * Show the user the scan results and let them add any or all of them as galleries.
    * This should be used after the 'finish' onScanProgress() event has happened.
    * All galleries the app has access to are returned, not just the newly added galleries.
    */
  def addScanResults(callback: js.Function1[/* mediaFileSystems */ js.Array[filesystemLib.FileSystem], scala.Unit]): scala.Unit = js.native
  /**
    * Present a directory picker to the user and add the selected directory as a gallery.
    * If the user cancels the picker, selectedFileSystemName will be empty.
    * A user gesture is required for the dialog to display.
    * Without a user gesture, the callback will run as though the user canceled.
    * @since Chrome 34.
    */
  def addUserSelectedFolder(
    callback: js.Function2[
      /* mediaFileSystems */ js.Array[filesystemLib.FileSystem], 
      /* selectedFileSystemName */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * @deprecated Deprecated since Chrome 51. The mediaGalleries API no longer supports scanning.
    * @description
    * Cancel any pending media scan.
    * Well behaved apps should provide a way for the user to cancel scans they start.
    */
  def cancelMediaScan(): scala.Unit = js.native
  /**
    * @deprecated Deprecated since Chrome 51. The user can manually drop access to galleries via the permissions dialog.
    * @description Give up access to a given media gallery.
    */
  def dropPermissionForMediaFileSystem(galleryId: java.lang.String): scala.Unit = js.native
  def dropPermissionForMediaFileSystem(galleryId: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * @deprecated Deprecated since Chrome 51. Applications should store their own gallery watches as they are added.
    * Notifies which galleries are being watched via the given callback.
    */
  def getAllGalleryWatch(callback: js.Function1[/* galleryIds */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  /**
    * @deprecated Deprecated since Chrome 51. Use getMediaFileSystemMetadata instead
    * Get metadata for all available media galleries.
    */
  def getAllMediaFileSystemMetadata(
    callback: js.Function1[
      /* metadatas */ js.Array[chromeDashAppsLib.chromeNs.mediaGalleriesNs.MediaFileSystemMetadata], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Get metadata about a specific media file system
    * @since Chrome 26.
    */
  def getMediaFileSystemMetadata(mediaFileSystem: filesystemLib.FileSystem): chromeDashAppsLib.chromeNs.mediaGalleriesNs.MediaFileSystemMetadata = js.native
  /**
    * Get the media galleries configured in this user agent.
    * If none are configured or available, the callback will receive an empty array.
    */
  def getMediaFileSystems(callback: js.Function1[/* mediaFileSystems */ js.Array[filesystemLib.FileSystem], scala.Unit]): scala.Unit = js.native
  /**
    * Get the media galleries configured in this user agent.
    * If none are configured or available, the callback will receive an empty array.
    */
  def getMediaFileSystems(
    options: chromeDashAppsLib.chromeNs.mediaGalleriesNs.MediaFileSystemsOptions,
    callback: js.Function1[/* mediaFileSystems */ js.Array[filesystemLib.FileSystem], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets the media-specific metadata for a media file.
    * This should work for files in media galleries as well as other DOM filesystems.
    * @since Chrome 38.
    */
  def getMetadata(
    mediaFile: stdLib.Blob,
    callback: js.Function1[/* metadata */ chromeDashAppsLib.chromeNs.mediaGalleriesNs.Metadata, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets the media-specific metadata for a media file.
    * This should work for files in media galleries as well as other DOM filesystems.
    * @since Chrome 38.
    */
  def getMetadata(
    mediaFile: stdLib.Blob,
    options: chromeDashAppsLib.chromeNs.mediaGalleriesNs.MetadataOptions,
    callback: js.Function1[/* metadata */ chromeDashAppsLib.chromeNs.mediaGalleriesNs.Metadata, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @deprecated Deprecated since Chrome 51. Use removeGalleryWatch instead.
    * Removes all gallery watches.
    */
  def removeAllGalleryWatch(): scala.Unit = js.native
  /**
    * Removes a gallery watch for the gallery with the specified gallery ID.
    * @since Chrome 39.
    */
  def removeGalleryWatch(galleryId: java.lang.String): scala.Unit = js.native
  /**
    * @deprecated Deprecated since Chrome 51. The mediaGalleries API no longer supports scanning.
    * @description
    * Start a scan of the user's hard disks for directories containing media.
    * The scan may take a long time so progress and completion is communicated by events.
    * No permission is granted as a result of the scan, see addScanResults.
    */
  def startMediaScan(): scala.Unit = js.native
}

