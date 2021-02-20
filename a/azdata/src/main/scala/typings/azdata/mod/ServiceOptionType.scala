package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServiceOptionType extends StObject
@JSImport("azdata", "ServiceOptionType")
@js.native
object ServiceOptionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ServiceOptionType with String] = js.native
  
  @js.native
  sealed trait boolean extends ServiceOptionType
  /* "boolean" */ val boolean: typings.azdata.mod.ServiceOptionType.boolean with String = js.native
  
  @js.native
  sealed trait category extends ServiceOptionType
  /* "category" */ val category: typings.azdata.mod.ServiceOptionType.category with String = js.native
  
  @js.native
  sealed trait multistring extends ServiceOptionType
  /* "multistring" */ val multistring: typings.azdata.mod.ServiceOptionType.multistring with String = js.native
  
  @js.native
  sealed trait number extends ServiceOptionType
  /* "number" */ val number: typings.azdata.mod.ServiceOptionType.number with String = js.native
  
  @js.native
  sealed trait `object` extends ServiceOptionType
  /* "object" */ val `object`: typings.azdata.mod.ServiceOptionType.`object` with String = js.native
  
  @js.native
  sealed trait password extends ServiceOptionType
  /* "password" */ val password: typings.azdata.mod.ServiceOptionType.password with String = js.native
  
  @js.native
  sealed trait string extends ServiceOptionType
  /* "string" */ val string: typings.azdata.mod.ServiceOptionType.string with String = js.native
}
