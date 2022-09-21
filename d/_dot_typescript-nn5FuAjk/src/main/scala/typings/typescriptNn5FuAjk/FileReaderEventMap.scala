package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileReaderEventMap extends StObject {
  
  var abort: ProgressEvent[FileReader]
  
  var error: ProgressEvent[FileReader]
  
  var load: ProgressEvent[FileReader]
  
  var loadend: ProgressEvent[FileReader]
  
  var loadstart: ProgressEvent[FileReader]
  
  var progress: ProgressEvent[FileReader]
}
object FileReaderEventMap {
  
  inline def apply(
    abort: ProgressEvent[FileReader],
    error: ProgressEvent[FileReader],
    load: ProgressEvent[FileReader],
    loadend: ProgressEvent[FileReader],
    loadstart: ProgressEvent[FileReader],
    progress: ProgressEvent[FileReader]
  ): FileReaderEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileReaderEventMap]
  }
  
  extension [Self <: FileReaderEventMap](x: Self) {
    
    inline def setAbort(value: ProgressEvent[FileReader]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setError(value: ProgressEvent[FileReader]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: ProgressEvent[FileReader]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadend(value: ProgressEvent[FileReader]): Self = StObject.set(x, "loadend", value.asInstanceOf[js.Any])
    
    inline def setLoadstart(value: ProgressEvent[FileReader]): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: ProgressEvent[FileReader]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
