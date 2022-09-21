package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.fileSystem.ChooseDirectoryEntryOptions
import typings.chromeApps.chrome.fileSystem.ChooseEntryOptionsBase
import typings.chromeApps.chrome.fileSystem.ChooseFileEntryOptions
import typings.chromeApps.chrome.fileSystem.ChooseMultipleFilesEntryOptions
import typings.chromeApps.chrome.fileSystem.ChooseSaveFileEntryOptions
import typings.chromeApps.chrome.fileSystem.FileEntryCallback
import typings.chromeApps.chrome.fileSystem.Volume
import typings.chromeApps.chromeAppsStrings.changed_
import typings.chromeApps.chromeAppsStrings.created
import typings.chromeApps.chromeAppsStrings.openDirectory
import typings.chromeApps.chromeAppsStrings.openFile
import typings.chromeApps.chromeAppsStrings.openWritableFile
import typings.chromeApps.chromeAppsStrings.removed
import typings.chromeApps.chromeAppsStrings.saveFile
import typings.filesystem.DirectoryEntry
import typings.filesystem.FileEntry
import typings.filesystem.FileSystemDirectoryEntry
import typings.std.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.fileSystem
////////////////
// FileSystem //
////////////////
/**
  * Use the chrome.fileSystem API to create, read, navigate, and write to the user's local file system.
  * With this API, Chrome Apps can read and write to a user-selected location.
  * For example, a text editor app can use the API to read and write local documents.
  * All failures are notified via chrome.runtime.lastError.
  * @since Chrome 24.
  * @requires Permissions:
  *   'fileSystem'
  *   {'fileSystem': ['write']}
  *   {'fileSystem': ['write', 'retainEntries', 'directory']}
  */
object fileSystem {
  
