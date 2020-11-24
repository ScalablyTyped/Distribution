package typings.chromeApps.global.chrome.fileSystemProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.anon.ABORT
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.fileSystemProvider.Action
import typings.chromeApps.chrome.fileSystemProvider.GetActionsRequestedEventOptions
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object onGetActionsRequested
  extends TopLevel[
      Event[
        js.Function3[
          /* options */ GetActionsRequestedEventOptions, 
          /* successCallback */ js.Function1[/* actions */ js.Array[Action], Unit], 
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
