package typings.backlogJs.distTypesOptionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends StObject
@JSImport("backlog-js/dist/types/option", "Project.FieldType")
@js.native
object FieldType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldType & Double] = js.native
  
  @js.native
  sealed trait CheckBox
    extends StObject
       with FieldType
  /* 7 */ val CheckBox: typings.backlogJs.distTypesOptionMod.Project.FieldType.CheckBox & Double = js.native
  
  @js.native
  sealed trait Date
    extends StObject
       with FieldType
  /* 4 */ val Date: typings.backlogJs.distTypesOptionMod.Project.FieldType.Date & Double = js.native
  
  @js.native
  sealed trait MultipleList
    extends StObject
       with FieldType
  /* 6 */ val MultipleList: typings.backlogJs.distTypesOptionMod.Project.FieldType.MultipleList & Double = js.native
  
  @js.native
  sealed trait Numeric
    extends StObject
       with FieldType
  /* 3 */ val Numeric: typings.backlogJs.distTypesOptionMod.Project.FieldType.Numeric & Double = js.native
  
  @js.native
  sealed trait Radio
    extends StObject
       with FieldType
  /* 8 */ val Radio: typings.backlogJs.distTypesOptionMod.Project.FieldType.Radio & Double = js.native
  
  @js.native
  sealed trait SingleList
    extends StObject
       with FieldType
  /* 5 */ val SingleList: typings.backlogJs.distTypesOptionMod.Project.FieldType.SingleList & Double = js.native
  
  @js.native
  sealed trait Text
    extends StObject
       with FieldType
  /* 1 */ val Text: typings.backlogJs.distTypesOptionMod.Project.FieldType.Text & Double = js.native
  
  @js.native
  sealed trait TextArea
    extends StObject
       with FieldType
  /* 2 */ val TextArea: typings.backlogJs.distTypesOptionMod.Project.FieldType.TextArea & Double = js.native
}
