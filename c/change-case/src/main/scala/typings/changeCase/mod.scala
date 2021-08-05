package typings.changeCase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("change-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def camelCase(input: String, options: typings.noCase.mod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def camelCaseTransform(input: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("camelCaseTransform")(input.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def camelCaseTransformMerge(input: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("camelCaseTransformMerge")(input.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def capitalCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def capitalCase(input: String, options: typings.noCase.mod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("capitalCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def capitalCaseTransform(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalCaseTransform")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def constantCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("constantCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def constantCase(input: String, options: typings.noCase.mod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("constantCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def dotCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dotCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def dotCase(input: String, options: typings.noCase.mod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dotCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def headerCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("headerCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def headerCase(input: String, options: typings.noCase.mod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("headerCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def noCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("noCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def noCase(input: String, options: typings.noCase.mod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("noCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def paramCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("paramCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def paramCase(input: String, options: typings.noCase.mod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("paramCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pascalCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def pascalCase(input: String, options: typings.noCase.mod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pascalCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pascalCaseTransform(input: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pascalCaseTransform")(input.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pascalCaseTransformMerge(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalCaseTransformMerge")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pathCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def pathCase(input: String, options: typings.noCase.mod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pathCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sentenceCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sentenceCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sentenceCase(input: String, options: typings.noCase.mod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sentenceCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sentenceCaseTransform(input: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sentenceCaseTransform")(input.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def snakeCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("snakeCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def snakeCase(input: String, options: typings.noCase.mod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("snakeCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options
    extends StObject
       with typings.noCase.mod.Options
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
}
