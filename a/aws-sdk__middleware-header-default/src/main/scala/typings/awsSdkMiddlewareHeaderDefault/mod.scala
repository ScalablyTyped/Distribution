package typings.awsSdkMiddlewareHeaderDefault

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-header-default", "headerDefault")
  @js.native
  def headerDefault(headerBag: HeaderDefaultArgs): BuildMiddleware[_, _] = js.native
  
  type HeaderDefaultArgs = StringDictionary[String]
}
