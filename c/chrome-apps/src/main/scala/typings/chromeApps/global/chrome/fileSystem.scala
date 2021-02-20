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
import typings.filesystem.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  /** @enum */
  object ChildChangeType {
    
    @JSGlobal("chrome.fileSystem.ChildChangeType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.fileSystem.ChildChangeType.CHANGED")
    @js.native
    def CHANGED: changed_ = js.native
    @scala.inline
    def CHANGED_=(x: changed_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystem.ChildChangeType.CREATED")
    @js.native
    def CREATED: created = js.native
    @scala.inline
    def CREATED_=(x: created): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystem.ChildChangeType.REMOVED")
    @js.native
    def REMOVED: removed = js.native
    @scala.inline
    def REMOVED_=(x: removed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVED")(x.asInstanceOf[js.Any])
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
    @scala.inline
    def OPEN_DIRECTORY_=(x: openDirectory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_DIRECTORY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystem.ChooseEntryType.OPEN_FILE")
    @js.native
    def OPEN_FILE: openFile = js.native
    @scala.inline
    def OPEN_FILE_=(x: openFile): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_FILE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystem.ChooseEntryType.OPEN_WRITABLE_FILE")
    @js.native
    def OPEN_WRITABLE_FILE: openWritableFile = js.native
    @scala.inline
    def OPEN_WRITABLE_FILE_=(x: openWritableFile): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_WRITABLE_FILE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystem.ChooseEntryType.SAVE_FILE")
    @js.native
    def SAVE_FILE: saveFile = js.native
    @scala.inline
    def SAVE_FILE_=(x: saveFile): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAVE_FILE")(x.asInstanceOf[js.Any])
  }
  
  /** Ask the user to choose a file or directory. */
  @JSGlobal("chrome.fileSystem.chooseEntry")
  @js.native
  def chooseEntry(
    callback: FileEntryCallback[ChooseFileEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = js.native
  @JSGlobal("chrome.fileSystem.chooseEntry")
  @js.native
  def chooseEntry(
    options: ChooseDirectoryEntryOptions,
    callback: FileEntryCallback[ChooseDirectoryEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = js.native
  /** Ask the user to choose a file or directory. */
  @JSGlobal("chrome.fileSystem.chooseEntry")
  @js.native
  def chooseEntry(
    options: ChooseEntryOptionsBase,
    callback: FileEntryCallback[ChooseEntryOptionsBase, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = js.native
  @JSGlobal("chrome.fileSystem.chooseEntry")
  @js.native
  def chooseEntry(
    options: ChooseFileEntryOptions,
    callback: FileEntryCallback[ChooseFileEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = js.native
  @JSGlobal("chrome.fileSystem.chooseEntry")
  @js.native
  def chooseEntry(
    options: ChooseMultipleFilesEntryOptions,
    callback: FileEntryCallback[ChooseMultipleFilesEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = js.native
  @JSGlobal("chrome.fileSystem.chooseEntry")
  @js.native
  def chooseEntry(
    options: ChooseSaveFileEntryOptions,
    callback: FileEntryCallback[ChooseSaveFileEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = js.native
  
  @JSGlobal("chrome.fileSystem.getDisplayPath")
  @js.native
  def getDisplayPath(entry: DirectoryEntry, callback: js.Function1[/* displayPath */ String, Unit]): Unit = js.native
  /**
    * Get the display path of an Entry object.
    * The display path is based on the full path of the file or directory on the local file system, but may be made more readable for display purposes.
    */
  @JSGlobal("chrome.fileSystem.getDisplayPath")
  @js.native
  def getDisplayPath(entry: FileEntry, callback: js.Function1[/* displayPath */ String, Unit]): Unit = js.native
  
  /**
    * @requires(Kiosk) Chrome OS Kiosk mode only
    * @requires Permissions: The 'fileSystem': {'requestFileSystem'} manifest permission is required.
    * Returns a list of volumes available for requestFileSystem().
    * Available to kiosk apps running in the kiosk session only.
    * In case of an error, volumes will be undefined, and chrome.runtime.lastError will be set.
    * @since Chrome 44.
    */
  @JSGlobal("chrome.fileSystem.getVolumeList")
  @js.native
  def getVolumeList(callback: js.Function1[/* volumes */ js.Array[Volume], Unit]): Unit = js.native
  
  @JSGlobal("chrome.fileSystem.getWritableEntry")
  @js.native
  def getWritableEntry(entry: DirectoryEntry, callback: js.Function1[/* entry */ DirectoryEntry, Unit]): Unit = js.native
  /**
    * Get a writable Entry from another Entry. This call will fail with a runtime error if the application does not have the 'write' permission under 'fileSystem'.
    * If entry is a DirectoryEntry, this call will fail if the application does not have the 'directory' permission under 'fileSystem'.
    */
  @JSGlobal("chrome.fileSystem.getWritableEntry")
  @js.native
  def getWritableEntry(entry: FileEntry, callback: js.Function1[/* entry */ FileEntry, Unit]): Unit = js.native
  
  /**
    * Returns whether the app has permission to restore the entry with the given id.
    * @since Chrome 29.
    **/
  @JSGlobal("chrome.fileSystem.isRestorable")
  @js.native
  def isRestorable(id: String, callback: js.Function1[/* isRestorable */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("chrome.fileSystem.isWritableEntry")
  @js.native
  def isWritableEntry(entry: DirectoryEntry, callback: js.Function1[/* isWritable */ Boolean, Unit]): Unit = js.native
  /** Gets whether this Entry is writable or not. */
  @JSGlobal("chrome.fileSystem.isWritableEntry")
  @js.native
  def isWritableEntry(entry: FileEntry, callback: js.Function1[/* isWritable */ Boolean, Unit]): Unit = js.native
  
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
  @JSGlobal("chrome.fileSystem.requestFileSystem")
  @js.native
  def requestFileSystem(options: Volume, callback: js.Function1[/* fileSystem */ FileSystem, Unit]): Unit = js.native
  
  /** Returns the file entry with the given id if it can be restored. This call will fail with a runtime error otherwise. */
  @JSGlobal("chrome.fileSystem.restoreEntry")
  @js.native
  def restoreEntry(id: String, callback: js.Function1[/* entry */ FileEntry, Unit]): Unit = js.native
  
  @JSGlobal("chrome.fileSystem.retainEntry")
  @js.native
  def retainEntry(entry: DirectoryEntry): String = js.native
  /**
    * Returns an id that can be passed to restoreEntry to regain access to a given file entry.
    * Only the 500 most recently used entries are retained, where calls to retainEntry and restoreEntry count as use.
    * If the app has the 'retainEntries' permission under 'fileSystem', entries are retained indefinitely.
    * Otherwise, entries are retained only while the app is running and across restarts.
    * @since Chrome 29.
    * */
  @JSGlobal("chrome.fileSystem.retainEntry")
  @js.native
  def retainEntry(entry: FileEntry): String = js.native
}
