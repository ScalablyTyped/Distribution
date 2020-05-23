package typings.branchSdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UriRedirectMode extends js.Object

@JSImport("branch-sdk", "UriRedirectMode")
@js.native
object UriRedirectMode extends js.Object {
  /**
    * This is the default value that yields the standard behavior where we don't try to open the app if the user can see an error.
    */
  @js.native
  sealed trait Default extends UriRedirectMode
  
  /**
    * Forceful redirect mode. Always try to force open the app, even if it risks showing an error message when the app is not installed.
    */
  @js.native
  sealed trait Forceful extends UriRedirectMode
  
  /**
    * Smart redirect mode. Same behavior as Default until we know the user has the app installed through Branch persona data. In that case, force URI schemes to open the app.
    */
  @js.native
  sealed trait Smart extends UriRedirectMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UriRedirectMode with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 2 */ @js.native
  object Forceful extends TopLevel[Forceful with Double]
  
  /* 1 */ @js.native
  object Smart extends TopLevel[Smart with Double]
  
}

