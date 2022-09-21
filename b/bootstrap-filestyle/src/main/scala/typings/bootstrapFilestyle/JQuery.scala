package typings.bootstrapFilestyle

import typings.bootstrapFilestyle.bootstrapFilestyleStrings.buttonBefore
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.buttonName
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.buttonText
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.clear
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.destroy
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.disabled
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.htmlIcon
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.htmlInput
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.icon
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.iconName
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.input
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.placeholder
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.pushNameFiles
import typings.bootstrapFilestyle.bootstrapFilestyleStrings.size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def filestyle(): JQuery = js.native
  def filestyle(method: clear | destroy | htmlIcon | htmlInput | pushNameFiles): JQuery = js.native
  def filestyle(method: size | placeholder | buttonText | buttonName | iconName, value: String): JQuery = js.native
  def filestyle(method: disabled | buttonBefore | icon | input, value: Boolean): JQuery = js.native
  def filestyle(options: FilestyleOptions): JQuery = js.native
}
