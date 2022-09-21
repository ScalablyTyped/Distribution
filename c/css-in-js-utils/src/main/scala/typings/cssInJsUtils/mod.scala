package typings.cssInJsUtils

import typings.cssInJsUtils.assignStyleMod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-in-js-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignStyle(base: StyleObject, extendingStyles: StyleObject*): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("assignStyle")(List(base.asInstanceOf[js.Any]).`++`(extendingStyles.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StyleObject]
  
  inline def camelCaseProperty(property: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCaseProperty")(property.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cssifyDeclaration(property: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cssifyDeclaration")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cssifyDeclaration(property: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cssifyDeclaration")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cssifyObject(style: typings.cssInJsUtils.cssifyObjectMod.StyleObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssifyObject")(style.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hyphenateProperty(property: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hyphenateProperty")(property.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hyphenateProperty(property: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hyphenateProperty")(property.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isPrefixedProperty(property: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrefixedProperty")(property.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrefixedValue(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrefixedValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUnitlessProperty(property: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnitlessProperty")(property.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeProperty(property: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProperty")(property.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolveArrayValue(property: String, value: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArrayValue")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unprefixProperty(property: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unprefixProperty")(property.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unprefixValue(value: String): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unprefixValue")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
  inline def unprefixValue(value: js.Array[String]): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unprefixValue")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
}
