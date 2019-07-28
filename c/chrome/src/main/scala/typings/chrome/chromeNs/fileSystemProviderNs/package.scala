package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileSystemProviderNs {
  type DirectoryPathRecursiveRequestedEvent = Event[
    js.Function3[
      /* options */ DirectoryPathRecursiveRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type DirectoryPathRequestedEvent = Event[
    js.Function3[
      /* options */ DirectoryPathRequestedEventOptions, 
      /* successCallback */ js.Function2[/* entries */ js.Array[EntryMetadata], /* hasMore */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type EntryPathRecursiveRequestedEvent = Event[
    js.Function3[
      /* options */ EntryPathRecursiveRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type FilePathLengthRequestedEvent = Event[
    js.Function3[
      /* options */ FilePathLengthRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type FilePathRequestedEvent = Event[
    js.Function3[
      /* options */ FilePathRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type MetadataRequestedEvent = Event[
    js.Function3[
      /* options */ MetadataRequestedEventOptions, 
      /* successCallback */ js.Function1[/* metadata */ EntryMetadata, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type OpenFileRequestedEvent = Event[
    js.Function3[
      /* options */ OpenFileRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type OpenedFileIoRequestedEvent = Event[
    js.Function3[
      /* options */ OpenedFileIoRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type OpenedFileOffsetRequestedEvent = Event[
    js.Function3[
      /* options */ OpenedFileOffsetRequestedEventOptions, 
      /* successCallback */ js.Function2[/* data */ ArrayBuffer, /* hasMore */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type OpenedFileRequestedEvent = Event[
    js.Function3[
      /* options */ OpenedFileRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type OperationRequestedEvent = Event[
    js.Function3[
      /* options */ OperationRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type OptionlessRequestedEvent = Event[
    js.Function2[
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type RequestedEvent = Event[
    js.Function3[
      /* options */ RequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
  type SourceTargetPathRequestedEvent = Event[
    js.Function3[
      /* options */ SourceTargetPathRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ]
}
