package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CustomEqualityTester = js.Function2[/* first */ scala.Any, /* second */ scala.Any, Boolean]

type CustomMatcherFactories = StringDictionary[CustomMatcherFactory]

type CustomMatcherFactory = js.Function2[
/* util */ MatchersUtil, 
/* customEqualityTesters */ js.Array[CustomEqualityTester], 
CustomMatcher]

type SpecFunction = js.Function1[/* spec */ js.UndefOr[Spec], Unit]

type StringPrettyPrinter = PrettyPrinter
