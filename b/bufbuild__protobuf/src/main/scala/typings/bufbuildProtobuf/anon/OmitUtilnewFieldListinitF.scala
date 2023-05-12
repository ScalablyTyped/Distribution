package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.bufbuildProtobuf.distTypesPrivateEnumMod.EnumObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/private/util.Util, 'newFieldList' | 'initFields'> */
trait OmitUtilnewFieldListinitF extends StObject {
  
  def clone[T /* <: Message[T] */](message: T): T
  @JSName("clone")
  var clone_Original: js.Function1[/* message */ Any, Any]
  
  def equals[T /* <: Message[T] */](`type`: MessageType[T]): Boolean
  def equals[T /* <: Message[T] */](`type`: MessageType[T], a: T): Boolean
  def equals[T /* <: Message[T] */](`type`: MessageType[T], a: T, b: T): Boolean
  def equals[T /* <: Message[T] */](`type`: MessageType[T], a: T, b: PlainMessage[T]): Boolean
  def equals[T /* <: Message[T] */](`type`: MessageType[T], a: Null, b: T): Boolean
  def equals[T /* <: Message[T] */](`type`: MessageType[T], a: Null, b: PlainMessage[T]): Boolean
  def equals[T /* <: Message[T] */](`type`: MessageType[T], a: Unit, b: T): Boolean
  def equals[T /* <: Message[T] */](`type`: MessageType[T], a: Unit, b: PlainMessage[T]): Boolean
  def equals[T /* <: Message[T] */](`type`: MessageType[T], a: PlainMessage[T]): Boolean
  def equals[T /* <: Message[T] */](`type`: MessageType[T], a: PlainMessage[T], b: T): Boolean
  def equals[T /* <: Message[T] */](`type`: MessageType[T], a: PlainMessage[T], b: PlainMessage[T]): Boolean
  @JSName("equals")
  var equals_Original: js.Function3[
    /* type */ MessageType[Any], 
    /* a */ js.UndefOr[Any | PlainMessage[Any] | Null], 
    /* b */ js.UndefOr[Any | PlainMessage[Any] | Null], 
    Boolean
  ]
  
  def initPartial[T /* <: Message[T] */](source: Unit, target: T): Unit
  def initPartial[T /* <: Message[T] */](source: PartialMessage[T], target: T): Unit
  @JSName("initPartial")
  var initPartial_Original: js.Function2[/* source */ js.UndefOr[PartialMessage[Any]], /* target */ Any, Unit]
  
  def setEnumType(enumObject: EnumObject, typeName: String, values: js.Array[OmitEnumValueInfolocalNam]): Unit
  def setEnumType(
    enumObject: EnumObject,
    typeName: String,
    values: js.Array[OmitEnumValueInfolocalNam],
    opt: js.Object
  ): Unit
  @JSName("setEnumType")
  var setEnumType_Original: js.Function4[
    /* enumObject */ EnumObject, 
    /* typeName */ String, 
    /* values */ js.Array[OmitEnumValueInfolocalNam], 
    /* opt */ js.UndefOr[js.Object], 
    Unit
  ]
}
object OmitUtilnewFieldListinitF {
  
  inline def apply(
    clone_ : /* message */ Any => Any,
    equals_ : (/* type */ MessageType[Any], /* a */ js.UndefOr[Any | PlainMessage[Any] | Null], /* b */ js.UndefOr[Any | PlainMessage[Any] | Null]) => Boolean,
    initPartial: (/* source */ js.UndefOr[PartialMessage[Any]], /* target */ Any) => Unit,
    setEnumType: (/* enumObject */ EnumObject, /* typeName */ String, /* values */ js.Array[OmitEnumValueInfolocalNam], /* opt */ js.UndefOr[js.Object]) => Unit
  ): OmitUtilnewFieldListinitF = {
    val __obj = js.Dynamic.literal(initPartial = js.Any.fromFunction2(initPartial), setEnumType = js.Any.fromFunction4(setEnumType))
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction3(equals_))
    __obj.asInstanceOf[OmitUtilnewFieldListinitF]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitUtilnewFieldListinitF] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: /* message */ Any => Any): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    inline def setEquals_(
      value: (/* type */ MessageType[Any], /* a */ js.UndefOr[Any | PlainMessage[Any] | Null], /* b */ js.UndefOr[Any | PlainMessage[Any] | Null]) => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction3(value))
    
    inline def setInitPartial(value: (/* source */ js.UndefOr[PartialMessage[Any]], /* target */ Any) => Unit): Self = StObject.set(x, "initPartial", js.Any.fromFunction2(value))
    
    inline def setSetEnumType(
      value: (/* enumObject */ EnumObject, /* typeName */ String, /* values */ js.Array[OmitEnumValueInfolocalNam], /* opt */ js.UndefOr[js.Object]) => Unit
    ): Self = StObject.set(x, "setEnumType", js.Any.fromFunction4(value))
  }
}
