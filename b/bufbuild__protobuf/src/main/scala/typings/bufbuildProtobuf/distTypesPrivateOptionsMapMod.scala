package typings.bufbuildProtobuf

import org.scalablytyped.runtime.StringDictionary
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateOptionsMapMod {
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type OptionsMap = {readonly [extensionName: string] : @bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonValue}
  }}}
  to avoid circular code involving: 
  - @bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonObject
  - @bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonValue
  - @bufbuild/protobuf.@bufbuild/protobuf/dist/types/private/options-map.OptionsMap
  */
  trait OptionsMap
    extends StObject
       with /* k */ StringDictionary[JsonValue]
  object OptionsMap {
    
    inline def apply(): OptionsMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsMap]
    }
  }
}
