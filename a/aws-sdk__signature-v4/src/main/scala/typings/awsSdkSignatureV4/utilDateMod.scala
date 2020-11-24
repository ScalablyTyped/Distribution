package typings.awsSdkSignatureV4

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/signature-v4/dist/cjs/utilDate", JSImport.Namespace)
@js.native
object utilDateMod extends js.Object {
  
  def iso8601(time: String): String = js.native
  def iso8601(time: Double): String = js.native
  def iso8601(time: Date): String = js.native
  
  def toDate(time: String): Date = js.native
  def toDate(time: Double): Date = js.native
  def toDate(time: Date): Date = js.native
}
