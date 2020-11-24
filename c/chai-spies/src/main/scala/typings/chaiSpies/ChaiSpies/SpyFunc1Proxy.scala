package typings.chaiSpies.ChaiSpies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpyFunc1Proxy[A1, R]
  extends SpyFunc1[A1, R]
     with Resetable {
  
  /* InferMemberOverrides */
  override def apply(T0: A1): R = js.native
}
