package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServiceOptionType extends js.Object
@JSImport("azdata", "ServiceOptionType")
@js.native
object ServiceOptionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ServiceOptionType with String] = js.native
  
  @js.native
  sealed trait boolean extends ServiceOptionType
  /* "boolean" */ @js.native
  object boolean extends TopLevel[boolean with String]
  
  @js.native
  sealed trait category extends ServiceOptionType
  /* "category" */ @js.native
  object category extends TopLevel[category with String]
  
  @js.native
  sealed trait multistring extends ServiceOptionType
  /* "multistring" */ @js.native
  object multistring extends TopLevel[multistring with String]
  
  @js.native
  sealed trait number extends ServiceOptionType
  /* "number" */ @js.native
  object number extends TopLevel[number with String]
  
  @js.native
  sealed trait `object` extends ServiceOptionType
  /* "object" */ @js.native
  object `object` extends TopLevel[`object` with String]
  
  @js.native
  sealed trait password extends ServiceOptionType
  /* "password" */ @js.native
  object password extends TopLevel[password with String]
  
  @js.native
  sealed trait string extends ServiceOptionType
  /* "string" */ @js.native
  object string extends TopLevel[string with String]
}
