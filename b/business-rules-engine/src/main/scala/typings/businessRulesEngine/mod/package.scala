package typings.businessRulesEngine.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type IAsyncValidate = js.Function1[/* args */ IError, Promise[Any]]

type IErrorCustomMessage = js.Function2[/* config */ Any, /* args */ Any, String]

type IOptional = js.Function0[Boolean]

type IValidate = js.Function1[/* args */ IError, Unit]
