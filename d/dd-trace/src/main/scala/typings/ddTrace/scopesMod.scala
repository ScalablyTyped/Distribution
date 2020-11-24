package typings.ddTrace

import typings.ddTrace.ddTraceStrings.async_hooks
import typings.ddTrace.ddTraceStrings.async_local_storage
import typings.ddTrace.ddTraceStrings.async_resource
import typings.ddTrace.ddTraceStrings.noop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dd-trace/ext/scopes", JSImport.Namespace)
@js.native
object scopesMod extends js.Object {
  
  var ASYNC_HOOKS: async_hooks = js.native
  
  var ASYNC_LOCAL_STORAGE: async_local_storage = js.native
  
  var ASYNC_RESOURCE: async_resource = js.native
  
  var NOOP: noop = js.native
}
