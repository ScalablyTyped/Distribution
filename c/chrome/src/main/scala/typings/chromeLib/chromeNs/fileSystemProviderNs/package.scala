package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileSystemProviderNs {
  type DirectoryPathRecursiveRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ DirectoryPathRecursiveRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type DirectoryPathRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ DirectoryPathRequestedEventOptions, 
      /* successCallback */ js.Function2[/* entries */ js.Array[EntryMetadata], /* hasMore */ scala.Boolean, scala.Unit], 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type EntryPathRecursiveRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ EntryPathRecursiveRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type FilePathLengthRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ FilePathLengthRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type FilePathRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ FilePathRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type MetadataRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ MetadataRequestedEventOptions, 
      /* successCallback */ js.Function1[/* metadata */ EntryMetadata, scala.Unit], 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OpenFileRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ OpenFileRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OpenedFileIoRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ OpenedFileIoRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OpenedFileOffsetRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ OpenedFileOffsetRequestedEventOptions, 
      /* successCallback */ js.Function2[/* data */ stdLib.ArrayBuffer, /* hasMore */ scala.Boolean, scala.Unit], 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OpenedFileRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ OpenedFileRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OperationRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ OperationRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OptionlessRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type RequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ RequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type SourceTargetPathRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* options */ SourceTargetPathRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
}
