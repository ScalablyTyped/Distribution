package typings
package cordovaDashPluginDashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplicationDirectory extends js.Object {
  /* Read-only directory where the application is installed. */
  var applicationDirectory: java.lang.String
  /* Root of app's private writable storage */
  var applicationStorageDirectory: java.lang.String
  /* Cached files that should survive app restarts. Apps should not rely on the OS to delete files in here. */
  var cacheDirectory: java.lang.String
  /* Where to put app-specific data files. */
  var dataDirectory: java.lang.String
  /* iOS: Files private to the app, but that are meaningful to other applciations (e.g. Office files) */
  var documentsDirectory: java.lang.String
  /* Android: the application space on external storage. */
  var externalApplicationStorageDirectory: java.lang.String
  /* Android: the application cache on external storage. */
  var externalCacheDirectory: java.lang.String
  /* Android: Where to put app-specific data files on external storage. */
  var externalDataDirectory: java.lang.String
  /* Android: the external storage (SD card) root. */
  var externalRootDirectory: java.lang.String
  /* BlackBerry10: Files globally available to all apps */
  var sharedDirectory: java.lang.String
  /* iOS: Holds app-specific files that should be synced (e.g. to iCloud). */
  var syncedDataDirectory: java.lang.String
  /* iOS: Temp directory that the OS can clear at will. */
  var tempDirectory: java.lang.String
}

object Anon_ApplicationDirectory {
  @scala.inline
  def apply(
    applicationDirectory: java.lang.String,
    applicationStorageDirectory: java.lang.String,
    cacheDirectory: java.lang.String,
    dataDirectory: java.lang.String,
    documentsDirectory: java.lang.String,
    externalApplicationStorageDirectory: java.lang.String,
    externalCacheDirectory: java.lang.String,
    externalDataDirectory: java.lang.String,
    externalRootDirectory: java.lang.String,
    sharedDirectory: java.lang.String,
    syncedDataDirectory: java.lang.String,
    tempDirectory: java.lang.String
  ): Anon_ApplicationDirectory = {
    val __obj = js.Dynamic.literal(applicationDirectory = applicationDirectory, applicationStorageDirectory = applicationStorageDirectory, cacheDirectory = cacheDirectory, dataDirectory = dataDirectory, documentsDirectory = documentsDirectory, externalApplicationStorageDirectory = externalApplicationStorageDirectory, externalCacheDirectory = externalCacheDirectory, externalDataDirectory = externalDataDirectory, externalRootDirectory = externalRootDirectory, sharedDirectory = sharedDirectory, syncedDataDirectory = syncedDataDirectory, tempDirectory = tempDirectory)
  
    __obj.asInstanceOf[Anon_ApplicationDirectory]
  }
}

