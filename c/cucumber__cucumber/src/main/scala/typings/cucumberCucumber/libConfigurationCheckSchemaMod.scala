package typings.cucumberCucumber

import typings.cucumberCucumber.anon.PartialIConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigurationCheckSchemaMod {
  
  @JSImport("@cucumber/cucumber/lib/configuration/check_schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkSchema(configuration: Any): PartialIConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSchema")(configuration.asInstanceOf[js.Any]).asInstanceOf[PartialIConfiguration]
}
