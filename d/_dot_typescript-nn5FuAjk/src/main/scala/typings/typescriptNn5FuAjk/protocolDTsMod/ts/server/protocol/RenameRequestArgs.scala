package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument for RenameRequest request.
  */
trait RenameRequestArgs
  extends StObject
     with FileLocationRequestArgs {
  
  /**
    * Should text at specified location be found/changed in comments?
    */
  var findInComments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should text at specified location be found/changed in strings?
    */
  var findInStrings: js.UndefOr[Boolean] = js.undefined
}
object RenameRequestArgs {
  
  inline def apply(file: String, line: Double, offset: Double): RenameRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameRequestArgs]
  }
  
  extension [Self <: RenameRequestArgs](x: Self) {
    
    inline def setFindInComments(value: Boolean): Self = StObject.set(x, "findInComments", value.asInstanceOf[js.Any])
    
    inline def setFindInCommentsUndefined: Self = StObject.set(x, "findInComments", js.undefined)
    
    inline def setFindInStrings(value: Boolean): Self = StObject.set(x, "findInStrings", value.asInstanceOf[js.Any])
    
    inline def setFindInStringsUndefined: Self = StObject.set(x, "findInStrings", js.undefined)
  }
}