  @JSGlobal("chrome.fileSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /** @enum */
  object ChildChangeType {
    
    @JSGlobal("chrome.fileSystem.ChildChangeType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.fileSystem.ChildChangeType.CHANGED")
    @js.native
    def CHANGED: changed_ = js.native
    inline def CHANGED_=(x: changed_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystem.ChildChangeType.CREATED")
    @js.native
    def CREATED: created = js.native
    inline def CREATED_=(x: created): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystem.ChildChangeType.REMOVED")
    @js.native
    def REMOVED: removed = js.native
    inline def REMOVED_=(x: removed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVED")(x.asInstanceOf[js.Any])
  }
  
  /**
    * **openFile**
    *  - Prompts the user to open an existing file and returns a FileEntry on success.
    *    From Chrome 31 onwards, the FileEntry will be writable if the application has
    *    the 'write' permission under 'fileSystem'; otherwise, the FileEntry will be read-only.
    * **openWritableFile**
    *  - Prompts the user to open an existing file and returns a writable FileEntry on success.
    *    Calls using this type will fail with a runtime error if the application doesn't have the
    *    'write' permission under 'fileSystem'.
    * **saveFile**
    *  - Prompts the user to open an existing file or a new file and returns a writable FileEntry
    *    on success. Calls using this type will fail with a runtime error if the application doesn't
    *    have the 'write' permission under 'fileSystem'.
    * **openDirectory**
    *  - Prompts the user to open a directory and returns a DirectoryEntry on success. Calls using
    *    this type will fail with a runtime error if the application doesn't have the 'directory'
    *    permission under 'fileSystem'. If the application has the 'write' permission under
    *    'fileSystem', the returned DirectoryEntry will be writable; otherwise it will be read-only.
    *    New in Chrome 31.
    * @enum
    */
  object ChooseEntryType {
    
    @JSGlobal("chrome.fileSystem.ChooseEntryType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.fileSystem.ChooseEntryType.OPEN_DIRECTORY")
    @js.native
    def OPEN_DIRECTORY: openDirectory = js.native
    inline def OPEN_DIRECTORY_=(x: openDirectory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_DIRECTORY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystem.ChooseEntryType.OPEN_FILE")
    @js.native
    def OPEN_FILE: openFile = js.native
    inline def OPEN_FILE_=(x: openFile): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_FILE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystem.ChooseEntryType.OPEN_WRITABLE_FILE")
    @js.native
    def OPEN_WRITABLE_FILE: openWritableFile = js.native
    inline def OPEN_WRITABLE_FILE_=(x: openWritableFile): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_WRITABLE_FILE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystem.ChooseEntryType.SAVE_FILE")
    @js.native
    def SAVE_FILE: saveFile = js.native
    inline def SAVE_FILE_=(x: saveFile): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAVE_FILE")(x.asInstanceOf[js.Any])
  }
  
  /** Ask the user to choose a file or directory. */
  inline def chooseEntry(
    callback: FileEntryCallback[ChooseFileEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseEntry")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def chooseEntry(
    options: ChooseDirectoryEntryOptions,
    callback: FileEntryCallback[ChooseDirectoryEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseEntry")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /** Ask the user to choose a file or directory. */
  inline def chooseEntry(
    options: ChooseEntryOptionsBase,
    callback: FileEntryCallback[ChooseEntryOptionsBase, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseEntry")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def chooseEntry(
    options: ChooseFileEntryOptions,
    callback: FileEntryCallback[ChooseFileEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseEntry")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def chooseEntry(
    options: ChooseMultipleFilesEntryOptions,
    callback: FileEntryCallback[ChooseMultipleFilesEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseEntry")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def chooseEntry(
    options: ChooseSaveFileEntryOptions,
    callback: FileEntryCallback[ChooseSaveFileEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseEntry")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDisplayPath(entry: DirectoryEntry, callback: js.Function1[/* displayPath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayPath")(entry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Get the display path of an Entry object.
    * The display path is based on the full path of the file or directory on the local file system, but may be made more readable for display purposes.
    */
  inline def getDisplayPath(entry: FileEntry, callback: js.Function1[/* displayPath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayPath")(entry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @requires(Kiosk) Chrome OS Kiosk mode only
    * @requires Permissions: The 'fileSystem': {'requestFileSystem'} manifest permission is required.
    * Returns a list of volumes available for requestFileSystem().
    * Available to kiosk apps running in the kiosk session only.
    * In case of an error, volumes will be undefined, and chrome.runtime.lastError will be set.
    * @since Chrome 44.
    */
  inline def getVolumeList(callback: js.Function1[/* volumes */ js.Array[Volume], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getVolumeList")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Get a writable Entry from another Entry. This call will fail with a runtime error if the application does not have the 'write' permission under 'fileSystem'.
    * If entry is a DirectoryEntry, this call will fail if the application does not have the 'directory' permission under 'fileSystem'.
    */
  inline def getWritableEntry(entry: FileEntry, callback: js.Function1[/* entry */ FileEntry, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getWritableEntry")(entry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getWritableEntry(
    entry: FileSystemDirectoryEntry,
    callback: js.Function1[/* entry */ FileSystemDirectoryEntry, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getWritableEntry")(entry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns whether the app has permission to restore the entry with the given id.
    * @since Chrome 29.
    **/
  inline def isRestorable(id: String, callback: js.Function1[/* isRestorable */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isRestorable")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isWritableEntry(entry: DirectoryEntry, callback: js.Function1[/* isWritable */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isWritableEntry")(entry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /** Gets whether this Entry is writable or not. */
  inline def isWritableEntry(entry: FileEntry, callback: js.Function1[/* isWritable */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isWritableEntry")(entry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Called when a list of available volumes is changed.
    * @since Chrome 44.
    */
  @JSGlobal("chrome.fileSystem.onVolumeListChanged")
  @js.native
  val onVolumeListChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* object */ js.Array[Volume], Unit]] = js.native
  
  /**
    * @requires(Kiosk) Kiosk mode only
    * @requires Permissions: The writable option requires the 'fileSystem': {'write'} permission in the manifest.
    * Requests access to a file system for a volume represented by options.volumeId.
    * If options.writable is set to true, then the file system will be writable.
    * Otherwise, it will be read-only.
    * For manual-launch kiosk mode, a confirmation dialog will be shown on top of the active app window.
    * In case of an error, fileSystem will be undefined, and chrome.runtime.lastError will be set.
    * @since Chrome 44.
    */
  inline def requestFileSystem(options: Volume, callback: js.Function1[/* fileSystem */ FileSystem, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestFileSystem")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Returns the file entry with the given id if it can be restored. This call will fail with a runtime error otherwise. */
  inline def restoreEntry(id: String, callback: js.Function1[/* entry */ FileEntry, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restoreEntry")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def retainEntry(entry: DirectoryEntry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("retainEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * Returns an id that can be passed to restoreEntry to regain access to a given file entry.
    * Only the 500 most recently used entries are retained, where calls to retainEntry and restoreEntry count as use.
    * If the app has the 'retainEntries' permission under 'fileSystem', entries are retained indefinitely.
    * Otherwise, entries are retained only while the app is running and across restarts.
    * @since Chrome 29.
    * */
  inline def retainEntry(entry: FileEntry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("retainEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[String]
}
