package typings.chromeDashApps.chrome.fileSystemProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.Anon_ABORT
import typings.chromeDashApps.chrome.ToStringLiteral
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
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Raised when the watcher should be removed.
  * If an error occurs, then errorCallback must be called.
  * @see ProviderError
  * @since Chrome 45.
  */
@JSGlobal("chrome.fileSystemProvider.onRemoveWatcherRequested")
@js.native
object onRemoveWatcherRequested
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[
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
      ]
    ]

