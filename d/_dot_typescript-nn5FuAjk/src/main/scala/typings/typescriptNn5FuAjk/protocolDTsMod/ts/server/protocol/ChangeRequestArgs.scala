package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for change request message.
  */
trait ChangeRequestArgs
  extends StObject
     with FormatRequestArgs {
  
  /**
    * Optional string to insert at location (file, line, offset).
    */
  var insertString: js.UndefOr[String] = js.undefined
}
object ChangeRequestArgs {
  
  inline def apply(endLine: Double, endOffset: Double, file: String, line: Double, offset: Double): ChangeRequestArgs = {
    val __obj = js.Dynamic.literal(endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeRequestArgs]
  }
  
  extension [Self <: ChangeRequestArgs](x: Self) {
    
    inline def setInsertString(value: String): Self = StObject.set(x, "insertString", value.asInstanceOf[js.Any])
    
    inline def setInsertStringUndefined: Self = StObject.set(x, "insertString", js.undefined)
  }
}
