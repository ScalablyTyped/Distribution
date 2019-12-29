package typings.backlogDashJs.backlogDashJsMod.Option.Project

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldType with Double] = js.native
  /* 7 */ @js.native
  object CheckBox extends TopLevel[CheckBox with Double]
  
  /* 4 */ @js.native
  object Date extends TopLevel[Date with Double]
  
  /* 6 */ @js.native
  object MultipleList extends TopLevel[MultipleList with Double]
  
  /* 3 */ @js.native
  object Numeric extends TopLevel[Numeric with Double]
  
  /* 8 */ @js.native
  object Radio extends TopLevel[Radio with Double]
  
  /* 5 */ @js.native
  object SingleList extends TopLevel[SingleList with Double]
  
  /* 1 */ @js.native
  object Text extends TopLevel[Text with Double]
  
  /* 2 */ @js.native
  object TextArea extends TopLevel[TextArea with Double]
  
}

