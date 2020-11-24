package typings.changeCase

import typings.noCase.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("change-case", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def camelCase(input: String): String = js.native
  def camelCase(input: String, options: Options): String = js.native
  
  def camelCaseTransform(input: String, index: Double): String = js.native
  
  def camelCaseTransformMerge(input: String, index: Double): String = js.native
  
  def capitalCase(input: String): String = js.native
  def capitalCase(input: String, options: Options): String = js.native
  
  def capitalCaseTransform(input: String): String = js.native
  
  def constantCase(input: String): String = js.native
  def constantCase(input: String, options: Options): String = js.native
  
  def dotCase(input: String): String = js.native
  def dotCase(input: String, options: Options): String = js.native
  
  def headerCase(input: String): String = js.native
  def headerCase(input: String, options: Options): String = js.native
  
  def noCase(input: String): String = js.native
  def noCase(input: String, options: Options): String = js.native
  
  def paramCase(input: String): String = js.native
  def paramCase(input: String, options: Options): String = js.native
  
  def pascalCase(input: String): String = js.native
  def pascalCase(input: String, options: Options): String = js.native
  
  def pascalCaseTransform(input: String, index: Double): String = js.native
  
  def pascalCaseTransformMerge(input: String): String = js.native
  
  def pathCase(input: String): String = js.native
  def pathCase(input: String, options: Options): String = js.native
  
  def sentenceCase(input: String): String = js.native
  def sentenceCase(input: String, options: Options): String = js.native
  
  def sentenceCaseTransform(input: String, index: Double): String = js.native
  
  def snakeCase(input: String): String = js.native
  def snakeCase(input: String, options: Options): String = js.native
}
