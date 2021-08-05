package typings.awsSdkBuildTypes

import typings.awsSdkBuildTypes.apiModelMod.MemberLocation
import typings.awsSdkBuildTypes.apiModelMod.Type
import typings.awsSdkBuildTypes.customizationMod.RuntimeTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsSdkBuildTypesStrings {
  
  @js.native
  sealed trait Configuration extends StObject
  inline def Configuration: Configuration = "Configuration".asInstanceOf[Configuration]
  
  @js.native
  sealed trait Middleware extends StObject
  inline def Middleware: Middleware = "Middleware".asInstanceOf[Middleware]
  
  @js.native
  sealed trait ParameterSuppression extends StObject
  inline def ParameterSuppression: ParameterSuppression = "ParameterSuppression".asInstanceOf[ParameterSuppression]
  
  @js.native
  sealed trait ParserDecorator extends StObject
  inline def ParserDecorator: ParserDecorator = "ParserDecorator".asInstanceOf[ParserDecorator]
  
  @js.native
  sealed trait SyntheticParameter extends StObject
  inline def SyntheticParameter: SyntheticParameter = "SyntheticParameter".asInstanceOf[SyntheticParameter]
  
  @js.native
  sealed trait blob
    extends StObject
       with Type
  inline def blob: blob = "blob".asInstanceOf[blob]
  
  @js.native
  sealed trait boolean
    extends StObject
       with Type
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait browser
    extends StObject
       with RuntimeTarget
  inline def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait byte
    extends StObject
       with Type
  inline def byte: byte = "byte".asInstanceOf[byte]
  
  @js.native
  sealed trait character
    extends StObject
       with Type
  inline def character: character = "character".asInstanceOf[character]
  
  @js.native
  sealed trait double
    extends StObject
       with Type
  inline def double: double = "double".asInstanceOf[double]
  
  @js.native
  sealed trait float
    extends StObject
       with Type
  inline def float: float = "float".asInstanceOf[float]
  
  @js.native
  sealed trait forked extends StObject
  inline def forked: forked = "forked".asInstanceOf[forked]
  
  @js.native
  sealed trait header
    extends StObject
       with MemberLocation
  inline def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait headers
    extends StObject
       with MemberLocation
  inline def headers: headers = "headers".asInstanceOf[headers]
  
  @js.native
  sealed trait input extends StObject
  inline def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait integer
    extends StObject
       with Type
  inline def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait list
    extends StObject
       with Type
  inline def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait long
    extends StObject
       with Type
  inline def long: long = "long".asInstanceOf[long]
  
  @js.native
  sealed trait map
    extends StObject
       with Type
  inline def map: map = "map".asInstanceOf[map]
  
  @js.native
  sealed trait node
    extends StObject
       with RuntimeTarget
  inline def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait output extends StObject
  inline def output: output = "output".asInstanceOf[output]
  
  @js.native
  sealed trait provider extends StObject
  inline def provider: provider = "provider".asInstanceOf[provider]
  
  @js.native
  sealed trait querystring
    extends StObject
       with MemberLocation
  inline def querystring: querystring = "querystring".asInstanceOf[querystring]
  
  @js.native
  sealed trait short
    extends StObject
       with Type
  inline def short: short = "short".asInstanceOf[short]
  
  @js.native
  sealed trait string
    extends StObject
       with Type
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait structure
    extends StObject
       with Type
  inline def structure: structure = "structure".asInstanceOf[structure]
  
  @js.native
  sealed trait timestamp
    extends StObject
       with Type
  inline def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  
  @js.native
  sealed trait unified extends StObject
  inline def unified: unified = "unified".asInstanceOf[unified]
  
  @js.native
  sealed trait universal
    extends StObject
       with RuntimeTarget
  inline def universal: universal = "universal".asInstanceOf[universal]
  
  @js.native
  sealed trait uri
    extends StObject
       with MemberLocation
  inline def uri: uri = "uri".asInstanceOf[uri]
  
  @js.native
  sealed trait value extends StObject
  inline def value: value = "value".asInstanceOf[value]
}
