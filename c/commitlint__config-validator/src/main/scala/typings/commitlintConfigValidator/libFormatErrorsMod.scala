package typings.commitlintConfigValidator

import typings.ajv.distTypesMod.ErrorObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatErrorsMod {
  
  @JSImport("@commitlint/config-validator/lib/formatErrors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatErrors(errors: js.Array[ErrorObject[String, Record[String, Any], Any]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatErrors")(errors.asInstanceOf[js.Any]).asInstanceOf[String]
}
