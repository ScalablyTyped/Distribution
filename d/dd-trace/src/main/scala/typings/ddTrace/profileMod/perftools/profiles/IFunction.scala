package typings.ddTrace.profileMod.perftools.profiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Function. */
@js.native
trait IFunction extends js.Object {
  /** Function filename */
  var filename: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  /** Function id */
  var id: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  /** Function name */
  var name: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  /** Function startLine */
  var startLine: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  /** Function systemName */
  var systemName: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
}

object IFunction {
  @scala.inline
  def apply(): IFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFunction]
  }
  @scala.inline
  implicit class IFunctionOps[Self <: IFunction] (val x: Self) extends AnyVal {
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
    def setFilename(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFilenameNull: Self = this.set("filename", null)
    @scala.inline
    def setId(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setName(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setStartLine(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("startLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartLine: Self = this.set("startLine", js.undefined)
    @scala.inline
    def setStartLineNull: Self = this.set("startLine", null)
    @scala.inline
    def setSystemName(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("systemName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemName: Self = this.set("systemName", js.undefined)
    @scala.inline
    def setSystemNameNull: Self = this.set("systemName", null)
  }
  
}

