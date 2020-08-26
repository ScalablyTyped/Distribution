package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlParameter extends js.Object {
  /**
    * The name of the parameter.
    */
  var name: js.UndefOr[ParameterName] = js.native
  /**
    * A hint that specifies the correct object type for data type mapping.  Values:     DECIMAL - The corresponding String parameter value is sent as an object of DECIMAL type to the database.    TIMESTAMP - The corresponding String parameter value is sent as an object of TIMESTAMP type to the database. The accepted format is YYYY-MM-DD HH:MM:SS[.FFF].    TIME - The corresponding String parameter value is sent as an object of TIME type to the database. The accepted format is HH:MM:SS[.FFF].    DATE - The corresponding String parameter value is sent as an object of DATE type to the database. The accepted format is YYYY-MM-DD.  
    */
  var typeHint: js.UndefOr[TypeHint] = js.native
  /**
    * The value of the parameter.
    */
  var value: js.UndefOr[Field] = js.native
}

object SqlParameter {
  @scala.inline
  def apply(): SqlParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlParameter]
  }
  @scala.inline
  implicit class SqlParameterOps[Self <: SqlParameter] (val x: Self) extends AnyVal {
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
    def setName(value: ParameterName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTypeHint(value: TypeHint): Self = this.set("typeHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeHint: Self = this.set("typeHint", js.undefined)
    @scala.inline
    def setValue(value: Field): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

