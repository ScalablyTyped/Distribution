package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.fileSystemProvider.AbortRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.Action
import typings.chromeApps.chrome.fileSystemProvider.CloseFileRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.ConfigureRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.CopyEntryRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.CreateDirectoryRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.CreateFileRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.DeleteEntryRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.EntryMetadata
import typings.chromeApps.chrome.fileSystemProvider.ExecuteActionRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.FileSystemInfo
import typings.chromeApps.chrome.fileSystemProvider.GetActionsRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.MetadataRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.MountOptions
import typings.chromeApps.chrome.fileSystemProvider.MoveEntryRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.NotificationOptions
import typings.chromeApps.chrome.fileSystemProvider.OpenFileRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.ReadDirectoryRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.ReadFileRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.TruncateRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.UnmountOptions
import typings.chromeApps.chrome.fileSystemProvider.UnmountRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.WatcherRequestedEventOptions
import typings.chromeApps.chrome.fileSystemProvider.WriteFileRequestedEventOptions
import typings.chromeApps.chromeAppsStrings.ABORT
import typings.chromeApps.chromeAppsStrings.ACCESS_DENIED
import typings.chromeApps.chromeAppsStrings.CHANGED
import typings.chromeApps.chromeAppsStrings.DELETED
import typings.chromeApps.chromeAppsStrings.EXISTS
import typings.chromeApps.chromeAppsStrings.FAILED
import typings.chromeApps.chromeAppsStrings.INVALID_OPERATION
import typings.chromeApps.chromeAppsStrings.INVALID_URL
import typings.chromeApps.chromeAppsStrings.IN_USE
import typings.chromeApps.chromeAppsStrings.IO
import typings.chromeApps.chromeAppsStrings.NOT_A_DIRECTORY
import typings.chromeApps.chromeAppsStrings.NOT_A_FILE
import typings.chromeApps.chromeAppsStrings.NOT_EMPTY
import typings.chromeApps.chromeAppsStrings.NOT_FOUND
import typings.chromeApps.chromeAppsStrings.NO_MEMORY
import typings.chromeApps.chromeAppsStrings.NO_SPACE
import typings.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY
import typings.chromeApps.chromeAppsStrings.OK
import typings.chromeApps.chromeAppsStrings.READ
import typings.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE
import typings.chromeApps.chromeAppsStrings.SECURITY
import typings.chromeApps.chromeAppsStrings.SHARE
import typings.chromeApps.chromeAppsStrings.TOO_MANY_OPENED
import typings.chromeApps.chromeAppsStrings.WRITE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.fileSystemProvider
//////////////////////////
// File System Provider //
//////////////////////////
/**
  * Use the chrome.fileSystemProvider API to create file systems,
  * that can be accessible from the file manager on Chrome OS.
  * @since Chrome 40.
  * @requires Permissions: 'fileSystemProvider'
  * @requires This API works only on Chrome OS.
  * @requires Manifest:
  * Requires an section in addition to the permission.
  * The file_system_provider section must be declared as follows:
  * **configurable (boolean)** - optional
  * Whether configuring via onConfigureRequested is supported. By default: false.
  * **multiple_mounts (boolean)** - optional
  * Whether multiple (more than one) mounted file systems are supported. By default: false.
  * **watchable (boolean)** - optional
  * Whether setting watchers and notifying about changes is supported. By default: false.
  * **source (type of 'file', 'device', or 'network') - required**
  * Source of data for mounted file systems.
  * @description
  * Files app uses above information in order to render related UI elements approprietly.
  * For example, if configurable is set to true, then a menu item for configuring volumes
  * will be rendered. Similarly, if multiple_mounts is set to true, then Files app will
  * allow to add more than one mount points from the UI. If watchable is false, then a
  * refresh button will be rendered. Note, that if possible you should add support for
  * watchers, so changes on the file system can be reflected immediately and automatically.
  * @see https://developer.chrome.com/apps/fileSystemProvider
  */
object fileSystemProvider {
  
