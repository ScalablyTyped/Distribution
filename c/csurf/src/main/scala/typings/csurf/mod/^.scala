package typings.csurf.mod

import typings.csurf.anon.Cookie
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("csurf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  def apply(options: Cookie): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
}
