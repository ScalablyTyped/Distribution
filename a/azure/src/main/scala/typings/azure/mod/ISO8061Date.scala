package typings.azure.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ISO8061Date {
  
  @JSImport("azure", "ISO8061Date")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def format(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parse(stringDateTime: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(stringDateTime.asInstanceOf[js.Any]).asInstanceOf[Date]
}
