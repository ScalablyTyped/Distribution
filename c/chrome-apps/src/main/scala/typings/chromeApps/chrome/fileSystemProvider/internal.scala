package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal interfaces, not for use
  */
object internal {
  
  trait EntryPathRequestedEventOptions
    extends StObject
       with RequestedEventOptions {
    
    /** The path of the entry to which this operation is related to. */
    var entryPath: String
  }
  object EntryPathRequestedEventOptions {
    
    inline def apply(entryPath: String, fileSystemId: String, requestId: integer): EntryPathRequestedEventOptions = {
      val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryPathRequestedEventOptions]
    }
    
    extension [Self <: EntryPathRequestedEventOptions](x: Self) {
      
      inline def setEntryPath(value: String): Self = StObject.set(x, "entryPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait FilePathRequestedEventOptions
    extends StObject
       with RequestedEventOptions {
    
    /** The path of the entry for the operation */
    var filePath: String
  }
  object FilePathRequestedEventOptions {
    
    inline def apply(filePath: String, fileSystemId: String, requestId: integer): FilePathRequestedEventOptions = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePathRequestedEventOptions]
    }
    
    extension [Self <: FilePathRequestedEventOptions](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestedEventOptions extends StObject {
    
    /** The identifier of the file system related to this operation. */
    var fileSystemId: String
    
    /** The unique identifier of this request. */
    var requestId: integer
  }
  object RequestedEventOptions {
    
    inline def apply(fileSystemId: String, requestId: integer): RequestedEventOptions = {
      val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestedEventOptions]
    }
    
    extension [Self <: RequestedEventOptions](x: Self) {
      
      inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: integer): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
}
