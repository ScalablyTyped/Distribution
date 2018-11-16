package typings
package camljsLib.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateTimeFieldExpression extends js.Object {
  /** Checks whether the value of the field is equal to the specified value.
              The datetime value should be defined in ISO 8601 format! */
  def EqualTo(value: java.lang.String): IExpression = js.native
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: stdLib.Date): IExpression = js.native
  /** Checks whether the value of the field is greater than the specified value.
              The datetime value should be defined in ISO 8601 format! */
  def GreaterThan(value: java.lang.String): IExpression = js.native
  /** Checks whether the value of the field is greater than the specified value */
  def GreaterThan(value: stdLib.Date): IExpression = js.native
  /** Checks whether the value of the field is greater than or equal to the specified value.
              The datetime value should be defined in ISO 8601 format! */
  def GreaterThanOrEqualTo(value: java.lang.String): IExpression = js.native
  /** Checks whether the value of the field is greater than or equal to the specified value */
  def GreaterThanOrEqualTo(value: stdLib.Date): IExpression = js.native
  /** Checks whether the value of the field is equal to one of the specified values */
  /** Checks whether the value of the field is equal to one of the specified values.
              The datetime value should be defined in ISO 8601 format! */
  def In(arrayOfValues: js.Array[java.lang.String | stdLib.Date]): IExpression = js.native
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression = js.native
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression = js.native
  /** Checks whether the value of the field is less than the specified value.
              The datetime value should be defined in ISO 8601 format! */
  def LessThan(value: java.lang.String): IExpression = js.native
  /** Checks whether the value of the field is less than the specified value */
  def LessThan(value: stdLib.Date): IExpression = js.native
  /** Checks whether the value of the field is less than or equal to the specified value.
              The datetime value should be defined in ISO 8601 format! */
  def LessThanOrEqualTo(value: java.lang.String): IExpression = js.native
  /** Checks whether the value of the field is less than or equal to the specified value */
  def LessThanOrEqualTo(value: stdLib.Date): IExpression = js.native
  /** Checks whether the value of the field is not equal to the specified value.
              The datetime value should be defined in ISO 8601 format! */
  def NotEqualTo(value: java.lang.String): IExpression = js.native
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: stdLib.Date): IExpression = js.native
}

