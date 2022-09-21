package typings.changeCaseAll

import typings.noCase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("change-case-all", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def camelCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def capitalCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def capitalCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("capitalCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def constantCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("constantCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def constantCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("constantCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def dotCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dotCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def dotCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dotCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def headerCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("headerCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def headerCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("headerCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("change-case-all", "isLowerCase")
  @js.native
  val isLowerCase: js.Function1[/* input */ String, Boolean] = js.native
  
  @JSImport("change-case-all", "isUpperCase")
  @js.native
  val isUpperCase: js.Function1[/* input */ String, Boolean] = js.native
  
  @JSImport("change-case-all", "localeLowerCase")
  @js.native
  val localeLowerCase: js.Function2[/* str */ String, /* locale */ String, String] = js.native
  
  @JSImport("change-case-all", "localeUpperCase")
  @js.native
  val localeUpperCase: js.Function2[/* str */ String, /* locale */ String, String] = js.native
  
  @JSImport("change-case-all", "lowerCase")
  @js.native
  val lowerCase: js.Function1[/* str */ String, String] = js.native
  
  @JSImport("change-case-all", "lowerCaseFirst")
  @js.native
  val lowerCaseFirst: js.Function1[/* input */ String, String] = js.native
  
  inline def noCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("noCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def noCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("noCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def paramCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("paramCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def paramCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("paramCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pascalCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def pascalCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pascalCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pathCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def pathCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pathCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sentenceCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sentenceCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sentenceCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sentenceCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def snakeCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("snakeCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def snakeCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("snakeCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("change-case-all", "spongeCase")
  @js.native
  val spongeCase: js.Function1[/* input */ String, String] = js.native
  
  @JSImport("change-case-all", "swapCase")
  @js.native
  val swapCase: js.Function1[/* input */ String, String] = js.native
  
  @JSImport("change-case-all", "titleCase")
  @js.native
  val titleCase: js.Function1[/* input */ String, String] = js.native
  
  @JSImport("change-case-all", "upperCase")
  @js.native
  val upperCase: js.Function1[/* str */ String, String] = js.native
  
  @JSImport("change-case-all", "upperCaseFirst")
  @js.native
  val upperCaseFirst: js.Function1[/* input */ String, String] = js.native
}
