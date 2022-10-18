package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.ethers.mod.ethers.providers.Formatter
import typings.ethersprojectProviders.libFormatterMod.FormatFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFormatter
  extends StObject
     with Instantiable0[Formatter] {
  
  def allowFalsish(format: FormatFunc, replaceValue: Any): FormatFunc = js.native
  
  def allowNull(format: FormatFunc): FormatFunc = js.native
  def allowNull(format: FormatFunc, nullValue: Any): FormatFunc = js.native
  
  def arrayOf(format: FormatFunc): FormatFunc = js.native
  
  def check(format: StringDictionary[FormatFunc], `object`: Any): Any = js.native
}
