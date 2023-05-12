package typings.cucumberCucumber

import typings.cucumberCucumber.libModelsGherkinStepKeywordMod.GherkinStepKeyword
import typings.cucumberCucumber.libModelsPickleOrderMod._PickleOrder
import typings.cucumberCucumber.libPublishHttpStreamMod.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cucumberCucumberStrings {
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait Given
    extends StObject
       with GherkinStepKeyword
  inline def Given: Given = "Given".asInstanceOf[Given]
  
  @js.native
  sealed trait POST
    extends StObject
       with HttpMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HttpMethod
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait Then
    extends StObject
       with GherkinStepKeyword
  inline def Then: Then = "Then".asInstanceOf[Then]
  
  @js.native
  sealed trait Unknown
    extends StObject
       with GherkinStepKeyword
  inline def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait When
    extends StObject
       with GherkinStepKeyword
  inline def When: When = "When".asInstanceOf[When]
  
  @js.native
  sealed trait defined
    extends StObject
       with _PickleOrder
  inline def defined: defined = "defined".asInstanceOf[defined]
  
  @js.native
  sealed trait formatter extends StObject
  inline def formatter: formatter = "formatter".asInstanceOf[formatter]
  
  @js.native
  sealed trait message extends StObject
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait random
    extends StObject
       with _PickleOrder
  inline def random: random = "random".asInstanceOf[random]
  
  @js.native
  sealed trait syntax extends StObject
  inline def syntax: syntax = "syntax".asInstanceOf[syntax]
}
