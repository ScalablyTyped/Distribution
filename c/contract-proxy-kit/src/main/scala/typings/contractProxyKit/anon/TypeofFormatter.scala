package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.ethers.mod.ethers.providers.Formatter
import typings.ethersprojectProviders.formatterMod.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFormatter extends Instantiable0[Formatter] {
  
  def allowFalsish(format: FormatFunc, replaceValue: js.Any): FormatFunc = js.native
  
  def allowNull(format: FormatFunc): FormatFunc = js.native
  def allowNull(format: FormatFunc, nullValue: js.Any): FormatFunc = js.native
  
  def arrayOf(format: FormatFunc): FormatFunc = js.native
  
  def check(format: StringDictionary[FormatFunc], `object`: js.Any): js.Any = js.native
}
