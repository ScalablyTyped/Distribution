package typings.awsSdkUtilEndpoints

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibGetAttrMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/lib/getAttr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAttr(value: GetAttrValue, path: String): GetAttrValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttr")(value.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[GetAttrValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type GetAttrValue = string | boolean | {[key: string] : @aws-sdk/util-endpoints.@aws-sdk/util-endpoints/dist-types/lib/getAttr.GetAttrValue} | std.Array<@aws-sdk/util-endpoints.@aws-sdk/util-endpoints/dist-types/lib/getAttr.GetAttrValue>
  }}}
  to avoid circular code involving: 
  - @aws-sdk/util-endpoints.@aws-sdk/util-endpoints/dist-types/lib/getAttr.GetAttrValue
  */
  type GetAttrValue = String | Boolean | StringDictionary[Any] | js.Array[Any]
}
