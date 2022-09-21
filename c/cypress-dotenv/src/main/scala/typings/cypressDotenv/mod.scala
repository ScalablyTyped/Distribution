package typings.cypressDotenv

import org.scalablytyped.runtime.StringDictionary
import typings.cypressDotenv.anon.Env
import typings.dotenv.mod.DotenvConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: CypressConfig */](cypressConfig: T): EnhancedConfig[T] = ^.asInstanceOf[js.Dynamic].apply(cypressConfig.asInstanceOf[js.Any]).asInstanceOf[EnhancedConfig[T]]
  inline def apply[T /* <: CypressConfig */](cypressConfig: T, dotEnvConfig: Unit, all: Boolean): EnhancedConfig[T] = (^.asInstanceOf[js.Dynamic].apply(cypressConfig.asInstanceOf[js.Any], dotEnvConfig.asInstanceOf[js.Any], all.asInstanceOf[js.Any])).asInstanceOf[EnhancedConfig[T]]
  inline def apply[T /* <: CypressConfig */](cypressConfig: T, dotEnvConfig: DotenvConfigOptions): EnhancedConfig[T] = (^.asInstanceOf[js.Dynamic].apply(cypressConfig.asInstanceOf[js.Any], dotEnvConfig.asInstanceOf[js.Any])).asInstanceOf[EnhancedConfig[T]]
  inline def apply[T /* <: CypressConfig */](cypressConfig: T, dotEnvConfig: DotenvConfigOptions, all: Boolean): EnhancedConfig[T] = (^.asInstanceOf[js.Dynamic].apply(cypressConfig.asInstanceOf[js.Any], dotEnvConfig.asInstanceOf[js.Any], all.asInstanceOf[js.Any])).asInstanceOf[EnhancedConfig[T]]
  
  @JSImport("cypress-dotenv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Cypress type
  type CypressConfig = StringDictionary[Any]
  
  type EnhancedConfig[T /* <: CypressConfig */] = T & Env
}
