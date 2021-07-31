package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Middleware = js.Function3[
/* req */ typings.azureMobileApps.Express.Request, 
/* res */ typings.azureMobileApps.Express.Response, 
/* next */ typings.azureMobileApps.Azure.MobileApps.NextMiddleware, 
scala.Unit]

type NextMiddleware = js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]
