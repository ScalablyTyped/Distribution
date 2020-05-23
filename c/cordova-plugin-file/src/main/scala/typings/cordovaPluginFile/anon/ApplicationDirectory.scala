package typings.cordovaPluginFile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationDirectory extends js.Object {
  /* Read-only directory where the application is installed. */
  var applicationDirectory: String
  /* Root of app's private writable storage */
  var applicationStorageDirectory: String
  /* Cached files that should survive app restarts. Apps should not rely on the OS to delete files in here. */
  var cacheDirectory: String
  /* Where to put app-specific data files. */
  var dataDirectory: String
  /* iOS: Files private to the app, but that are meaningful to other applciations (e.g. Office files) */
  var documentsDirectory: String
  /* Android: the application space on external storage. */
  var externalApplicationStorageDirectory: String
  /* Android: the application cache on external storage. */
  var externalCacheDirectory: String
  /* Android: Where to put app-specific data files on external storage. */
  var externalDataDirectory: String
  /* Android: the external storage (SD card) root. */
  var externalRootDirectory: String
  /* BlackBerry10: Files globally available to all apps */
  var sharedDirectory: String
  /* iOS: Holds app-specific files that should be synced (e.g. to iCloud). */
  var syncedDataDirectory: String
  /* iOS: Temp directory that the OS can clear at will. */
  var tempDirectory: String
}

object ApplicationDirectory {
  @scala.inline
  def apply(
    applicationDirectory: String,
    applicationStorageDirectory: String,
    cacheDirectory: String,
    dataDirectory: String,
    documentsDirectory: String,
    externalApplicationStorageDirectory: String,
    externalCacheDirectory: String,
    externalDataDirectory: String,
    externalRootDirectory: String,
    sharedDirectory: String,
    syncedDataDirectory: String,
    tempDirectory: String
  ): ApplicationDirectory = {
    val __obj = js.Dynamic.literal(applicationDirectory = applicationDirectory.asInstanceOf[js.Any], applicationStorageDirectory = applicationStorageDirectory.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], dataDirectory = dataDirectory.asInstanceOf[js.Any], documentsDirectory = documentsDirectory.asInstanceOf[js.Any], externalApplicationStorageDirectory = externalApplicationStorageDirectory.asInstanceOf[js.Any], externalCacheDirectory = externalCacheDirectory.asInstanceOf[js.Any], externalDataDirectory = externalDataDirectory.asInstanceOf[js.Any], externalRootDirectory = externalRootDirectory.asInstanceOf[js.Any], sharedDirectory = sharedDirectory.asInstanceOf[js.Any], syncedDataDirectory = syncedDataDirectory.asInstanceOf[js.Any], tempDirectory = tempDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDirectory]
  }
}

