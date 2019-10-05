package typings.backlogDashJs.backlogDashJsMod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldType extends js.Object

@JSImport("backlog-js", "Option.Project.FieldType")
@js.native
object FieldType extends js.Object {
  @js.native
  sealed trait CheckBox extends FieldType
  
  @js.native
  sealed trait Date extends FieldType
  
  @js.native
  sealed trait MultipleList extends FieldType
  
  @js.native
  sealed trait Numeric extends FieldType
  
  @js.native
  sealed trait Radio extends FieldType
  
  @js.native
  sealed trait SingleList extends FieldType
  
  @js.native
  sealed trait Text extends FieldType
  
  @js.native
  sealed trait TextArea extends FieldType
  
  /* 7 */ val CheckBox: typings.backlogDashJs.backlogDashJsMod.Option.Project.FieldType.CheckBox with Double = js.native
  /* 4 */ val Date: typings.backlogDashJs.backlogDashJsMod.Option.Project.FieldType.Date with Double = js.native
  /* 6 */ val MultipleList: typings.backlogDashJs.backlogDashJsMod.Option.Project.FieldType.MultipleList with Double = js.native
  /* 3 */ val Numeric: typings.backlogDashJs.backlogDashJsMod.Option.Project.FieldType.Numeric with Double = js.native
  /* 8 */ val Radio: typings.backlogDashJs.backlogDashJsMod.Option.Project.FieldType.Radio with Double = js.native
  /* 5 */ val SingleList: typings.backlogDashJs.backlogDashJsMod.Option.Project.FieldType.SingleList with Double = js.native
  /* 1 */ val Text: typings.backlogDashJs.backlogDashJsMod.Option.Project.FieldType.Text with Double = js.native
  /* 2 */ val TextArea: typings.backlogDashJs.backlogDashJsMod.Option.Project.FieldType.TextArea with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldType with Double] = js.native
}

