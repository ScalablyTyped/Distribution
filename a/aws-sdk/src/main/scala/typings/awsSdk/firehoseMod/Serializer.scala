package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Serializer extends StObject {
  
  /**
    * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information, see Apache ORC.
    */
  var OrcSerDe: js.UndefOr[typings.awsSdk.firehoseMod.OrcSerDe] = js.undefined
  
  /**
    * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more information, see Apache Parquet.
    */
  var ParquetSerDe: js.UndefOr[typings.awsSdk.firehoseMod.ParquetSerDe] = js.undefined
}
object Serializer {
  
  @scala.inline
  def apply(): Serializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Serializer]
  }
  
  @scala.inline
  implicit class SerializerMutableBuilder[Self <: Serializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrcSerDe(value: OrcSerDe): Self = StObject.set(x, "OrcSerDe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrcSerDeUndefined: Self = StObject.set(x, "OrcSerDe", js.undefined)
    
    @scala.inline
    def setParquetSerDe(value: ParquetSerDe): Self = StObject.set(x, "ParquetSerDe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParquetSerDeUndefined: Self = StObject.set(x, "ParquetSerDe", js.undefined)
  }
}
