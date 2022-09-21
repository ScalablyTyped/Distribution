package typings.fastXmlParserSoMrbExG

import typings.fastXmlParserSoMrbExG.anon.Code
import typings.fastXmlParserSoMrbExG.anon.PartialX2jOptions
import typings.fastXmlParserSoMrbExG.fastXmlParserSoMrbExGBooleans.`false`
import typings.fastXmlParserSoMrbExG.fastXmlParserSoMrbExGBooleans.`true`
import typings.fastXmlParserSoMrbExG.fastXmlParserSoMrbExGStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport(".fast-xml-parser-SoMrbExG", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert2nimn(node: Any, e_schema: ESchema): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert2nimn")(node.asInstanceOf[js.Any], e_schema.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def convert2nimn(node: Any, e_schema: ESchema, options: X2jOptionsOptional): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert2nimn")(node.asInstanceOf[js.Any], e_schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def convertToJson(node: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToJson")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def convertToJson(node: Any, options: X2jOptionsOptional): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToJson")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def convertToJsonString(node: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToJsonString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToJsonString(node: Any, options: X2jOptionsOptional): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToJsonString")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTraversalObj(xmlData: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTraversalObj")(xmlData.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getTraversalObj(xmlData: String, options: X2jOptionsOptional): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTraversalObj")(xmlData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport(".fast-xml-parser-SoMrbExG", "j2xParser")
  @js.native
  open class j2xParser protected () extends StObject {
    def this(options: J2xOptionsOptional) = this()
    
    def parse(options: Any): Any = js.native
  }
  
  inline def parse(xmlData: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xmlData.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(xmlData: String, options: Unit, validationOptions: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xmlData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(xmlData: String, options: Unit, validationOptions: validationOptionsOptional): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xmlData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(xmlData: String, options: X2jOptionsOptional): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xmlData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(xmlData: String, options: X2jOptionsOptional, validationOptions: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xmlData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(xmlData: String, options: X2jOptionsOptional, validationOptions: validationOptionsOptional): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xmlData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseToNimn(xmlData: String, schema: Any, options: PartialX2jOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToNimn")(xmlData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def validate(xmlData: String): `true` | ValidationError = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(xmlData.asInstanceOf[js.Any]).asInstanceOf[`true` | ValidationError]
  inline def validate(xmlData: String, options: validationOptionsOptional): `true` | ValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(xmlData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[`true` | ValidationError]
  
  type ESchema = String | js.Object | (js.Array[String | js.Object])
  
  trait J2xOptions extends StObject {
    
    var attrNodeName: `false` | String
    
    def attrValueProcessor(attrValue: String): String
    
    var attributeNamePrefix: String
    
    var cdataPositionChar: String
    
    var cdataTagName: `false` | String
    
    var format: Boolean
    
    var ignoreAttributes: Boolean
    
    var indentBy: String
    
    var supressEmptyNode: Boolean
    
    def tagValueProcessor(tagValue: String): String
    
    var textNodeName: String
  }
  object J2xOptions {
    
    inline def apply(
      attrNodeName: `false` | String,
      attrValueProcessor: String => String,
      attributeNamePrefix: String,
      cdataPositionChar: String,
      cdataTagName: `false` | String,
      format: Boolean,
      ignoreAttributes: Boolean,
      indentBy: String,
      supressEmptyNode: Boolean,
      tagValueProcessor: String => String,
      textNodeName: String
    ): J2xOptions = {
      val __obj = js.Dynamic.literal(attrNodeName = attrNodeName.asInstanceOf[js.Any], attrValueProcessor = js.Any.fromFunction1(attrValueProcessor), attributeNamePrefix = attributeNamePrefix.asInstanceOf[js.Any], cdataPositionChar = cdataPositionChar.asInstanceOf[js.Any], cdataTagName = cdataTagName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], ignoreAttributes = ignoreAttributes.asInstanceOf[js.Any], indentBy = indentBy.asInstanceOf[js.Any], supressEmptyNode = supressEmptyNode.asInstanceOf[js.Any], tagValueProcessor = js.Any.fromFunction1(tagValueProcessor), textNodeName = textNodeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[J2xOptions]
    }
    
    extension [Self <: J2xOptions](x: Self) {
      
      inline def setAttrNodeName(value: `false` | String): Self = StObject.set(x, "attrNodeName", value.asInstanceOf[js.Any])
      
      inline def setAttrValueProcessor(value: String => String): Self = StObject.set(x, "attrValueProcessor", js.Any.fromFunction1(value))
      
      inline def setAttributeNamePrefix(value: String): Self = StObject.set(x, "attributeNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setCdataPositionChar(value: String): Self = StObject.set(x, "cdataPositionChar", value.asInstanceOf[js.Any])
      
      inline def setCdataTagName(value: `false` | String): Self = StObject.set(x, "cdataTagName", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAttributes(value: Boolean): Self = StObject.set(x, "ignoreAttributes", value.asInstanceOf[js.Any])
      
      inline def setIndentBy(value: String): Self = StObject.set(x, "indentBy", value.asInstanceOf[js.Any])
      
      inline def setSupressEmptyNode(value: Boolean): Self = StObject.set(x, "supressEmptyNode", value.asInstanceOf[js.Any])
      
      inline def setTagValueProcessor(value: String => String): Self = StObject.set(x, "tagValueProcessor", js.Any.fromFunction1(value))
      
      inline def setTextNodeName(value: String): Self = StObject.set(x, "textNodeName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<.fast-xml-parser-SoMrbExG..fast-xml-parser-SoMrbExG.J2xOptions> */
  trait J2xOptionsOptional extends StObject {
    
    var attrNodeName: js.UndefOr[`false` | String] = js.undefined
    
    var attrValueProcessor: js.UndefOr[js.Function1[/* attrValue */ String, String]] = js.undefined
    
    var attributeNamePrefix: js.UndefOr[String] = js.undefined
    
    var cdataPositionChar: js.UndefOr[String] = js.undefined
    
    var cdataTagName: js.UndefOr[`false` | String] = js.undefined
    
    var format: js.UndefOr[Boolean] = js.undefined
    
    var ignoreAttributes: js.UndefOr[Boolean] = js.undefined
    
    var indentBy: js.UndefOr[String] = js.undefined
    
    var supressEmptyNode: js.UndefOr[Boolean] = js.undefined
    
    var tagValueProcessor: js.UndefOr[js.Function1[/* tagValue */ String, String]] = js.undefined
    
    var textNodeName: js.UndefOr[String] = js.undefined
  }
  object J2xOptionsOptional {
    
    inline def apply(): J2xOptionsOptional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[J2xOptionsOptional]
    }
    
    extension [Self <: J2xOptionsOptional](x: Self) {
      
      inline def setAttrNodeName(value: `false` | String): Self = StObject.set(x, "attrNodeName", value.asInstanceOf[js.Any])
      
      inline def setAttrNodeNameUndefined: Self = StObject.set(x, "attrNodeName", js.undefined)
      
      inline def setAttrValueProcessor(value: /* attrValue */ String => String): Self = StObject.set(x, "attrValueProcessor", js.Any.fromFunction1(value))
      
      inline def setAttrValueProcessorUndefined: Self = StObject.set(x, "attrValueProcessor", js.undefined)
      
      inline def setAttributeNamePrefix(value: String): Self = StObject.set(x, "attributeNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setAttributeNamePrefixUndefined: Self = StObject.set(x, "attributeNamePrefix", js.undefined)
      
      inline def setCdataPositionChar(value: String): Self = StObject.set(x, "cdataPositionChar", value.asInstanceOf[js.Any])
      
      inline def setCdataPositionCharUndefined: Self = StObject.set(x, "cdataPositionChar", js.undefined)
      
      inline def setCdataTagName(value: `false` | String): Self = StObject.set(x, "cdataTagName", value.asInstanceOf[js.Any])
      
      inline def setCdataTagNameUndefined: Self = StObject.set(x, "cdataTagName", js.undefined)
      
      inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIgnoreAttributes(value: Boolean): Self = StObject.set(x, "ignoreAttributes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAttributesUndefined: Self = StObject.set(x, "ignoreAttributes", js.undefined)
      
      inline def setIndentBy(value: String): Self = StObject.set(x, "indentBy", value.asInstanceOf[js.Any])
      
      inline def setIndentByUndefined: Self = StObject.set(x, "indentBy", js.undefined)
      
      inline def setSupressEmptyNode(value: Boolean): Self = StObject.set(x, "supressEmptyNode", value.asInstanceOf[js.Any])
      
      inline def setSupressEmptyNodeUndefined: Self = StObject.set(x, "supressEmptyNode", js.undefined)
      
      inline def setTagValueProcessor(value: /* tagValue */ String => String): Self = StObject.set(x, "tagValueProcessor", js.Any.fromFunction1(value))
      
      inline def setTagValueProcessorUndefined: Self = StObject.set(x, "tagValueProcessor", js.undefined)
      
      inline def setTextNodeName(value: String): Self = StObject.set(x, "textNodeName", value.asInstanceOf[js.Any])
      
      inline def setTextNodeNameUndefined: Self = StObject.set(x, "textNodeName", js.undefined)
    }
  }
  
  trait ValidationError extends StObject {
    
    var err: Code
  }
  object ValidationError {
    
    inline def apply(err: Code): ValidationError = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    extension [Self <: ValidationError](x: Self) {
      
      inline def setErr(value: Code): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    }
  }
  
  trait X2jOptions extends StObject {
    
    var allowBooleanAttributes: Boolean
    
    var arrayMode: Boolean | strict | js.RegExp | (js.Function2[/* tagName */ String, /* parentTagName */ String, Boolean])
    
    var attrNodeName: `false` | String
    
    def attrValueProcessor(attrValue: String, attrName: String): String
    
    var attributeNamePrefix: String
    
    var cdataPositionChar: String
    
    var cdataTagName: `false` | String
    
    var ignoreAttributes: Boolean
    
    var ignoreNameSpace: Boolean
    
    var parseAttributeValue: Boolean
    
    var parseNodeValue: Boolean
    
    var parseTrueNumberOnly: Boolean
    
    var stopNodes: js.Array[String]
    
    def tagValueProcessor(tagValue: String, tagName: String): String
    
    var textNodeName: String
    
    var trimValues: Boolean
  }
  object X2jOptions {
    
    inline def apply(
      allowBooleanAttributes: Boolean,
      arrayMode: Boolean | strict | js.RegExp | (js.Function2[/* tagName */ String, /* parentTagName */ String, Boolean]),
      attrNodeName: `false` | String,
      attrValueProcessor: (String, String) => String,
      attributeNamePrefix: String,
      cdataPositionChar: String,
      cdataTagName: `false` | String,
      ignoreAttributes: Boolean,
      ignoreNameSpace: Boolean,
      parseAttributeValue: Boolean,
      parseNodeValue: Boolean,
      parseTrueNumberOnly: Boolean,
      stopNodes: js.Array[String],
      tagValueProcessor: (String, String) => String,
      textNodeName: String,
      trimValues: Boolean
    ): X2jOptions = {
      val __obj = js.Dynamic.literal(allowBooleanAttributes = allowBooleanAttributes.asInstanceOf[js.Any], arrayMode = arrayMode.asInstanceOf[js.Any], attrNodeName = attrNodeName.asInstanceOf[js.Any], attrValueProcessor = js.Any.fromFunction2(attrValueProcessor), attributeNamePrefix = attributeNamePrefix.asInstanceOf[js.Any], cdataPositionChar = cdataPositionChar.asInstanceOf[js.Any], cdataTagName = cdataTagName.asInstanceOf[js.Any], ignoreAttributes = ignoreAttributes.asInstanceOf[js.Any], ignoreNameSpace = ignoreNameSpace.asInstanceOf[js.Any], parseAttributeValue = parseAttributeValue.asInstanceOf[js.Any], parseNodeValue = parseNodeValue.asInstanceOf[js.Any], parseTrueNumberOnly = parseTrueNumberOnly.asInstanceOf[js.Any], stopNodes = stopNodes.asInstanceOf[js.Any], tagValueProcessor = js.Any.fromFunction2(tagValueProcessor), textNodeName = textNodeName.asInstanceOf[js.Any], trimValues = trimValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[X2jOptions]
    }
    
    extension [Self <: X2jOptions](x: Self) {
      
      inline def setAllowBooleanAttributes(value: Boolean): Self = StObject.set(x, "allowBooleanAttributes", value.asInstanceOf[js.Any])
      
      inline def setArrayMode(
        value: Boolean | strict | js.RegExp | (js.Function2[/* tagName */ String, /* parentTagName */ String, Boolean])
      ): Self = StObject.set(x, "arrayMode", value.asInstanceOf[js.Any])
      
      inline def setArrayModeFunction2(value: (/* tagName */ String, /* parentTagName */ String) => Boolean): Self = StObject.set(x, "arrayMode", js.Any.fromFunction2(value))
      
      inline def setAttrNodeName(value: `false` | String): Self = StObject.set(x, "attrNodeName", value.asInstanceOf[js.Any])
      
      inline def setAttrValueProcessor(value: (String, String) => String): Self = StObject.set(x, "attrValueProcessor", js.Any.fromFunction2(value))
      
      inline def setAttributeNamePrefix(value: String): Self = StObject.set(x, "attributeNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setCdataPositionChar(value: String): Self = StObject.set(x, "cdataPositionChar", value.asInstanceOf[js.Any])
      
      inline def setCdataTagName(value: `false` | String): Self = StObject.set(x, "cdataTagName", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAttributes(value: Boolean): Self = StObject.set(x, "ignoreAttributes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNameSpace(value: Boolean): Self = StObject.set(x, "ignoreNameSpace", value.asInstanceOf[js.Any])
      
      inline def setParseAttributeValue(value: Boolean): Self = StObject.set(x, "parseAttributeValue", value.asInstanceOf[js.Any])
      
      inline def setParseNodeValue(value: Boolean): Self = StObject.set(x, "parseNodeValue", value.asInstanceOf[js.Any])
      
      inline def setParseTrueNumberOnly(value: Boolean): Self = StObject.set(x, "parseTrueNumberOnly", value.asInstanceOf[js.Any])
      
      inline def setStopNodes(value: js.Array[String]): Self = StObject.set(x, "stopNodes", value.asInstanceOf[js.Any])
      
      inline def setStopNodesVarargs(value: String*): Self = StObject.set(x, "stopNodes", js.Array(value*))
      
      inline def setTagValueProcessor(value: (String, String) => String): Self = StObject.set(x, "tagValueProcessor", js.Any.fromFunction2(value))
      
      inline def setTextNodeName(value: String): Self = StObject.set(x, "textNodeName", value.asInstanceOf[js.Any])
      
      inline def setTrimValues(value: Boolean): Self = StObject.set(x, "trimValues", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<.fast-xml-parser-SoMrbExG..fast-xml-parser-SoMrbExG.X2jOptions> */
  trait X2jOptionsOptional extends StObject {
    
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
  object X2jOptionsOptional {
    
    inline def apply(): X2jOptionsOptional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X2jOptionsOptional]
    }
    
    extension [Self <: X2jOptionsOptional](x: Self) {
      
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
  
  trait validationOptions extends StObject {
    
    var allowBooleanAttributes: Boolean
  }
  object validationOptions {
    
    inline def apply(allowBooleanAttributes: Boolean): validationOptions = {
      val __obj = js.Dynamic.literal(allowBooleanAttributes = allowBooleanAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[validationOptions]
    }
    
    extension [Self <: validationOptions](x: Self) {
      
      inline def setAllowBooleanAttributes(value: Boolean): Self = StObject.set(x, "allowBooleanAttributes", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<.fast-xml-parser-SoMrbExG..fast-xml-parser-SoMrbExG.validationOptions> */
  trait validationOptionsOptional extends StObject {
    
    var allowBooleanAttributes: js.UndefOr[Boolean] = js.undefined
  }
  object validationOptionsOptional {
    
    inline def apply(): validationOptionsOptional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[validationOptionsOptional]
    }
    
    extension [Self <: validationOptionsOptional](x: Self) {
      
      inline def setAllowBooleanAttributes(value: Boolean): Self = StObject.set(x, "allowBooleanAttributes", value.asInstanceOf[js.Any])
      
      inline def setAllowBooleanAttributesUndefined: Self = StObject.set(x, "allowBooleanAttributes", js.undefined)
    }
  }
}
