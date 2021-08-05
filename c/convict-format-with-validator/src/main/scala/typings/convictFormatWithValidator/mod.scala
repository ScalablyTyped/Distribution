package typings.convictFormatWithValidator

import typings.convict.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("convict-format-with-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("convict-format-with-validator", "email")
  @js.native
  def email: Format = js.native
  inline def email_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("email")(x.asInstanceOf[js.Any])
  
  @JSImport("convict-format-with-validator", "ipaddress")
  @js.native
  def ipaddress: Format = js.native
  inline def ipaddress_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ipaddress")(x.asInstanceOf[js.Any])
  
  @JSImport("convict-format-with-validator", "url")
  @js.native
  def url: Format = js.native
  inline def url_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
}
