package typings.camelCase

import typings.noCase.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("camel-case", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def camelCase(input: String): String = js.native
  def camelCase(input: String, options: Options): String = js.native
  
  def camelCaseTransform(input: String, index: Double): String = js.native
  
  def camelCaseTransformMerge(input: String, index: Double): String = js.native
}
