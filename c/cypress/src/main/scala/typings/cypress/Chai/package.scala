package typings.cypress.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AssertStatic = Assert

// chai.Assertion.prototype.assert arguments
type AssertionArgs = js.Tuple6[
// 'expression to be tested'
// This parameter is unused and the docs list its type as
// 'Philosophical', which is mentioned nowhere else in the source. Do
// with that what you will!
Any, 
Message, 
// message if value fails
Message, 
// message if negated value fails
Any, 
js.UndefOr[// expected value
Any], 
js.UndefOr[// actual value
Boolean]]

type ChaiPlugin = js.Function2[/* chai */ ChaiStatic, /* utils */ ChaiUtils, Unit]

type CloseTo = js.Function3[/* expected */ Double, /* delta */ Double, /* message */ js.UndefOr[String], Assertion]

type Equal = js.Function2[/* value */ Any, /* message */ js.UndefOr[String], Assertion]

type InstanceOf = js.Function2[/* constructor */ Any, /* message */ js.UndefOr[String], Assertion]

type Members = js.Function2[/* set */ js.Array[Any], /* message */ js.UndefOr[String], Assertion]

type Message = String | js.Function0[String]

type NumberComparer = js.Function2[/* value */ Double | js.Date, /* message */ js.UndefOr[String], Assertion]

type ObjectProperty = String | js.Symbol | Double

type Operator = String

type OperatorComparable = js.UndefOr[Boolean | Null | Double | String | js.Date]

type PropertyChange = js.Function3[
/* object */ js.Object, 
/* property */ js.UndefOr[String], 
/* message */ js.UndefOr[String], 
Assertion]

type RespondTo = js.Function2[/* method */ String, /* message */ js.UndefOr[String], Assertion]

type Satisfy = js.Function2[/* matcher */ js.Function, /* message */ js.UndefOr[String], Assertion]
