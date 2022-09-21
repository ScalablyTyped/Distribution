package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitOutput extends StObject {
  
  var emitSkipped: Boolean
  
  var outputFiles: Array[OutputFile]
}
object EmitOutput {
  
  inline def apply(emitSkipped: Boolean, outputFiles: Array[OutputFile]): EmitOutput = {
    val __obj = js.Dynamic.literal(emitSkipped = emitSkipped.asInstanceOf[js.Any], outputFiles = outputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitOutput]
  }
  
  extension [Self <: EmitOutput](x: Self) {
    
    inline def setEmitSkipped(value: Boolean): Self = StObject.set(x, "emitSkipped", value.asInstanceOf[js.Any])
    
    inline def setOutputFiles(value: Array[OutputFile]): Self = StObject.set(x, "outputFiles", value.asInstanceOf[js.Any])
  }
}
