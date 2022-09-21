package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizeImportsArgs
  extends StObject
     with CombinedCodeFixScope {
  
  var skipDestructiveCodeActions: js.UndefOr[Boolean] = js.undefined
}
object OrganizeImportsArgs {
  
  inline def apply(fileName: java.lang.String): OrganizeImportsArgs = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("file")
    __obj.asInstanceOf[OrganizeImportsArgs]
  }
  
  extension [Self <: OrganizeImportsArgs](x: Self) {
    
    inline def setSkipDestructiveCodeActions(value: Boolean): Self = StObject.set(x, "skipDestructiveCodeActions", value.asInstanceOf[js.Any])
    
    inline def setSkipDestructiveCodeActionsUndefined: Self = StObject.set(x, "skipDestructiveCodeActions", js.undefined)
  }
}
