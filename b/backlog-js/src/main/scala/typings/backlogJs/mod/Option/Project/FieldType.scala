package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends js.Object
@JSImport("backlog-js", "Option.Project.FieldType")
@js.native
object FieldType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldType with Double] = js.native
  
  @js.native
  sealed trait CheckBox extends FieldType
  /* 7 */ @js.native
  object CheckBox extends TopLevel[CheckBox with Double]
  
  @js.native
  sealed trait Date extends FieldType
  /* 4 */ @js.native
  object Date extends TopLevel[Date with Double]
  
  @js.native
  sealed trait MultipleList extends FieldType
  /* 6 */ @js.native
  object MultipleList extends TopLevel[MultipleList with Double]
  
  @js.native
  sealed trait Numeric extends FieldType
  /* 3 */ @js.native
  object Numeric extends TopLevel[Numeric with Double]
  
  @js.native
  sealed trait Radio extends FieldType
  /* 8 */ @js.native
  object Radio extends TopLevel[Radio with Double]
  
  @js.native
  sealed trait SingleList extends FieldType
  /* 5 */ @js.native
  object SingleList extends TopLevel[SingleList with Double]
  
  @js.native
  sealed trait Text extends FieldType
  /* 1 */ @js.native
  object Text extends TopLevel[Text with Double]
  
  @js.native
  sealed trait TextArea extends FieldType
  /* 2 */ @js.native
  object TextArea extends TopLevel[TextArea with Double]
}
