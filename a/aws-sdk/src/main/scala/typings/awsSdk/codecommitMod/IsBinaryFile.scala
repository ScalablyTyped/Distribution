package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsBinaryFile extends js.Object {
  /**
    * The binary or non-binary status of a file in the base of a merge or pull request.
    */
  var base: js.UndefOr[CapitalBoolean] = js.native
  /**
    * The binary or non-binary status of a file in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[CapitalBoolean] = js.native
  /**
    * The binary or non-binary status of file in the source of a merge or pull request.
    */
  var source: js.UndefOr[CapitalBoolean] = js.native
}

object IsBinaryFile {
  @scala.inline
  def apply(): IsBinaryFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsBinaryFile]
  }
  @scala.inline
  implicit class IsBinaryFileOps[Self <: IsBinaryFile] (val x: Self) extends AnyVal {
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
    def setBase(value: CapitalBoolean): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setDestination(value: CapitalBoolean): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setSource(value: CapitalBoolean): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

