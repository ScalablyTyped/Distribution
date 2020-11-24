package typings.bcp47.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCodes extends js.Object
@JSImport("bcp-47", "ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorCodes with Double] = js.native
  
  @js.native
  sealed trait errEmptyExtension extends ErrorCodes
  /* 4 */ @js.native
  object errEmptyExtension extends TopLevel[errEmptyExtension with Double]
  
  @js.native
  sealed trait errExtensionTooLong extends ErrorCodes
  /* 2 */ @js.native
  object errExtensionTooLong extends TopLevel[errExtensionTooLong with Double]
  
  @js.native
  sealed trait errExtraContent extends ErrorCodes
  /* 6 */ @js.native
  object errExtraContent extends TopLevel[errExtraContent with Double]
  
  @js.native
  sealed trait errPrivateUseTooLong extends ErrorCodes
  /* 5 */ @js.native
  object errPrivateUseTooLong extends TopLevel[errPrivateUseTooLong with Double]
  
  @js.native
  sealed trait errTooManySubtags extends ErrorCodes
  /* 3 */ @js.native
  object errTooManySubtags extends TopLevel[errTooManySubtags with Double]
  
  @js.native
  sealed trait errVariantTooLong extends ErrorCodes
  /* 1 */ @js.native
  object errVariantTooLong extends TopLevel[errVariantTooLong with Double]
}
