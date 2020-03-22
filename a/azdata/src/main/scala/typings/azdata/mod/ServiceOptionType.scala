package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ServiceOptionType extends js.Object

@JSImport("azdata", "ServiceOptionType")
@js.native
object ServiceOptionType extends js.Object {
  @js.native
  sealed trait boolean extends ServiceOptionType
  
  @js.native
  sealed trait category extends ServiceOptionType
  
  @js.native
  sealed trait multistring extends ServiceOptionType
  
  @js.native
  sealed trait number extends ServiceOptionType
  
  @js.native
  sealed trait `object` extends ServiceOptionType
  
  @js.native
  sealed trait password extends ServiceOptionType
  
  @js.native
  sealed trait string extends ServiceOptionType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ServiceOptionType with String] = js.native
  /* "boolean" */ @js.native
  object boolean extends TopLevel[boolean with String]
  
  /* "category" */ @js.native
  object category extends TopLevel[category with String]
  
  /* "multistring" */ @js.native
  object multistring extends TopLevel[multistring with String]
  
  /* "number" */ @js.native
  object number extends TopLevel[number with String]
  
  /* "object" */ @js.native
  object `object` extends TopLevel[`object` with String]
  
  /* "password" */ @js.native
  object password extends TopLevel[password with String]
  
  /* "string" */ @js.native
  object string extends TopLevel[string with String]
  
}

