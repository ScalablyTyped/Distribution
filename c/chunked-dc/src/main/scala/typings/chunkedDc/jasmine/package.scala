package typings.chunkedDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jasmine {
  
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean]
  
  type CustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typings.chunkedDc.jasmine.CustomMatcherFactory]
  
  type CustomMatcherFactory = js.Function2[
    /* util */ typings.chunkedDc.jasmine.MatchersUtil, 
    /* customEqualityTesters */ js.Array[typings.chunkedDc.jasmine.CustomEqualityTester], 
    typings.chunkedDc.jasmine.CustomMatcher
  ]
  
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[typings.chunkedDc.jasmine.Spec], scala.Unit]
  
  type StringPrettyPrinter = typings.chunkedDc.jasmine.PrettyPrinter
}
