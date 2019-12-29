package typings.bcpDash47.bcpDash47Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

@JSImport("bcp-47", "ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  @js.native
  sealed trait errEmptyExtension extends ErrorCodes
  
  @js.native
  sealed trait errExtensionTooLong extends ErrorCodes
  
  @js.native
  sealed trait errExtraContent extends ErrorCodes
  
  @js.native
  sealed trait errPrivateUseTooLong extends ErrorCodes
  
  @js.native
  sealed trait errTooManySubtags extends ErrorCodes
  
  @js.native
  sealed trait errVariantTooLong extends ErrorCodes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorCodes with Double] = js.native
  /* 4 */ @js.native
  object errEmptyExtension extends TopLevel[errEmptyExtension with Double]
  
  /* 2 */ @js.native
  object errExtensionTooLong extends TopLevel[errExtensionTooLong with Double]
  
  /* 6 */ @js.native
  object errExtraContent extends TopLevel[errExtraContent with Double]
  
  /* 5 */ @js.native
  object errPrivateUseTooLong extends TopLevel[errPrivateUseTooLong with Double]
  
  /* 3 */ @js.native
  object errTooManySubtags extends TopLevel[errTooManySubtags with Double]
  
  /* 1 */ @js.native
  object errVariantTooLong extends TopLevel[errVariantTooLong with Double]
  
}

