package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  /**
    * An array of column values.
    */
  var arrayValues: js.UndefOr[ArrayValueList] = js.native
  /**
    * A value for a column of big integer data type.
    */
  var bigIntValue: js.UndefOr[BoxedLong] = js.native
  /**
    * A value for a column of BIT data type.
    */
  var bitValue: js.UndefOr[BoxedBoolean] = js.native
  /**
    * A value for a column of BLOB data type.
    */
  var blobValue: js.UndefOr[_Blob] = js.native
  /**
    * A value for a column of double data type.
    */
  var doubleValue: js.UndefOr[BoxedDouble] = js.native
  /**
    * A value for a column of integer data type.
    */
  var intValue: js.UndefOr[BoxedInteger] = js.native
  /**
    * A NULL value.
    */
  var isNull: js.UndefOr[BoxedBoolean] = js.native
  /**
    * A value for a column of real data type.
    */
  var realValue: js.UndefOr[BoxedFloat] = js.native
  /**
    * A value for a column of string data type.
    */
  var stringValue: js.UndefOr[String] = js.native
  /**
    * A value for a column of STRUCT data type.
    */
  var structValue: js.UndefOr[StructValue] = js.native
}

object Value {
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
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
    def setArrayValuesVarargs(value: Value*): Self = this.set("arrayValues", js.Array(value :_*))
    @scala.inline
    def setArrayValues(value: ArrayValueList): Self = this.set("arrayValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayValues: Self = this.set("arrayValues", js.undefined)
    @scala.inline
    def setBigIntValue(value: BoxedLong): Self = this.set("bigIntValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigIntValue: Self = this.set("bigIntValue", js.undefined)
    @scala.inline
    def setBitValue(value: BoxedBoolean): Self = this.set("bitValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitValue: Self = this.set("bitValue", js.undefined)
    @scala.inline
    def setBlobValue(value: _Blob): Self = this.set("blobValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlobValue: Self = this.set("blobValue", js.undefined)
    @scala.inline
    def setDoubleValue(value: BoxedDouble): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    @scala.inline
    def setIntValue(value: BoxedInteger): Self = this.set("intValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntValue: Self = this.set("intValue", js.undefined)
    @scala.inline
    def setIsNull(value: BoxedBoolean): Self = this.set("isNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNull: Self = this.set("isNull", js.undefined)
    @scala.inline
    def setRealValue(value: BoxedFloat): Self = this.set("realValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealValue: Self = this.set("realValue", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
    @scala.inline
    def setStructValue(value: StructValue): Self = this.set("structValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructValue: Self = this.set("structValue", js.undefined)
  }
  
}

