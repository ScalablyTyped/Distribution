package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.QualifiedTypeIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualifiedTypeIdentifier_
  extends Node
     with Flow {
  var id: Identifier_ = js.native
  var qualification: Identifier_ | QualifiedTypeIdentifier_ = js.native
  @JSName("type")
  var type_QualifiedTypeIdentifier_ : QualifiedTypeIdentifier = js.native
}

object QualifiedTypeIdentifier_ {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    qualification: Identifier_ | QualifiedTypeIdentifier_,
    start: Double,
    `type`: QualifiedTypeIdentifier
  ): QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualifiedTypeIdentifier_]
  }
  @scala.inline
  implicit class QualifiedTypeIdentifier_Ops[Self <: QualifiedTypeIdentifier_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setQualification(value: Identifier_ | QualifiedTypeIdentifier_): Self = this.set("qualification", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: QualifiedTypeIdentifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

