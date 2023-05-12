package typings.cucumberCucumber

import typings.cucumberCucumber.anon.PartialIConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigurationMergeConfigurationsMod {
  
  @JSImport("@cucumber/cucumber/lib/configuration/merge_configurations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeConfigurations[T](source: T, configurations: PartialIConfiguration*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfigurations")(scala.List(source.asInstanceOf[js.Any]).`++`(configurations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
}
