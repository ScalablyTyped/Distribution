package typings.awsSdkTypes.distTypesEventStreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkTypes.distTypesEventStreamMod.BooleanHeaderValue
  - typings.awsSdkTypes.distTypesEventStreamMod.ByteHeaderValue
  - typings.awsSdkTypes.distTypesEventStreamMod.ShortHeaderValue
  - typings.awsSdkTypes.distTypesEventStreamMod.IntegerHeaderValue
  - typings.awsSdkTypes.distTypesEventStreamMod.LongHeaderValue
  - typings.awsSdkTypes.distTypesEventStreamMod.BinaryHeaderValue
  - typings.awsSdkTypes.distTypesEventStreamMod.StringHeaderValue
  - typings.awsSdkTypes.distTypesEventStreamMod.TimestampHeaderValue
  - typings.awsSdkTypes.distTypesEventStreamMod.UuidHeaderValue
*/
trait MessageHeaderValue extends StObject
object MessageHeaderValue {
  
  inline def BinaryHeaderValue(value: js.typedarray.Uint8Array): typings.awsSdkTypes.distTypesEventStreamMod.BinaryHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[typings.awsSdkTypes.distTypesEventStreamMod.BinaryHeaderValue]
  }
  
  inline def BooleanHeaderValue(value: Boolean): typings.awsSdkTypes.distTypesEventStreamMod.BooleanHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.awsSdkTypes.distTypesEventStreamMod.BooleanHeaderValue]
  }
  
  inline def ByteHeaderValue(value: Double): typings.awsSdkTypes.distTypesEventStreamMod.ByteHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("byte")
    __obj.asInstanceOf[typings.awsSdkTypes.distTypesEventStreamMod.ByteHeaderValue]
  }
  
  inline def IntegerHeaderValue(value: Double): typings.awsSdkTypes.distTypesEventStreamMod.IntegerHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typings.awsSdkTypes.distTypesEventStreamMod.IntegerHeaderValue]
  }
  
  inline def LongHeaderValue(value: Int64): typings.awsSdkTypes.distTypesEventStreamMod.LongHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("long")
    __obj.asInstanceOf[typings.awsSdkTypes.distTypesEventStreamMod.LongHeaderValue]
  }
  
  inline def ShortHeaderValue(value: Double): typings.awsSdkTypes.distTypesEventStreamMod.ShortHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[typings.awsSdkTypes.distTypesEventStreamMod.ShortHeaderValue]
  }
  
  inline def StringHeaderValue(value: String): typings.awsSdkTypes.distTypesEventStreamMod.StringHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.awsSdkTypes.distTypesEventStreamMod.StringHeaderValue]
  }
  
  inline def TimestampHeaderValue(value: js.Date): typings.awsSdkTypes.distTypesEventStreamMod.TimestampHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timestamp")
    __obj.asInstanceOf[typings.awsSdkTypes.distTypesEventStreamMod.TimestampHeaderValue]
  }
  
  inline def UuidHeaderValue(value: String): typings.awsSdkTypes.distTypesEventStreamMod.UuidHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("uuid")
    __obj.asInstanceOf[typings.awsSdkTypes.distTypesEventStreamMod.UuidHeaderValue]
  }
}
