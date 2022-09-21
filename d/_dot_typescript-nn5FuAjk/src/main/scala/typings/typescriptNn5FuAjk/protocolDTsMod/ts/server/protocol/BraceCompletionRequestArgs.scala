package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument for BraceCompletionRequest request.
  */
trait BraceCompletionRequestArgs
  extends StObject
     with FileLocationRequestArgs {
  
  /**
    * Kind of opening brace
    */
  var openingBrace: String
}
object BraceCompletionRequestArgs {
  
  inline def apply(file: String, line: Double, offset: Double, openingBrace: String): BraceCompletionRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openingBrace = openingBrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[BraceCompletionRequestArgs]
  }
  
  extension [Self <: BraceCompletionRequestArgs](x: Self) {
    
    inline def setOpeningBrace(value: String): Self = StObject.set(x, "openingBrace", value.asInstanceOf[js.Any])
  }
}
