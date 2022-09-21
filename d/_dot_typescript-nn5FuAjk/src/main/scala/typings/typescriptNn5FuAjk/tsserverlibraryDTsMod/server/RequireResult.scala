package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.anon.Error
  - typings.typescriptNn5FuAjk.anon.Module
*/
trait RequireResult extends StObject
object RequireResult {
  
  inline def Error(error: Unit): typings.typescriptNn5FuAjk.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.anon.Error]
  }
  
  inline def Module(error: Message, module: Unit): typings.typescriptNn5FuAjk.anon.Module = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.anon.Module]
  }
}
