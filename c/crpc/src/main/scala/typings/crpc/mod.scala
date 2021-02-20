package typings.crpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("crpc", JSImport.Namespace)
  @js.native
  def apply(baseUrl: String): Client = js.native
  @JSImport("crpc", JSImport.Namespace)
  @js.native
  def apply(baseUrl: String, options: js.Object): Client = js.native
  
  type Client = js.Function3[
    /* path */ String, 
    /* body */ js.Any, 
    /* options */ js.UndefOr[js.Object | Null], 
    js.Promise[js.Any]
  ]
}
