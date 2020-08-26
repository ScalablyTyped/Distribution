package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockerDeclaration extends js.Object {
  /**
    * Reserved for future use.
    */
  var name: BlockerName = js.native
  /**
    * Reserved for future use.
    */
  var `type`: BlockerType = js.native
}

object BlockerDeclaration {
  @scala.inline
  def apply(name: BlockerName, `type`: BlockerType): BlockerDeclaration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockerDeclaration]
  }
  @scala.inline
  implicit class BlockerDeclarationOps[Self <: BlockerDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: BlockerName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: BlockerType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

