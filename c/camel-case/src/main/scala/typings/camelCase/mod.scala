package typings.camelCase

import typings.noCase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("camel-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def camelCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def camelCaseTransform(input: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("camelCaseTransform")(input.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def camelCaseTransformMerge(input: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("camelCaseTransformMerge")(input.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
}
