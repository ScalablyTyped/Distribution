package typings.cnpj

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cnpj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(cnpj: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(cnpj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(cnpj: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(cnpj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
  
  inline def validate(cnpj: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(cnpj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validate(cnpj: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(cnpj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
