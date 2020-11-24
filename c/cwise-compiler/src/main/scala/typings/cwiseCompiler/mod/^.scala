package typings.cwiseCompiler.mod

import typings.ndarray.mod.ndarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cwise-compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(user_args: UserArgs): js.Function3[
    /* a */ ndarray[Double], 
    /* b */ ndarray[Double], 
    /* repeated */ ndarray[Double], 
    ndarray[Double]
  ] = js.native
}
