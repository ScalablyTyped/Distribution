package typings.bufbuildProtobuf

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.bufbuildProtobuf.anon.OmitEnumValueInfolocalNam
import typings.bufbuildProtobuf.distTypesEnumMod.EnumType
import typings.bufbuildProtobuf.distTypesEnumMod.EnumValueInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateEnumMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/private/enum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEnumType(enumObject: EnumObject): EnumType = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnumType")(enumObject.asInstanceOf[js.Any]).asInstanceOf[EnumType]
  
  inline def makeEnum(typeName: String, values: js.Array[EnumValueInfo | OmitEnumValueInfolocalNam]): EnumObject = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEnum")(typeName.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[EnumObject]
  inline def makeEnum(typeName: String, values: js.Array[EnumValueInfo | OmitEnumValueInfolocalNam], opt: js.Object): EnumObject = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEnum")(typeName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[EnumObject]
  
  inline def makeEnumType(typeName: String, values: js.Array[EnumValueInfo | OmitEnumValueInfolocalNam]): EnumType = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEnumType")(typeName.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[EnumType]
  inline def makeEnumType(typeName: String, values: js.Array[EnumValueInfo | OmitEnumValueInfolocalNam], _opt: js.Object): EnumType = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEnumType")(typeName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], _opt.asInstanceOf[js.Any])).asInstanceOf[EnumType]
  
  inline def setEnumType(enumObject: EnumObject, typeName: String, values: js.Array[OmitEnumValueInfolocalNam]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEnumType")(enumObject.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setEnumType(
    enumObject: EnumObject,
    typeName: String,
    values: js.Array[OmitEnumValueInfolocalNam],
    opt: js.Object
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEnumType")(enumObject.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type EnumObject = (StringDictionary[Double | String]) & NumberDictionary[String]
}
