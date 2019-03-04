package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILookupMultiFieldExpression extends js.Object {
  /** DEPRECATED: "Eq" operation in CAML works exactly the same as "Includes". To avoid confusion, please use Includes. */
  def EqualTo(value: js.Any): IExpression
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().EqualTo(value)" instead. */
  def Includes(value: js.Any): IExpression
  /** Checks a condition against every item in the multi lookup value */
  def IncludesSuchItemThat(): ILookupFieldExpression
  /** Checks whether the field values collection is not empty */
  def IsNotNull(): IExpression
  /** Checks whether the field values collection is empty */
  def IsNull(): IExpression
  /** DEPRECATED: "Neq" operation in CAML works exactly the same as "NotIncludes". To avoid confusion, please use NotIncludes. */
  def NotEqualTo(value: js.Any): IExpression
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().NotEqualTo(value)" instead. */
  def NotIncludes(value: js.Any): IExpression
}

object ILookupMultiFieldExpression {
  @scala.inline
  def apply(
    EqualTo: js.Function1[js.Any, IExpression],
    Includes: js.Function1[js.Any, IExpression],
    IncludesSuchItemThat: js.Function0[ILookupFieldExpression],
    IsNotNull: js.Function0[IExpression],
    IsNull: js.Function0[IExpression],
    NotEqualTo: js.Function1[js.Any, IExpression],
    NotIncludes: js.Function1[js.Any, IExpression]
  ): ILookupMultiFieldExpression = {
    val __obj = js.Dynamic.literal(EqualTo = EqualTo, Includes = Includes, IncludesSuchItemThat = IncludesSuchItemThat, IsNotNull = IsNotNull, IsNull = IsNull, NotEqualTo = NotEqualTo, NotIncludes = NotIncludes)
  
    __obj.asInstanceOf[ILookupMultiFieldExpression]
  }
}

