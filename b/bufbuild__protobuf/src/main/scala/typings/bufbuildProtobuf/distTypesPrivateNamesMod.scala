package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescEnum
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescEnumValue
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMessage
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMethod
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescOneof
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateNamesMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/private/names", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/private/names", "fieldJsonName")
  @js.native
  val fieldJsonName: js.Function1[/* snakeCase */ String, String] = js.native
  
  inline def findEnumSharedPrefix(enumName: String, valueNames: js.Array[String]): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findEnumSharedPrefix")(enumName.asInstanceOf[js.Any], valueNames.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def localFieldName(protoName: String, inOneof: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localFieldName")(protoName.asInstanceOf[js.Any], inOneof.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def localName(desc: DescEnum): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localName")(desc.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def localName(desc: DescEnumValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localName")(desc.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def localName(desc: DescField): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localName")(desc.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def localName(desc: DescMessage): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localName")(desc.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def localName(desc: DescMethod): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localName")(desc.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def localName(desc: DescOneof): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localName")(desc.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def localName(desc: DescService): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localName")(desc.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def localOneofName(protoName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localOneofName")(protoName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def safeIdentifier(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeIdentifier")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def safeObjectProperty(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeObjectProperty")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
