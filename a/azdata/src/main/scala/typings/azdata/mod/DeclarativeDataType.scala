package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeclarativeDataType extends js.Object

@JSImport("azdata", "DeclarativeDataType")
@js.native
object DeclarativeDataType extends js.Object {
  @js.native
  sealed trait boolean extends DeclarativeDataType
  
  @js.native
  sealed trait category extends DeclarativeDataType
  
  @js.native
  sealed trait editableCategory extends DeclarativeDataType
  
  @js.native
  sealed trait string extends DeclarativeDataType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DeclarativeDataType with String] = js.native
  /* "boolean" */ @js.native
  object boolean extends TopLevel[boolean with String]
  
  /* "category" */ @js.native
  object category extends TopLevel[category with String]
  
  /* "editableCategory" */ @js.native
  object editableCategory extends TopLevel[editableCategory with String]
  
  /* "string" */ @js.native
  object string extends TopLevel[string with String]
  
}

