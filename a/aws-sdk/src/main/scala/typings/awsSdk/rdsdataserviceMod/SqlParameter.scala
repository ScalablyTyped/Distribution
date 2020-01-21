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
  def apply(name: ParameterName = null, typeHint: TypeHint = null, value: Field = null): SqlParameter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (typeHint != null) __obj.updateDynamic("typeHint")(typeHint.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlParameter]
  }
}

