package typings.cnpj

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cnpj", "format")
  @js.native
  def format(cnpj: Double): String = js.native
  
  @JSImport("cnpj", "generate")
  @js.native
  def generate(): String = js.native
  
  @JSImport("cnpj", "validate")
  @js.native
  def validate(cnpj: String): Boolean = js.native
}
