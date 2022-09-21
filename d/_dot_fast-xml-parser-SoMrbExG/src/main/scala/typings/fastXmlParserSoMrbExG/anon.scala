package typings.fastXmlParserSoMrbExG

import typings.fastXmlParserSoMrbExG.fastXmlParserSoMrbExGBooleans.`false`
import typings.fastXmlParserSoMrbExG.fastXmlParserSoMrbExGStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: String
    
    var line: Double
    
    var msg: String
  }
  object Code {
    
    inline def apply(code: String, line: Double, msg: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<.fast-xml-parser-SoMrbExG..fast-xml-parser-SoMrbExG.X2jOptions> */
  trait PartialX2jOptions extends StObject {
    
    var allowBooleanAttributes: js.UndefOr[Boolean] = js.undefined
    
    var arrayMode: js.UndefOr[
        Boolean | strict | js.RegExp | (js.Function2[/* tagName */ String, /* parentTagName */ String, Boolean])
      ] = js.undefined
    
    var attrNodeName: js.UndefOr[`false` | String] = js.undefined
    
    var attrValueProcessor: js.UndefOr[js.Function2[/* attrValue */ String, /* attrName */ String, String]] = js.undefined
    
    var attributeNamePrefix: js.UndefOr[String] = js.undefined
    
    var cdataPositionChar: js.UndefOr[String] = js.undefined
    
    var cdataTagName: js.UndefOr[`false` | String] = js.undefined
    
    var ignoreAttributes: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNameSpace: js.UndefOr[Boolean] = js.undefined
    
    var parseAttributeValue: js.UndefOr[Boolean] = js.undefined
    
    var parseNodeValue: js.UndefOr[Boolean] = js.undefined
    
    var parseTrueNumberOnly: js.UndefOr[Boolean] = js.undefined
    
    var stopNodes: js.UndefOr[js.Array[String]] = js.undefined
    
    var tagValueProcessor: js.UndefOr[js.Function2[/* tagValue */ String, /* tagName */ String, String]] = js.undefined
    
    var textNodeName: js.UndefOr[String] = js.undefined
    
    var trimValues: js.UndefOr[Boolean] = js.undefined
  }
  object PartialX2jOptions {
    
    inline def apply(): PartialX2jOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialX2jOptions]
    }
    
    extension [Self <: PartialX2jOptions](x: Self) {
      
      inline def setAllowBooleanAttributes(value: Boolean): Self = StObject.set(x, "allowBooleanAttributes", value.asInstanceOf[js.Any])
      
      inline def setAllowBooleanAttributesUndefined: Self = StObject.set(x, "allowBooleanAttributes", js.undefined)
      
      inline def setArrayMode(
        value: Boolean | strict | js.RegExp | (js.Function2[/* tagName */ String, /* parentTagName */ String, Boolean])
      ): Self = StObject.set(x, "arrayMode", value.asInstanceOf[js.Any])
      
      inline def setArrayModeFunction2(value: (/* tagName */ String, /* parentTagName */ String) => Boolean): Self = StObject.set(x, "arrayMode", js.Any.fromFunction2(value))
      
      inline def setArrayModeUndefined: Self = StObject.set(x, "arrayMode", js.undefined)
      
      inline def setAttrNodeName(value: `false` | String): Self = StObject.set(x, "attrNodeName", value.asInstanceOf[js.Any])
      
      inline def setAttrNodeNameUndefined: Self = StObject.set(x, "attrNodeName", js.undefined)
      
      inline def setAttrValueProcessor(value: (/* attrValue */ String, /* attrName */ String) => String): Self = StObject.set(x, "attrValueProcessor", js.Any.fromFunction2(value))
      
      inline def setAttrValueProcessorUndefined: Self = StObject.set(x, "attrValueProcessor", js.undefined)
      
      inline def setAttributeNamePrefix(value: String): Self = StObject.set(x, "attributeNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setAttributeNamePrefixUndefined: Self = StObject.set(x, "attributeNamePrefix", js.undefined)
      
      inline def setCdataPositionChar(value: String): Self = StObject.set(x, "cdataPositionChar", value.asInstanceOf[js.Any])
      
      inline def setCdataPositionCharUndefined: Self = StObject.set(x, "cdataPositionChar", js.undefined)
      
      inline def setCdataTagName(value: `false` | String): Self = StObject.set(x, "cdataTagName", value.asInstanceOf[js.Any])
      
      inline def setCdataTagNameUndefined: Self = StObject.set(x, "cdataTagName", js.undefined)
      
      inline def setIgnoreAttributes(value: Boolean): Self = StObject.set(x, "ignoreAttributes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAttributesUndefined: Self = StObject.set(x, "ignoreAttributes", js.undefined)
      
      inline def setIgnoreNameSpace(value: Boolean): Self = StObject.set(x, "ignoreNameSpace", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNameSpaceUndefined: Self = StObject.set(x, "ignoreNameSpace", js.undefined)
      
      inline def setParseAttributeValue(value: Boolean): Self = StObject.set(x, "parseAttributeValue", value.asInstanceOf[js.Any])
      
      inline def setParseAttributeValueUndefined: Self = StObject.set(x, "parseAttributeValue", js.undefined)
      
      inline def setParseNodeValue(value: Boolean): Self = StObject.set(x, "parseNodeValue", value.asInstanceOf[js.Any])
      
      inline def setParseNodeValueUndefined: Self = StObject.set(x, "parseNodeValue", js.undefined)
      
      inline def setParseTrueNumberOnly(value: Boolean): Self = StObject.set(x, "parseTrueNumberOnly", value.asInstanceOf[js.Any])
      
      inline def setParseTrueNumberOnlyUndefined: Self = StObject.set(x, "parseTrueNumberOnly", js.undefined)
      
      inline def setStopNodes(value: js.Array[String]): Self = StObject.set(x, "stopNodes", value.asInstanceOf[js.Any])
      
      inline def setStopNodesUndefined: Self = StObject.set(x, "stopNodes", js.undefined)
      
      inline def setStopNodesVarargs(value: String*): Self = StObject.set(x, "stopNodes", js.Array(value*))
      
      inline def setTagValueProcessor(value: (/* tagValue */ String, /* tagName */ String) => String): Self = StObject.set(x, "tagValueProcessor", js.Any.fromFunction2(value))
      
      inline def setTagValueProcessorUndefined: Self = StObject.set(x, "tagValueProcessor", js.undefined)
      
      inline def setTextNodeName(value: String): Self = StObject.set(x, "textNodeName", value.asInstanceOf[js.Any])
      
      inline def setTextNodeNameUndefined: Self = StObject.set(x, "textNodeName", js.undefined)
      
      inline def setTrimValues(value: Boolean): Self = StObject.set(x, "trimValues", value.asInstanceOf[js.Any])
      
      inline def setTrimValuesUndefined: Self = StObject.set(x, "trimValues", js.undefined)
    }
  }
}
