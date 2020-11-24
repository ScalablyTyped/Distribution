package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeclarativeDataType extends js.Object
@JSImport("azdata", "DeclarativeDataType")
@js.native
object DeclarativeDataType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DeclarativeDataType with String] = js.native
  
  @js.native
  sealed trait boolean extends DeclarativeDataType
  /* "boolean" */ @js.native
  object boolean extends TopLevel[boolean with String]
  
  @js.native
  sealed trait category extends DeclarativeDataType
  /* "category" */ @js.native
  object category extends TopLevel[category with String]
  
  @js.native
  sealed trait editableCategory extends DeclarativeDataType
  /* "editableCategory" */ @js.native
  object editableCategory extends TopLevel[editableCategory with String]
  
  @js.native
  sealed trait string extends DeclarativeDataType
  /* "string" */ @js.native
  object string extends TopLevel[string with String]
}
