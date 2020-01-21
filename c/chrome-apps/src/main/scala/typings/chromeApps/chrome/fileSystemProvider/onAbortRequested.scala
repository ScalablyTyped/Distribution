package typings.chromeApps.chrome.fileSystemProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.AnonABORT
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chromeAppsStrings.ABORT
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
object onAbortRequested
  extends TopLevel[
      Event[
        js.Function3[
          /* options */ AbortRequestedEventOptions, 
          /* successCallback */ js.Function0[Unit], 
          /* errorCallback */ js.Function1[
            /* error */ ToStringLiteral[
              AnonABORT, 
              String, 
              Exclude[
                String, 
                INVALID_URL | IN_USE | OK | ABORT | SECURITY | NOT_A_DIRECTORY | NOT_A_FILE | INVALID_OPERATION | TOO_MANY_OPENED | NO_MEMORY | ACCESS_DENIED | NOT_FOUND | FAILED | NO_SPACE | EXISTS | NOT_EMPTY | IO
              ]
            ], 
            Unit
          ], 
          Unit
        ]
      ]
    ]

