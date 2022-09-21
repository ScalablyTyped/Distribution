package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCombinedCodeFixRequestArgs extends StObject {
  
  var scope: GetCombinedCodeFixScope
}
object GetCombinedCodeFixRequestArgs {
  
  inline def apply(scope: GetCombinedCodeFixScope): GetCombinedCodeFixRequestArgs = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCombinedCodeFixRequestArgs]
  }
  
  extension [Self <: GetCombinedCodeFixRequestArgs](x: Self) {
    
    inline def setScope(value: GetCombinedCodeFixScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
