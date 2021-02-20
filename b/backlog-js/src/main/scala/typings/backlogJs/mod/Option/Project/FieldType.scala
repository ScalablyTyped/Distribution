package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends StObject
@JSImport("backlog-js", "Option.Project.FieldType")
@js.native
object FieldType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldType with Double] = js.native
  
  @js.native
  sealed trait CheckBox extends FieldType
  /* 7 */ val CheckBox: typings.backlogJs.mod.Option.Project.FieldType.CheckBox with Double = js.native
  
  @js.native
  sealed trait Date extends FieldType
  /* 4 */ val Date: typings.backlogJs.mod.Option.Project.FieldType.Date with Double = js.native
  
  @js.native
  sealed trait MultipleList extends FieldType
  /* 6 */ val MultipleList: typings.backlogJs.mod.Option.Project.FieldType.MultipleList with Double = js.native
  
  @js.native
  sealed trait Numeric extends FieldType
  /* 3 */ val Numeric: typings.backlogJs.mod.Option.Project.FieldType.Numeric with Double = js.native
  
  @js.native
  sealed trait Radio extends FieldType
  /* 8 */ val Radio: typings.backlogJs.mod.Option.Project.FieldType.Radio with Double = js.native
  
  @js.native
  sealed trait SingleList extends FieldType
  /* 5 */ val SingleList: typings.backlogJs.mod.Option.Project.FieldType.SingleList with Double = js.native
  
  @js.native
  sealed trait Text extends FieldType
  /* 1 */ val Text: typings.backlogJs.mod.Option.Project.FieldType.Text with Double = js.native
  
  @js.native
  sealed trait TextArea extends FieldType
  /* 2 */ val TextArea: typings.backlogJs.mod.Option.Project.FieldType.TextArea with Double = js.native
}
