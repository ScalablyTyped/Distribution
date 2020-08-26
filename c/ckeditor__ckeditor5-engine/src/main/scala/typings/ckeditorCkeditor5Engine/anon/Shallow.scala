package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.Position
import typings.ckeditorCkeditor5Engine.mod.view.Range
import typings.ckeditorCkeditor5Engine.mod.view.TreeWalkerDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shallow extends js.Object {
  var boundaries: js.UndefOr[Range] = js.native
  var direction: js.UndefOr[TreeWalkerDirection] = js.native
  var ignoreElementEnd: js.UndefOr[Boolean] = js.native
  var shallow: js.UndefOr[Boolean] = js.native
  var singleCharacters: js.UndefOr[Boolean] = js.native
  var startPosition: js.UndefOr[Position] = js.native
}

object Shallow {
  @scala.inline
  def apply(): Shallow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shallow]
  }
  @scala.inline
  implicit class ShallowOps[Self <: Shallow] (val x: Self) extends AnyVal {
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
    def setBoundaries(value: Range): Self = this.set("boundaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundaries: Self = this.set("boundaries", js.undefined)
    @scala.inline
    def setDirection(value: TreeWalkerDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setIgnoreElementEnd(value: Boolean): Self = this.set("ignoreElementEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreElementEnd: Self = this.set("ignoreElementEnd", js.undefined)
    @scala.inline
    def setShallow(value: Boolean): Self = this.set("shallow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShallow: Self = this.set("shallow", js.undefined)
    @scala.inline
    def setSingleCharacters(value: Boolean): Self = this.set("singleCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleCharacters: Self = this.set("singleCharacters", js.undefined)
    @scala.inline
    def setStartPosition(value: Position): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
  }
  
}

