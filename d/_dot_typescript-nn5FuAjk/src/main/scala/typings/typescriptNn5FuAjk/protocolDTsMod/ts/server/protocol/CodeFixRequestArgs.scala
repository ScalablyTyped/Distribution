package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instances of this interface specify errorcodes on a specific location in a sourcefile.
  */
trait CodeFixRequestArgs
  extends StObject
     with FileRangeRequestArgs {
  
  /**
    * Errorcodes we want to get the fixes for.
    */
  var errorCodes: Array[Double]
}
object CodeFixRequestArgs {
  
  inline def apply(
    endLine: Double,
    endOffset: Double,
    errorCodes: Array[Double],
    file: String,
    startLine: Double,
    startOffset: Double
  ): CodeFixRequestArgs = {
    val __obj = js.Dynamic.literal(endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], errorCodes = errorCodes.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFixRequestArgs]
  }
  
  extension [Self <: CodeFixRequestArgs](x: Self) {
    
    inline def setErrorCodes(value: Array[Double]): Self = StObject.set(x, "errorCodes", value.asInstanceOf[js.Any])
  }
}
