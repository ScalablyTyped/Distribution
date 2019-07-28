package typings.chromeDashApps.chromeNs.fileSystemProviderNs

import typings.chromeDashApps.Anon_ABORT
import typings.chromeDashApps.chromeDashAppsStrings.ABORT
import typings.chromeDashApps.chromeDashAppsStrings.ACCESS_DENIED
import typings.chromeDashApps.chromeDashAppsStrings.EXISTS
import typings.chromeDashApps.chromeDashAppsStrings.FAILED
import typings.chromeDashApps.chromeDashAppsStrings.INVALID_OPERATION
import typings.chromeDashApps.chromeDashAppsStrings.INVALID_URL
import typings.chromeDashApps.chromeDashAppsStrings.IN_USE
import typings.chromeDashApps.chromeDashAppsStrings.IO
import typings.chromeDashApps.chromeDashAppsStrings.NOT_A_DIRECTORY
import typings.chromeDashApps.chromeDashAppsStrings.NOT_A_FILE
import typings.chromeDashApps.chromeDashAppsStrings.NOT_EMPTY
import typings.chromeDashApps.chromeDashAppsStrings.NOT_FOUND
import typings.chromeDashApps.chromeDashAppsStrings.NO_MEMORY
import typings.chromeDashApps.chromeDashAppsStrings.NO_SPACE
import typings.chromeDashApps.chromeDashAppsStrings.OK
import typings.chromeDashApps.chromeDashAppsStrings.SECURITY
import typings.chromeDashApps.chromeDashAppsStrings.TOO_MANY_OPENED
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.std.ArrayBuffer
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystemProvider")
@js.native
object ^ extends js.Object {
  /**
    * Raised when aborting an operation with operationRequestId is requested.
    * The operation executed with operationRequestId must be immediately stopped
    * and successCallback of this abort request executed. If aborting fails,
    * then errorCallback must be called. Note, that callbacks of the aborted
    * operation must not be called, as they will be ignored. Despite calling
    * errorCallback, the request may be forcibly aborted.
    * @see ProviderError
    */
  val onAbortRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ AbortRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onAddWatcherRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ WatcherRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onCloseFileRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ CloseFileRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onConfigureRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ ConfigureRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onCopyEntryRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ CopyEntryRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onCreateDirectoryRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ CreateDirectoryRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onCreateFileRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ CreateFileRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onDeleteEntryRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ DeleteEntryRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onExecuteActionRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ ExecuteActionRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onGetActionsRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ GetActionsRequestedEventOptions, 
      /* successCallback */ js.Function1[/* actions */ js.Array[Action], Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onGetMetadataRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ MetadataRequestedEventOptions, 
      /* successCallback */ js.Function1[/* metadata */ EntryMetadata, Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onMountRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function2[
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onMoveEntryRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ MoveEntryRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onOpenFileRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ OpenFileRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onReadDirectoryRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ ReadDirectoryRequestedEventOptions, 
      /* successCallback */ js.Function2[/* entries */ js.Array[EntryMetadata], /* hasMore */ Boolean, Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onReadFileRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ ReadFileRequestedEventOptions, 
      /* successCallback */ js.Function2[/* data */ ArrayBuffer, /* hasMore */ Boolean, Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onRemoveWatcherRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ WatcherRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onTruncateRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ TruncateRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onUnmountRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ UnmountRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
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
  val onWriteFileRequested: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ WriteFileRequestedEventOptions, 
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[
        /* error */ ToStringLiteral[
          Anon_ABORT, 
          String, 
          Exclude[
            String, 
            IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
          ]
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  /**
    * Returns information about a file system with the passed fileSystemId.
    * @since Chrome 42.
    * @param callback Callback to receive the result of get function.
    */
  def get(fileSystemId: String, callback: js.Function1[/* fileSystem */ FileSystemInfo, Unit]): Unit = js.native
  /**
    * Returns all file systems mounted by the app.
    * @param callback Callback to receive the result of getAll function.
    */
  def getAll(callback: js.Function1[/* fileSystems */ js.Array[FileSystemInfo], Unit]): Unit = js.native
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
  def mount(options: MountOptions): Unit = js.native
  def mount(options: MountOptions, callback: js.Function0[Unit]): Unit = js.native
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
  def notify(options: NotificationOptions, callback: js.Function0[Unit]): Unit = js.native
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
  def unmount(options: UnmountOptions): Unit = js.native
  def unmount(options: UnmountOptions, callback: js.Function0[Unit]): Unit = js.native
}

