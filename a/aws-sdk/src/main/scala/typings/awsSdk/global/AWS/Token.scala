package typings.awsSdk.global.AWS

import typings.awsSdk.libTokenMod.TokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AWS.Token")
@js.native
open class Token protected ()
  extends typings.awsSdk.mod.Token {
  /**
    * Creates a Token object with a given set of token information as an options hash.
    *
    * @param {object} options - An option hash containing a set of token information.
    */
  def this(options: TokenOptions) = this()
}
/* static members */
object Token {
  
  @JSGlobal("AWS.Token")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("AWS.Token.expiryWindow")
  @js.native
  def expiryWindow: Double = js.native
  inline def expiryWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expiryWindow")(x.asInstanceOf[js.Any])
}
