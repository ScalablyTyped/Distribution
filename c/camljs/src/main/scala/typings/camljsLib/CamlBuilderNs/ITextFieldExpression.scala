package typings
package camljsLib.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITextFieldExpression extends js.Object {
  /** Checks whether the value of the field begins with the specified substring */
  def BeginsWith(value: java.lang.String): IExpression
  /** Checks whether the value of the field contains the specified substring */
  def Contains(value: java.lang.String): IExpression
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: java.lang.String): IExpression
  /** Checks whether the value of the field is equal to one of the specified values */
  def In(arrayOfValues: js.Array[java.lang.String]): IExpression
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: java.lang.String): IExpression
}

