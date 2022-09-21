package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizeImportsRequestArgs extends StObject {
  
  var scope: OrganizeImportsScope
  
  var skipDestructiveCodeActions: js.UndefOr[Boolean] = js.undefined
}
object OrganizeImportsRequestArgs {
  
  inline def apply(scope: OrganizeImportsScope): OrganizeImportsRequestArgs = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizeImportsRequestArgs]
  }
  
  extension [Self <: OrganizeImportsRequestArgs](x: Self) {
    
    inline def setScope(value: OrganizeImportsScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSkipDestructiveCodeActions(value: Boolean): Self = StObject.set(x, "skipDestructiveCodeActions", value.asInstanceOf[js.Any])
    
    inline def setSkipDestructiveCodeActionsUndefined: Self = StObject.set(x, "skipDestructiveCodeActions", js.undefined)
  }
}
