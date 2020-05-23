package typings.breeze.mod

import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "DataTypeSymbol")
@js.native
class DataTypeSymbol ()
  extends typings.breeze.breeze.DataTypeSymbol {
  /* CompleteClass */
  override var defaultValue: js.Any = js.native
  /* CompleteClass */
  override var parentEnum: IEnum = js.native
  /** Function to format this DataType for OData queries. */
  /* CompleteClass */
  override def fmtOData(`val`: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getName(): String = js.native
  /* CompleteClass */
  override def validatorCtor(context: js.Any): typings.breeze.breeze.Validator = js.native
}

