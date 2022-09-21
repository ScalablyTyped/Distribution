package typings.azureMobileApps.Azure.MobileApps

import typings.azureMobileApps.Express.Request
import typings.azureMobileApps.Express.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Middleware = js.Function3[/* req */ Request, /* res */ Response, /* next */ NextMiddleware, Unit]

type NextMiddleware = js.Function1[/* error */ js.UndefOr[Any], Unit]
