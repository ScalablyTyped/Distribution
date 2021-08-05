package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeMergeConflictsError extends StObject {
  
  /**
    * The name of the exception.
    */
  var exceptionName: ExceptionName
  
  /**
    * The path to the file.
    */
  var filePath: Path
  
  /**
    * The message provided by the exception.
    */
  var message: Message
}
object BatchDescribeMergeConflictsError {
  
  inline def apply(exceptionName: ExceptionName, filePath: Path, message: Message): BatchDescribeMergeConflictsError = {
    val __obj = js.Dynamic.literal(exceptionName = exceptionName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeMergeConflictsError]
  }
  
  extension [Self <: BatchDescribeMergeConflictsError](x: Self) {
    
    inline def setExceptionName(value: ExceptionName): Self = StObject.set(x, "exceptionName", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
