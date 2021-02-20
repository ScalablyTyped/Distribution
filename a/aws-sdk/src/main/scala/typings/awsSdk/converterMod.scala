package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.dynamodbMod.AttributeMap
import typings.awsSdk.dynamodbMod.AttributeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object converterMod {
  
  @JSImport("aws-sdk/lib/dynamodb/converter", "Converter")
  @js.native
  class Converter () extends StObject
  /* static members */
  object Converter {
    
    @JSImport("aws-sdk/lib/dynamodb/converter", "Converter.input")
    @js.native
    def input(data: js.Any): AttributeValue = js.native
    @JSImport("aws-sdk/lib/dynamodb/converter", "Converter.input")
    @js.native
    def input(data: js.Any, options: ConverterOptions): AttributeValue = js.native
    
    @JSImport("aws-sdk/lib/dynamodb/converter", "Converter.marshall")
    @js.native
    def marshall(data: StringDictionary[js.Any]): AttributeMap = js.native
    @JSImport("aws-sdk/lib/dynamodb/converter", "Converter.marshall")
    @js.native
    def marshall(data: StringDictionary[js.Any], options: ConverterOptions): AttributeMap = js.native
    
    @JSImport("aws-sdk/lib/dynamodb/converter", "Converter.output")
    @js.native
    def output(data: AttributeValue): js.Any = js.native
    @JSImport("aws-sdk/lib/dynamodb/converter", "Converter.output")
    @js.native
    def output(data: AttributeValue, options: ConverterOptions): js.Any = js.native
    
    @JSImport("aws-sdk/lib/dynamodb/converter", "Converter.unmarshall")
    @js.native
    def unmarshall(data: AttributeMap): StringDictionary[js.Any] = js.native
    @JSImport("aws-sdk/lib/dynamodb/converter", "Converter.unmarshall")
    @js.native
    def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[js.Any] = js.native
    
    type ConverterOptions = typings.awsSdk.documentClientMod.DocumentClient.ConverterOptions
  }
}
