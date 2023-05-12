package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.OmitEnumValueInfolocalNam
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.bufbuildProtobuf.distTypesPrivateEnumMod.EnumObject
import typings.bufbuildProtobuf.distTypesPrivateFieldListMod.FieldListSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateUtilMod {
  
  @js.native
  trait Util extends StObject {
    
    /**
      * Create a deep copy.
      */
    def clone[T /* <: Message[T] */](message: T): T = js.native
    
    /**
      * Compares two messages of the same type recursively.
      * Will also return true if both messages are `undefined` or `null`.
      */
    def equals[T /* <: Message[T] */](`type`: MessageType[T]): Boolean = js.native
    def equals[T /* <: Message[T] */](`type`: MessageType[T], a: T): Boolean = js.native
    def equals[T /* <: Message[T] */](`type`: MessageType[T], a: T, b: T): Boolean = js.native
    def equals[T /* <: Message[T] */](`type`: MessageType[T], a: T, b: PlainMessage[T]): Boolean = js.native
    def equals[T /* <: Message[T] */](`type`: MessageType[T], a: Null, b: T): Boolean = js.native
    def equals[T /* <: Message[T] */](`type`: MessageType[T], a: Null, b: PlainMessage[T]): Boolean = js.native
    def equals[T /* <: Message[T] */](`type`: MessageType[T], a: Unit, b: T): Boolean = js.native
    def equals[T /* <: Message[T] */](`type`: MessageType[T], a: Unit, b: PlainMessage[T]): Boolean = js.native
    def equals[T /* <: Message[T] */](`type`: MessageType[T], a: PlainMessage[T]): Boolean = js.native
    def equals[T /* <: Message[T] */](`type`: MessageType[T], a: PlainMessage[T], b: T): Boolean = js.native
    def equals[T /* <: Message[T] */](`type`: MessageType[T], a: PlainMessage[T], b: PlainMessage[T]): Boolean = js.native
    
    /**
      * Set default field values on the target message.
      */
    def initFields(target: Message[AnyMessage]): Unit = js.native
    
    def initPartial[T /* <: Message[T] */](source: Unit, target: T): Unit = js.native
    /**
      * Set specified field values on the target message, recursively.
      */
    def initPartial[T /* <: Message[T] */](source: PartialMessage[T], target: T): Unit = js.native
    
    /**
      * Create a field list
      */
    def newFieldList(fields: FieldListSource): FieldList = js.native
    
    /**
      * Sets reflection information on a generated enum.
      */
    def setEnumType(enumObject: EnumObject, typeName: String, values: js.Array[OmitEnumValueInfolocalNam]): Unit = js.native
    def setEnumType(
      enumObject: EnumObject,
      typeName: String,
      values: js.Array[OmitEnumValueInfolocalNam],
      opt: js.Object
    ): Unit = js.native
  }
}
