package typings.chrome.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fileSystemProvider {
  
  type DirectoryPathRecursiveRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.DirectoryPathRecursiveRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type DirectoryPathRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.DirectoryPathRequestedEventOptions, 
      /* successCallback */ js.Function2[
        /* entries */ js.Array[typings.chrome.chrome.fileSystemProvider.EntryMetadata], 
        /* hasMore */ scala.Boolean, 
        scala.Unit
      ], 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type EntryPathRecursiveRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.EntryPathRecursiveRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type FilePathLengthRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.FilePathLengthRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type FilePathRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.FilePathRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type MetadataRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.MetadataRequestedEventOptions, 
      /* successCallback */ js.Function1[/* metadata */ typings.chrome.chrome.fileSystemProvider.EntryMetadata, scala.Unit], 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type OpenFileRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.OpenFileRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type OpenedFileIoRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.OpenedFileIoRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type OpenedFileOffsetRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.OpenedFileOffsetRequestedEventOptions, 
      /* successCallback */ js.Function2[/* data */ typings.std.ArrayBuffer, /* hasMore */ scala.Boolean, scala.Unit], 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type OpenedFileRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.OpenedFileRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type OperationRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.OperationRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type OptionlessRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type RequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.RequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  
  type SourceTargetPathRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typings.chrome.chrome.fileSystemProvider.SourceTargetPathRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
}
