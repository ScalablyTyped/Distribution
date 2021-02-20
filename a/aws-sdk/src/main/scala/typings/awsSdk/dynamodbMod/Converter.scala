package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.converterMod.Converter.ConverterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/dynamodb", "Converter")
@js.native
class Converter ()
  extends typings.awsSdk.converterMod.Converter
/* static members */
object Converter {
  
  @JSImport("aws-sdk/clients/dynamodb", "Converter.input")
  @js.native
  def input(data: js.Any): AttributeValue = js.native
  @JSImport("aws-sdk/clients/dynamodb", "Converter.input")
  @js.native
  def input(data: js.Any, options: ConverterOptions): AttributeValue = js.native
  
  @JSImport("aws-sdk/clients/dynamodb", "Converter.marshall")
  @js.native
  def marshall(data: StringDictionary[js.Any]): AttributeMap = js.native
  @JSImport("aws-sdk/clients/dynamodb", "Converter.marshall")
  @js.native
  def marshall(data: StringDictionary[js.Any], options: ConverterOptions): AttributeMap = js.native
  
  @JSImport("aws-sdk/clients/dynamodb", "Converter.output")
  @js.native
  def output(data: AttributeValue): js.Any = js.native
  @JSImport("aws-sdk/clients/dynamodb", "Converter.output")
  @js.native
  def output(data: AttributeValue, options: ConverterOptions): js.Any = js.native
  
  @JSImport("aws-sdk/clients/dynamodb", "Converter.unmarshall")
  @js.native
  def unmarshall(data: AttributeMap): StringDictionary[js.Any] = js.native
  @JSImport("aws-sdk/clients/dynamodb", "Converter.unmarshall")
  @js.native
  def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[js.Any] = js.native
}
