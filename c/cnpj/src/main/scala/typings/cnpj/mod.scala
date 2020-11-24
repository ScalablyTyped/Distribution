package typings.cnpj

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cnpj", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def format(cnpj: Double): String = js.native
  
  def generate(): String = js.native
  
  def validate(cnpj: String): Boolean = js.native
}
