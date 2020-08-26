package typings.chromeApps.global.chrome.fileSystemProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.anon.ABORT
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chromeAppsStrings.ACCESS_DENIED
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
import typings.chromeApps.chromeAppsStrings.OK
import typings.chromeApps.chromeAppsStrings.SECURITY
import typings.chromeApps.chromeAppsStrings.TOO_MANY_OPENED
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
object onMountRequested
  extends TopLevel[
      Event[
        js.Function2[
          /* successCallback */ js.Function0[Unit], 
          /* errorCallback */ js.Function1[
            /* error */ ToStringLiteral[
              ABORT, 
              /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | typings.chromeApps.chromeAppsStrings.ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
              Exclude[
                /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | typings.chromeApps.chromeAppsStrings.ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
                INVALID_URL | IN_USE | OK | typings.chromeApps.chromeAppsStrings.ABORT | SECURITY | NOT_A_DIRECTORY | NOT_A_FILE | INVALID_OPERATION | TOO_MANY_OPENED | NO_MEMORY | ACCESS_DENIED | NOT_FOUND | FAILED | NO_SPACE | EXISTS | NOT_EMPTY | IO
              ]
            ], 
            Unit
          ], 
          Unit
        ]
      ]
    ]

