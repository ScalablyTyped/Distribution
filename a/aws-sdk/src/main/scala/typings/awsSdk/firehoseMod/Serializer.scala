package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serializer extends js.Object {
  /**
    * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information, see Apache ORC.
    */
  var OrcSerDe: js.UndefOr[typings.awsSdk.firehoseMod.OrcSerDe] = js.native
  /**
    * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more information, see Apache Parquet.
    */
  var ParquetSerDe: js.UndefOr[typings.awsSdk.firehoseMod.ParquetSerDe] = js.native
}

object Serializer {
  @scala.inline
  def apply(): Serializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Serializer]
  }
  @scala.inline
  implicit class SerializerOps[Self <: Serializer] (val x: Self) extends AnyVal {
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
    def setOrcSerDe(value: OrcSerDe): Self = this.set("OrcSerDe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrcSerDe: Self = this.set("OrcSerDe", js.undefined)
    @scala.inline
    def setParquetSerDe(value: ParquetSerDe): Self = this.set("ParquetSerDe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParquetSerDe: Self = this.set("ParquetSerDe", js.undefined)
  }
  
}

