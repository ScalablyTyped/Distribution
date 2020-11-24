package typings.camundaExternalTaskClientJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Handler = js.Function1[/* args */ typings.camundaExternalTaskClientJs.mod.HandlerArgs, scala.Unit]
  
  type Interceptor = js.Function1[/* config */ js.Any, js.Any]
  
  type Logger_ = typings.camundaExternalTaskClientJs.mod.Middleware with typings.camundaExternalTaskClientJs.anon.Error
  
  type Middleware = js.Function1[/* client */ typings.camundaExternalTaskClientJs.mod.Client, scala.Unit]
  
  type SuccessWithTasksEvent = typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonsuccess
  
  type TypedValueMap = org.scalablytyped.runtime.StringDictionary[typings.camundaExternalTaskClientJs.mod.TypedValue]
  
  type Value = js.Any
  
  type ValueMap = org.scalablytyped.runtime.StringDictionary[typings.camundaExternalTaskClientJs.mod.Value]
}
