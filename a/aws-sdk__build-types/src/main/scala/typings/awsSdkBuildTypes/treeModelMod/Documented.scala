package typings.awsSdkBuildTypes.treeModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Documented extends js.Object {
  var documentation: String = js.native
}

object Documented {
  @scala.inline
  def apply(documentation: String): Documented = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documented]
  }
  @scala.inline
  implicit class DocumentedOps[Self <: Documented] (val x: Self) extends AnyVal {
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
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
  }
  
}

