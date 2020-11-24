package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.binary
import typings.awsSdkTypes.awsSdkTypesStrings.boolean
import typings.awsSdkTypes.awsSdkTypesStrings.byte
import typings.awsSdkTypes.awsSdkTypesStrings.integer
import typings.awsSdkTypes.awsSdkTypesStrings.long
import typings.awsSdkTypes.awsSdkTypesStrings.short
import typings.awsSdkTypes.awsSdkTypesStrings.string
import typings.awsSdkTypes.awsSdkTypesStrings.timestamp
import typings.awsSdkTypes.awsSdkTypesStrings.uuid
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
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
trait MessageHeaderValue extends js.Object
object MessageHeaderValue {
  
  @scala.inline
  def ShortHeaderValue(`type`: short, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def BooleanHeaderValue(`type`: boolean, value: Boolean): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def UuidHeaderValue(`type`: uuid, value: String): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def BinaryHeaderValue(`type`: binary, value: Uint8Array): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def StringHeaderValue(`type`: string, value: String): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def TimestampHeaderValue(`type`: timestamp, value: Date): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def ByteHeaderValue(`type`: byte, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def IntegerHeaderValue(`type`: integer, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  
  @scala.inline
  def LongHeaderValue(`type`: long, value: Int64): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
}