  @JSGlobal("chrome.fileSystemProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /** Type of a change detected on the observed directory. */
  object ChangeType {
    
    @JSGlobal("chrome.fileSystemProvider.ChangeType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.fileSystemProvider.ChangeType.CHANGED")
    @js.native
    def CHANGED: typings.chromeApps.chromeAppsStrings.CHANGED = js.native
    inline def CHANGED_=(x: CHANGED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ChangeType.DELETED")
    @js.native
    def DELETED: typings.chromeApps.chromeAppsStrings.DELETED = js.native
    inline def DELETED_=(x: DELETED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETED")(x.asInstanceOf[js.Any])
  }
  
  /**
    * List of common actions. 'SHARE' is for sharing files with others.
    * 'SAVE_FOR_OFFLINE' for pinning (saving for offline access).
    * 'OFFLINE_NOT_NECESSARY' for notifying that the file doesn't
    * need to be stored for offline access anymore.
    * Used by onGetActionsRequested and onExecuteActionRequested.
    */
  object CommonActionId {
    
    @JSGlobal("chrome.fileSystemProvider.CommonActionId")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.fileSystemProvider.CommonActionId.OFFLINE_NOT_NECESSARY")
    @js.native
    def OFFLINE_NOT_NECESSARY: typings.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY = js.native
    inline def OFFLINE_NOT_NECESSARY_=(x: OFFLINE_NOT_NECESSARY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFLINE_NOT_NECESSARY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.CommonActionId.SAVE_FOR_OFFLINE")
    @js.native
    def SAVE_FOR_OFFLINE: typings.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE = js.native
    inline def SAVE_FOR_OFFLINE_=(x: SAVE_FOR_OFFLINE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAVE_FOR_OFFLINE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.CommonActionId.SHARE")
    @js.native
    def SHARE: typings.chromeApps.chromeAppsStrings.SHARE = js.native
    inline def SHARE_=(x: SHARE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHARE")(x.asInstanceOf[js.Any])
  }
  
  /** Mode of opening a file. Used by onOpenFileRequested. */
  object OpenFileMode {
    
    @JSGlobal("chrome.fileSystemProvider.OpenFileMode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.fileSystemProvider.OpenFileMode.READ")
    @js.native
    def READ: typings.chromeApps.chromeAppsStrings.READ = js.native
    inline def READ_=(x: READ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READ")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.OpenFileMode.WRITE")
    @js.native
    def WRITE: typings.chromeApps.chromeAppsStrings.WRITE = js.native
    inline def WRITE_=(x: WRITE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WRITE")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Error codes used by providing extensions in response to requests
    * as well as in case of errors when calling methods of the API.
    * For success, 'OK' must be used.
    * */
  object ProviderError {
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.ABORT")
    @js.native
    def ABORT: typings.chromeApps.chromeAppsStrings.ABORT = js.native
    inline def ABORT_=(x: ABORT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABORT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.ACCESS_DENIED")
    @js.native
    def ACCESS_DENIED: typings.chromeApps.chromeAppsStrings.ACCESS_DENIED = js.native
    inline def ACCESS_DENIED_=(x: ACCESS_DENIED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCESS_DENIED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.EXISTS")
    @js.native
    def EXISTS: typings.chromeApps.chromeAppsStrings.EXISTS = js.native
    inline def EXISTS_=(x: EXISTS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXISTS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.FAILED")
    @js.native
    def FAILED: typings.chromeApps.chromeAppsStrings.FAILED = js.native
    inline def FAILED_=(x: FAILED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.INVALID_OPERATION")
    @js.native
    def INVALID_OPERATION: typings.chromeApps.chromeAppsStrings.INVALID_OPERATION = js.native
    inline def INVALID_OPERATION_=(x: INVALID_OPERATION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_OPERATION")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.INVALID_URL")
    @js.native
    def INVALID_URL: typings.chromeApps.chromeAppsStrings.INVALID_URL = js.native
    inline def INVALID_URL_=(x: INVALID_URL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_URL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.IN_USE")
    @js.native
    def IN_USE: typings.chromeApps.chromeAppsStrings.IN_USE = js.native
    inline def IN_USE_=(x: IN_USE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IN_USE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.IO")
    @js.native
    def IO: typings.chromeApps.chromeAppsStrings.IO = js.native
    inline def IO_=(x: IO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IO")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.NOT_A_DIRECTORY")
    @js.native
    def NOT_A_DIRECTORY: typings.chromeApps.chromeAppsStrings.NOT_A_DIRECTORY = js.native
    inline def NOT_A_DIRECTORY_=(x: NOT_A_DIRECTORY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_A_DIRECTORY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.NOT_A_FILE")
    @js.native
    def NOT_A_FILE: typings.chromeApps.chromeAppsStrings.NOT_A_FILE = js.native
    inline def NOT_A_FILE_=(x: NOT_A_FILE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_A_FILE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.NOT_EMPTY")
    @js.native
    def NOT_EMPTY: typings.chromeApps.chromeAppsStrings.NOT_EMPTY = js.native
    inline def NOT_EMPTY_=(x: NOT_EMPTY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_EMPTY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.NOT_FOUND")
    @js.native
    def NOT_FOUND: typings.chromeApps.chromeAppsStrings.NOT_FOUND = js.native
    inline def NOT_FOUND_=(x: NOT_FOUND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.NO_MEMORY")
    @js.native
    def NO_MEMORY: typings.chromeApps.chromeAppsStrings.NO_MEMORY = js.native
    inline def NO_MEMORY_=(x: NO_MEMORY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_MEMORY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.NO_SPACE")
    @js.native
    def NO_SPACE: typings.chromeApps.chromeAppsStrings.NO_SPACE = js.native
    inline def NO_SPACE_=(x: NO_SPACE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_SPACE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.OK")
    @js.native
    def OK: typings.chromeApps.chromeAppsStrings.OK = js.native
    inline def OK_=(x: OK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OK")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.SECURITY")
    @js.native
    def SECURITY: typings.chromeApps.chromeAppsStrings.SECURITY = js.native
    inline def SECURITY_=(x: SECURITY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECURITY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.fileSystemProvider.ProviderError.TOO_MANY_OPENED")
    @js.native
    def TOO_MANY_OPENED: typings.chromeApps.chromeAppsStrings.TOO_MANY_OPENED = js.native
    inline def TOO_MANY_OPENED_=(x: TOO_MANY_OPENED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOO_MANY_OPENED")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Returns information about a file system with the passed fileSystemId.
    * @since Chrome 42.
    * @param callback Callback to receive the result of get function.
    */
  inline def get(fileSystemId: String, callback: js.Function1[/* fileSystem */ FileSystemInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(fileSystemId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns all file systems mounted by the app.
    * @param callback Callback to receive the result of getAll function.
    */
  inline def getAll(callback: js.Function1[/* fileSystems */ js.Array[FileSystemInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  ///\/\/|\/\/\\\
  /// METHODS \\\
  ///\/\/|\/\/\\\
  /**
    * Mounts a file system with the given fileSystemId and displayName.
    * displayName will be shown in the left panel of the Files app.
    * displayName can contain any characters including '/', but cannot be an empty string.
    * displayName must be descriptive but doesn't have to be unique.
    * The fileSystemId must not be an empty string.
    *
    * Depending on the type of the file system being mounted, the source option must be set appropriately.
    *
    * In case of an error, runtime.lastError will be set with a corresponding error code.
    *
    * @param callback A generic result callback to indicate success or failure.
    */
  inline def mount(options: MountOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mount(options: MountOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @requires Manifest: 'file_system_provider.notify' = true
    * @description
    * Notifies about changes in the watched directory at observedPath in recursive mode.
    * If the file system is mounted with supportsNofityTag, then tag must be provided,
    * and all changes since the last notification always reported, even if the system was shutdown.
    * The last tag can be obtained with getAll.
    *
    * Value of tag can be any string which is unique per call,
    * so it's possible to identify the last registered notification.
    * Eg. if the providing app starts after a reboot,
    * and the last registered notification's tag is equal to '123',
    * then it should call notify for all changes which happened since
    * the change tagged as '123'. It cannot be an empty string.
    *
    * Not all providers are able to provide a tag, but if the file system has a changelog,
    * then the tag can be eg. a change number, or a revision number.
    *
    * Note that if a parent directory is removed, then all descendant entries are also removed,
    * and if they are watched, then the API must be notified about the fact.
    * Also, if a directory is renamed, then all descendant entries are in fact removed,
    * as there is no entry under their original paths anymore.
    *
    * In case of an error, runtime.lastError will be set will a corresponding error code.
    *
    * @param callback A generic result callback to indicate success or failure.
    * @since Chrome 45.
    */
  inline def notify_(options: NotificationOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Raised when aborting an operation with operationRequestId is requested.
    * The operation executed with operationRequestId must be immediately stopped
    * and successCallback of this abort request executed. If aborting fails,
    * then errorCallback must be called. Note, that callbacks of the aborted
    * operation must not be called, as they will be ignored. Despite calling
    * errorCallback, the request may be forcibly aborted.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onAbortRequested")
  @js.native
  val onAbortRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ AbortRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when setting a new directory watcher is requested.
    * If an error occurs, then errorCallback must be called.
    * @see ProviderError
    * @since Chrome 45.
    */
  @JSGlobal("chrome.fileSystemProvider.onAddWatcherRequested")
  @js.native
  val onAddWatcherRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ WatcherRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when opening a file previously opened
    * with openRequestId is requested to be closed.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onCloseFileRequested")
  @js.native
  val onCloseFileRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ CloseFileRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when showing a configuration dialog for fileSystemId is requested.
    * If it's handled, the *file_system_provider.configurable* manfiest option must be set to true.
    * @requires Manifest: 'file_system_provider.configurable' = true
    * @see ProviderError
    * @since Chrome 44.
    */
  @JSGlobal("chrome.fileSystemProvider.onConfigureRequested")
  @js.native
  val onConfigureRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ ConfigureRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when copying an entry (recursively if a directory) is requested.
    * If an error occurs, then errorCallback must be called.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onCopyEntryRequested")
  @js.native
  val onCopyEntryRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ CopyEntryRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when creating a directory is requested.
    * The operation must fail with the EXISTS error if the target directory already exists.
    * If recursive is true, then all of the missing directories on the directory path must be created.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onCreateDirectoryRequested")
  @js.native
  val onCreateDirectoryRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ CreateDirectoryRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when creating a file is requested.
    * If the file already exists, then errorCallback must be called with the 'EXISTS' error code.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onCreateFileRequested")
  @js.native
  val onCreateFileRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ CreateFileRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when deleting an entry is requested.
    * If recursive is true, and the entry is a directory,
    * then all of the entries inside must be recursively deleted as well.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onDeleteEntryRequested")
  @js.native
  val onDeleteEntryRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ DeleteEntryRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when executing an action for a set of files or directories is requested.
    * After the action is completed, successCallback must be called.
    * On error, errorCallback must be called.
    * @see ProviderError
    * @since Chrome 48.
    */
  @JSGlobal("chrome.fileSystemProvider.onExecuteActionRequested")
  @js.native
  val onExecuteActionRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ ExecuteActionRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when a list of actions for a set of files or directories at entryPaths is requested.
    * All of the returned actions must be applicable to each entry.
    * If there are no such actions, an empty array should be returned.
    * The actions must be returned with the successCallback call.
    * In case of an error, errorCallback must be called.
    * @see ProviderError
    * @since Chrome 48.
    **/
  @JSGlobal("chrome.fileSystemProvider.onGetActionsRequested")
  @js.native
  val onGetActionsRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ GetActionsRequestedEventOptions, 
      /* successCallback */ js.Function1[/* actions */ js.Array[Action], Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when metadata of a file or a directory at entryPath is requested.
    * The metadata must be returned with the successCallback call.
    * In case of an error, errorCallback must be called.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onGetMetadataRequested")
  @js.native
  val onGetMetadataRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ MetadataRequestedEventOptions, 
      /* successCallback */ js.Function1[/* metadata */ EntryMetadata, Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when showing a dialog for mounting a new file system is requested.
    * If the app is a file handler, then this event shouldn't be handled.
    * Instead app.runtime.onLaunched should be handled in order to mount new file systems when a file is opened.
    * @requires Manifest (for multiple mounts): 'file_system_provider.multiple_mounts' = true
    * @see ProviderError
    * @since Chrome 44.
    */
  @JSGlobal("chrome.fileSystemProvider.onMountRequested")
  @js.native
  val onMountRequested: typings.chromeApps.chrome.events.Event[
    js.Function2[
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when moving an entry (recursively if a directory) is requested.
    * If an error occurs, then errorCallback must be called.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onMoveEntryRequested")
  @js.native
  val onMoveEntryRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ MoveEntryRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when opening a file at filePath is requested.
    * If the file does not exist, then the operation must fail.
    * Maximum number of files opened at once can be specified with MountOptions.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onOpenFileRequested")
  @js.native
  val onOpenFileRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ OpenFileRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when contents of a directory at directoryPath are requested.
    * The results must be returned in chunks by calling the successCallback several times.
    * In case of an error, errorCallback must be called.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onReadDirectoryRequested")
  @js.native
  val onReadDirectoryRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ ReadDirectoryRequestedEventOptions, 
      /* successCallback */ js.Function2[/* entries */ js.Array[EntryMetadata], /* hasMore */ Boolean, Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when reading contents of a file opened previously with openRequestId is requested.
    * The results must be returned in chunks by calling successCallback several times.
    * In case of an error, errorCallback must be called.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onReadFileRequested")
  @js.native
  val onReadFileRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ ReadFileRequestedEventOptions, 
      /* successCallback */ js.Function2[/* data */ js.typedarray.ArrayBuffer, /* hasMore */ Boolean, Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when the watcher should be removed.
    * If an error occurs, then errorCallback must be called.
    * @see ProviderError
    * @since Chrome 45.
    */
  @JSGlobal("chrome.fileSystemProvider.onRemoveWatcherRequested")
  @js.native
  val onRemoveWatcherRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ WatcherRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when truncating a file to a desired length is requested.
    * If an error occurs, then errorCallback must be called.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onTruncateRequested")
  @js.native
  val onTruncateRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ TruncateRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  ///\/\/\/\/\\\
  /// EVENTS \\\
  ///\/\/\/\/\\\
  /**
    * Raised when unmounting for the file system with the fileSystemId identifier is requested.
    * In the response, the unmount API method must be called together with successCallback.
    * If unmounting is not possible (eg. due to a pending operation), then errorCallback must be called.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onUnmountRequested")
  @js.native
  val onUnmountRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ UnmountRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Raised when writing contents to a file opened previously with openRequestId is requested.
    * @see ProviderError
    */
  @JSGlobal("chrome.fileSystemProvider.onWriteFileRequested")
  @js.native
  val onWriteFileRequested: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* options */ WriteFileRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          typings.chromeApps.anon.ABORT, 
          /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} extends keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'} ? std.Exclude<keyof {  OK :'OK',   FAILED :'FAILED',   IN_USE :'IN_USE',   EXISTS :'EXISTS',   NOT_FOUND :'NOT_FOUND',   ACCESS_DENIED :'ACCESS_DENIED',   TOO_MANY_OPENED :'TOO_MANY_OPENED',   NO_MEMORY :'NO_MEMORY',   NO_SPACE :'NO_SPACE',   NOT_A_DIRECTORY :'NOT_A_DIRECTORY',   INVALID_OPERATION :'INVALID_OPERATION',   SECURITY :'SECURITY',   ABORT :'ABORT',   NOT_A_FILE :'NOT_A_FILE',   NOT_EMPTY :'NOT_EMPTY',   INVALID_URL :'INVALID_URL',   IO :'IO'}, 'INVALID_URL' | 'IN_USE' | 'OK' | 'ABORT' | 'SECURITY' | 'NOT_A_DIRECTORY' | 'NOT_A_FILE' | 'INVALID_OPERATION' | 'TOO_MANY_OPENED' | 'NO_MEMORY' | 'ACCESS_DENIED' | 'NOT_FOUND' | 'FAILED' | 'NO_SPACE' | 'EXISTS' | 'NOT_EMPTY' | 'IO'> : never */ js.Any
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Unmounts a file system with the given fileSystemId.
    * It must be called after onUnmountRequested is invoked.
    * Also, the providing extension can decide to perform unmounting if not requested
    * (eg. in case of lost connection, or a file error).
    *
    * In case of an error, runtime.lastError will be set with a corresponding error code.
    *
    * @param callback A generic result callback to indicate success or failure.
    */
  inline def unmount(options: UnmountOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unmount(options: UnmountOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
