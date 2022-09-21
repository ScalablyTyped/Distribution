package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeclarativeDataType extends StObject
@JSImport("azdata", "DeclarativeDataType")
@js.native
object DeclarativeDataType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DeclarativeDataType & String] = js.native
  
  @js.native
  sealed trait boolean
    extends StObject
       with DeclarativeDataType
  /* "boolean" */ val boolean: typings.azdata.mod.DeclarativeDataType.boolean & String = js.native
  
  @js.native
  sealed trait category
    extends StObject
       with DeclarativeDataType
  /* "category" */ val category: typings.azdata.mod.DeclarativeDataType.category & String = js.native
  
  @js.native
  sealed trait component
    extends StObject
       with DeclarativeDataType
  /* "component" */ val component: typings.azdata.mod.DeclarativeDataType.component & String = js.native
  
  @js.native
  sealed trait editableCategory
    extends StObject
       with DeclarativeDataType
  /* "editableCategory" */ val editableCategory: typings.azdata.mod.DeclarativeDataType.editableCategory & String = js.native
  
  @js.native
  sealed trait menu
    extends StObject
       with DeclarativeDataType
  /* "menu" */ val menu: typings.azdata.mod.DeclarativeDataType.menu & String = js.native
  
  @js.native
  sealed trait string
    extends StObject
       with DeclarativeDataType
  /* "string" */ val string: typings.azdata.mod.DeclarativeDataType.string & String = js.native
}
