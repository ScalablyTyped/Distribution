package typings.awsSdkTypes.eventStreamMod

import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkTypes.eventStreamMod.BooleanHeaderValue
  - typings.awsSdkTypes.eventStreamMod.ByteHeaderValue
  - typings.awsSdkTypes.eventStreamMod.ShortHeaderValue
  - typings.awsSdkTypes.eventStreamMod.IntegerHeaderValue
  - typings.awsSdkTypes.eventStreamMod.LongHeaderValue
  - typings.awsSdkTypes.eventStreamMod.BinaryHeaderValue
  - typings.awsSdkTypes.eventStreamMod.StringHeaderValue
  - typings.awsSdkTypes.eventStreamMod.TimestampHeaderValue
  - typings.awsSdkTypes.eventStreamMod.UuidHeaderValue
*/
trait MessageHeaderValue extends StObject
object MessageHeaderValue {
  
  @scala.inline
  def BinaryHeaderValue(value: Uint8Array): typings.awsSdkTypes.eventStreamMod.BinaryHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.BinaryHeaderValue]
  }
  
  @scala.inline
  def BooleanHeaderValue(value: Boolean): typings.awsSdkTypes.eventStreamMod.BooleanHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.BooleanHeaderValue]
  }
  
  @scala.inline
  def ByteHeaderValue(value: Double): typings.awsSdkTypes.eventStreamMod.ByteHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("byte")
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.ByteHeaderValue]
  }
  
  @scala.inline
  def IntegerHeaderValue(value: Double): typings.awsSdkTypes.eventStreamMod.IntegerHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.IntegerHeaderValue]
  }
  
  @scala.inline
  def LongHeaderValue(value: Int64): typings.awsSdkTypes.eventStreamMod.LongHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("long")
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.LongHeaderValue]
  }
  
  @scala.inline
  def ShortHeaderValue(value: Double): typings.awsSdkTypes.eventStreamMod.ShortHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.ShortHeaderValue]
  }
  
  @scala.inline
  def StringHeaderValue(value: String): typings.awsSdkTypes.eventStreamMod.StringHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.StringHeaderValue]
  }
  
  @scala.inline
  def TimestampHeaderValue(value: Date): typings.awsSdkTypes.eventStreamMod.TimestampHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timestamp")
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.TimestampHeaderValue]
  }
  
  @scala.inline
  def UuidHeaderValue(value: String): typings.awsSdkTypes.eventStreamMod.UuidHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("uuid")
    __obj.asInstanceOf[typings.awsSdkTypes.eventStreamMod.UuidHeaderValue]
  }
}
